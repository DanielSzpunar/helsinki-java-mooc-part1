import java.util.Scanner;
public class ManyPrints038 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many?");
        int times = Integer.parseInt(input.nextLine());
        int i = 1;
        while (i <= times) {
            printText();
            i++;
        }
    }
    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
