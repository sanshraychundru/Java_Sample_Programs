import java.util.*;

public class MultiplicationTable {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter which number you want or the times table: ");
            int num = sc.nextInt();
            System.out.println("");
            System.out.println("Enter how many numbers you want in the times table: ");
            int n = sc.nextInt();
            System.out.println("");
            for(int i = 1; i <= n; ++i)
            {
                System.out.printf("%d * %d = %d \n", num, i, num * i);
            }
    }
    }
}