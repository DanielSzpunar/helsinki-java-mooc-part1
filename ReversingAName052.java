import java.util.Scanner;

public class ReversingAName052 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        **The Below Formula Works But Can Not Print In Reverse Order:
        String name = input.nextLine();
        int i = 1;
        while(i < name.length() + 1) {
            System.out.print(name.charAt(name.length()-i));
            i++;
        }
         */
        System.out.print("Type your name: ");
        String name = input.nextLine();
        int i = name.length() -1;
        String helper = "";

        while(i >= 0) {
            helper = helper + name.charAt(i);
            i--;
        }
        System.out.println("In reverse order: " + helper);
    }
}
