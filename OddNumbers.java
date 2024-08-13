import java.util.*;

public class OddNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter until which odd number you want in the sequence: ");
            int n = sc.nextInt();
            System.out.println("");
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 1) {
                    System.out.println(i);
                }
            }
        }
    }
}