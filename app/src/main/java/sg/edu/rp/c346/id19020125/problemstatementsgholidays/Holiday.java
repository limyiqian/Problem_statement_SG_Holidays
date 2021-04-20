package sg.edu.rp.c346.id19020125.problemstatementsgholidays;

public class Holiday {
    private String holName;
    private String date;
    private String icon;

    public Holiday(String holName, String date, String icon) {
        this.holName = holName;
        this.date = date;
        this.icon = icon;
    }

    public String getHolName() {
        return holName;
    }

    public String getDate() {
        return date;
    }

    public String getIcon() {
        return icon;
    }
}
