import java.util.Scanner;

public class LastCharacter049 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = input.nextLine();
        System.out.println("Last character: " + firstCharacter(name));


    }
    public static char firstCharacter(String text) {
        return text.charAt(text.length()-1);
    }
}
