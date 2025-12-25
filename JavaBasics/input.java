import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Your code starts here
        System.out.print("Enter Your Roll no :");
        int rollno = scanner.nextInt();
        System.out.println("Your Roll No is "+rollno);

        scanner.close();
    }
}