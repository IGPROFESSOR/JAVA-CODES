import java.util.Scanner;
public class q19 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sq;
        sq=num*num;
        if(num==sq%100)
            System.out.println("Automorphuc number");
        else System.out.println("not a automorphic number");
        sc.close();
    }
}
