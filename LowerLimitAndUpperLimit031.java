import java.util.Scanner;

public class LowerLimitAndUpperLimit031 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("First: ");
        int first = Integer.parseInt(input.nextLine());
        System.out.print("Last: ");
        int last = Integer.parseInt(input.nextLine());
        while(first <= last) {
            System.out.println(first);
            first ++;
        }
    }
}
