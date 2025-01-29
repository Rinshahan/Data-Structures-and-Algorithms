package Arrays;

public class Arrays {
  public static void main(String args[]) {
    int arr[] = { 1, 2, 3, 4 };
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    String cars[] = { "Suzuki", "Toyota", "Tata", "Mitsubishi" };
    for (int i = 0; i < cars.length; i++) {
      System.out.println(cars[i]);
    }

    Object[] myArray = { 1, "car", 2, 10.5, true };
    for (int i = 0; i < myArray.length; i++) {
      System.out.println(myArray[i]);
    }

    // for each loop for looping through arrays;

    String phones[] = { "Xiaomi", "Apple", "Samsung" };
    for (String i : phones) {
      System.out.println(i);
    }

  }
}
