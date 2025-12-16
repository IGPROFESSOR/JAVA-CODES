import java.util.Scanner;
public class q14 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       int n=num;
        int d;
    int sum=0;
        while(n!=0){
            d=n%10;
            int fact=1;
            while(d>0){
                fact=fact*d;
                d--;
            }
            sum=sum+fact;
            n=n/10;
        }
        if(sum==num) System.out.println("Strong number: "+sum);
        else System.out.println("not a Strong number: "+sum); 
        sc.close();
    }
}
