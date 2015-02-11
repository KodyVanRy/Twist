package com.desitum.twist.objects;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by kody on 2/3/15.
 * can be used by kody and people in []
 */
public class BackgroundImage extends Sprite {

    public BackgroundImage(Texture texture, float sizeX, float locX, float locY) {
        super(texture, 0, 0, texture.getWidth(), texture.getHeight());

        setPosition(locX, locY);
        setSize(sizeX, sizeX);
    }

    public boolean outOfScreen(OrthographicCamera cam){
        if (getY() + getHeight() < cam.position.y - cam.viewportHeight) {
            return true;
        }
        return false;
    }
}
