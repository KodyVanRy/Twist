package com.desitum.twist.world;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.desitum.twist.data.Assets;
import com.desitum.twist.objects.BackgroundImage;
import com.desitum.twist.objects.MenuButton;
import com.desitum.twist.screens.MainScreen;

import java.util.ArrayList;

/**
 * Created by kody on 1/30/15.
 */
public class MenuRenderer {

    private SpriteBatch menuBatch;
    private OrthographicCamera menuCam;
    private MenuWorld world;

    private ArrayList<BackgroundImage> backgroundImages;

    public MenuRenderer (MenuWorld world, SpriteBatch batch){
        this.world = world;
        this.menuBatch = batch;
        menuCam = new OrthographicCamera(MainScreen.FRUSTUM_WIDTH, MainScreen.FRUSTUM_HEIGHT);
        menuCam.position.set(MainScreen.FRUSTUM_WIDTH/2, MainScreen.FRUSTUM_HEIGHT/2, 0);

        backgroundImages = loadBackgroundImages();
    }

    public void render() {
        menuCam.update();
        menuBatch.setProjectionMatrix(menuCam.combined);

        backgroundImages.get(0).draw(menuBatch);
        backgroundImages.get(1).draw(menuBatch);
        for (MenuButton menuItem : this.world.getMenuButtons()) {
            menuItem.draw(menuBatch);
        }
    }

    private ArrayList<BackgroundImage> loadBackgroundImages(){
        ArrayList<BackgroundImage> bgs = new ArrayList<BackgroundImage>();

        bgs.add(new BackgroundImage(Assets.backgroundTexture1, MainScreen.FRUSTUM_WIDTH, 0, 0));
        bgs.add(new BackgroundImage(Assets.backgroundTexture2, MainScreen.FRUSTUM_WIDTH, 0, 10));
        bgs.add(new BackgroundImage(Assets.backgroundTexture3, MainScreen.FRUSTUM_WIDTH, 0, 0));
        bgs.add(new BackgroundImage(Assets.backgroundTexture4, MainScreen.FRUSTUM_WIDTH, 0, 0));

        return bgs;
    }

}
