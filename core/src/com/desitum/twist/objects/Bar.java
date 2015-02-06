package com.desitum.twist.objects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.desitum.twist.screens.MainScreen;

/**
 * Created by kody on 1/30/15.
 */
public class Bar extends Sprite {
    private float moveSpeed; //Max is 8 (4 is lowest, 8 is highest, 4 = slow)
    private float barLength; //Max is 5 (1 is lowest, 5 is highest, 1 = small)

    private float originalMoveSpeed;

    public static final int VERTICAL = 0;
    public static final int HORIZONTAL = 1;

    public static final float BAR_WIDTH = 1;

    private int barOrientation; //Vertical or Horizontal (0 is Vertical, 1 is Horizontal)
    private float barPositionX;
    private float barPositionY;

    private float barStoppingPointTop;
    private float barStoppingPointBottom;
    private float barStoppingPointLeft;
    private float barStoppingPointRight;

    public Bar(float moveSpeed, float barLength, int barOrientation, float[] position, Texture texture) {
        super(texture, 0, 0, texture.getWidth(), texture.getHeight());


        this.setSize(barLength, BAR_WIDTH);

        if (barOrientation == HORIZONTAL){
            setRotation(0);
        } else if (barOrientation == VERTICAL){
            setOriginCenter();
            setRotation(90);
        }

        this.moveSpeed = moveSpeed;
        this.originalMoveSpeed = moveSpeed;
        this.barLength = barLength;
        this.barOrientation = barOrientation;
        this.barStoppingPointRight = MainScreen.FRUSTUM_WIDTH;
        this.barStoppingPointLeft = 0;

        this.barPositionX = position[0];
        this.barPositionY = position[1];



        this.setPosition(position[0], position[1]);
    }

    public void update(float delta) {
        if (barOrientation == VERTICAL) {
            if (barPositionY <= barStoppingPointBottom && moveSpeed < 0) {
                moveSpeed = originalMoveSpeed;
            } else if (barPositionY + barLength >= barStoppingPointTop && moveSpeed > 0) {
                moveSpeed = -originalMoveSpeed;
            } else {
                barPositionY += moveSpeed * delta;
            }
        } else {
            if (barPositionX <= barStoppingPointLeft && moveSpeed < 0) {
                moveSpeed = originalMoveSpeed;
            } else if (barPositionX + barLength >= barStoppingPointRight && moveSpeed > 0) {
                moveSpeed = -originalMoveSpeed;
            } else {
                barPositionX += moveSpeed * delta;
            }
        }
        setX(barPositionX);
        setY(barPositionY);
    }

    public float getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(float moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public float getBarLength() {
        return barLength;
    }

    public void setBarLength(float barLength) {
        this.barLength = barLength;
    }

    public int getBarOrientation() {
        return barOrientation;
    }

    public void setBarOrientation(int barOrientation) {
        this.barOrientation = barOrientation;
    }

    public void setBarStoppingPointTop(float barStoppingPointTop) {
        this.barStoppingPointTop = barStoppingPointTop;
    }

    public void setBarStoppingPointBottom(float barStoppingPointBottom) {
        this.barStoppingPointBottom = barStoppingPointBottom;
    }

    public void setBarStoppingPointLeft(float barStoppingPointLeft) {
        this.barStoppingPointLeft = barStoppingPointLeft;
    }

    public void setBarStoppingPointRight(float barStoppingPointRight) {
        this.barStoppingPointRight = barStoppingPointRight;
    }

    public void setBarY(float y){
        this.barPositionY += y;
        this.barStoppingPointTop += y;
        this.barStoppingPointBottom += y;
        setY(y);
    }

    public void setBarX(float x){
        float difference = x - this.barPositionX;
        this.barStoppingPointLeft += difference;
        this.barStoppingPointRight += difference;
        this.barPositionX = x;
        setX(x);
    }
}
