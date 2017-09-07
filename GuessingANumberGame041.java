import java.util.Scanner;

public class GuessingANumberGame041 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int random = (int) (Math.random() * 101);
        int guessCounter = 0;
        while (true) {
            System.out.print("Guess a number:");
            int guess = Integer.parseInt(input.nextLine());
            if (guess == random) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
            else if(guess > random) {
                guessCounter++;
                System.out.println("The number is lesser, guesses made: " + guessCounter);
            }
            else if (guess < random) {
                guessCounter++;
                System.out.println("The number is greater, guesses made: " + guessCounter);
            }

        }
        System.out.println("It took you " + guessCounter + " guesses.");
    }
}
