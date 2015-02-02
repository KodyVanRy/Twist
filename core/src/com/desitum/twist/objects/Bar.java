package com.desitum.twist.objects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by kody on 1/30/15.
 */
public class Bar extends Sprite {
    private float moveSpeed; //Max is 8 (4 is lowest, 8 is highest, 4 = slow)
    private float barLength; //Max is 5 (1 is lowest, 5 is highest, 1 = small)

    private static final int VERTICAL = 0;
    private static final int HORIZANTAL = 1;

    public static final float BAR_WIDTH = 1;

    private int barOrientation; //Vertical or Horizontal (0 is Vertical, 1 is Horizontal)
    private float barPositionX;
    private float barPositionY;

    private float barStoppingPointTop;
    private float barStoppingPointBottom;
    private float barStoppingPointLeft;
    private float barStoppingPointRight;

    public Bar(float moveSpeed, float barLength, int barOrientation, int[] position, Texture texture) {
        super(texture, 0, 0, texture.getWidth(), texture.getHeight());

        this.moveSpeed = moveSpeed;
        this.barLength = barLength;
        this.barOrientation = barOrientation;

        if (barOrientation == HORIZANTAL){
            this.setSize(barLength, BAR_WIDTH);
        } else if (barOrientation == VERTICAL){
            this.setSize(BAR_WIDTH, barLength);
        }

        this.setPosition(position[0], position[1]);
    }

    public void update(float delta) {
        if (barOrientation == VERTICAL) {
            if (barPositionY <= barStoppingPointBottom) {
                moveSpeed *= -HORIZANTAL;
            } else if (barPositionY + barLength >= barStoppingPointTop) {
                moveSpeed *= -HORIZANTAL;
            } else {
                barPositionY += moveSpeed * delta;
            }
        } else {
            if (barPositionX <= barStoppingPointLeft) {
                moveSpeed *= -HORIZANTAL;
            } else if (barPositionX + barLength >= barStoppingPointRight) {
                moveSpeed *= -HORIZANTAL;
            } else {
                barPositionX += moveSpeed * delta;
            }
        }
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
}
