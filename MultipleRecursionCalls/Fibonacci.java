package MultipleRecursionCalls;

public class Fibonacci {
  public static void main(String args[]) {
    int num = 3;
    System.out.println(returnNthFibonacci(num));
  }

  public static int returnNthFibonacci(int num) {
    if (num <= 1) {
      return num;
    }
    return returnNthFibonacci(num - 1) + returnNthFibonacci(num - 2);
  }
}
