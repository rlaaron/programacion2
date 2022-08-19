public class Date {
    // Declaring the variables that will be used in the class.
    private int day;
    private int month;
    private int year;
    private boolean leapYear;

    // The default constructor.
    public Date(){
        day = 1;
        month = 1;
        year = 1900;
        leapYear = false;
    }

    // A constructor that takes three parameters, day, month and year. It checks if the parameters are
    // valid and if they are, it sets the values of the variables day, month and year to the
    // parameters. If the parameters are not valid, it sets the values of the variables day, month and
    // year to 1, 1 and 1900 respectively.
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

    // getters.
   public int getDay(){
       return day;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }

    public boolean getLeapYear(){
        return leapYear;
    }

    // setters.
    public void setDay(int day){
        this.day = day;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public void setYear(int year){
        this.year = year;
        if(leapYeear(year)){
            leapYear = true;
        }
    }



    /**
     * If the year is divisible by 4, but not by 100, or if the year is divisible by 400, then it is a
     * leap year
     * 
     * @param year the year to check
     * @return leapYear
     */
    public boolean leapYeear(int year){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            leapYear = true;
        }else {
            leapYear = false;
        }
        return leapYear;
    }

    /**
     * This function takes in a month and a year and returns the number of days in that month
     * 
     * @param month the month you want to know the days of
     * @param year the year of the date
     * @return The number of days in a month.
     */
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
        System.out.println("Days passed: ");
        return days;
    }
    /**
     * @return The day, month and year of the date.
     */
    public String shortDate(){
        return day + "/" + month + "/" + year;
    }
    /**
     * @return The number of days between 1-1-1900 and the date.
     */

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

    /**
     * It takes the number of days between the two dates and uses the modulus operator to determine the
     * day of the week
     * 
     * @return The day of the week.
     */
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
    
    /**
     * @return The day, month and year of the date.
     */
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


    /**
     * It takes a date and adds a number of days to it, returning the new date
     * 
     * @param days The number of days to add to the current date.
     * @return The date after the number of days that is passed in.
     */
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

    /**
     * If the day is greater than the number of days in the month, subtract the number of days in the
     * month from the day, increment the month, and if the month is greater than 12, subtract 12 from
     * the month and increment the year
     * 
     * @return The next day.
     */
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

    /**
     * If the day is greater than 1, subtract 1 from the day. If the day is less than 1, subtract 1
     * from the month and add the number of days in the previous month to the day. If the month is less
     * than 1, subtract 1 from the year and add 12 to the month
     * 
     * @return The day, month, and year of the previous day.
     */
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
