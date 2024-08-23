import java.util.*;

public class calculator {

    public static void main(String [] args ) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter an operation +, -, *, or /: ");
            String operator = sc.next();
            System.out.println("Enter number 1: ");
            int var1 =sc.nextInt();
            System.out.println("Enter number 2: ");
            int var2 = sc.nextInt();

            double answer = 0;
            switch (operator) {
                case "+" -> answer = var1 + var2;
                case "-" -> answer = var1 - var2;
                case "*" -> answer = var1 * var2;
                case "/" -> answer = var1 / var2;
                default -> {
                    System.out.println("Invalid Error");;
                }
            }
            System.out.println(answer);
        }
    }
}