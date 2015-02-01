package com.desitum.twist.objects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by kody on 1/30/15.
 */
public class MenuButton extends Sprite {

    private String command;
    private String text;

    private boolean moving = true;
    private float speed = 2;

    private static float SIZE_X = 8;
    private static float SIZE_Y = 1.5f;

    public MenuButton(String command, String text, float locX, float locY, Texture texture) {
        super(texture, 0, 0, texture.getWidth(), texture.getHeight());
        this.command = command;
        this.text = text;
        this.setPosition(locX, locY);
        this.setSize(SIZE_X, SIZE_Y);

    }

    public void update(float delta){
        if (moving){
            this.setX(this.getX() + speed * delta);
            speed += 2 * delta;
        }
    }

    public boolean isMoving(){
        return this.moving;
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

    public void setImage(Texture image) {
        setTexture(image);
    }

    public void moveOffScreen(){
        this.moving = true;
    }
}
