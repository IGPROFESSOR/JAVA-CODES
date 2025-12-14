import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 10000; 
        System.out.print("Enter amount to withdraw: ");
        int withdraw = sc.nextInt();

        if (withdraw > balance) {
            System.out.println("Error: Insufficient Balance.");
        } else if (withdraw % 100 != 0) {
            System.out.println("Error: Withdrawal amount must be a multiple of 100.");
        } else {
            balance -= withdraw;
            System.out.println("Please collect your cash.");
            System.out.println("Remaining Balance: ₹" + balance);
        }

        sc.close();
    }
}
