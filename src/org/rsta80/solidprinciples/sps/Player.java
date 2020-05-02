package org.rsta80.solidprinciples.sps;

import java.time.LocalDate;

public class Player {

    private int id;
    private String name;
    private int win;
    private int lose;
    private LocalDate date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    /* These method does not comply with the Single responsability principle


    public Double winPercentage(Player player) {
        return (double) (player.getWin() / (player.getWin() + player.getLose()));
    }

    public Double losePercentage(Player player) {
        return (double) (player.getLose() / (player.getWin() + player.getLose()));
    }

    public void savePlayer(Player player) {  saved player  }

    public void deletePlayer(Player player) { deleted player }

    public void showPlayerHD(Player player) {
        System.out.println(player);
    }

    public void showPlayer(Player player) {
        System.out.println(player);
    }

    */

}
