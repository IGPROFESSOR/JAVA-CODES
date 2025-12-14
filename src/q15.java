import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle speed (km/h): ");
        int speed = sc.nextInt();

        if (speed > 100) {
            System.out.println("Warning: Speed exceeds 100 km/h! Slow down");
        } else {
            System.out.println("Speed is within the safe limit");
        }

        sc.close();
    }
}
