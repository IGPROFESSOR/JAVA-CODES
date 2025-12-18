import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isDescending = true;
        int lastDigit = num % 10;
        num = num / 10;

        while (num > 0) {
            int currentDigit = num % 10;

            if (currentDigit < lastDigit) {
                isDescending = false;
                break;
            }

            lastDigit = currentDigit;
            num = num / 10;
        }

        if (isDescending) {
            System.out.println("Digits are in descending order.");
        } else {
            System.out.println("Digits are not in descending order.");
        }

        sc.close();
    }
}
