import java.util.Scanner;
import java.util.ArrayList;

public class IsTheNumberMoreThanOnceInTheList068 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("Type a number: ");
        int number = Integer.parseInt(input.nextLine());
        if (moreThanOnce(list, number)) {
            System.out.println(number + " appears more than once.");
        } else System.out.println(number + " does not appear more than once.");
    }

    public static boolean moreThanOnce(ArrayList<Integer> list, int number) {
        Boolean moreThanTwo = false;
        ArrayList<Integer> counter = new ArrayList<Integer>();
        for (int i : list) {
            if (number == i) {
                counter.add(i);
            }
        }
        if (counter.size() >= 2) {
            moreThanTwo = true;
        }
        return moreThanTwo;
    }
}
