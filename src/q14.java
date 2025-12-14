import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter passenger age: ");
        int age = sc.nextInt();
        double price;

        
        if (age >= 0 && age <= 12) {
            price = 50; 
            System.out.println("Passenger category: Child");
        } else if (age >= 13 && age <= 59) {
            price = 100; 
            System.out.println("Passenger category: Adult");
        } else if (age >= 60) {
            price = 70; 
            System.out.println("Passenger category: Senior");
        } else {
            System.out.println("Invalid age entered!");
            sc.close();
           return;

        }

        System.out.println("Ticket Price: ₹" + price);
        sc.close();
    }
}
