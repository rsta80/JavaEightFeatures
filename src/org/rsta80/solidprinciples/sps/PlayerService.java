package org.rsta80.solidprinciples.sps;

public class PlayerService {

    public Double winPercentage(Player player) {
        return (double) (player.getWin() / (player.getWin() + player.getLose()));
    }

    public Double losePercentage(Player player) {
        return (double) (player.getLose() / (player.getWin() + player.getLose()));
    }

}
