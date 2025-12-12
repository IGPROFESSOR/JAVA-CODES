import java.util.Scanner;
public class q12 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b;
        b=a<0?-a:a;
        sc.close();
        System.out.println(b);
    }
}
