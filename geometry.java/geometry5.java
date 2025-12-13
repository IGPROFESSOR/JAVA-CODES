import java.util.Scanner;
public class Right_tri {
    public static void main (String[] args){
    Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int right=((a*a)+(b*b));
        int c2=c*c;
        if(right==c2){
            System.out.println("Right angle Triangle");
        }
        else{
            System.out.println("Not Right angle Triangle");
        }
        sc.close();
    }
    
}
