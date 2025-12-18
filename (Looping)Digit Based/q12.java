import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        int n = number;

        while (n > 0) {
            int digit = n % 10; 

            if (digit % 2 == 0) {
                evenSum += digit; 
            } else {
                oddSum += digit;  
            }

            n = n / 10; 
        }

        int difference = evenSum - oddSum;

        System.out.println("Sum of even digits: " + evenSum);
        System.out.println("Sum of odd digits: " + oddSum);
        System.out.println("Difference (even - odd) = " + difference);
        sc.close();
    }
}