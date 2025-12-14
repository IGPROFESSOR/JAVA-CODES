import java.util.Scanner;
public class q4 {
    public static void main(String[]args){
        System.out.println("Enter the number of month: ");
        Scanner sc=new Scanner(System.in);
        int Month=sc.nextInt();
        switch(Month){
            case 12:
            case 1:
            case 2:
                System.out.println("Season:Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Season:Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Season:Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Season:Autum");
                break;
                default:
                    System.out.println("Inavlid format");

        
        }
    sc.close();
}}