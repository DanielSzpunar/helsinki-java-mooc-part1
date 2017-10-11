import java.util.Arrays;

public class Sorting104 {

    public static void main(String[] args) {
        int[] values = {10,1,5,7,9,2,4,6,10,8};
        int smallest = smallest(values);
        System.out.println(smallest);
        System.out.println();

        int smallestIndex = smallestIndex(values);
        System.out.println(smallestIndex);
        System.out.println();

        int smallestIndexFrom = smallestIndexFrom(values, 6);
        System.out.println(smallestIndexFrom);
        System.out.println();

        System.out.println(Arrays.toString(values));
        swap(values,0,3);
        System.out.println(Arrays.toString(values));
        swap(values, 1,4);
        System.out.println(Arrays.toString(values));
        System.out.println();

        sort(values);
        System.out.println(Arrays.toString(values));



    }
    public static int smallest (int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }//[2,5,1,8,3,7]
    public static int smallestIndex(int[] array) {
        int smallestIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[smallestIndex] > array[i]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
    public static int smallestIndexFrom(int[] array, int index) {
        int smallestIndexFrom = index;
        for (int i = index; i < array.length; i++) {
            if (array[smallestIndexFrom] > array[i]) {
                smallestIndexFrom = i;
            }
        }
        return smallestIndexFrom;
    }
    public static void swap(int[]array, int num1, int num2) {
        int temp = array[num1];
        array[num1] = array[num2];
        array[num2] = temp;
    }
    /*
    This is interesting.  Use the smallestIndexFrom method to determine the index with the smallest value.  Then we replace it with i.  Since i starts at zero and iterates the length of the array we can easily sort them in order form lowest to highest through the for loop.
     */
    public static void sort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int index = smallestIndexFrom(array, i);
            swap(array, i, index);
        }
    }
}