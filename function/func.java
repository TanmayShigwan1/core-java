import java.util.Scanner;

public class func {
    public static void main(String[] args) {
       

        // Your code starts here
        //input of two no and print sum by function
       
        int ans =sum2();
        System.out.println(ans);

        int sumsu =ans+2;
        System.out.print(sumsu);

    
        
    }

    static int sum2(){
         Scanner scanner = new Scanner(System.in);
     System.out.print("Enter first Number :  ");
     int num1= scanner.nextInt();
     System.out.print("Enter Second Number : ");
     int num2 =scanner.nextInt();
    int sum=num1+num2;
     return sum;
    }
   static  void sum(){
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter first Number :  ");
     int num1= scanner.nextInt();
     System.out.print("Enter Second Number : ");
     int num2 =scanner.nextInt();
     int sum=num1+num2;
     System.out.println("The sum of " +num1 +" And "+ num2 + "is :"+sum);

    }
}