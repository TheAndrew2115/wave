package com.wave.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

    private Handler handler;
    private boolean[] keyDown = new boolean[4];

    public KeyInput(Handler handler) {
        this.handler = handler;

        keyDown[0] = false; //w
        keyDown[1] = false; //s
        keyDown[2] = false; //d
        keyDown[3] = false; //a
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);

            if (tempObject.getID() == ID.Player) {
                //key events for player
                if (key == KeyEvent.VK_W) { //go up
                    tempObject.setYspeed(-5);
                    keyDown[0] = true;
                }
                if (key == KeyEvent.VK_S) { //go down
                    tempObject.setYspeed(5);
                    keyDown[1] = true;
                }
                if (key == KeyEvent.VK_D) { //go right
                    tempObject.setXspeed(5);
                    keyDown[2] = true;
                }
                if (key == KeyEvent.VK_A) { //go left
                    tempObject.setXspeed(-5);
                    keyDown[3] = true;
                }
            }
        }

        if (key == KeyEvent.VK_ESCAPE) System.exit(1);
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);

            if (tempObject.getID() == ID.Player) {
                //key events for player
                if (key == KeyEvent.VK_W) { //go up
                    //tempObject.setYspeed(0);
                    keyDown[0] = false;
                }
                if (key == KeyEvent.VK_S) { //go down
                    //tempObject.setYspeed(0);
                    keyDown[1] = false;
                }
                if (key == KeyEvent.VK_D) { //go right
                    //tempObject.setXspeed(0);
                    keyDown[2] = false;
                }
                if (key == KeyEvent.VK_A) { //go left
                    //tempObject.setXspeed(0);
                    keyDown[3] = false;
                }

                if(!keyDown[0] && !keyDown[1]) {
                    tempObject.setYspeed(0);
                }
                if(!keyDown[2] && !keyDown[3]) {
                    tempObject.setXspeed(0);
                }
            }
        }
    }

}
