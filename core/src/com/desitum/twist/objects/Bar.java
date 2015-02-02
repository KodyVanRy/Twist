package com.desitum.twist.objects;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by kody on 1/30/15.
 */
public class Bar extends Sprite {
    private float moveSpeed; //Max is 8 (4 is lowest, 8 is highest, 4 = slow)
    private float barLength; //Max is 5 (1 is lowest, 5 is highest, 1 = small)

    //TODO change all 0's and 1's to be static final ints named HORIZONTAL and VERTICAL
    // look at what we did in Kipper
    private int barOrientation; //Vertical or Horizontal (0 is Vertical, 1 is Horizontal)
    private float barPositionX;
    private float barPositionY;
    private Color barColor; //Color of the Bar (Orange?)
    private float barStoppingPointTop;
    private float barStoppingPointBottom;
    private float barStoppingPointLeft;
    private float barStoppingPointRight;

    public Bar(float moveSpeed, float barLength, int barOrientation, Color barColor, int[] position) {
        this.moveSpeed = moveSpeed;
        this.barLength = barLength;
        this.barOrientation = barOrientation;
        this.barColor = barColor;

    }

    public void update(float delta) {
        if (barOrientation == 0) {
            if (barPositionY <= barStoppingPointBottom) {
                moveSpeed *= -1;
            } else if (barPositionY + barLength >= barStoppingPointTop) {
                moveSpeed *= -1;
            } else {
                barPositionY += moveSpeed * delta;
            }
        } else {
            if (barPositionX <= barStoppingPointLeft) {
                moveSpeed *= -1;
            } else if (barPositionX + barLength >= barStoppingPointRight) {
                moveSpeed *= -1;
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
        //Hahaha, I hid it inside a collapsed method! Sneaky Sneaky. MainScreen is the last one!
    }

    //TODO need setters for all the stopping point variables

}
