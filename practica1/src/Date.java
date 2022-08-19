public class Date {
    private int day;
    private int month;
    private int year;
    private boolean leapYear;

    public Date(){
        day = 1;
        month = 1;
        year = 1900;
        leapYear = false;
    }

    public Date(int day, int month, int year){
        if (day > 0 && day <= 31 && month > 0 && month <= 12 && year > 0){
            this.day = day;
            this.month = month;
            this.year = year;
            if(leapYeear(year)){
                leapYear = true;
            }else{
                leapYear = false;
            }
        }
        else{
            day = 1;
            month = 1;
            year = 1900;
        }
        
    }

    public boolean leapYeear(int year){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            leapYear = true;
        }else {
            leapYear = false;
        }
        return leapYear;
    }

    public int days(int month, int year){
        int days = 0;
        if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
            days = 31;
        }else if(month==4 || month==6 || month==9 || month==11){
            days = 30;
        }else if(month==2){
            if(leapYeear(year)){
                days = 29;
            }else{
                days = 28;
            }
        }
        return days;
    }
    public String shortDate(){
        return day + "/" + month + "/" + year;
    }

    public boolean leapyear(){
        
        return leapYear;
    }

    // public String dayWeek(){
    //     int  sunday = [0,7,14,21,29];
    //     int  monday = [0,7,14,21,29];
    //     int  sunday = [0,7,14,21,29];
    //     int  sunday = [0,7,14,21,29];
    //     int  sunday = [0,7,14,21,29];
    //     if(day == sunday ){
    //         return "Sunday";
    //     }
    //     return 
    // }


}
