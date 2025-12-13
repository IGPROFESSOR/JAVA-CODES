import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        if (year <= 0 || month < 1 || month > 12) {
            System.out.println("Invalid year or month");
        } 
        else {
            int days;
            if (month == 2) {
                // Leap year check
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
            }
            else if (month == 4 || month == 6 || month == 9 || month == 11) {
                days = 30;
            }
            else {
                days = 31;
            }
            System.out.println("Number of days = " + days);
        }
        sc.close();
    }
}
