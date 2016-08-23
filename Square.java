package com.example.satanat.game;

/**
 * Created by satanat on 06.07.2016.
 */
public class Square {
    private Player player = null;

        public void fill(Player player) {
            this.player = player;
        }

        public boolean isFilled() {
            if (player != null) {
                return true;
            }
            return false;
        }

        public Player getPlayer() {
            return player;
        }
}