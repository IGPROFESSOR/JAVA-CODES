import java.util.Scanner;

public class q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;

        if (b > 0) {
            for (int i = 0; i < b; i++) {
                result += a;
            }
        } else {
            for (int i = 0; i > b; i--) {
                result -= a;
            }
        }

        System.out.println(result);
        sc.close();
    }
}