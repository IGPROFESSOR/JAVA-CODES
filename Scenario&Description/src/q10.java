import java.util.Scanner;
public class q10 {
    public void main(String[] args){
        Scanner sc=new Scanner(System.in);  
        int Basic=sc.nextInt();
        int HRA=sc.nextInt();
        int ALLOWANCE=sc.nextInt();
        int salary=Basic+HRA+ALLOWANCE;
       
        System.out.println(salary);
        sc.close();
    }
}
