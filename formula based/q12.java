import java.util.Scanner;
public class q12 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double surfacearea=6*(a*a);
        double volume=a*a*a;
        double perimeter=4*a;
        sc.close();
        System.out.println("\nArea: "+surfacearea+"\nvolume: "+volume+"\nperimeter of cube: "+perimeter);
    }
}
