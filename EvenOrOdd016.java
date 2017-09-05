import java.util.Scanner;

public class EvenOrOdd016 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Type a number: ");
		int num = Integer.parseInt(input.nextLine());
		if(num % 2 ==0)System.out.println("Number " + num + " is even.");
			else System.out.println("Number " + num + " is odd.");
	}	
}
