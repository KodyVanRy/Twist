package com.desitum.twist.world;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.desitum.twist.objects.Bar;
import com.desitum.twist.screens.MainScreen;

/**
 * Created by kody on 1/31/15.
 */
public class GameRenderer {

    private SpriteBatch gameBatch;
    private OrthographicCamera menuCam;
    private GameWorld world;

    public GameRenderer (GameWorld world, SpriteBatch batch){
        this.world = world;
        this.gameBatch = batch;
        menuCam = new OrthographicCamera(MainScreen.FRUSTUM_WIDTH, MainScreen.FRUSTUM_HEIGHT);
        menuCam.position.set(MainScreen.FRUSTUM_WIDTH/2, MainScreen.FRUSTUM_HEIGHT/2, 0);
    }

    public void render(){
        menuCam.update();
        gameBatch.setProjectionMatrix(menuCam.combined);

        for (Bar bar: world.getBars()){
            bar.draw(gameBatch);
            //Did you actually follow the trail? Good for you! Go to Bar next! (Delete these as you go.......)
        }

    }

}
