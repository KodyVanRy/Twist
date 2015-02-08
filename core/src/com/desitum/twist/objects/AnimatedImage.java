package com.desitum.twist.objects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by kody on 2/7/15.
 * can be used by kody and people in []
 */
public class AnimatedImage extends Sprite {

    public static final int GROW_FROM_CENTER = 0;
    public static final int SLIDE_IN_FROM_RIGHT = 1;
    public static final int SLIDE_IN_FROM_LEFT = 2;
    public static final int SLIDE_IN_FROM_TOP = 3;
    public static final int SLIDE_IN_FROM_BOTTOM = 4;

    private int animation;

    private float duration;
    private float animationDistance;
    private float goToWidth;
    private float goToHeight;
    private float goToX;
    private float goToY;
    private float screenWidth;
    private float screenHeight;

    public AnimatedImage(float width, float height, float x, float y, Texture texture, int animation, float duration) {
        super(texture, 0, 0, texture.getWidth(), texture.getHeight());

        this.animation = animation;
        this.duration = duration;

        setSize(width, height);
        setPosition(x, y);

        setupAnimation();
    }

    public AnimatedImage(float width, float height, float x, float y, Texture texture, int animation, float screenWidth, float screenHeight) {
        super(texture, 0, 0, texture.getWidth(), texture.getHeight());

        this.animation = animation;
        setSize(width, height);
        setPosition(x, y);

        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;

        setupAnimation();
    }

    private void setupAnimation(){

    }
}

