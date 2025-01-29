package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterHash {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    String charac = scanner.nextLine();

    // precompute
    HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
    for (int i = 0; i < charac.length(); i++) {
      char currentChar = charac.charAt(i);
      hash.put(currentChar, hash.getOrDefault(currentChar, 0) + 1);
    }
    // queries
    System.out.println("Enter the query length");
    int queryLength = scanner.nextInt();
    while (queryLength > 0) {
      char character = scanner.next().charAt(0);
      System.out.println("The Character " + character + " Ocurred " + hash.getOrDefault(character, 0) + " Times");
    }
    scanner.close();
  }
}
