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

    public int daysBetewen(){
        int days = -1;
        for(int i = 1900; i < year; i++){
            if(leapYeear(i)){
                days += 366;
            }else{
                days += 365;
            }
        }
        for(int i = 1; i < month; i++){
            days += days(i, year);
        }
        days += day;

        return days;
    }
    public String dayWeek(){
        String dayWeek = "";
        int days = daysBetewen();
        if(days % 7 == 0){
            dayWeek = "Sunday";
        }else if(days % 7 == 1){
            dayWeek = "Monday";
        }else if(days % 7 == 2){
            dayWeek = "Tuesday";
        }else if(days % 7 == 3){
            dayWeek = "Wednesday";
        }else if(days % 7 == 4){
            dayWeek = "Thursday";
        }else if(days % 7 == 5){
            dayWeek = "Friday";
        }else if(days % 7 == 6){
            dayWeek = "Saturday";
        }
        return dayWeek;
    }
    
    public String longDate(){
        String longDate = "";
        longDate = dayWeek() + " " + day;
        longDate += " of ";
        if(month == 1){
            longDate += "January";
        }else if(month == 2){
            longDate += "February";
        }else if(month == 3){
            longDate += "March";
        }else if(month == 4){
            longDate += "April";
        }else if(month == 5){
            longDate += "May";
        }else if(month == 6){
            longDate += "June";
        }else if(month == 7){
            longDate += "July";
        }else if(month == 8){
            longDate += "August";
        }else if(month == 9){
            longDate += "September";
        }else if(month == 10){
            longDate += "October";
        }else if(month == 11){
            longDate += "November";
        }else if(month == 12){
            longDate += "December";
        }
        longDate += " " + year;
        return longDate;
    }
    
    public String dateAfter(int days){
        int newDay = day + days;
        int newMonth = month;
        int newYear = year;
        if(newDay > days(month, year)){
            newDay -= days(month, year);
            newMonth++;
        }
        if(newMonth > 12){
            newMonth -= 12;
            newYear++;
        }
        return newDay + "/" + newMonth + "/" + newYear;
    }

    public String nextDay(){
        int newDay = day + 1;
        int newMonth = month;
        int newYear = year;
        if(newDay > days(month, year)){
            newDay -= days(month, year);
            newMonth++;
        }
        if(newMonth > 12){
            newMonth -= 12;
            newYear++;
        }
        return newDay + "/" + newMonth + "/" + newYear;
    }

    public String backDay(){
        int newDay = day - 1;
        int newMonth = month;
        int newYear = year;
        if(newDay < 1){
            newDay += days(month, year);
            newMonth--;
        }
        if(newMonth < 1){
            newMonth += 12;
            newYear--;
        }
        return newDay + "/" + newMonth + "/" + newYear;
    }

}
