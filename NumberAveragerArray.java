public class NumberAveragerArray {
    public static void main(String[] args) {
        int[] numbers = {9, -6, 2, 34, 12, -42, 24, 343, 23};
        int sum = 0;
        Double average;

        for (int number: numbers) {
          sum += number;
        }

        int arrayLength = numbers.length;

        average =  ((double)sum / (double)arrayLength);
     
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}