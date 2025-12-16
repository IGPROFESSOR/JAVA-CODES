import java.util.Scanner;
public class q4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pro=1;
        int d;
        while(n!=0){
            d=n%10;
            pro=pro*d;
            n/=10;
        }
        System.out.println(" product of digits: "+pro);
        sc.close();
    }
}
