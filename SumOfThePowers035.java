import java.util.Scanner;

public class SumOfThePowers035 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int powerOf = 0;
        int result = 0;
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        while (powerOf <= number){
            result += (int)Math.pow(2, powerOf);
            powerOf++;
        }
        System.out.println("The result is " + result);
     }
}
