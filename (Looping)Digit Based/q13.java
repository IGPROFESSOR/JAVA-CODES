import java.util.Scanner;

public class q13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

       
        boolean isNegative = false;
        if (num < 0) {
            isNegative = true;
            num = -num;
        }

        int result = 0;
        int place = 1;

        while (num > 0) {
            int digit = num % 10;
            if (digit != 0) {
                result = digit * place + result; 
                place *= 10;
            }
            num /= 10;
        }

        if (isNegative) {
            result = -result;
        }

        System.out.println("Number after removing all zeros: " + result);

        sc.close();
    }
}