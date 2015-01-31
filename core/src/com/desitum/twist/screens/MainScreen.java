package com.desitum.twist.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.desitum.twist.world.MenuRenderer;
import com.desitum.twist.world.MenuWorld;

/**
 * Created by kody on 1/30/15.
 */
public class MainScreen implements Screen {

    public static final float FRUSTUM_WIDTH = 10;
    public static final float FRUSTUM_HEIGHT = 15;

    private OrthographicCamera cam;
    private SpriteBatch spriteBatch;
    private MenuWorld menuWorld;
    private MenuRenderer menuRenderer;

    public MainScreen () {
        cam = new OrthographicCamera(FRUSTUM_WIDTH, FRUSTUM_HEIGHT);
        cam.position.set(FRUSTUM_WIDTH/2, FRUSTUM_HEIGHT/2, 0);
        spriteBatch = new SpriteBatch();
        menuWorld = new MenuWorld();
        menuRenderer = new MenuRenderer(menuWorld, spriteBatch);
    }

    @Override
    public void render (float delta) {
        System.out.println(delta);

        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        Gdx.gl.glClearColor(1,0,1,1);

        cam.update();
        spriteBatch.begin();

        menuRenderer.render();

        spriteBatch.end();
    }

    @Override
    public void resize (int width, int height) {
    }

    @Override
    public void show () {
    }

    @Override
    public void hide () {
    }

    @Override
    public void pause () {
    }

    @Override
    public void resume () {
    }

    @Override
    public void dispose () {
    }
}
