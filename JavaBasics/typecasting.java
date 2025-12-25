import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Your code starts here
        int num = (int)(67.55f);
        System.out.println(num);

        int a = 7;
        byte b = (byte)(a);
        System.out.println(b);

        int number = 'a';
        System.out.println(number);

        scanner.close();
    }
}