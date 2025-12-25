import java.util.Scanner;

public class input2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Your code starts here
     
       /*So scanner.next only stores the one word of the 
       input eg tanmany shigwan it will store tanmay*/
        String Name = scanner.next();
        scanner.nextLine();
        System.out.println(Name);
        /*so if we use scanner.nextLine it will 
        give us full line eg tanamy shigwan then output also 
        tanmay shigwan */
        String name = scanner.nextLine();
        System.out.println(name);
         


        scanner.close();
    }
}