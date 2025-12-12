import java.util.Scanner;
public class q18 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String b;
        b=a>0?"Positive":"Negative";
        sc.close();
        System.out.println(b);
    }
}
