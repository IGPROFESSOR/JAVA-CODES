import java.util.Scanner;
public class q5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int d;
        while(n!=0){
            d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        System.out.println("reverse of the number: "+rev);
        sc.close();
    }
}
