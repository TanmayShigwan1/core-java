import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Your code starts here
        //print no from 1 to 5
        /* 
         * for (int;condi;inc/dec){
         * body}
         */
        for(int i=1;i<=5;i+=2){
            System.out.println(i);
        }

        //print no 1 to n 
        int n= scanner.nextInt();
        for ( int num =0 ;num<=n;num++){
            System.out.println(num);       
         }

       int m=scanner.nextInt();
       for(int multi=1; multi<=m; multi+=2)
       {
       System.out.println(multi);  
       }
        scanner.close();
    }
}