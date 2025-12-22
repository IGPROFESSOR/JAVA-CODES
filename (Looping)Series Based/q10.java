import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to add: ");
        int N = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= N; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();
            sum = sum + num;
        }

        System.out.println("Sum of the given numbers is: " + sum);
    sc.close();}
}
