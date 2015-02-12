package com.desitum.twist.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.desitum.twist.GooglePlayServicesInterface;
import com.desitum.twist.TwistGame;
import com.desitum.twist.data.Assets;
import com.desitum.twist.data.Pattern;
import com.desitum.twist.libraries.Colors;

/**
 * Created by dvan6234 on 2/12/2015.
 */
public class SplashScreen implements Screen {

    private OrthographicCamera cam;
    private SpriteBatch batch;
    private TwistGame game;
    private GooglePlayServicesInterface gps;

    private Sprite desitum;

    private boolean beenThrough = false;
    private boolean hasLoaded = false;
    private float timeElapsed = 0;

    public SplashScreen(GooglePlayServicesInterface gps, TwistGame game){

        cam = new OrthographicCamera(MainScreen.FRUSTUM_WIDTH, MainScreen.FRUSTUM_HEIGHT);
        cam.position.set(MainScreen.FRUSTUM_WIDTH/2, MainScreen.FRUSTUM_HEIGHT/2, 0);
        batch = new SpriteBatch();

        this.gps = gps;
        this.game = game;

        Texture desitumTexture = new Texture(Gdx.files.internal("menu/desitum.png"));
        desitum = new Sprite(desitumTexture);
        desitum.setSize(10, 5);
        desitum.setX(0);
        desitum.setY(MainScreen.FRUSTUM_HEIGHT/2 - desitum.getHeight()/2);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        if (timeElapsed > 3){
            game.setScreen(new MainScreen(gps));
        } else if (beenThrough && !hasLoaded){
            hasLoaded = true;
            Assets.loadMenuTextures();
            Assets.loadGameTextures();
            Assets.loadBackgroundTextures();
            Assets.loadSounds();
            Pattern.loadPatterns();
            Colors.load();
        }
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        Gdx.gl.glClearColor(0,0,0, 1);

        cam.update();

        batch.setProjectionMatrix(cam.combined);
        batch.begin();
        desitum.draw(batch);
        batch.end();
        timeElapsed += delta;
        beenThrough = true;
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
