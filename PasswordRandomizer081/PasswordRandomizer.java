import java.util.Random;

public class PasswordRandomizer {
    private Random random = new Random();
    private int length;
    private String letters = "abcdefghijklmnopqrstuvwxyz";

    public PasswordRandomizer(int length) {
        this.length = length;
        this.random = new Random();
    }
    public String createPassword() {
        int i = 0;
        int charPosition;
        String password = "";
        while (i < this.length) {
            charPosition = random.nextInt(letters.length());
            password += letters.charAt(charPosition);
            i++;
        }
        return password;
    }


}
