import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int binary = sc.nextInt();   
        int decimal = 0;
        int place = 1;

        while (binary > 0) {
            int rem = binary % 10;
            decimal = decimal + rem * place;
            place = place * 2;
            binary = binary / 10;
        }

        System.out.println(decimal);
        sc.close();
    }
}