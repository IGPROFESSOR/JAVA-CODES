import java.util.Scanner;

public class q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = n;

        while (sum > 9) {
            int temp = sum;
            sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
        }

        if (sum == 1)
            System.out.println("Magic Number");
        else
            System.out.println("Not a Magic Number");
        sc.close();
    }
}