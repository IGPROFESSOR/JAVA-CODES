import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter price per pen: ");
        int price = sc.nextInt();

        System.out.print("Enter total pens bought: ");
        int bought = sc.nextInt();
        int groups = bought / 5;
        int freePens = groups * 2;
        int payPens = bought - freePens;
        int amount = payPens * price;

        System.out.println("Pay For: " + payPens);
        System.out.println("Total amount: " + amount);
        sc.close();
    }
}