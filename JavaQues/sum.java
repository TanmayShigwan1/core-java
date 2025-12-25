import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Your code starts here
        float a,b;
        System.out.print("Enter first Number :");
        a = scanner.nextFloat();
        System.out.print("Enter Second Number");
        b = scanner.nextFloat();
        float sum = a+b;
        System.out.println("The Sum of Two number is : "+ sum );

        scanner.close();
    }
}