import java.util.Arrays;

public class ReversingAndCopyingOfAnArray098 {

    public static void main(String[] args) {
        int[] original = {1,2,3,4};
        /*
        int[] copied = copy(original);
        copied[0] = 99;

        System.out.println("original: " + Arrays.toString(original));
        System.out.println("copied: " + Arrays.toString(copied));
        */
        /*int reversed[] =  reverseCopy(original);
        System.out.println("reversed: " +Arrays.toString(reversed));
        */

        int[] reverse = reverseCopy(original);
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reverse));
    }
    public static int[] copy(int[] arrayName) {
        int[] copy = new int[arrayName.length];
        for (int i = 0; i < arrayName.length; i++) {
            copy[i] = arrayName[i];
        }
        return copy;
    }
    public static int[] reverseCopy(int[] arrayName) {
        //System.out.println(arrayName[arrayName.length-1]);
        int[] reverseCopy = new int[arrayName.length];
        for (int i = arrayName.length; i > 0; i--) {
            reverseCopy[i - 1] = arrayName[arrayName.length - i];
        }
        return reverseCopy;
    }
}
