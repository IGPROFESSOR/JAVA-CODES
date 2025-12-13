import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); 
        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println(" is odd");
        }sc.close();
    }
}