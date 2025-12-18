import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = Math.abs(num); 
        int smallest = 9;         

        while (temp > 0) {
            int digit = temp % 10;   
            if (digit < smallest) {
                smallest = digit;   
            }
            temp = temp / 10;     
        }

        System.out.println("The smallest digit in the number is: " + smallest);

        sc.close();
    }
}