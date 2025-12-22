import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        int count = 0; 
        int num = 2;  

        System.out.println("First " + N + " prime numbers are:");

        while (count < N) {
            boolean isPrime = true;

        
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num);
                count++;
            }

            num++;
        }sc.close();
    }
}
