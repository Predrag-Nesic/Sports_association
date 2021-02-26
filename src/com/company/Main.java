package com.company;

import association.SportsAssociation;
import association.Team;
import personell.Manager;
import personell.Player;
import personell.Trainer;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("Predrag", "Nesic", "middle");
        Player player2 = new Player("Nenad", "Nesic", "attack");
        Player player3 = new Player("Marko", "Nesic", "defense");
        Player player4 = new Player("Predrag", "Kovic", "goalkeeper");
        Player player5 = new Player("Zvezdan", "Nedeljkovic", "attack");
        Player player6 = new Player("Goran", "Jezdikovic", "middle");
        Player player7 = new Player("Predrag", "Hadzi - Prodanovic", "middle");
        Player player8 = new Player("Sergej", "Aleksic", "defense");
        Player player9 = new Player("Ognjen", "Uralic", "goalkeeper");

        Trainer trainer1 = new Trainer("Mihajlo", "Ilic", "fitness coach");
        Trainer trainer2 = new Trainer("Ivan", "Ilic", "fitness coach");
        Trainer trainer3 = new Trainer("Dusan", "Tosic", "assistant coach");
        Trainer trainer4 = new Trainer("Sara", "Tosic", "assistant coach");
        Trainer trainer5 = new Trainer("Andrija", "Karaklajic", "main coach");
        Trainer trainer6 = new Trainer("Sasa", "Bajic", "trainee");

        Manager manager1 = new Manager("Janko", "Vukotic");
        Manager manager2 = new Manager("Janko", "Saric");
        Manager manager3 = new Manager("Darko", "Jankovic");

        Team team1 = new Team("First team");
        team1.addPlayer(player1);
        team1.addPlayer(player2);
        team1.addPlayer(player3);
        team1.addTrainer(trainer1);
        team1.addTrainer(trainer2);
        team1.addManager(manager1);

        Team team2 = new Team("Second team");
        team2.addPlayer(player4);
        team2.addPlayer(player5);
        team2.addPlayer(player6);
        team2.addTrainer(trainer3);
        team2.addTrainer(trainer4);
        team2.addManager(manager2);

        Team team3 = new Team("Third team");
        team3.addPlayer(player7);
        team3.addPlayer(player8);
        team3.addPlayer(player9);
        team3.addTrainer(trainer5);
        team3.addTrainer(trainer6);
        team3.addManager(manager3);

        SportsAssociation sportsAssociation = new SportsAssociation("Olympia", "Bul.Kralja Aleksandra 88");
        sportsAssociation.addTeam(team1);
        sportsAssociation.addTeam(team2);
        sportsAssociation.addTeam(team3);

        System.out.println(sportsAssociation);
    }
}
