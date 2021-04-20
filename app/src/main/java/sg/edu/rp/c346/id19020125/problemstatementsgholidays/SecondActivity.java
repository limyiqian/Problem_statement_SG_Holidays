package sg.edu.rp.c346.id19020125.problemstatementsgholidays;

import android.content.Intent;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tv;
    ArrayList<Holiday> alSecular;
    ArrayList<Holiday> alEthnic;
    ArrayAdapter aa;
    ArrayList<Holiday> selectedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        alSecular = new ArrayList<Holiday>();
        alEthnic = new ArrayList<Holiday>();
        selectedList = new ArrayList<Holiday>();

        lv = (ListView) this.findViewById(R.id.lv);
        tv = (TextView) findViewById(R.id.tv);

        alSecular.add(new Holiday("New Year's Day","1 Jan 2017","nyd"));
        alSecular.add(new Holiday("Labour Day","1 May 2017","ld"));

        alEthnic.add(new Holiday("Chinese New Year","28-29 Jab 2017","cny"));
        alEthnic.add(new Holiday("Good Friday","14 April 2017","gf"));

        Intent i = getIntent();
        String hol = i.getStringExtra("hol");
        tv.setText(hol);

        if(hol.equals("Secular")) {
            selectedList = alSecular;
        }
        else if (hol.equals("Ethnic & Religion")) {
            selectedList = alEthnic;
        }
        aa = new HolidayAdapter(this, R.layout.holidayrow, selectedList);
        lv.setAdapter(aa);


    }



}

