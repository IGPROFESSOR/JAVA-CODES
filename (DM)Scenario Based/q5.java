import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter body temperature (°F): ");
        double temp = sc.nextDouble();

        if (temp > 100) {
            System.out.println("You have a fever.");
        } else {
            System.out.println("Temperature is normal.");
        }

        sc.close();
    }
}
