package sg.edu.rp.c346.id19020125.problemstatementsgholidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HolidayAdapter extends ArrayAdapter<Holiday> {
    private ArrayList<Holiday> holidayArrayList;
    private Context context;
    private TextView holName;
    private TextView holDate;
    private ImageView icon;

    public HolidayAdapter(Context context, int resource, ArrayList<Holiday> objects) {
        super(context, resource, objects);
        holidayArrayList = objects;
        this.context = context;
    }

    public View getView(int position, View converyView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.holidayrow, parent, false);
        holName = (TextView) rowView.findViewById(R.id.tvHolName);
        holDate = (TextView) rowView.findViewById(R.id.tvHolDate);
        icon = (ImageView) rowView.findViewById(R.id.ivIcon);

        Holiday currentHol = holidayArrayList.get(position);
        holName.setText(currentHol.getHolName());
        holDate.setText(currentHol.getDate());
        if(currentHol.getIcon()=="nyd"){
            icon.setImageResource(R.drawable.newyearday);
        }
        else if(currentHol.getIcon()=="ld") {
            icon.setImageResource(R.drawable.labourday);
        }
        else if(currentHol.getIcon()=="cny") {
            icon.setImageResource(R.drawable.cny);
        }
        else if(currentHol.getIcon()=="gf") {
            icon.setImageResource(R.drawable.goodfriday);
        }
        return rowView;
    }
}
