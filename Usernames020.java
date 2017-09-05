import java.util.Scanner;
public class Usernames020 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type your username: ");
        String userName = input.nextLine();
        System.out.print("Type your password: ");
        String password = input.nextLine();
        if (userName.equals("alex") && password.equals("mightyducks")) System.out.println("You are logged into the system!");
        else if (userName.equals("emily") && password.equals("cat")) System.out.println("You are logged into the system!");
        else System.out.println("Your username or password was invalid.");
    }
}
