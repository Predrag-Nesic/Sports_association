package association;

import java.util.ArrayList;

public class SportsAssociation {
    private String name;
    private String address;
    private ArrayList<Team> teams;

    public SportsAssociation(String name, String address) {
        this.name = name;
        this.address = address;
        teams = new ArrayList<>();
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public int totalPlayers() {
        int total = 0;
        for(Team team : teams) {
            total += team.totalPlayers();
        }
        return total;
    }

    public int totalTrainers() {
        int total = 0;
        for(Team team : teams) {
            total += team.totalTrainers();
        }
        return total;
    }

    @Override
    public String toString() {
        String text = "Sports association: " + name + ", " + address;
        text += "\n-------------------------------------------------";
        text += "\nTotal players: " + totalPlayers();
        text += "\nTotal trainers: " + totalTrainers();
        text += "\nTotal managers: " + teams.size();
        text += "\n-------------------------------------------------";
        for(Team team : teams) {
            text += "\n" + team;
            text += "\n-------------------------------------------------";
        }
        return text;

    }
}
