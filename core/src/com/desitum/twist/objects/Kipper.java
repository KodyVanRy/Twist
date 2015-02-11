package com.desitum.twist.objects;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;
import com.desitum.twist.data.Assets;
import com.desitum.twist.data.Settings;
import com.desitum.twist.screens.MainScreen;

/**
 * Created by Zmyth on 1/30/2015.
 */
public class Kipper extends Sprite {
    /*In way of explanation of this file and the weird naming conventions,
     the name of the cube in the game is "Kipper" Like Kipper the Kube.
      Name inspired by KopperKow*/

    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    public static final int ROTATING = 2;
    private static final float ROTATE_SPEED = 750;

    private float kipperSpeed; //Max is 8 (4 is lowest, 8 is highest, 4 = slow)
    private int kipperOrientation; //Vertical or Horizontal (0 is Vertical, 1 is Horizontal)
    private float rotationAmount; //Rotational amount for animation
    private float lastHorizontalSpeed; //Left or Right (- or +)
    private int nextDirection = 0;
    private Rectangle lastRectangle;

    //This color is going to be used for a blur trail
    private Color kipperColor; //Color of Kipper (Blue?)

    public Kipper(float kipperSpeed, float kipperSize, Color kipperColor, float kipperPositionX, float kipperPositionY) {
        super(Assets.kipperTexture, 0, 0, Assets.kipperTexture.getWidth(), Assets.kipperTexture.getHeight());

        this.kipperSpeed = kipperSpeed;
        this.kipperOrientation = VERTICAL;
        this.kipperColor = kipperColor;
        this.rotationAmount = 0;
        this.lastHorizontalSpeed = kipperSpeed;

        this.setSize(kipperSize, kipperSize);
        this.setX(kipperPositionX);
        this.setY(kipperPositionY);
        setOriginCenter();
    }

    public void update(float delta) {


        if (kipperOrientation == HORIZONTAL)
        {
            if (getX() <= 0) {
                kipperSpeed = Settings.kipperSpeed;
            } else if (getX() + getWidth() >= MainScreen.FRUSTUM_WIDTH) {
                kipperSpeed = -Settings.kipperSpeed;
            }


            setX(getX() + kipperSpeed * delta);

            lastRectangle = new Rectangle(getX(), getY(), getWidth(), getHeight());

        } else if (kipperOrientation == VERTICAL) {
            setY(getY() + kipperSpeed * delta);

            lastRectangle = new Rectangle(getX(), getY(), getWidth(), getHeight());
        } else {
            if (nextDirection == VERTICAL){
                if (rotationAmount < 0){
                    rotationAmount += delta * ROTATE_SPEED;
                    if (rotationAmount >= 0){
                        rotationAmount = 0;
                        kipperOrientation = VERTICAL;
                    }
                } else {
                    rotationAmount -= delta * ROTATE_SPEED;
                    if (rotationAmount <= 0){
                        rotationAmount = 0;
                        kipperOrientation = VERTICAL;
                    }
                }
            } else {
                if (lastHorizontalSpeed < 0){
                    rotationAmount += delta * ROTATE_SPEED;
                    if (rotationAmount >= 90){
                        rotationAmount = 90;
                        kipperOrientation = HORIZONTAL;
                    }
                } else {
                    rotationAmount -= delta * ROTATE_SPEED;
                    if (rotationAmount <= -90){
                        rotationAmount = -90;
                        kipperOrientation = HORIZONTAL;
                    }
                }
            }
            setRotation(rotationAmount);
        }
    }


    public float getKipperLength() {
        return getBoundingRectangle().getWidth();
    }

    public void setKipperLength(float kipperLength) {
        this.getBoundingRectangle().setWidth(kipperLength);
    }

    public int getKipperOrientation() {
        return kipperOrientation;
    }

    public void toggleKipperOrientation() {
        if (kipperOrientation == VERTICAL) {
            kipperOrientation = ROTATING;
            nextDirection = HORIZONTAL;
            kipperSpeed = lastHorizontalSpeed;
        } else if (kipperOrientation == HORIZONTAL) {
            kipperOrientation = ROTATING;
            nextDirection = VERTICAL;
            lastHorizontalSpeed = kipperSpeed;
            kipperSpeed = Settings.kipperSpeed;
        }
    }


    public void reset(){
        setPosition(Settings.kipperX, Settings.kipperY);
        kipperOrientation = VERTICAL;
        kipperSpeed = Settings.kipperSpeed;
    }

    @Override
    public Rectangle getBoundingRectangle(){
        return lastRectangle;
    }
}

