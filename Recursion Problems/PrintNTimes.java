import java.util.Scanner;

public class PrintNTimes {
  static int count = 0;

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("What do you want to print ?");
    String name = sc.nextLine();
    System.out.println("how Many times you need Print ?");
    int count = sc.nextInt();
    printName(name, count);
    sc.close();
  }

  public static void printName(String name, int counts) {
    if (count == counts) {
      return; // base case
    }

    System.out.println(name);
    count++;
    printName(name, counts);
  }
}
