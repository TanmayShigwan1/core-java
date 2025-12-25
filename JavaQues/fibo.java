import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Your code starts here
         int n =scanner.nextInt();
         int p=0;
         int i=1;
         int count =2;
         while (count <= n) {
            int temp =i;
            i = i+p;
            p = temp;
            count++;
            
         }
         System.out.println(i);

        scanner.close();
    }
}