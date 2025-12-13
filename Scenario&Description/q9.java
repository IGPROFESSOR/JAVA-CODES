import java.util.Scanner;

public class q9{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int r=sc.nextInt();
        int t=sc.nextInt();
        double si=(p*r*t)/100;
        System.out.println(si);
        sc.close();
    }
}