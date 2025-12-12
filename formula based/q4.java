import java.util.Scanner;
public class q4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();
        double area;
        area=3.14*radius*radius;
        sc.close();
        System.out.println("area of circle: "+area);
    }
}
