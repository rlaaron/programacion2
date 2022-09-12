public class Date {
    private int day;
    private int month;
    private int year; 

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public Date(){
        this.day = 0;
        this.month = 0;
        this.year = 0;
    }
    
    @Override
    public String toString(){
        return day+"/"+" "+month+"/"+" "+year;
    }
}
 