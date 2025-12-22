import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i ++) {
            if(i%2==0)
            System.out.println(i);
        }sc.close();
    }
}
