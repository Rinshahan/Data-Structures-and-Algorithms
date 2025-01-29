public class Factorial {
  public static void main(String[] args) {
    int num = 4;
    System.out.println(printFactorial(num));
  }

  public static int printFactorial(int num) {
    if (num == 1) {
      return num;
    }
    return num * printFactorial(num - 1);
  }
}