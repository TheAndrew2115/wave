package com.wave.main;

import java.awt.*;
import java.util.Random;

public class Player extends GameObject {

    Random r = new Random();
    Handler handler;

    public Player(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        this.handler = handler;
    }

    @Override
    public void tick() {
        x += xspeed;
        y += yspeed;

        x = Game.clamp(x, 0, Game.WIDTH-32);
        y = Game.clamp(y, 0, Game.HEIGHT-60);

        collision();
    }

    @Override
    public void render(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        if (id == ID.Player) g.setColor(Color.white);
        g.fillRect(x, y, 32, 32);
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(x, y, 32, 32);
    }

    private void collision() {
        for (int i = 0; i < handler.object.size(); i++) {

            GameObject tempObject = handler.object.get(i);

            if (tempObject.getID() == ID.BasicEnemy || tempObject.getID() == ID.FastEnemy) {
                if (getBounds().intersects(tempObject.getBounds())) {
                    HUD.HEALTH -= 2;
                }
            }
        }
    }

}
