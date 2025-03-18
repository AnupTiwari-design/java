package Aggregation;

public class Team {
    String teamName;
    Player player; // Aggregation (Weak Association)

    Team(String teamName, Player player) {
        this.teamName = teamName;
        this.player = player;
    }

    void showTeam() {
        System.out.println(player.name + " is in " + teamName + " Team.");
    }
}
