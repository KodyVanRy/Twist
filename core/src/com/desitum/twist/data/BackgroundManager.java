package com.desitum.twist.data;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.desitum.twist.objects.BackgroundImage;
import com.desitum.twist.screens.MainScreen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * Created by kody on 2/4/15.
 * can be used by kody and people in []
 */
public class BackgroundManager {

    private ArrayList<Texture> backgroundImages;
    private ArrayList<BackgroundImage> currentBackgroundImages;

    public BackgroundManager() {
        backgroundImages = loadBackgroundImages();
        currentBackgroundImages = new ArrayList<BackgroundImage>();
        currentBackgroundImages = getCurrent();
    }

    public void update(OrthographicCamera cam){
        Iterator iter = currentBackgroundImages.iterator();
        while (iter.hasNext()) {
            BackgroundImage bg = (BackgroundImage) iter.next();
            if (bg.outOfScreen(cam)){
                iter.remove();
            }
        }
        if (currentBackgroundImages.size() < 4){
            currentBackgroundImages = getCurrent();
        }
    }

    private ArrayList<Texture> loadBackgroundImages(){
        ArrayList<Texture> bgs = new ArrayList<Texture>();

        bgs.add(Assets.backgroundTexture1);
        bgs.add(Assets.backgroundTexture2);
        bgs.add(Assets.backgroundTexture3);
        bgs.add(Assets.backgroundTexture4);
        bgs.add(Assets.backgroundTexture5);
        bgs.add(Assets.backgroundTexture6);
        bgs.add(Assets.backgroundTexture7);

        return bgs;
    }

    public ArrayList<BackgroundImage> getBackgroundImages() {
        return this.currentBackgroundImages;
    }

    private ArrayList<BackgroundImage> getCurrent(){
        ArrayList<BackgroundImage> returnArray = (ArrayList<BackgroundImage>) currentBackgroundImages.clone();
        Random rand = new Random();

        while (returnArray.size() < 4){
            Texture nextImage = backgroundImages.get(rand.nextInt(backgroundImages.size()));
            float nextY = 0;
            if (returnArray.size() > 0){ nextY = returnArray.get(returnArray.size()-1).getY() + returnArray.get(returnArray.size()-1).getHeight(); }
            BackgroundImage imageToAdd = new BackgroundImage(nextImage, MainScreen.FRUSTUM_WIDTH, 0, nextY);
            returnArray.add(imageToAdd);
        }
        System.out.println("Size : " + returnArray.size());
        return returnArray;
    }
}
