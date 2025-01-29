public class FunctionalSum {
  public static void main(String[] args) {
    int num = 3;
    System.out.println(printSum(num));
  }

  public static int printSum(int num) {
    if (num == 0) {
      return num;
    }
    return num + printSum(num - 1);
  }
}
