import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num < 0) {
            num = -num;
        }
        boolean hasEven = false;
        boolean hasOdd = false;

        if (num == 0) {
            hasEven = true; 
        }

        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                hasEven = true;
            } else {
                hasOdd = true;
            }
            num /= 10;
            if (hasEven && hasOdd) {
                break;
            }
        }

        if (hasEven && hasOdd) {
            System.out.println("The number has mixed digits (both even and odd).");
        } else if (hasEven) {
            System.out.println("All digits are even.");
        } else {
            System.out.println("All digits are odd.");
        }

        sc.close();
    }
}