import java.util.Scanner;

public class string_func {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Your code starts here
        String Message = greet();
        System.out.print(Message);


        scanner.close();
    }
    static String greet(){
        String greeting ="How Are You";
        return greeting;
    }
}