package com.desitum.twist.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.desitum.twist.data.Assets;
import com.desitum.twist.data.Settings;
import com.desitum.twist.libraries.CollisionDetection;
import com.desitum.twist.objects.Kipper;
import com.desitum.twist.objects.MenuButton;
import com.desitum.twist.world.MenuRenderer;
import com.desitum.twist.world.MenuWorld;

/**
 * Created by kody on 1/30/15.
 */
public class MainScreen implements Screen {


    Kipper kipper;

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

    public MainScreen() {
        cam = new OrthographicCamera(FRUSTUM_WIDTH, FRUSTUM_HEIGHT);
        cam.position.set(FRUSTUM_WIDTH / 2, FRUSTUM_HEIGHT / 2, 0);
        spriteBatch = new SpriteBatch();
        menuWorld = new MenuWorld();
        menuRenderer = new MenuRenderer(menuWorld, spriteBatch);
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        Gdx.gl.glClearColor(1, 0, 1, 1);

        if (Gdx.input.justTouched()) {
            touchPoint = cam.unproject(new Vector3(Gdx.input.getX(), Gdx.input.getY(), 0));
            onClick();
        }

        update(delta);
        //draw();

        cam.update();
        spriteBatch.begin();

        menuRenderer.render();

        spriteBatch.end();
    }

    //region onClicks
    private void onClick() {
        switch (state) {
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

    private void onClickMenuWaiting() {
        for (MenuButton mb : menuWorld.getMenuButtons()) {
            if (CollisionDetection.pointInRectangle(mb.getBoundingRectangle(), touchPoint)) {
                if (mb.getCommand().equals(PLAY)) {
                    state = MENU_TRANSITION;
                } else if (mb.getCommand().equals(OPEN_SCORES)) {
                    //TODO add in Google Play Game Services (I'll do that)
                } else if (mb.getCommand().equals(VOLUMES)) {
                    if (Settings.volumeOn) {
                        mb.setTexture(Assets.volumeOnButtonTexture);
                    } else {
                        mb.setTexture(Assets.volumeOffButtonTexture);
                    }
                }
            }
        }
    }

    private void onClickGameBefore() {
        state = GAME_RUNNING;
    }

    private void onClickGamePaused() {
        state = GAME_RUNNING;
    }

    private void onClickGameRunning() {
        kipper.toggleKipperOrientation();
    }

    private void onClickGameOver() {

    }
    //endregion

    //region folding for update methods
    private void update(float delta) {
        switch (state) {
            case MENU_WAITING:
                updateMenuWaiting(delta);
                break;
            case MENU_TRANSITION:
                updateMenuTransition(delta);
                break;
            case GAME_BEFORE:
                updateGameBefore(delta);
                break;
            case GAME_PAUSED:
                updateGamePaused(delta);
                break;
            case GAME_RUNNING:
                updateGameRunning(delta);
                break;
            case GAME_OVER:
                updateGameOver(delta);
                break;
        }
    }


    private void updateMenuWaiting(float delta) {
        //Does nothing for now
    }

    private void updateMenuTransition(float delta) {
        if (!menuWorld.getMenuButtons().get(0).isMoving()) { // if first menu button isn't moving
            menuWorld.getMenuButtons().get(0).moveOffScreen(); // start it moving
        } else if (!menuWorld.getMenuButtons().get(1).isMoving() && menuWorld.getMenuButtons().get(0).getX() >= 6) { // if first menu button isn't moving
            System.out.println("MenuButton 1: " + menuWorld.getMenuButtons().get(0).getX());
            menuWorld.getMenuButtons().get(1).moveOffScreen(); // start it moving
        } else if (!menuWorld.getMenuButtons().get(2).isMoving() && menuWorld.getMenuButtons().get(1).getX() >= 6) {
            menuWorld.getMenuButtons().get(2).moveOffScreen();
        }
        for (MenuButton mb: menuWorld.getMenuButtons()){
            mb.update(delta);
        }
    }

    private void updateGameBefore(float delta) {

    }

    private void updateGameRunning(float delta) {

    }

    private void updateGamePaused(float delta) {

    }

    private void updateGameOver(float delta) {
    }


    //endregion

    //region folding for drawing methods
    private void draw() {
        switch (state) {
            case GAME_OVER:
                drawGameOver();
                break;
            case GAME_RUNNING:
                drawGameRunning();
                break;
            case MENU_WAITING:
                drawMenuWaiting();
                break;
            case MENU_TRANSITION:
                drawMenuTransition();
                break;
            case GAME_BEFORE:
                drawGameBefore();
                break;
            case GAME_PAUSED:
                drawGamePaused();
                break;
        }
    }

    private void drawGamePaused() {
    }

    private void drawGameBefore() {

    }

    private void drawMenuTransition() {

    }

    private void drawMenuWaiting() {

    }


    private void drawGameRunning() {
    }

    private void drawGameOver() {
    }
    //endregion

    @Override
    public void resize(int width, int height) {
    }

    @Override
    public void show() {
    }

    @Override
    public void hide() {
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void dispose() {
    }
}
