import java.util.Scanner;

public class q26{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        System.out.println("Perfect cubes from 1 to " + N + " are:");

        for (int i = 1; i * i * i <= N; i++) {
            System.out.println(i * i * i);
        }sc.close();
    }
}
