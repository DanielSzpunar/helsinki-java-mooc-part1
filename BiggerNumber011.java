import java.util.Scanner;

public class BiggerNumber011 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = Integer.parseInt(input.nextLine());
        System.out.println("Enter another number:");
        int num2 = Integer.parseInt(input.nextLine());
        System.out.println("The bigger number of the two numbers given is: " + Math.max(num1,num2));

    }
}
