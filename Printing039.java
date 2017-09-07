import java.util.Scanner;
public class Printing039 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        printStars391(5);
        printStars391(3);
        printStars391(9);
        System.out.println();
        printingASquare392(4);
        System.out.println();
        printingARectangle393(17,3);
        System.out.println();
        printTriangle394(4);

    }
    public static void printStars391(int amount) {
        int i = 1;
        while (i <= amount) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }
    public static void printingASquare392(int sideSize) {
        int i = 1;
        while (i <= sideSize) {
            printStars391(sideSize);
            i++;
        }
    }
    public static void printingARectangle393(int width, int height) {
        int i = 1;
        while (i <= height) {
            printStars391(width);
            i++;
        }
    }
    public static void printTriangle394(int size) {
        int i = 1;
        while(i <= size) {
            printStars391(i);
            i++;
        }
    }
}
