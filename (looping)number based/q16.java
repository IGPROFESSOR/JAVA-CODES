import java.util.Scanner;
public class q16{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n=num;
        int sum=0;
        int d;
        int sq=n*n;
        while(sq!=0){
            d=sq%10;
            sum=sum+d;
            sq=sq/10;
        }
        if(num==sum) System.out.println("Neon number");
        else System.out.println("Not a neon number");
        sc.close();
    }
}