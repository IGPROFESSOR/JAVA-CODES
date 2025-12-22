import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number;

        while (true) {
            System.out.print("Enter a number (negative to stop): ");
            number = sc.nextInt();

            if (number < 0) {
                break; 
            }

            sum += number; 
        }

        System.out.println("Sum of the entered positive numbers is: " + sum);
        sc.close();
    }
}

