public class ElegantPrintingOfAnArray097 {

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);

    }

    public static void printElegantly(int[] arrayName) {
        for (int i = 0; i < arrayName.length; i++) {
            if (i < arrayName.length -1) {
                System.out.print(arrayName[i] + ", ");
            }
            else {
                System.out.print(arrayName[i]);
            }
        }
    }
}
