import java.util.Scanner;
public class q10 {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int count=0;
    for(int i=1;i<=a;i++)
        if(a%i==0)
            count++;
        if(count==2)
            System.out.println("Prime number");
        else 
            System.out.println("Not a Prime Number");

        sc.close();
}    
}
