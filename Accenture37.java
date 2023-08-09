import java.util.HashMap;
import java.util.Map;

public class Accenture37 {

  public static String letterCounts(String string) {
    Map<Character, Integer> letterCounts = new HashMap<>();
    for (char letter : string.toCharArray()) {
      if (letterCounts.containsKey(letter)) {
        letterCounts.put(letter, letterCounts.get(letter) + 1);
      } else {
        letterCounts.put(letter, 1);
      }
    }

    String output = "";
    for (char letter : letterCounts.keySet()) {
      output += String.format("%s: %d$", letter, letterCounts.get(letter));
    }
    return output;
  }

  public static void main(String[] args) {
    System.out.println(letterCounts("accenture"));
  }
}