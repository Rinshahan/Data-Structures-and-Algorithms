package Arrays;

public class SearchingArray {
  public static void main(String args[]) {
    int arr[] = { 1, 2, 3 };
    int search = 3;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == search) {
        System.out.println(i);
      }
    }
  }
}

// this is linear search