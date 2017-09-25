import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	NumberStatistics allNumbers = new NumberStatistics();
	NumberStatistics evenNumbers = new NumberStatistics();
	NumberStatistics oddNumbers = new NumberStatistics();
	Scanner input = new Scanner(System.in);
		System.out.println("Type numbers: ");
		while (true) {
			int number = Integer.parseInt(input.nextLine());
			if (number == -1) {
				break;
			}
			allNumbers.addNumber(number);
			if (number % 2 == 0) {
				evenNumbers.addNumber(number);
			}
			else oddNumbers.addNumber(number);

		}
		System.out.println("Sum: " + allNumbers.sum());
		System.out.println("Sum of even: " + evenNumbers.sum());
		System.out.println("Sum of odd: " + oddNumbers.sum());
		System.out.println("Average: " + allNumbers.average());
	}
}
