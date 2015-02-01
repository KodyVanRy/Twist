package com.desitum.twist.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.desitum.twist.world.MenuRenderer;
import com.desitum.twist.world.MenuWorld;

/**
 * Created by kody on 1/30/15.
 */
public class MainScreen implements Screen {

    public static final float FRUSTUM_WIDTH = 10;
    public static final float FRUSTUM_HEIGHT = 15;

    private int state = 0;

    public static final int MENU_WAITING = 0;
    public static final int MENU_TRANSITION = 1;
    public static final int GAME_BEFORE = 2;
    public static final int GAME_RUNNING = 3;
    public static final int GAME_PAUSED = 4;
    public static final int GAME_OVER = 5;

    public static String PLAY = "play";
    public static String VOLUMES = "volumes";
    public static String OPEN_SCORES = "open_scores";

    private OrthographicCamera cam;
    private SpriteBatch spriteBatch;
    private MenuWorld menuWorld;
    private MenuRenderer menuRenderer;

    private Vector3 touchPoint;

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

        if (Gdx.input.justTouched()){
            touchPoint = cam.unproject(new Vector3(Gdx.input.getX(), Gdx.input.getY(), 0));
            onClick();
        }

        update(delta);
        draw();

        cam.update();
        spriteBatch.begin();

        menuRenderer.render();

        spriteBatch.end();
    }

    //region onClicks
    private void onClick(){
        switch (state){
            case MENU_WAITING:
                onClickMenuWaiting();
                break;
            case GAME_BEFORE:
                onClickGameBefore();
                break;
            case GAME_PAUSED:
                onClickGamePaused();
                break;
            case GAME_RUNNING:
                onClickGameRunning();
                break;
            case GAME_OVER:
                onClickGameOver();
                break;
        }
    }

    private void onClickMenuWaiting(){

    }

    private void onClickGameBefore(){

    }

    private void onClickGamePaused(){

    }

    private void onClickGameRunning(){

    }

    private void onClickGameOver(){

    }
    //endregion

    //region folding for update methods
    private void update(float delta){
        switch (state){
            case MENU_WAITING:
                updateMenuWating();
                break;
            case MENU_TRANSITION():
                updateMenuTransition();
                break;
            case GAME_BEFORE:
                updateGameBefore();
                break;
            case GAME_PAUSED:
                updateGamePaused();
                break;
            case GAME_RUNNING:
                updateGameRunning();
                break;
            case GAME_OVER():
                updateGameOver();
                break;
        }
    }

    //TODO add in update methods (if this is just busy work to you I'll do it (remember the code generation shortuct ;)

    //endregion

    //region folding for drawing methods
    private void draw(){
        //TODO need switch case for drawing i.e. drawGameOver, drawGameRunning
    }
    //endregion

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
