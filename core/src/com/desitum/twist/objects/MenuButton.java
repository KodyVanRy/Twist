package com.desitum.twist.objects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by kody on 1/30/15.
 */
public class MenuButton extends Sprite {

    private String command;
    private String text;

    private static int SIZE_X = 8;
    private static int SIZE_Y = 1;

    public MenuButton(String command, String text, float locX, float locY, Texture texture) {
        this.command = command;
        this.text = text;
        this.setPosition(locX, locY);
        setTexture(texture);
        this.setSize(SIZE_X, SIZE_Y);
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

    public void setImage(Texture image){
        setTexture(image);
    }
}
