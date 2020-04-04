package com.wave.main;

import java.awt.*;

public abstract class GameObject {

    protected int x, y;
    protected ID id;
    protected int xspeed, yspeed;

    public GameObject(int x, int y, ID id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public abstract void tick();
    public abstract void render(Graphics g);

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setId(ID id) {
        this.id = id;
    }

    public ID getID() {
        return id;
    }

    public void setXspeed(int xspeed) {
        this.xspeed = xspeed;
    }

    public int getXspeed() {
        return this.xspeed;
    }

    public void setYspeed(int yspeed) {
        this.yspeed = yspeed;
    }

    public int getYspeed() {
        return this.yspeed;
    }
}
