package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class OccurrenceHash {
  public static void main(String[] args) {
    // input
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the size of the array : ");
    int sizeOfArr = scanner.nextInt();
    int givenArr[] = new int[sizeOfArr];
    for (int i = 0; i < givenArr.length; i++) {
      givenArr[i] = scanner.nextInt();
    }

    // precompute
    HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
    for (int i = 0; i < givenArr.length; i++) {
      hash.put(givenArr[i], hash.getOrDefault(givenArr[i], 0) + 1);
    }
    System.out.println(hash);
    // entries
    System.out.println("Enter the size of the occ : ");
    int entrySize = scanner.nextInt();
    while (entrySize > 0) {
      int number = scanner.nextInt();
      System.out.println("The number " + number + " Occured " + hash.getOrDefault(number, 0) + " Times");
      entrySize--;
    }
    scanner.close();
  }
}
