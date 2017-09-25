public class Main {

    public static void main(String[] args) {
        Counter test = new Counter(true);
        test.increase();
        System.out.println(test.value());
        test.increase(10);
        System.out.println(test.value());
        test.decrease();
        test.decrease(5);
        System.out.println(test.value());

    }
}
