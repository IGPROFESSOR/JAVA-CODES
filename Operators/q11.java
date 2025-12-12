import java.util.Scanner;
public class q11 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        a=a/10;
        a=a%10;
        sc.close();
        System.out.println("middle value :"+a);
    }
}
