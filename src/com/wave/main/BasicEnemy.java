package com.wave.main;

import java.awt.*;

public class BasicEnemy extends GameObject {

    public BasicEnemy(int x, int y, ID id) {
        super(x, y, id);

        xspeed = 5;
        yspeed = 5;

    }

    @Override
    public void tick() {
        x += xspeed;
        y += yspeed;

        if (y <= 0 || y >= Game.HEIGHT - 32) {
            yspeed *= -1;
        }
        if (x <= 0 || x >= Game.WIDTH - 32) {
            xspeed *= -1;
        }
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(x, y, 16,16);
    }
}
