import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int lastDigit = num % 10;

        if (lastDigit % 3 == 0) {
            System.out.println( " is divisible by 3");
        } else {
            System.out.println(" is not divisible by 3");
        }sc.close();
    }
}
