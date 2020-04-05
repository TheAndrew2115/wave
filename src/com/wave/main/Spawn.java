package com.wave.main;

import java.util.Random;

public class Spawn {

    private Handler handler;
    private HUD hud;
    private int scoreKeep = 0;
    private int levelUp = 200;
    private Random r = new Random();

    public Spawn(Handler handler, HUD hud) {
        this.handler = handler;
        this.hud = hud;
    }

    public void tick() {
        scoreKeep++;

        if (scoreKeep >= levelUp) {
            scoreKeep = 0;
            hud.setLevel(hud.getLevel() + 1);
            int curLevel = hud.getLevel();

            if (curLevel <= 3 && curLevel != 1) {
                handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH), 0, ID.BasicEnemy, handler));
            } else if (curLevel == 4) {
                handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH), Game.HEIGHT-60, ID.FastEnemy, handler));
            }
        }
    }
}
