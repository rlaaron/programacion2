import java.util.Scanner;
public class AppReverse {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input how many words you want to reverse: ");
        int n = sc.nextInt();
        String str[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Input word " + (i + 1) + ": ");
            str[i] = sc.next();
        }
        Reverse rev = new Reverse(str);
        sc.close();
        System.out.println(rev.reverseString());
    }
}
