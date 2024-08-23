import java.util.*;

public class Set {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<>();
    cars.add("Ferrari");
    cars.add("Buggati");
    cars.add("Lamborgini");
    cars.add("Rolls Royce");
    cars.add("Koenigsegg");
    System.out.println(cars);

//bad Can be hard when looking up elements. good Does not allow dupicate elements.
  }
}