import java.util.Scanner;

public class larg_three_nos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Your code starts here
        System.out.print("Enter a ");
        int a=scanner.nextInt();
        System.out.print("Enter b ");
        int b=scanner.nextInt();
        System.out.print("Enter c ");
        int c=scanner.nextInt();

        int max = a; 
        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        else{
            System.out.println(a);    
            }
          
            System.out.println("maximum no is "+ max);

        scanner.close();
    }
}