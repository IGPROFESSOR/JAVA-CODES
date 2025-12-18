import java.util.Scanner;

public class q7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String binary = sc.next();   

        int count0 = 0, count1 = 0;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                count0++;
            } else if (binary.charAt(i) == '1') {
                count1++;
            }
        }

        System.out.println("Number of 0s: " + count0);
        System.out.println("Number of 1s: " + count1);
        sc.close();
    }
}
