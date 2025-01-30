public class InsertionSort {
  public static void main(String args[]) {
    int arr[] = { 5, 1, 16, 12, 10, 11 };
    for (int i = 1; i <= arr.length - 1; i++) {
      int key = i;
      while (key > 0 && arr[key - 1] > arr[key]) {
        int temp = arr[key - 1];
        arr[key - 1] = arr[key];
        arr[key] = temp;
        key--;
      }
    }

    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
