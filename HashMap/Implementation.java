package HashMap;

import java.util.HashMap;

public class Implementation {
  public static void main(String[] args) {
    HashMap<String, String> capital = new HashMap<String, String>();
    capital.put("Tamil Nadu", "Chennai");
    capital.put("Kerala", "Trivandrum");

    for (String i : capital.keySet()) {
      System.out.println(i + "'s Capital is " + capital.get(i));
    }
  }
}