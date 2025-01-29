public class ParameterizedSum {
  public static void main(String args[]) {
    int num = 3;
    printSum(num, 0);
  }

  public static void printSum(int num, int sum) {
    if (num < 1) {
      System.out.println(sum);
      return;
    }
    printSum(num - 1, sum + num);
  }
}

// used back tracking