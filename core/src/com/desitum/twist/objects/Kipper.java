package com.desitum.twist.objects;

import com.badlogic.gdx.graphics.Color;
import com.desitum.twist.screens.MainScreen;

/**
 * Created by Zmyth on 1/30/2015.
 */
public class Kipper {
    /*In way of explanation of this file and the weird naming conventions,
     the name of the cube in the game is "Kipper" Like Kipper the Kube.
      Name inspired by KopperKow*/

    private float kipperSpeed; //Max is 8 (4 is lowest, 8 is highest, 4 = slow)
    private float kipperLength; //Max is 5 (1 is lowest, 5 is highest, 1 = small)
    private int kipperOrientation; //Vertical or Horizontal (0 is Vertical, 1 is Horizontal)
    private int kipperPositionX;
    private int kipperPositionY;
    private Color kipperColor; //Color of Kipper (Blue?)
    private int kipperStoppingPointLeft;
    private int kipperStoppingPointRight;

    public Kipper(float kipperSpeed, float kipperLength, int kipperOrientation, Color kipperColor, int kipperPositionX, int kipperPositionY) {
        this.kipperSpeed = kipperSpeed;
        this.kipperLength = kipperLength;
        this.kipperOrientation = kipperOrientation;
        this.kipperColor = kipperColor;

    }

    public void update(float delta)
    {


            if(kipperOrientation == 0) //Placeholder to prevent error
            {
                //TODO Add Collision with Bars here
            }
            else if (kipperPositionX <= MainScreen.FRUSTUM_WIDTH) {
                kipperSpeed *= -1;
            } else if (kipperPositionX + kipperLength >= MainScreen.FRUSTUM_WIDTH) {
                kipperSpeed *= -1;
            } else {
                kipperPositionX += kipperSpeed * delta;
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
}

