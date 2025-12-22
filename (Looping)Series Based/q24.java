import java.util.Scanner;

public class q24{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        System.out.println("Numbers between 1 and " + N + " which are powers of 2:");

        int num = 1;

        while (num <= N) {
            System.out.println(num);
            num *= 2;
        }sc.close();
    }
}

