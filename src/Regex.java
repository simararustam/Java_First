import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    /*
    * Write a program that takes a sentence as input
    * and uses regular expressions to find and print
    * all the words that start with the letter 'S'.
    */
    public static void main(String[] args) {
      String sentence = "The sun slowly set overs the shimmering sea.";

      Pattern pattern = Pattern.compile("\\bs\\w*");
      Matcher matcher = pattern.matcher(sentence);

      while (matcher.find()) {
          System.out.println("Words start with s: " + matcher.group());
      }
    }
}
