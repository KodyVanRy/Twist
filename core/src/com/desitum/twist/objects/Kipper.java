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

    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;

    private float kipperSpeed; //Max is 8 (4 is lowest, 8 is highest, 4 = slow)
    private float kipperLength; //Max is 5 (1 is lowest, 5 is highest, 1 = small)
    private int kipperOrientation; //Vertical or Horizontal (0 is Vertical, 1 is Horizontal)
    
    //This color is going to be used for a blur trail
    private Color kipperColor; //Color of Kipper (Blue?)
    
    private Rectangle kipperRect;

    public Kipper(float kipperSpeed, float kipperSize, Color kipperColor, float kipperPositionX, float kipperPositionY) {
        this.kipperSpeed = kipperSpeed;
        this.kipperOrientation = VERTICAL;
        this.kipperColor = kipperColor;

        kipperRect = new Rectangle(kipperPositionX, kipperPositionY, kipperSize, kipperSize);

    }

    public void update(float delta) {

        

        if (kipperOrientation == HORIZONTAL) //Placeholder to prevent error
        {
            if (kipperRect.getX() <= MainScreen.FRUSTUM_WIDTH) {
                kipperSpeed *= -1;
            } else if (kipperRect.getX() + kipperLength >= MainScreen.FRUSTUM_WIDTH) {
                kipperSpeed *= -1;
            }

            
            kipperRect.setX(kipperRect.getX() + kipperSpeed * delta); 

        } else if (kipperOrientation == VERTICAL){
            kipperRect.setY(kipperRect.getY() + kipperSpeed * delta);
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

    public void toggleKipperOrientation(int kipperOrientation){
        this.kipperOrientation = kipperOrientation;

        if(kipperOrientation == VERTICAL)
        {
            kipperOrientation = HORIZONTAL;
        }
        else
        {
            kipperOrientation = VERTICAL;
        }
    }

    public Rectangle getKipperRect(){
        return kipperRect;
    }


}

