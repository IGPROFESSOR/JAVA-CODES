public class q20 {

    public static void main(String[]args){
        int n=5;
      for(int i=1;i<=n;i++){
           for(int j=1;j<=n;j++){
            if(i==1||i==j){
                System.out.print("* ");
        }
        else
            System.out.print("  ");
            } 
               
              for(int j=2;j<=n;j++){
            if(i==1||i+j==n+1){
                System.out.print("* ");
            }
                else
                    System.out.print("  ");
            }
        System.out.println();
    }    
   
        for(int i=2;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==n||i+j==n+1){
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            for(int j=2;j<=i;j++){
                if(i==n||i==j){
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            
            System.out.println();
        }
    
    }
    }

