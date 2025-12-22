import java.util.Scanner;

public class q18{
 
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        System.out.println("Strong numbers from 1 to " + N + " are:");

        for (int num = 1; num <= N; num++) {
            int sum = 0;
            int temp = num;

            while (temp > 0) {
                int digit = temp % 10;
                sum += factorial(digit);
                temp /= 10;
            }

            if (sum == num) {
                System.out.println(num);
            }
        }sc.close();
    }
}
