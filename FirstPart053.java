import java.util.Scanner;

public class FirstPart053 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type a word: ");
        String word = input.nextLine();
        System.out.println("Length of the First Part: ");
        int lengthOfFirstPart = Integer.parseInt(input.nextLine());
        System.out.println("Result: " + word.substring(0,lengthOfFirstPart));
    }
}
