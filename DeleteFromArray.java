import java.util.*;

public class DeleteFromArray {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9,10));
        List<Integer> list1 = new ArrayList<>(Arrays.asList(0,5,10));
        System.out.println("List: " + list);
        list.removeAll(list1);
        System.out.println("Updated List: " + list);
     }
}