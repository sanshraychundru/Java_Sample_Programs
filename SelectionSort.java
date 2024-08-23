import java.util.*;
public class SelectionSort 
{ 
    static void sel_sort(int a[]) 
    { 
        int n = a.length; 
           for (int i = 0; i < n-1; i++) 
        { 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (a[j] < a[min_idx]) 
                    min_idx = j; 
               int temp = a[min_idx]; 
            a[min_idx] = a[i]; 
            a[i] = temp; 
        } 
    } 
    public static void main(String args[]) {
        int a[] = {7,5,2,20,42,15,23,34,10};
        System.out.println("Original Array:" + Arrays.toString(a)); 
        sel_sort(a); 
        System.out.println("Sorted Array:" + Arrays.toString(a)); 
    } 
}