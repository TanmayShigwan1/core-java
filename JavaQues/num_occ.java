import java.util.Scanner;

public class num_occ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Your code starts here
        System.out.println("enter the numbers");
        int n = scanner.nextInt();
        System.out.println("enter the no you want");
        int m =scanner.nextInt();
        int count = 0;
        while(n>0){
            int rem = n%10;
            if(rem == m){
                count++;
            }
            n=n/10;
        }
System.out.println(count);
        scanner.close();
    }
}