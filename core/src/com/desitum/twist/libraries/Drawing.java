package com.desitum.twist.libraries;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;

/**
 * Created by kody on 1/31/15.
 */
public class Drawing {

    public static Texture getTextureBoundingRectangle(int width, int height, int radius, Color color) {
        Pixmap pixmap;

        pixmap = new Pixmap(width, height, Pixmap.Format.RGBA8888);
        pixmap.setColor(color);

        // Horizontal Rectangle
        pixmap.fillRectangle(0, radius, pixmap.getWidth(), pixmap.getHeight()-2*radius);

        // Green rectangle
        pixmap.fillRectangle(radius, 0, pixmap.getWidth() - 2*radius, pixmap.getHeight());


        // Bottom-left circle
        pixmap.fillCircle(radius, radius, radius);

        // Top-left circle
        pixmap.fillCircle(radius, pixmap.getHeight()-radius, radius);

        // Bottom-right circle
        pixmap.fillCircle(pixmap.getWidth()-radius, radius, radius);

        // Top-right circle
        pixmap.fillCircle(pixmap.getWidth()-radius, pixmap.getHeight()-radius, radius);

        Texture returnTexture = new Texture(pixmap.getWidth(), pixmap.getHeight(), Pixmap.Format.RGBA8888);
        returnTexture.draw(pixmap, 0, 0);
        return returnTexture;
    }
}
