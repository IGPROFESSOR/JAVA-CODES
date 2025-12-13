import java.util.Scanner;

public class q19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 =sc.nextInt(); 
        int product = num1 * num2;
        if(product > 0) {
            System.out.println("The product is positive.");
        } else if(product < 0) {
            System.out.println("The product is negative.");
        } else {
            System.out.println("The product is zero.");
        }   sc.close();
    }
}
