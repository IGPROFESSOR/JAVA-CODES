import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 3 == 0 || num % 7 == 0) {
            System.out.println("Divisible by either 3 or 7");
        } else {
            System.out.println("Not divisible by either 3 or 7");
        }   sc.close();
    }
}
