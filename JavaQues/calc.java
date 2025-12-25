import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Your code starts here
        int ans = 0;
        while(true){
            // use the operator
            System.out.println("Enter the operator");
            char op = scanner.next().trim().charAt(0);
            if(op == '*'|| op =='+'|| op == '-' || op == '/' || op == '%')
            {
            System.out.println("Enter Num 1");
            int num1=scanner.nextInt();
            System.out.println("Enter Num 2");
            int num2=scanner.nextInt();

            if(op == '+'){
                ans = num1+num2;
            }
             if(op == '-'){
                ans = num1-num2;
            }
             if(op == '/'){
                ans = num1/num2;
            }
            if(op == '%'){
                ans = num1%num2;
            }
            if(op=='*'){
                ans = num1*num2;
            }
            else if(op == 'X' || op == 'x'){
                break;
            }
            else{
                System.out.println("invalid");
            }
            System.out.println(ans);


            }
        }

        scanner.close();
    }
}