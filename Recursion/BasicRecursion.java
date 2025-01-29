public class BasicRecursion {
  static int count = 0;

  public static void printCount() {
    if (count == 3) {
      return;
    }
    System.err.println(count);
    count++;
    printCount(); // Recursive call of the function
  }

  public static void main(String[] args) {
    printCount();
  }
}
