import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> playerList = new ArrayList<Player>();

    public Team(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void addPlayer(Player playerName) {
        playerList.add(playerName);
    }
    public void printPlayers() {
        for (Player i : playerList) {
            System.out.println(i);
        }
    }


}
