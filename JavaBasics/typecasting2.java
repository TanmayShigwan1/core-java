import java.util.Scanner;

public class typecasting2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Your code starts here
        byte b= 42;
        char c = 'a';
        short s = 1024;
        double d =0.1234;
        float f =5.67f;
        int i = 50000;

        double result = (f*b)+(i/c)-(d-s);
        System.out.println((f*b) +(i/c)-(d-s));
        System.out.println(result);
        scanner.close();
    }
}