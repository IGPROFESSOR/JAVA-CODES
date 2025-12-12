import java.util.Scanner;
public class q19 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d;
        d=a>b && a>c? b>a && b>c?a:b:c;
        sc.close();
        System.out.println(d);
    }
}
