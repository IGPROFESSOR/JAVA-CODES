import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day of the week: ");
        String day = sc.next().toLowerCase();
        int price = 0;

        switch (day) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                price = 100; 
                System.out.println("It's a weekday");
                break;

            case "saturday":
            case "sunday":
                price = 150; 
                System.out.println("It's a weekend");
                break;

            default:
                System.out.println("Invalid day entered!");
                sc.close();
                return;
        }

        System.out.println("Ticket Price: ₹" + price);
        sc.close();
    }
}
