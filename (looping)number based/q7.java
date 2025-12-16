import java.util.Scanner;
public class q7 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int ams=0;
        int d;
        
        while(n!=0){
            d=n%10;
            ams=ams+(d*d*d);
            n=n/10;
        }
        if(temp==ams){
        System.out.println("amstrong number: "+ams);
        }
        else{ 
        System.out.println("not an amstrong number: "+ams);
         }
          sc.close();
    }
}
