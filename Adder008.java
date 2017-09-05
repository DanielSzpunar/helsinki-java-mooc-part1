import java.util.Scanner;
public class Adder008 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num1 = Integer.parseInt(input.nextLine());
		System.out.println("Enter another number: ");
		int num2 = Integer.parseInt(input.nextLine());
		System.out.println("Sum of the numbers: " + (num1 + num2));
	}
}
