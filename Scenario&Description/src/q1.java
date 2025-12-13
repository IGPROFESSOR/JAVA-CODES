import java.util.Scanner;
public class q1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        double discount=a/b;
        double og;
        og=a-discount;
        sc.close();
        System.out.println("Discount Amount: "+discount+"\nFinal Price: "+og);
        
    }
}