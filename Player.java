package com.example.satanat.game;

/**
 * Created by satanat on 06.07.2016.
 */
public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public CharSequence getName() {
        return (CharSequence) name;
    }
}
