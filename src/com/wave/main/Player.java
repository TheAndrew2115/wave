package com.wave.main;

import java.awt.*;
import java.util.Random;

public class Player extends GameObject {

    Random r = new Random();

    public Player(int x, int y, ID id) {
        super(x, y, id);

        xspeed = r.nextInt(5) + 1;
        yspeed = r.nextInt(5);
    }

    @Override
    public void tick() {
        x += xspeed;
        y += yspeed;
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(x, y, 32, 32);
    }
}
