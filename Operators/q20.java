import java.util.Scanner;
public class q20 {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String b;
        b=a>=50?"Pass":"Fail";
        sc.close();
        System.out.println(b);
    }
    
}
