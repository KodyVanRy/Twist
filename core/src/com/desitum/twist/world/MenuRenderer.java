package com.desitum.twist.world;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.desitum.twist.objects.MenuButton;
import com.desitum.twist.screens.MainScreen;

/**
 * Created by kody on 1/30/15.
 */
public class MenuRenderer {

    private SpriteBatch menuBatch;
    private OrthographicCamera menuCam;
    private MenuWorld world;

    public MenuRenderer (MenuWorld world, SpriteBatch batch){
        this.world = world;
        this.menuBatch = batch;
        menuCam = new OrthographicCamera(MainScreen.FRUSTUM_WIDTH, MainScreen.FRUSTUM_HEIGHT);
        menuCam.position.set(MainScreen.FRUSTUM_WIDTH/2, MainScreen.FRUSTUM_HEIGHT/2, 0);
    }

    public void render(){
        menuCam.update();
        menuBatch.setProjectionMatrix(menuCam.combined);

        for (MenuButton menuItem: this.world.getMenuButtons()){
            menuItem.draw(menuBatch);
        }
    }

}
