package com.desitum.twist.data;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

/**
 * Created by kody on 1/30/15.
 */
public class Assets {

    public static Texture playButtonTexture;
    public static Texture highscoreButtonTexture;
    public static Texture volumeOnButtonTexture;
    public static Texture volumeOffButtonTexture;

    public static Texture purpleBarTexture;
    public static Texture yellowBarTexture;
    public static Texture redBarTexture;
    public static Texture orangeBarTexture;
    public static Texture kipperTexture;
    public static Texture tappingHand;

    public static Texture backgroundTexture1;
    public static Texture backgroundTexture2;
    public static Texture backgroundTexture3;
    public static Texture backgroundTexture4;
    public static Texture backgroundTexture5;
    public static Texture backgroundTexture6;
    public static Texture backgroundTexture7;

    public static void loadMenuTextures(){
        playButtonTexture = new Texture(Gdx.files.internal("menu/play.png"));
        highscoreButtonTexture = new Texture(Gdx.files.internal("menu/high_scores.png"));
        volumeOnButtonTexture = new Texture(Gdx.files.internal("menu/volume_on.png"));
        volumeOffButtonTexture = new Texture(Gdx.files.internal("menu/volume_off.png"));
    }

    public static void loadGameTextures(){
        purpleBarTexture = new Texture(Gdx.files.internal("game/purple_bar.png"));
        orangeBarTexture = new Texture(Gdx.files.internal("game/orange_bar.png"));
        redBarTexture = new Texture(Gdx.files.internal("game/red_bar.png"));
        yellowBarTexture = new Texture(Gdx.files.internal("game/yellow_bar.png"));
        kipperTexture = new Texture(Gdx.files.internal("game/kipper.png"));
        tappingHand = new Texture(Gdx.files.internal("game/tapping_hand.png"));
    }

    public static void loadBackgroundTextures(){
        backgroundTexture1 = new Texture(Gdx.files.internal("bg/bg_1.png"));
        backgroundTexture2 = new Texture(Gdx.files.internal("bg/bg_2.png"));
        backgroundTexture3 = new Texture(Gdx.files.internal("bg/bg_3.png"));
        backgroundTexture4 = new Texture(Gdx.files.internal("bg/bg_4.png"));
        backgroundTexture5 = new Texture(Gdx.files.internal("bg/bg_5.png"));
        backgroundTexture6 = new Texture(Gdx.files.internal("bg/bg_6.png"));
        backgroundTexture7 = new Texture(Gdx.files.internal("bg/bg_7.png"));
    }
}
