import java.util.Scanner;

public class calculator {

    public static void main(String [] args ) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an operation : ");
        String operator = sc.next();
        System.out.println("Enter number 1: ");
        int var1 =sc.nextInt();
        System.out.println("Enter number 2: ");
        int var2 = sc.nextInt();

        int answer = 0;
        switch (operator) {
            case "+":
                answer = var1 + var2;
                break;
            case "-":
                answer = var1 - var2;
                break; 
            case "*":
                answer = var1 * var2;
                break; 
            case "/":
                answer = var1 / var2;
                break; 
            default:
                System.out.println("Invalid Error");;
        }
        System.out.println(answer);
    }
}