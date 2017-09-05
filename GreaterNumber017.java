import java.util.Scanner;
public class GreaterNumber017 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type the first number: ");
        int num1 = Integer.parseInt(input.nextLine());
        System.out.print("Type the second number: ");
        int num2 = Integer.parseInt(input.nextLine());
        if (num1 > num2) System.out.println("Greater number: " + num1);
        else if (num2 > num1) System.out.println("Greater number: " + num2);
        else System.out.println("The numbers area equal!");
    }
}
