import java.util.Scanner;
public class q6 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int rev=0;
        int d;
        while(n!=0){
            d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        if(temp==rev)
        System.out.println("palindrome number");
    else 
        System.out.println("Not a palindrome");
        sc.close();
    }
}
