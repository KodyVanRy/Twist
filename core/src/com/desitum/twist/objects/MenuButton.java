package com.desitum.twist.objects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by kody on 1/30/15.
 */
public class MenuButton extends Sprite {

    private String command;

    private boolean movingOut;
    private boolean movingIn;
    private float speed = 4;

    private static float acceleration = 64;
    public static float SIZE_X = 8;
    public static float SIZE_Y = 1.5f;

    private float moveFromX = 0;
    private float moveToX = 0;
    private float originalY = 0;
    private float totalMoveX = 0;
    private float currentX = 0;
    private float time = 0;
    private float duration = 0.5f;

    public MenuButton(String command, float locX, float locY, Texture texture) {
        super(texture, 0, 0, texture.getWidth(), texture.getHeight());
        this.command = command;
        originalY = locY;
        this.setPosition(locX, locY);
        this.setSize(SIZE_X, SIZE_Y);
    }

    public void update(float delta){
        time += delta;
        if (time > 1){
            time = 1;
        }
        if (movingOut){
            this.setX(this.getX() + speed * delta);
            speed += acceleration * delta;
        } else if (movingIn){
            currentX = (float) Math.pow(time - 1, 2) * totalMoveX;
            this.setX(moveToX - currentX);
        }
    }

    public void setMovement(float startX, float endX, float duration){
        this.moveFromX = startX;
        this.moveToX = endX;
        if (startX > endX){
            this.totalMoveX = startX - endX;
        } else {
            this.totalMoveX = endX - startX;
        }
        this.setX(moveToX - totalMoveX);
    }

    public void moveIn(){
        this.movingIn = true;
    }

    public boolean isMoving(){
        return this.movingOut || this.movingIn;
    }

    public String getCommand() {
        return command;
    }


    public void moveOffScreen(){
        this.movingOut = true;
    }

    public boolean isInPlace(){
        if (moveToX == getX()){
            movingIn = false;
            return true;
        }
        return false;
    }

}
