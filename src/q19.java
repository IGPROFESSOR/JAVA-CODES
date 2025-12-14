import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter data usage in MB: ");
        int usage = sc.nextInt();

        if (usage < 500) {
            System.out.println("Low Data");
        } else if (usage <= 1000) {
            System.out.println("Half Consumed");
        } else {
            System.out.println("Data Over");
        }

        sc.close();
    }
}
