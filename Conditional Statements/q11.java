import java.util.Scanner;

public class q11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int digit=num1%100;
        if(digit%2==0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
    }sc.close();
    }
}
