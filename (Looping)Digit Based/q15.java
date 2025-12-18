import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isNegative = false;
        if (num < 0) {
            isNegative = true;
            num = -num;
        }
        int temp = num;
        int reversed = 0;
        if (num == 0) {
            reversed = 0;
        }

        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit; 
            temp /= 10;
        }

        if (isNegative) {
            System.out.print("Minus ");
        }
        if (reversed == 0) {
            System.out.print("Zero");
        } else {
            while (reversed > 0) {
                int digit = reversed % 10;

                switch (digit) {
                    case 0: System.out.print("Zero "); break;
                    case 1: System.out.print("One "); break;
                    case 2: System.out.print("Two "); break;
                    case 3: System.out.print("Three "); break;
                    case 4: System.out.print("Four "); break;
                    case 5: System.out.print("Five "); break;
                    case 6: System.out.print("Six "); break;
                    case 7: System.out.print("Seven "); break;
                    case 8: System.out.print("Eight "); break;
                    case 9: System.out.print("Nine "); break;
                }

                reversed /= 10;
            }
        }

        sc.close();
    }
 
}
