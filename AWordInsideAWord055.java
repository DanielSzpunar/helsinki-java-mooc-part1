import java.util.Scanner;

public class AWordInsideAWord055 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Type the first word: ");
        String firstWord = input.nextLine();

        System.out.print("Type the second word:");
        String secondWord = input.nextLine();

        int index = firstWord.indexOf(secondWord);

        if (!firstWord.contains(secondWord))
            System.out.println("The word '" + secondWord + "'" + " is not found in the word " + "'" + firstWord + "'");
        else if (firstWord.substring(index).equals(secondWord)) {
            System.out.println("The word '" + secondWord + "' is found in the word '" + firstWord + "'.");
        }
  }
}
