import java.util.Arrays;

public class ArraysToStars099 {

    public static void main(String[] args) {
        int[] array = {5,1,3,4,2};
        printArrayAsStars(array);

    }
    public static void printArrayAsStars(int[] arrayName) {
        String star = "*";
        for (int i = 0; i < arrayName.length; i++) {

            for (int j = 0; j < arrayName[i]; j++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }

}