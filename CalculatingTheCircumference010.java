import java.util.Scanner;
public class CalculatingTheCircumference010 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		int radius = Integer.parseInt(input.nextLine());
		System.out.println("Circumference of the circle: " + (2 * Math.PI * radius));
	}
}
