package com.desitum.twist.world;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.desitum.twist.data.Assets;
import com.desitum.twist.data.BackgroundManager;
import com.desitum.twist.objects.BackgroundImage;
import com.desitum.twist.objects.Bar;
import com.desitum.twist.screens.MainScreen;

/**
 * Created by kody on 1/31/15.
 */
public class GameRenderer {

    private SpriteBatch gameBatch;
    private OrthographicCamera gameCam;
    private GameWorld world;
    private BackgroundManager backgroundManager;

    public GameRenderer (GameWorld world, SpriteBatch batch, BackgroundManager backgroundManager){
        this.world = world;
        this.gameBatch = batch;
        this.backgroundManager = backgroundManager;
        gameCam = new OrthographicCamera(MainScreen.FRUSTUM_WIDTH, MainScreen.FRUSTUM_HEIGHT);
        gameCam.position.set(MainScreen.FRUSTUM_WIDTH/2, MainScreen.FRUSTUM_HEIGHT/2, 0);
    }

    public void render(){

        if (this.world.kipper.getY() > 3) {
            gameCam.position.set(MainScreen.FRUSTUM_WIDTH/2, this.world.kipper.getY() + 4.5f, 0);
            backgroundManager.update(gameCam);
        }

        gameCam.update();
        gameBatch.setProjectionMatrix(gameCam.combined);

        for (BackgroundImage bgImage: backgroundManager.getBackgroundImages()){
            bgImage.draw(gameBatch);
        }

        for (Bar bar: world.getBars()){
            bar.draw(gameBatch);
        }

        this.world.kipper.draw(gameBatch);

        Assets.font.draw(gameBatch, "" + world.score, MainScreen.FRUSTUM_WIDTH*0.5f, MainScreen.FRUSTUM_HEIGHT*0.5f);

    }

    public OrthographicCamera getCam(){
        return gameCam;
    }

    public void resetCam(){
        gameCam.position.set(MainScreen.FRUSTUM_WIDTH/2, MainScreen.FRUSTUM_HEIGHT/2, 0);
    }
}
