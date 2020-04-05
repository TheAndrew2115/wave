package com.wave.main;

import java.util.Random;

public class Spawn {

    private Handler handler;
    private HUD hud;
    private int scoreKeep = 0;
    private Random r = new Random();

    public Spawn(Handler handler, HUD hud) {
        this.handler = handler;
        this.hud = hud;
    }

    public void tick() {
        scoreKeep++;

        if (scoreKeep >= 1000) {
            scoreKeep = 0;
            hud.setLevel(hud.getLevel() + 1);

            handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH), 0, ID.BasicEnemy, handler));

        }
    }
}
