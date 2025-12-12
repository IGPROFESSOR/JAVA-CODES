import java.util.Scanner;
public class q3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double base=sc.nextDouble();
        double height=sc.nextDouble();
        double area;
        area=(base*height)*1/2;
        sc.close();
        System.out.println(" area of Triangle: "+area);
    }
    
}
