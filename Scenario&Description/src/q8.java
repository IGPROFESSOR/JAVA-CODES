import java.util.Scanner;

public class q8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int total_cakes=sc.nextInt();
        int hour=sc.nextInt();
        System.out.println("Total Cakes "+total_cakes*hour);
        sc.close();
    }
}