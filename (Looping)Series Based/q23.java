import java.util.Scanner;

public class q23 {
   
    public static boolean isMagic(int num) {
        int sum = num;

        while (sum > 9) { 
            int temp = sum;
            sum = 0;

            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
        }

        return sum == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        System.out.println("Magic numbers from 1 to " + N + " are:");

        for (int i = 1; i <= N; i++) {
            if (isMagic(i)) {
                System.out.println(i);
            }
        }sc.close();
    }
}

