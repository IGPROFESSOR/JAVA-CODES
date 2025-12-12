import java.util.Scanner;
public class q6 {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        double far=sc.nextDouble();
        double cel;
        cel=(far-32)*5/9;
        sc.close();
        System.out.println("Fahrenheit to celsius: "+cel);
    }
    
}
