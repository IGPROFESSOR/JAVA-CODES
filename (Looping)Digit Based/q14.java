import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            num = -num;
        }

        int sumSquares = 0;
        int sumCubes = 0;

        while (num > 0) {
            int digit = num % 10;
            int square = digit * digit;
            int cube = digit * digit * digit;

            sumSquares += square;
            sumCubes += cube;

            num /= 10;
        }

        System.out.println("Sum of squares of digits: " + sumSquares);
        System.out.println("Sum of cubes of digits: " + sumCubes);

        sc.close();
    }
}