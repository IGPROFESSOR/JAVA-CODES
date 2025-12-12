import java.util.Scanner;
public class q15 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int average=a+b+c;
        sc.close();
        System.out.println("average of three numbers: "+(average/3));
    }
    
}
