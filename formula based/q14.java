import java.util.Scanner;
public class q14 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();
        double SA=(4*3.14)*radius*radius;
        double Vol=(3.15*(radius*radius*radius)*4/3);
        sc.close();
        System.out.println("Surface Area of a Sphere: "+SA+"\nVolume of a Sphere: "+Vol);
    }
}
