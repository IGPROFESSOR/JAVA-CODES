import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        int sum = 0;
        int count = 0;

        while (count < N) {
            System.out.print("Enter a positive number: ");
            int num = sc.nextInt();

            if (num < 0) {
                System.out.println("Negative number entered! Please enter a positive number.");
                continue; 
            }

            sum += num;
            count++; 
        }

        System.out.println("Sum of " + N + " positive numbers is: " + sum);
        sc.close();
    }
}
