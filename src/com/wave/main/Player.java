package com.wave.main;

import java.awt.*;
import java.util.Random;

public class Player extends GameObject {

    Random r = new Random();

    public Player(int x, int y, ID id) {
        super(x, y, id);
    }

    @Override
    public void tick() {
        x += xspeed;
        y += yspeed;

        x = Game.clamp(x, 0, Game.WIDTH-32);
        y = Game.clamp(y, 0, Game.HEIGHT-60);
    }

    @Override
    public void render(Graphics g) {
        if (id == ID.Player) g.setColor(Color.white);
        g.fillRect(x, y, 32, 32);
    }


}
