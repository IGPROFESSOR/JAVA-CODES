import java.util.Scanner;
public class q15{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    for(int i=1;i<=n/2;i++){
        if(n%i==0){
            sum=sum+i;
        }}
        if(n==sum) System.out.println("Perfect Number");
        else 
            System.out.println("Not a perfect number");
        sc.close();

}
}