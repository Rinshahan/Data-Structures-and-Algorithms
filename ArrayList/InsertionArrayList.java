package ArrayList;

import java.util.ArrayList;

// inlcuded insertion and deletion;
public class InsertionArrayList {
  public static void main(String args[]) {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(1);
    arr.add(2);
    arr.add(1, 4);
    arr.remove(2);
    for (int i : arr) {
      System.out.println(i);
    }
  }
}