import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();      
        int digit = sc.nextInt();    

        if (num < 0) {
            num = -num;   
        }

        int count = 0;

        while (num > 0) {
            int rem = num % 10;

            if (rem == digit) {
                count++;
            }

            num = num / 10;
        }

        System.out.println(count);
        sc.close();
    }
}