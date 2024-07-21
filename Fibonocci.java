import java.util.Scanner;

public class Fibonocci {
    public static void main(String[] args) {
      
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter how many numbers you want to be in the Fibonocci: ");
            int n = sc.nextInt();
        int firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");
      
        for (int i = 1; i <= n; ++i) {
        System.out.print(firstTerm + ", ");
      
        int nextTerm = firstTerm + secondTerm;
        firstTerm = secondTerm;
        secondTerm = nextTerm;
        }
    }    
}
