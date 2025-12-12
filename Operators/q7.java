import java.util.Scanner;
public class q7 {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        sc.close();
        System.out.println(a+" "+b);
    }
}
