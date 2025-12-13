import java.util.Scanner;
public class F2_L2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int F2=year/100;
        int L2=year%100;
        if(F2==L2){
            System.out.println(" same");
        } else {
            System.out.println("not same");
        }
        scanner.close();
    }
    
}
