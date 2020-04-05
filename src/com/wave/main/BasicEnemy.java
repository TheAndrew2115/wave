package com.wave.main;

import java.awt.*;

public class BasicEnemy extends GameObject {

    private Handler handler;

    public BasicEnemy(int x, int y, ID id, Handler handler) {
        super(x, y, id);

        this.handler = handler;

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

        handler.addObject(new Trail(x, y, ID.Trail, Color.red, 16, 16, (float) 0.04, handler));
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(x, y, 16,16);
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(x, y, 16, 16);
    }

}
