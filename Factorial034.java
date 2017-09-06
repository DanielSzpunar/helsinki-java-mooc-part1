import java.util.Scanner;

public class Factorial034 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Type a number: ");
        int factorial = Integer.parseInt(input.nextLine());
        int sum = 1;
        int i = 1;
        while(i <= factorial) {
            if (factorial == 0) {
                sum = 1;
                System.out.println("Factorial is " + sum);
                break;
            }
            else if (i <= factorial) {
                sum *=i;
                i++;
            }
        }
        System.out.println("Factorial is " + sum);
    }
}
