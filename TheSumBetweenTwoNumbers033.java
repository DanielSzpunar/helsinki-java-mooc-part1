import java.util.Scanner;

public class TheSumBetweenTwoNumbers033 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("First: ");
        int first = Integer.parseInt(input.nextLine());
        System.out.print("Second: ");
        int last = Integer.parseInt(input.nextLine());

        int sum = 0;
        while(first <= last) {
            sum += first;
            first++;
        }
        System.out.println("The sum " + sum);
    }
}
