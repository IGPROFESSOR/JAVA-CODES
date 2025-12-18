import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int largest = 0;
        int temp = Math.abs(num); 

        while (temp > 0) {
            int digit = temp % 10; 
            if (digit > largest) {
                largest = digit;   
            }
            temp = temp / 10;      
        }

        System.out.println("The largest digit in the number is: " + largest);

        sc.close();
    }
}
