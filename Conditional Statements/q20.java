import java.util.Scanner;
public class q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        int ascii = (int) ch;  
        System.out.println(ch + " = " + ascii);
        if (ascii % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }sc.close();
    }
}