package com.desitum.twist.objects;

import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by kody on 1/30/15.
 */
public class MenuButton extends Sprite {

    private String command;
    private String text;

    private static int SIZE_X;
    private static int SIZE_Y;

    public MenuButton(String command, String text, float locX, float locY) {
        this.command = command;
        this.text = text;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
