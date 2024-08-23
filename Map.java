import java.util.*;

public class Map {
  public static void main(String[] args) {
    HashMap<String, String> capitalCities = new HashMap<>();

    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);
    //good Faster access to elements, can add key values. bad Size is limited.
  }
}