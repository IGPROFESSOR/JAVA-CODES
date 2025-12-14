import java.util.Scanner;
public class q1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1st number: ");
        int a=sc.nextInt();
        System.out.println("enter the 2nd number: ");
        int b=sc.nextInt();
        System.out.println("enter the operator: ");
        char op=sc.next().charAt(0);
        switch(op){
            case '+': 
            System.out.println("addition: "+(a+b));
            break;
            case '-':
            System.out.println("subtraction: "+(a-b));
            break;
            case'*':
            System.out.println("multiplication: "+(a*b));
            break;
            case'/':
            System.out.println("division:"+(a/b));
            break;
            case'%':
            System.out.println("modules: "+(a%b));
            break;
        }
        sc.close();
    }
}
