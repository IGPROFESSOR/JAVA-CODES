import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num < 0) {
            num = -num;   
        }

        while (num >= 10) {
            num = num / 10;
        }

        System.out.println(num);
        sc.close();
    }
}