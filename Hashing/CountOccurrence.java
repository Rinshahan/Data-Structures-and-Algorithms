import java.util.Scanner;

public class CountOccurrence {

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the size of the array : ");
    int sizeArr = scanner.nextInt();

    int givenArr[] = new int[sizeArr];

    for (int i = 0; i < givenArr.length; i++) {
      givenArr[i] = scanner.nextInt();
    }

    // pre compute
    int maxValue = 1000000000;
    int hash[] = new int[maxValue + 1];

    for (int i = 0; i < givenArr.length; i++) {
      hash[givenArr[i]] += 1;
    }

    System.out.print("size of the occurence");
    int occ = scanner.nextInt();

    while (occ > 0) {
      int number = scanner.nextInt();
      System.out.print("The Number " + number + " Occured " + hash[number] + " Times");
      occ--;
    }
    scanner.close();
  }
}