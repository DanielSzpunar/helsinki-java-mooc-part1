import java.util.Scanner;

public class SumOfManyNumbers026 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while(true) {
            System.out.print("Enter a number:");
            int read = Integer.parseInt(input.nextLine());
            if (read == 0) {
                break;
            }
            else sum+= read;
            System.out.println("Sum now: " + sum);
        }
        System.out.println("Sum in the end: " + sum);

    }
}
