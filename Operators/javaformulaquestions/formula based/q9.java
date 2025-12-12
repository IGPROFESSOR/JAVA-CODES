import java.util.Scanner;
public class q9 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        int perimeter;
        perimeter=2*(length+breadth);
        sc.close();
        System.out.println("Perimeter of a rectangle: "+perimeter);
    }
}
