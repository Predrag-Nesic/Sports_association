package association;

import personell.Manager;
import personell.Player;
import personell.Trainer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Team {
    private String teamName;
    private ArrayList<Player> players;
    private ArrayList<Trainer> trainers;
    private Manager manager;
    private LocalDate dateOfEstablishment;
    private int day;
    private int month;
    private int year;

    public Team(String teamName) {
        this.teamName = teamName;
        players = new ArrayList<>();
        trainers = new ArrayList<>();
        dateOfEstablishment = LocalDate.of(1945, 5, 3);
        day = dateOfEstablishment.getDayOfMonth();
        month = dateOfEstablishment.getMonthValue();
        year = dateOfEstablishment.getYear();
    }

    public void addPlayer(Player player) {
        Collections.sort(players);
        players.add(player);
        player.signContract();
    }

    public void addTrainer(Trainer trainer) {
        Collections.sort(trainers);
        trainers.add(trainer);
        trainer.signContract();
    }

    public void addManager(Manager manager) {
        this.manager = manager;
        manager.signContract();
    }

    public int totalPlayers() {
        return players.size();
    }

    public int totalTrainers() {
        return trainers.size();
    }


    @Override
    public String toString() {
        String tekst = "Tim - " + teamName + " (" + dateOfEstablishment + ")";
        tekst += "\n- " + manager;
        for(Player player : players) {
            tekst += "\n- " + player;
        }
        for(Trainer trainer : trainers) {
            tekst += "\n- " + trainer;
        }
        return tekst;

    }
}
