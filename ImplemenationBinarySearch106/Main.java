import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[] values = {-3,2,3,6,8,10,13};
        System.out.println("Enter a value to search for: ");
        int  searchFor = Integer.parseInt(input.nextLine());
        BinarySearch binary = new BinarySearch();
        boolean result = binary.search(values, searchFor);

        if (result == true) {
            System.out.println("The value " + searchFor + " is located in the array.");
        }
        else System.out.println("The value " + searchFor + " is not located in the array.");
    }
}