package com.desitum.twist.objects;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Rectangle;
import com.desitum.twist.screens.MainScreen;

/**
 * Created by Zmyth on 1/30/2015.
 */
public class Kipper {
    /*In way of explanation of this file and the weird naming conventions,
     the name of the cube in the game is "Kipper" Like Kipper the Kube.
      Name inspired by KopperKow*/

    private static final int HORIZONTAL = 0;
    private static final int VERTICAL = 1;

    private float kipperSpeed; //Max is 8 (4 is lowest, 8 is highest, 4 = slow)
    private float kipperLength; //Max is 5 (1 is lowest, 5 is highest, 1 = small)
    private int kipperOrientation; //Vertical or Horizontal (0 is Vertical, 1 is Horizontal)
    // GOT RID of positionx and positiony, should be stored in rectangle
    //This color is going to be used for a blur trail
    private Color kipperColor; //Color of Kipper (Blue?)
    // GOT rid of because it bounces off the sides private int kipperStoppingPointLeft;
    // GOT rid of because it bounces off the sides private int kipperStoppingPointRight;
    private Rectangle kipperRect;

    public Kipper(float kipperSpeed, float kipperLength, int kipperOrientation, Color kipperColor, int kipperPositionX, int kipperPositionY) {
        this.kipperSpeed = kipperSpeed;
        this.kipperLength = kipperLength;
        this.kipperOrientation = kipperOrientation;
        this.kipperColor = kipperColor;

    }

    public void update(float delta) {

        //TODO Add Collision with Bars here actually will be in World

        if (kipperOrientation == HORIZONTAL) //Placeholder to prevent error
        {
            if (kipperRect.getX() <= MainScreen.FRUSTUM_WIDTH) {
                kipperSpeed *= -1;
            } else if (kipperRect.getX() + kipperLength >= MainScreen.FRUSTUM_WIDTH) {
                kipperSpeed *= -1;
            }

            //took out else statement, the box needs to move every time through
            kipperRect.setX(kipperRect.getX() + kipperSpeed * delta); //CHANGED because we need rects for collision detection

        } else if (kipperOrientation == VERTICAL){

        }
    }

    public float getKipperSpeed()
    {
        return kipperSpeed;
    }

    public void setKipperSpeed(float kipperSpeed)
    {
        this.kipperSpeed = kipperSpeed;
    }

    public float getKipperLength()
    {
        return kipperLength;
    }

    public void setKipperLength(float kipperLength)
    {
        this.kipperLength = kipperLength;
    }

    public int getKipperOrientation()
    {
        return kipperOrientation;
    }

    public void setKipperOrientation(int kipperOrientation)
    {
        this.kipperOrientation = kipperOrientation;
    }

    public Rectangle getKipperRect(){
        return kipperRect;
    }

    //TODO need a toggle for direction
    //TODO need new orientation ROTATING (won't be used til end, but need variable and elseif for later)

}

