import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class WordsInAlphabeticalOrder060 {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Type a word: ");
            String word = input.nextLine();
            if(word.equals(""))
                break;
            else
                words.add(word);
        }
        System.out.println("You typed the following words:");
        Collections.sort(words);
        for(String i: words) {
            System.out.println(i);
        }
    }
}
