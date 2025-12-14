import java.util.Scanner;
public class q2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the student mark: ");
        int marks=sc.nextInt();
        switch(marks/10){
            case 10:
            case 9:
            case 8:
                System.out.println("A grade");
                break;

            case 7:
            case 6:
                System.out.println("B grade");
                break;
            case 5:
                System.out.println("C grade");
                break;
                default:
                    System.out.println("Fail");

        }
        sc.close();

    }
}