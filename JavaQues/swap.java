import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Your code starts here
        System.out.println("Enter First No");
        int num1 =scanner.nextInt();
        System.out.println("Enter Seconcd Num");
        int num2 =scanner.nextInt();

        int temp = num1;
        num1=num2;
        num2=temp;

        System.out.println("the swap values are "+num1+"and"+num2);

        scanner.close();
    }
}