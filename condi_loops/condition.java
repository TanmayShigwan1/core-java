import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Your code starts here
        /*
         * syntax of if 
         * if(condition){
         * body
         * }
         * else{
         * body
         * }
         */
        int salary =25000;
        if(salary>20000){
            salary = salary+5000;
        }
        else if (salary>10000){
            salary = salary+2000;
        }
       
        else{
            salary =+ 500;
        }
         System.out.println(salary);

        scanner.close();
    }
}