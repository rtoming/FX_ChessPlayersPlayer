package com.example.fx_chessplayers;

public class ChessPlayer {
    String name;
    int elo;
    String years;
    String imgURL;

    public ChessPlayer(String name, int elo, String years, String imgURL) {
        this.name = name;
        this.elo = elo;
        this.years = years;
        this.imgURL = imgURL;
    }

    public String getName() {
        return name;
    }

    public int getElo() {
        return elo;
    }

    public String getYears() {
        return years;
    }

    public String getImgURL() {
        return imgURL;
    }
}
