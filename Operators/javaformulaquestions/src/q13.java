import java.util.Scanner;
public class q13 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int h=sc.nextInt();
        int b=sc.nextInt();
        int SA=2*((l*b)+(b*h)+(l*h));
        int vol=l*b*h;
        sc.close();
        System.out.println("Surface Area Volume of a cubiod: "+SA+"\nVolume of a cuboid: "+vol);
    }
    
}
