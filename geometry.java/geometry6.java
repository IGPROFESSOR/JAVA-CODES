import java.util.Scanner;
public class Valid_triangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=a+b+c;
        if(d==180){
            System.out.println("Valid Tri");
        }
        else{
            System.out.println("Not Valid");
        }
        sc.close();
    } 
}
