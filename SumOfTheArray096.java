public class SumOfTheArray096 {

    public static void main(String[] args) {
       int[] array = {5,1,3,4,2};
        System.out.println(sum(array));

    }

    public static int sum(int[] arrayName) {
        int sum = 0;
        for (int i = 0; i < arrayName.length; i++) {
            sum += arrayName[i];
        }
        return sum;
    }
}
