import java.util.Scanner;

public class q22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numRows = scanner.nextInt();
        int c = 1;
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
        scanner.close();
    }
}