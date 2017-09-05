import java.util.Scanner;

public class Password022 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String password = "carrot";
        while (true) {
            System.out.print("Type the password: ");
            String userPassword = input.nextLine();

            if (userPassword.equals(password)) {
                System.out.println("Right!");
                System.out.println();
                System.out.println("The secret is: jryy qbar");
                break;
            }
            else System.out.println("Wrong!");
        }
    }
}
