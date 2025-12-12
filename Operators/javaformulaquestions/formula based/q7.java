import java.util.Scanner;
public class q7 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double cel=sc.nextDouble();
        double far;
        far = (cel*9/5)+32;
        sc.close();
        System.out.println("celsius to Fahrenheit: "+far);

    }
}
