import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int temp;
        int[] a = new int[] {90,12,34,71,91,89};
        int n = a.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if (a[j]<a[i]){
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
