public class Main {

    public static void main(String[] args) {
	    /*LyyraCard cardOfPekka = new LyyraCard(10);
        System.out.println("money on the card " + cardOfPekka.balance());
        boolean succeeded = cardOfPekka.pay(8);
        System.out.println("money taken: " + succeeded);
        System.out.println("money on the card: " + cardOfPekka.balance());

        succeeded = cardOfPekka.pay(4);
        System.out.println("money taken: " + succeeded);
        System.out.println("money on the card " + cardOfPekka.balance());
        */
	    /*CashRegister unicafeExactum = new CashRegister();

	    double theChange = unicafeExactum.payEconomical(10);
        System.out.println("The change was " + theChange);

        theChange = unicafeExactum.payEconomical(5);
        System.out.println("The change was " + theChange);

        theChange = unicafeExactum.payGourmet(4);
        System.out.println("The change was " + theChange);

        System.out.println(unicafeExactum);
        */

	    CashRegister unicafeExactum = new CashRegister();

	    double theChange = unicafeExactum.payEconomical(10);
        System.out.println("The change was " + theChange);

        LyyraCard cardOfJim = new LyyraCard(7);

        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success:" + succeeded);

        succeeded = unicafeExactum.payEconomical(cardOfJim);
        System.out.println("payment success: " + succeeded);

        System.out.println(unicafeExactum);
    }
}
