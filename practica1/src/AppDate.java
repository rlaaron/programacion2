import java.util.Scanner;
public class AppDate {
    public static void main(String[] args) {
        Date date = new Date(10, 1, 1900);
        Scanner sn = new Scanner(System.in);
        // System.out.println(date.shortDate());
        System.out.println(date.daysBetewen());
        // System.out.println(date.dayWeek());
        System.out.println(date.longDate());
        System.out.println("Enter a days to agree: ");
        int days = sn.nextInt();
        System.out.println(date.dateAfter(days));
        sn.close();
    }

    
}
