import java.util.Scanner;

public class q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean isPowerOfThree = false;

        if (n > 0) {
            while (n % 3 == 0) {
                n /= 3;
            }
            if (n == 1) {
                isPowerOfThree = true;
            }
        }

        if (isPowerOfThree)
            System.out.println("Power of 3");
        else
            System.out.println("Not a Power of 3");
        sc.close();
    }
}