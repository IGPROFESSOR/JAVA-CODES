import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        int count = 0;
        int number = 1;

        while (count < N) {
            System.out.println(number);
            number += 2;
            count++;
        }sc.close();
    }
}
