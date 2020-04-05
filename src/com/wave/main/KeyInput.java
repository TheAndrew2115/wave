package com.wave.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

    private Handler handler;

    public KeyInput(Handler handler) {
        this.handler = handler;
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);

            if (tempObject.getID() == ID.Player) {
                //key events for player
                if (key == KeyEvent.VK_W) { //go up
                    tempObject.setYspeed(-5);
                }
                if (key == KeyEvent.VK_S) { //go down
                    tempObject.setYspeed(5);
                }
                if (key == KeyEvent.VK_D) { //go right
                    tempObject.setXspeed(5);
                }
                if (key == KeyEvent.VK_A) { //go left
                    tempObject.setXspeed(-5);
                }
            }
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);

            if (tempObject.getID() == ID.Player) {
                //key events for player
                if (key == KeyEvent.VK_W) { //go up
                    tempObject.setYspeed(0);
                }
                if (key == KeyEvent.VK_S) { //go down
                    tempObject.setYspeed(0);
                }
                if (key == KeyEvent.VK_D) { //go right
                    tempObject.setXspeed(0);
                }
                if (key == KeyEvent.VK_A) { //go left
                    tempObject.setXspeed(0);
                }
            }
        }
    }

}
