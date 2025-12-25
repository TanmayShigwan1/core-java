import java.util.Scanner;

public class tempconv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Your code starts here
        System.out.println("Please Enter the temp in C: ");
        float celc = scanner.nextFloat();
        float far = celc *  9/5 +32 ;
        double kel = celc+273.15;
        System.out.println("The conv of celc to far is "+ far);
         System.out.println("The conv of celc to far is "+ kel);

        scanner.close();
    }
}