import java.util.Scanner;

public class q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        System.out.println("Buzz numbers from 1 to " + N + " are:");

        for (int i = 1; i <= N; i++) {
            if (i % 7 == 0 || i % 10 == 7) {
                System.out.println(i);
            }
        }sc.close();
    }
}

