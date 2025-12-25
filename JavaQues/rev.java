import java.util.Scanner;

public class rev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Your code starts here
        System.out.println("enter the no to rev");
        int org = scanner.nextInt();
        int rev = 0;
        while(org>0){
            int rem = org%10;
            org /=10;

            rev = rev*10+rem;

        }
        System.out.println(rev);


        scanner.close();
    }
}