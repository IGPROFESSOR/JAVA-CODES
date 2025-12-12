import java.util.Scanner;
public class q10 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int perimeter;
        perimeter=a+b+c;
        sc.close();
        System.out.println("Perimeter of a triangle: "+perimeter);
    }
    
}
