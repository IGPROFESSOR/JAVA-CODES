import java.util.Scanner;

public class q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num < 0) {
            num = -num;  
        }

        boolean ascending = true;
        int prevDigit = num % 10;
        num = num / 10;

        while (num > 0) {
            int currDigit = num % 10;
            if (currDigit > prevDigit) {
                ascending = false;
                break;
            }
            prevDigit = currDigit;
            num = num / 10;
        }

        if (ascending) {
            System.out.println("Digits are in ascending order");
        } else {
            System.out.println("Digits are not in ascending order");
        }sc.close();
    }
}