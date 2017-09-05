import java.util.*;

public class AgeCheck019 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How old are you? ");
        int age = Integer.parseInt(input.nextLine());
        if(age <=-1 || age >=121) System.out.println("Impossible!");
        else System.out.println("OK");
    }
}
