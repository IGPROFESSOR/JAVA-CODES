import java.util.Scanner;

public class  q7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total_Candies = sc.nextInt();
        int total_Students = sc.nextInt();
        System.out.println("Each Gets: "+total_Candies / total_Students);
        System.out.println("Remaining: "+total_Candies % total_Students);
        sc.close();
    }
}