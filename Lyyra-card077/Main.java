public class Main {

    public static void main(String[] args) {

        LyyraCard pekka = new LyyraCard(20);
        LyyraCard brian = new LyyraCard(30);
        pekka.payGourmet();
        brian.payEconomical();
        System.out.println("Pekka: The card has " + pekka.toString() + " euros");
        System.out.println("Brian: The card has " + brian.toString() + " euros");
        pekka.loadMoney(20);
        brian.payGourmet();
        System.out.println("Pekka: The card has " + pekka.toString() + " euros");
        System.out.println("Brian: The card has " + brian.toString() + " euros");
        pekka.payEconomical();
        pekka.payEconomical();
        brian.loadMoney(50);
        System.out.println("Pekka: The card has " + pekka.toString() + " euros");
        System.out.println("Brian: The card has " + brian.toString() + " euros");


    }
}
