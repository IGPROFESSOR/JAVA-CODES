import java.util.Scanner;

public class q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        if (num>0 && num<10) {
            System.out.println("Single Digit");
        } else if (num>=10 && num<100) {
            System.out.println("Two Digit");
        } else {
            System.out.println("Three Digit");
        }sc.close();
    }
}