import java.util.Scanner;

public class q14 {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("Divisible by both");
            } else {
                System.out.println("Not Divisible by both");
        }sc.close();
    }
}
