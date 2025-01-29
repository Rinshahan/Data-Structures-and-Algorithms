package Arrays;

public class UpdationArray {
  public static void main(String args[]) {
    int arr[] = { 1, 2, 3 };
    int updateNumber = 3;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == updateNumber) {
        arr[i] = 4;
      }
    }

    for (int i : arr) {
      System.out.println(i);
    }
  }
}

// Why Updating Works but Adding Does Not
// Updating: You are modifying an existing element. Arrays have fixed memory for
// their elements, so you can directly change the value at any valid index.
// Adding: Adding requires allocating new memory to accommodate additional
// elements, which arrays don't support directly due to their fixed size. For
// this, you need a new array or a data structure like ArrayList.
