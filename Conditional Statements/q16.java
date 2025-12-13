import java.util.Scanner;
public class q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0 && number % 5 == 0 && number % 8 != 0) {
            System.out.println("Divisible by 2 and 5 but not by 8");
        } else {
            System.out.println("Nope");
        }
        scanner.close();
    }
}