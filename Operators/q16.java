import java.util.Scanner;
public class q16 {
     public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        String c;
        c = a==b?"true":"false";
        sc.close();
        System.out.println(c);
}
}