package ArrayList;

import java.util.ArrayList;

public class SearchingArrayList {
  public static void main(String args[]) {
    ArrayList<Integer> arr = new ArrayList<>();

    arr.add(1);
    arr.add(2);
    arr.add(3);

    int searchElement = 3;

    for (int i = 0; i < arr.size(); i++) {
      if (arr.get(i) == searchElement) {
        System.out.println(i);
      }
    }
  }
}
