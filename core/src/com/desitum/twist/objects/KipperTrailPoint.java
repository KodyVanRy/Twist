package com.desitum.twist.objects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by dvan6234 on 2/10/2015.
 */
public class KipperTrailPoint extends Sprite{

    private float alphaAmount;
    private float scaleSize;


    public KipperTrailPoint (float x, float y, float size, float rotationAmount, Texture texture){
        super(texture, 0, 0, texture.getWidth(), texture.getHeight());
        this.setPosition(x, y);
        this.setSize(size, size);

        this.setOriginCenter();

        this.setRotation(rotationAmount);

        alphaAmount = 0.4f;
        scaleSize = 1f;

    }

    public void update(float delta){
        alphaAmount -= delta;
        if (alphaAmount <= 0) alphaAmount = 0;
        setAlpha(alphaAmount);
        scaleSize -= delta*2;
        if (scaleSize <= 0) scaleSize = 0;
        setScale(scaleSize);
    }

    public float getScaleSize(){
        return scaleSize;
    }
}
