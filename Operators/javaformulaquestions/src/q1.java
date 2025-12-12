import java.util.Scanner;
public class q1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int Length=sc.nextInt();
        int Breadth=sc.nextInt();
        int area;
        sc.close();
        area=Length*Breadth;
        System.out.println("area of Rectangle: "+area);
    }
} 