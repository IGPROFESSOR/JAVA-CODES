import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char start = sc.next().charAt(0);
        char end = sc.next().charAt(0);

        if (start <= end) {
            for (char ch = start; ch <= end; ch++) {
                System.out.print(ch + " ");
            }
        } else {
            for (char ch = start; ch >= end; ch--) {
                System.out.print(ch + " ");
            }
            sc.close();
        }
    }
}

