import java.util.Scanner;
public class q2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int d;
        while(n!=0){
            d=n%10;
            sum=sum+d;
            n/=10;
        }
        System.out.println("Sum of digits: "+sum);
        sc.close();
    }
}
