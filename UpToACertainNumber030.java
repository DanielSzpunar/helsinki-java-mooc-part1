import java.util.Scanner;

public class UpToACertainNumber030 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Up to what number? ");
        int upTo = Integer.parseInt(input.nextLine());
        int i = 1;
        while (i <= upTo) {
            System.out.println(i);
            i++;
        }
    }
}
