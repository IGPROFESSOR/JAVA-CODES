import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter battery percentage (0-100): ");
        int battery = sc.nextInt();

        if (battery >= 80 && battery <= 100) {
            System.out.println("Battery Status: Full");
        } else if (battery >= 30 && battery < 80) {
            System.out.println("Battery Status: Moderate");
        } else if (battery >= 0 && battery < 30) {
            System.out.println("Battery Status: Low");
        } else {
            System.out.println("Invalid battery percentage");
        }

        sc.close();
    }
}
