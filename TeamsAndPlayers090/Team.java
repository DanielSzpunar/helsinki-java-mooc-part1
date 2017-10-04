
import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Player> playerList = new ArrayList<Player>();
    int maxSize = 16;

    public Team(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void addPlayer(Player playerName) {
        if (playerList.size() < maxSize) {
            playerList.add(playerName);
        }
    }
    public void printPlayers() {
        for (Player i : playerList) {
            System.out.println(i);
        }
    }
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    public int size() {
        return playerList.size();
    }
    public int goals() {
        int totalGoals = 0;
        for(Player i : playerList) {
            totalGoals += i.getGoals();
        }
        return totalGoals;
    }


}
