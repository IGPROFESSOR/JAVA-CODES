import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();   
        int digit = sc.nextInt();  

        if (num < 0) {
            num = -num;  
        }

        boolean found = false;

        while (num > 0) {
            int rem = num % 10;

            if (rem == digit) {
                found = true;
                break;
            }

            num = num / 10;
        }

        if (found) {
            System.out.println("Digit is present");
        } else {
            System.out.println("Digit is not present");
        }
        sc.close();
    }
}