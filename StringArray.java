import java.util.*;

public class StringArray {   
    public static void main(String[] args){
           
          String a[] = { "A", "B", "C", "D", "E", "F" }; 
          
        System.out.println("Initial Array:\n"  
                           + Arrays.toString(a));   
        String ne = "G";  
        List<String>l = new ArrayList<>(  
                  Arrays.asList(a));  
        l.add(ne);  
        a = l.toArray(a);  
        System.out.println("Array with added Value: \n"  
                           + Arrays.toString(a)) ;    
    }   
}  