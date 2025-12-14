import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your mobile number: ");
        String mobile = sc.next();

        if (mobile.length() >= 10 && mobile.matches("\\d+")) {
            System.out.println("Valid Number");
        } else {
            System.out.println("Invalid Number");
        }

        sc.close();
    }
}
