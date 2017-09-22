import java.util.Scanner;

public class Palindrome069 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Type text: ");
        String text = input.nextLine();

        if(palindrome(text))
            System.out.println("The text is a palindrome.");
        else
            System.out.println("The text is not a palindrome.");
    }

    public static boolean palindrome(String text) {
        String reverse = "";
        int i = text.length() - 1;
        while (i >= 0) {
            reverse += text.charAt(i);
            i--;
        }
        if (reverse.equals(text)) return true;
        else return false;
    }
}
