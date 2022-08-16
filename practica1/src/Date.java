public class Date {
    private double day;
    private double month;
    private double year;
    private boolean leapYear;

    public Date(){
        day = 1;
        month = 1;
        year = 1900;
        leapYear = false;
    }

    public Date(double day, double month, double year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setRead(double day, double month, double year){
        if (day>1 && day<31){
            this.day = day;
        }
        if (month>1 && month<12){
            this.month = month;
        }
        if (year<1900 && year<2050){
            this.year = year;
        }
    }

    public boolean leapyear(){
        
        return leapYear;
    }


}
