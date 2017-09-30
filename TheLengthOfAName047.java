import java.util.Scanner;
import java.util.ArrayList;

public class TheLengthOfAName047 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = input.nextLine();
        System.out.println("Number of characters: " + calculateCharacters(name)) ;

    }
    public static int calculateCharacters(String text) {
        return text.length();
    }
}
