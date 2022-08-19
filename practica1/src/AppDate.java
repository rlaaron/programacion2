import java.util.Scanner;
public class AppDate {
    public static void main(String[] args) {
        Date date = new Date(10, 5, 2018);
        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        int op; 
        while(!exit){
           // Printing the menu.
            System.out.println("\n1.Leap year check");
            System.out.println("2.Days in a month");
            System.out.println("3.Short date");
            System.out.println("4.Days since 1-1-1900 until date input");
            System.out.println("5.Day of week");
            System.out.println("6.Long date");
            System.out.println("7.Date after days");
            System.out.println("8.Next day");
            System.out.println("9.Before day");
            System.out.println("10.Getters and setters");
            System.out.println("11.Exit");
            try {
                System.out.println("Select an option");
                op = sn.nextInt();
                switch (op){
                    case 1:
                        System.out.println("Enter check leap year: ");
                        int year = sn.nextInt();
                        System.out.println(date.leapYeear(year));
                        break;
                    case 2:
                        System.out.println("Enter month and year to count days: ");
                        int month = sn.nextInt();
                        int yearDays = sn.nextInt();
                        System.out.println(date.days(month, yearDays));
                        break;
                    case 3:
                        System.out.println("Short date: ");
                        System.out.println(date.shortDate());
                        break;
                    case 4:
                        System.out.println("Days since 1-1-1900 until date input: ");
                        System.out.println(date.daysBetewen());
                        break;
                    case 5:
                        System.out.println("Day of week: ");
                        System.out.println(date.dayWeek());
                        break;
                    case 6:
                        System.out.println("Long date: ");
                        System.out.println(date.longDate());
                        break;
                    case 7:
                        System.out.println("Date after days: ");
                        int days = sn.nextInt();
                        System.out.println(date.dateAfter(days));
                        break;
                    case 8:
                        System.out.println("Next day: ");
                        System.out.println(date.nextDay());
                        break;
                    case 9:
                        System.out.println("Before day: ");
                        System.out.println(date.backDay());
                        break;
                    case 10:
                        while(!exit){
                            System.out.println("\n1.Set day");
                            System.out.println("2.Set month");
                            System.out.println("3.Set year");
                            System.out.println("4.Get day");
                            System.out.println("5.Get month");
                            System.out.println("6.Get year");
                            System.out.println("7.Get leap year");
                            System.out.println("9.Exit");
                            System.out.println("Select an option");
                            op = sn.nextInt();
                            switch (op){
                                case 1:
                                    System.out.println("Enter day: ");
                                    int day = sn.nextInt();
                                    date.setDay(day);
                                    break;
                                case 2:
                                    System.out.println("Enter month: ");
                                    int monthS = sn.nextInt();
                                    date.setMonth(monthS);
                                    break;
                                case 3:
                                    System.out.println("Enter year: ");
                                    int yearS = sn.nextInt();
                                    date.setYear(yearS);
                                    break;
                                case 4:
                                    System.out.println("Day: " + date.getDay());
                                    break;
                                case 5:
                                    System.out.println("Month: " + date.getMonth());
                                    break;
                                case 6:
                                    System.out.println("Year: " + date.getYear());
                                    break;
                                case 7:
                                    System.out.println("Leap year: " + date.getLeapYear());
                                    break;
                                case 8:
                                    exit = true;
                                    break;
                                default:
                                    System.out.println("Invalid option");
                                    break;
                            }
                        }
                        break;
                    case 11:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid option");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Invalid option");
            }
        } sn.close();
    }
}
