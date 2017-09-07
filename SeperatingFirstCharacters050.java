import java.util.Scanner;

public class SeperatingFirstCharacters050 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = input.nextLine();
        int i = 1;
        while (i <= 3) {
            System.out.println(i + ". character: " + name.charAt(i - 1));
            i++;
        }
    }

}
