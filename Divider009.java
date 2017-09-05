import java.util.Scanner;
public class Divider009 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num1 = Integer.parseInt(input.nextLine());
		System.out.println("Enter another number: ");
		int num2 = Integer.parseInt(input.nextLine());
		float result = (float) num1 / num2;
		System.out.println("Division: " + num1 + " / " + num2 + " = " +  result);	
	}
}
