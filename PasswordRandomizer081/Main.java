import java.util.Random;

public class Main {

    public static void main(String[] args) {
		PasswordRandomizer randomizer = new PasswordRandomizer(13);
		System.out.println("Password:" + randomizer.createPassword());
	}
}