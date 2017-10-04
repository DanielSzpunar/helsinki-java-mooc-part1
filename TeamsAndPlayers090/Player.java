

public class Player {
    private String name;
    private int goals;

    public Player(String name, int goals) {
        this.name = name;
        this.goals = goals;
    }
    public Player(String name) {
        this(name, 0);
    }
    public String getName() {
        return this.name;
    }
    public int getGoals() {
        return this.goals;
    }
    public String toString() {
        return "Player: " + this.name + ", goals " + this.goals;
    }
}
