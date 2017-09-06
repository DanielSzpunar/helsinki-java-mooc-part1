import java.util.Scanner;

public class LoopsEndingAndRemembering036 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int sum = 0;
        int numbers = 0;
        int even = 0;
        int odd = 0;
        while(true) {
            int number = Integer.parseInt(input.nextLine());
            if (number == -1) {
                System.out.println("Thank you and see you later!");
                break;
            }
            else {
                if (number % 2 == 0) {
                    even++;
                }
                    else odd++;
                sum += number;
                numbers++;
            }
        }
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + numbers);
        System.out.println("Average:" + ((double)sum / numbers));
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
