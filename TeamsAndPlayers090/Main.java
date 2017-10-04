public class Main {

    public static void main(String[] args) {
        /*
        Team barcelona = new Team("FC Barcelona");
        System.out.println("Team: " + barcelona.getName());

        Player brian = new Player("Brian");
        System.out.println("Player: " + brian);

        Player pekka = new Player("Pekka", 39);
        System.out.println("Player: " + pekka);
        System.out.println("-------------");

        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1));

        barcelona.printPlayers();
        */

        /*
        Team barcelona = new Team("FC Barcelona");
        barcelona.setMaxSize(1);
        Player brian = new Player("Brian");
        Player pekka = new Player("pekka", 39);
        barcelona.addPlayer(new Player("Mikael",1));
        System.out.println("Number of players: " + barcelona.size());
        */

        Team barcelona = new Team("FC Barcelona");
        Player brian = new Player("Brian");
        Player pekka = new Player("Pekka", 39);
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael", 1));
        System.out.println("Total goals: " + barcelona.goals());

    }
}
