import java.util.Scanner;

public class q12 {
   public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int lastDigit = a % 10;
        if (lastDigit % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }sc.close();
    }
}