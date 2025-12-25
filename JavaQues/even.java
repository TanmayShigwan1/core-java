import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Your code starts here
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        if (num%2 == 0) {
            System.out.println("Given no is even");
            
        }
        else{
            System.out.println("Given No is Odd");
        }

        scanner.close();
    }
}