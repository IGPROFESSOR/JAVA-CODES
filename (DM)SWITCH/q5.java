import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 10000;   // initial balance
        int choice;
        int amount;

        System.out.println("----- MINI ATM -----");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Your Balance = ₹" + balance);
                break;

            case 2:
                System.out.print("Enter deposit amount: ");
                amount = sc.nextInt();
                balance = balance + amount;
                System.out.println("Amount Deposited Successfully");
                System.out.println("Updated Balance = ₹" + balance);
                break;

            case 3:
                System.out.print("Enter withdrawal amount: ");
                amount = sc.nextInt();
                if (amount <= balance) {
                    balance = balance - amount;
                    System.out.println("Please collect your cash");
                    System.out.println("Remaining Balance = ₹" + balance);
                } else {
                    System.out.println("Insufficient Balance");
                }
                break;

            case 4:
                System.out.println("Thank you for using ATM");
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
