import java.util.Scanner;
public class q15 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double height=sc.nextDouble();
        double radius=sc.nextDouble();
        Double SA=2*3.14*radius*(radius+height);
        double Vol=3.14*(radius*radius*height);
        sc.close();
        System.out.println("Surface Area of cylinder"+SA+"\nVolume of a cylinder"+Vol);
    }
    
}
