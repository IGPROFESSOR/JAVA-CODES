import java.util.Scanner;

public class Same_L2 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year1 = scanner.nextInt();
        int year2=scanner.nextInt();
        int L2=year1%100;
        int l2=year2%100;
        if(L2==l2){
            System.out.println(" same");
        } else {
            System.out.println("not same");
        }
        scanner.close(); 
}
}
