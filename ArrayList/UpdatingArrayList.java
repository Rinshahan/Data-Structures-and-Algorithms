package ArrayList;

import java.util.ArrayList;

public class UpdatingArrayList {
  public static void main(String args[]) {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(1);
    arr.add(2);
    arr.add(3);

    for (int i : arr) {
      System.out.println(i);
    }

    arr.set(1, 6);

    for (int i : arr) {
      System.out.println(i);
    }
  }
}

/*
 * 1
 * 2
 * 3
 * 
 * 1
 * 6
 * 3
 */
