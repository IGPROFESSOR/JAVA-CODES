import java.util.Scanner;
public class q13{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=0;
        for(int i=1;i*i<=n;i++)
            if(i*i==n){
                t=1;
                break;
            }
            if(t==1)
            System.out.println("Perfect Square");
        else 
            System.out.println("not a perfect square");
        sc.close();
    }
}
