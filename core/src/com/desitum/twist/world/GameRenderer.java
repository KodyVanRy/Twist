package com.desitum.twist.world;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.desitum.twist.data.BackgroundManager;
import com.desitum.twist.objects.BackgroundImage;
import com.desitum.twist.objects.Bar;
import com.desitum.twist.screens.MainScreen;

/**
 * Created by kody on 1/31/15.
 */
public class GameRenderer {

    private SpriteBatch gameBatch;
    private OrthographicCamera menuCam;
    private GameWorld world;
    private BackgroundManager backgroundManager;

    public GameRenderer (GameWorld world, SpriteBatch batch, BackgroundManager backgroundManager){
        this.world = world;
        this.gameBatch = batch;
        this.backgroundManager = backgroundManager;
        menuCam = new OrthographicCamera(MainScreen.FRUSTUM_WIDTH, MainScreen.FRUSTUM_HEIGHT);
        menuCam.position.set(MainScreen.FRUSTUM_WIDTH/2, MainScreen.FRUSTUM_HEIGHT/2, 0);
    }

    public void render(){
        menuCam.update();
        gameBatch.setProjectionMatrix(menuCam.combined);

        for (BackgroundImage bgImage: backgroundManager.getBackgroundImages()){
            bgImage.draw(gameBatch);
        }

        for (Bar bar: world.getBars()){
            bar.draw(gameBatch);
        }

        this.world.kipper.draw(gameBatch);

        System.out.println("Drawing");

    }

}
