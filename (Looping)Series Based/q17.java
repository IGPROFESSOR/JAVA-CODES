import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        System.out.println("Armstrong numbers from 1 to " + N + " are:");

        for (int num = 1; num <= N; num++) {
            int sum = 0;
            int temp = num;
            int digits = String.valueOf(num).length();

            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == num) {
                System.out.println(num);
            }
        }sc.close();
    }
}
