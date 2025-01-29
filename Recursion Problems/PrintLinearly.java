import java.util.Scanner;

public class PrintLinearly {
  static int count = 1;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int number = scanner.nextInt();
    printNLinearly(number);
    scanner.close();
  }

  public static void printNLinearly(int Num) {
    if (count > Num) { // base case
      return;
    }
    System.out.println(count);
    count++;
    printNLinearly(Num);
  }
}
