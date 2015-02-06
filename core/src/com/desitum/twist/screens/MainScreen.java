package com.desitum.twist.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.desitum.twist.data.Assets;
import com.desitum.twist.data.BackgroundManager;
import com.desitum.twist.data.Settings;
import com.desitum.twist.libraries.CollisionDetection;
import com.desitum.twist.objects.Bar;
import com.desitum.twist.objects.MenuButton;
import com.desitum.twist.world.GameRenderer;
import com.desitum.twist.world.GameWorld;
import com.desitum.twist.world.MenuRenderer;
import com.desitum.twist.world.MenuWorld;

/**
 * Created by kody on 1/30/15.
 */
public class MainScreen implements Screen {

    public static final float FRUSTUM_WIDTH = 10;
    public static final float FRUSTUM_HEIGHT = 15;

    public static int state = 0;

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
    private GameWorld gameWorld;

    private MenuRenderer menuRenderer;
    private GameRenderer gameRenderer;

    private Vector3 touchPoint;

    private BackgroundManager backgroundManager;

    public MainScreen() {
        cam = new OrthographicCamera(FRUSTUM_WIDTH, FRUSTUM_HEIGHT);
        cam.position.set(FRUSTUM_WIDTH / 2, FRUSTUM_HEIGHT / 2, 0);
        spriteBatch = new SpriteBatch();
        backgroundManager = new BackgroundManager();

        menuWorld = new MenuWorld();
        gameWorld = new GameWorld();

        menuRenderer = new MenuRenderer(menuWorld, spriteBatch, backgroundManager);
        gameRenderer = new GameRenderer(gameWorld, spriteBatch, backgroundManager);
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

        draw();

        spriteBatch.end();
    }

    //region onClicks

    /**
     * handles Gdx.input.justTouched() input
     */
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

    /**
     * called when click input when game state is MENU_WAITING
     */
    private void onClickMenuWaiting() {
        for (MenuButton mb : menuWorld.getMenuButtons()) {
            if (CollisionDetection.pointInRectangle(mb.getBoundingRectangle(), touchPoint)) { // if touched a rectangle
                if (mb.getCommand().equals(PLAY)) { // if the button was play
                    state = MENU_TRANSITION;
                } else if (mb.getCommand().equals(OPEN_SCORES)) { // if the button was high scores
                    //TODO add in Google Play Game Services (I'll do that)
                } else if (mb.getCommand().equals(VOLUMES)) { // if the button was volumes
                    Settings.volumeOn = !Settings.volumeOn; // toggle whether volume is on
                    if (Settings.volumeOn) { // update texture for the Volume button
                        mb.setTexture(Assets.volumeOnButtonTexture);
                    } else {
                        mb.setTexture(Assets.volumeOffButtonTexture);
                    }
                }
            }
        }
    }

    /**
     * called when click input when game state is GAME_BEFORE
     */
    private void onClickGameBefore() {
        state = GAME_RUNNING;
    }

    /**
     * called when click input when game state is GAME_PAUSED
     */
    private void onClickGamePaused() {
        state = GAME_RUNNING;
    }

    /**
     * called when click input when game state is GAME_RUNNING
     */
    private void onClickGameRunning() {
        gameWorld.toggleKipperDirection();
    }

    /**
     * called when click input when game state is GAME_OVER
     */
    private void onClickGameOver() {
        //TODO (will be done later) check for button and do accordingly
    }
    //endregion

    //region folding for update methods

    /**
     * update in general, switch case determines what area to update
     * @param delta delta time
     */
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


    /**
     * method to update game when state equals MENU_WAITING
     * @param delta delta time
     */
    private void updateMenuWaiting(float delta) {
        //Does nothing for now
    }

    /**
     * method to update game when state equals MENU_TRANSITION
     * @param delta delta time
     */
    private void updateMenuTransition(float delta) {
        if (!menuWorld.getMenuButtons().get(0).isMoving()) { // if first menu button isn't moving
            menuWorld.getMenuButtons().get(0).moveOffScreen(); // start it moving
        } else if (!menuWorld.getMenuButtons().get(1).isMoving() && menuWorld.getMenuButtons().get(0).getX() >= 4) { // if first menu button isn't moving
            menuWorld.getMenuButtons().get(1).moveOffScreen(); // start it moving
        } else if (!menuWorld.getMenuButtons().get(2).isMoving() && menuWorld.getMenuButtons().get(1).getX() >= 4) {
            menuWorld.getMenuButtons().get(2).moveOffScreen();
        } else if (menuWorld.getMenuButtons().get(2).getX() >= FRUSTUM_WIDTH){
            System.out.println("Switched states");
            state = GAME_BEFORE;
        }
        for (MenuButton mb: menuWorld.getMenuButtons()){
            mb.update(delta);
        }
    }

    /**
     * method to update game when state equals GAME_BEFORE
     * @param delta delta time
     */
    private void updateGameBefore(float delta) {
        gameWorld.update(state, gameRenderer.getCam(), delta);
    }

    /**
     * method to update game when state equals GAME_RUNNING
     * @param delta delta time
     */
    private void updateGameRunning(float delta) {
        gameWorld.update(state, gameRenderer.getCam(), delta);

        for (Bar b: gameWorld.getBars()){
            if (CollisionDetection.overlapRectangles(b.getBoundingRectangle(), gameWorld.getKipper().getBoundingRectangle())) {
                //cam.position.set(FRUSTUM_WIDTH/2, FRUSTUM_HEIGHT/2, 0);
                //gameRenderer.resetCam();
                //menuRenderer.resetCam();
                //backgroundManager.reset();
                state = GAME_OVER;
            }
        }
    }

    /**
     * method to update game when state equals GAME_PAUSED
     * @param delta delta time
     */
    private void updateGamePaused(float delta) {

    }

    /**
     * method to update game when state equals GAME_OVER
     * @param delta delta time
     */
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
        gameRenderer.render();
    }

    private void drawGameBefore() {
        gameRenderer.render();

        if (state == GAME_BEFORE && gameWorld.getKipper().getY() > 3){
            spriteBatch.draw(Assets.tappingHand, FRUSTUM_WIDTH / 2 - 1, gameWorld.getKipper().getY() + 4.5f, 2, 3);
        }
    }

    private void drawMenuTransition() {
        menuRenderer.render();
    }

    private void drawMenuWaiting() {
        menuRenderer.render();
    }


    private void drawGameRunning() {
        gameRenderer.render();
    }

    private void drawGameOver() {
        gameRenderer.render();
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
        if (state == GAME_RUNNING){
            state = GAME_PAUSED;
        }
    }

    @Override
    public void pause() {
        if (state == GAME_RUNNING){
            state = GAME_PAUSED;
        }
    }

    @Override
    public void resume() {
    }

    @Override
    public void dispose() {
    }

    //TODO need to create a background manager class
}
