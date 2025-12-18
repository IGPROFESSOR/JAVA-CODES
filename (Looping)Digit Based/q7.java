import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int lastDigit = num % 10;
        int firstDigit = 0;
        int digits = 0;

        while (temp > 0) {
            firstDigit = temp;
            temp = temp / 10;
            digits++;
        }

        int power = 1;
        for (int i = 1; i < digits; i++) {
            power *= 10;
        }

        int middle = (num % power) / 10;
        int swappedNumber = lastDigit * power + middle * 10 + firstDigit;

        System.out.println("Number after swapping first and last digit: " + swappedNumber);

        sc.close();
    }
}