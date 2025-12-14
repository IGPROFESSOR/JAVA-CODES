import java.util.Scanner;
public class q3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int Days=sc.nextInt();
        switch(Days){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            System.out.println("Weedkday");
            break;
            case 6:
            case 7:
            System.out.println("Weekend");
            break;
            default:
            System.out.println("Inalid number");
        }
        sc.close();

    }
}
