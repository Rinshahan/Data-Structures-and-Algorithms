public class ReverseArraySingePointer {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4 };
    reverseArray(arr, 0);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void reverseArray(int arr[], int index) {
    if (index >= arr.length / 2) { // 0, 4/2 = 2
      return;
    }
    int temp = arr[index];
    arr[index] = arr[arr.length - index - 1];
    arr[arr.length - index - 1] = temp;

    reverseArray(arr, index + 1);
  }
}
