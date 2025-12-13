import java.util.Scanner;

public class q17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 =sc.nextInt();
        int num2 =sc.nextInt();
        int lastDigit1 = num1 % 10;
        int lastDigit2 = num2 % 10;

        if (lastDigit1 == lastDigit2) {
            System.out.println("Same last digit");
        } else {
            System.out.println("Different last digits");
        }sc.close();
    }
}
