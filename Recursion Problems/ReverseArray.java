public class ReverseArray {
  public static void main(String args[]) {
    int arr[] = { 1, 2, 3, 4, 5 };
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    reverseArray(arr, 0, arr.length - 1);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void reverseArray(int arr[], int start, int end) {
    if (start >= end) {
      return;
    }
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;

    reverseArray(arr, start + 1, end - 1);
  }
}

// used two pointer technique here