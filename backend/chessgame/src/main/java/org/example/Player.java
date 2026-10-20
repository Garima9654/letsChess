package org.example;

public class Player {
    private String name;
    private boolean isWhiteSide;

    Player(String name, boolean isWhiteSide){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public boolean isWhiteSide() {
        return isWhiteSide;
    }
}