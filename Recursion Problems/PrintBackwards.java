public class PrintBackwards {
  public static void main(String[] args) {
    int num = 5;
    Backwards(num);
  }

  public static void Backwards(int num) {
    if (num < 0) {
      return;
    }

    System.out.println(num);
    num--;
    Backwards(num);
  }
}
