import java.util.Scanner;

public class CharacterOccurrence {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the Characters: ");
    String characters = scanner.nextLine();

    int maxValue = 26;
    int hash[] = new int[maxValue];
    for (int i = 0; i < characters.length(); i++) {
      char currentChar = characters.charAt(i);
      if (currentChar >= 'a' && currentChar <= 'z') {
        hash[currentChar - 'a']++;
      }
    }

    System.out.println("Enter the number of queries: ");
    int occu = scanner.nextInt();

    while (occu > 0) {
      System.out.println("Enter the character to check occurrence:");
      char chara = scanner.next().charAt(0);
      System.out.println("The character " + chara + " occurred " + hash[chara - 'a'] + " times");
      occu--;
    }

    scanner.close();
  }
}