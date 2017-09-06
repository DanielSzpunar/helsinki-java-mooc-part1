import java.util.Scanner;

public class SumOfThreeNumbers025 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int read;
        System.out.print("Type the first number: ");
        sum += Integer.parseInt(input.nextLine());
        System.out.print("Type the second number: ");
        sum += Integer.parseInt(input.nextLine());
        System.out.print("Type the third number: ");
        sum += Integer.parseInt(input.nextLine());
        System.out.println("Sum: " + sum);

    }
}
