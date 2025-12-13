import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       if(number >= 100 && number <= 999) {
           System.out.println("Three Digit Number");
       } else {
           System.out.println("Not a Three Digit Number");
       }sc.close();
    }
}
