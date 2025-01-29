public class BackTracking {

  public static void main(String args[]) {
    int number = 1;
    linearPrint(number);
  }

  public static void linearPrint(int num) {
    if (num > 10) {
      return;
    }
    linearPrint(num + 1);
    System.out.println(num);
  }

}