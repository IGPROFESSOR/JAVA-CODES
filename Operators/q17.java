import java.util.Scanner;
public class q17 {
 
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sc.close();
     if(a>0 && (a&(a-1))==0){
        System.out.println(a+" is a power of 2");
     }
     else{
        System.out.println(a+" is NOT power of 2");
     }
    }
}
