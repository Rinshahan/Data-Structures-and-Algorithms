public class PalindromeString {
  public static void main(String[] args) {
    String name = "malayalam";
    System.out.println(checkPalindrome(name, 0));

  }

  public static boolean checkPalindrome(String name, int index) {
    if (index >= name.length() / 2) {
      return true;
    }
    if (name.charAt(index) != name.charAt(name.length() - index - 1)) {
      return false;
    }

    return checkPalindrome(name, index + 1);
  }
}