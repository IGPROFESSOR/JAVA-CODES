import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        for (int digit = 0; digit <= 9; digit++) {
            int count = 0;
            long temp = num;

            while (temp > 0) {
                int rem = (int)(temp % 10);
                if (rem == digit) {
                    count++;
                }
                temp = temp / 10;
            }

            if (count > 0) {
                System.out.println("Digit " + digit + " : " + count);
            }
        }

        sc.close();
    }
}