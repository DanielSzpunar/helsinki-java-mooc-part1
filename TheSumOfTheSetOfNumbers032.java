import java.util.Scanner;

public class TheSumOfTheSetOfNumbers032 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Until what? ");
        int upTo = Integer.parseInt(input.nextLine());
        int i = 0;
        int sum = 0;
        while (i <= upTo) {
            sum += i;
            i++;
        }
        System.out.println("Sum is " + sum);
    }
}
