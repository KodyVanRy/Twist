package com.desitum.twist.objects;

/**
 * Created by kody on 1/30/15.
 */
public class Bar {
    private float moveSpeed; //Max is 8 (4 is lowest, 8 is highest, 4 = slow)
    private float barLength; //Max is 5 (1 is lowest, 5 is highest, 1 = small)
    private int barOrientation; //Vertical or Horizantal

    public Bar(float moveSpeed, float barLength, int barOrientation)
    {
        this.moveSpeed = moveSpeed;
        this.barLength = barLength;
        this.barOrientation = barOrientation;

    }

    public void update(float delta)
    {

    }

    public float getMoveSpeed()
    {
        return moveSpeed;
    }

    public void setMoveSpeed(float moveSpeed)
    {
        this.moveSpeed = moveSpeed;
    }

    public float getBarLength()
    {
        return barLength;
    }

    public void setBarLength(float barLength)
    {
        this.barLength = barLength;
    }

    public int getBarOrientation()
    {
        return barOrientation;
    }

    public void setBarOrientation(int barOrientation)
    {
        this.barOrientation = barOrientation;
    }
}
