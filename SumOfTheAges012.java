import java.util.Scanner;

public class SumOfTheAges012 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name1 = input.nextLine();
        System.out.print("Type your age:");
        int age1 = Integer.parseInt(input.nextLine());
        System.out.print("Type your name: ");
        String name2 = input.nextLine();
        System.out.print("Type your age: ");
        int age2 = Integer.parseInt(input.nextLine());
        System.out.println(name1 + " and " + name2 + " are " + (age1 + age2) + " years old in total.");
    }
}
