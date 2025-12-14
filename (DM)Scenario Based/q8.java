import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int storedPIN = 1234; 
        int enteredPIN;
        int balance = 10000; 

        System.out.print("Enter your ATM PIN: ");
        enteredPIN = sc.nextInt();

        if (enteredPIN == storedPIN) {
            System.out.println("PIN verified successfully!");

            System.out.print("Enter amount to withdraw: ");
            int withdraw = sc.nextInt();

            if (withdraw <= balance) {
                balance -= withdraw;
                System.out.println("Please collect your cash.");
                System.out.println("Remaining Balance: ₹" + balance);
            } else {
                System.out.println("Insufficient Balance.");
            }

        } else {
            System.out.println("Invalid PIN! Access Denied.");
        }

        sc.close();
    }
}
