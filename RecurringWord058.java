import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord058 {
  public static void main (String[] args) {
    ArrayList<String> words = new ArrayList<String>();
    Scanner input = new Scanner(System.in);
    while(true) {
      System.out.print("Type a word: ");
      String word = input.nextLine();
      if (word.equals("")) {
        System.out.println("You have indicated that you wish to end this list.");
        break;
      }
        else if (words.contains(word)) {
          System.out.println("You have already entered that word.");
        }
        else {
          words.add(word);
        }
    }
    System.out.println("You have entered the following words: ");
    for(String i: words) {
      System.out.println(i);
    }
  }
}
