import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                evenSum = evenSum + i;
            } else {
                oddSum = oddSum + i;
            }
        }

        System.out.println("Sum of even numbers till " + N + " = " + evenSum);
        System.out.println("Sum of odd numbers till " + N + " = " + oddSum);
        sc.close();
    }
}
