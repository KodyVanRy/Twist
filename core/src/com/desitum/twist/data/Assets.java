package com.desitum.twist.data;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.desitum.twist.libraries.Drawing;

/**
 * Created by kody on 1/30/15.
 */
public class Assets {

    public static Texture playButtonTexture;
    public static Texture highscoreButtonTexture;
    public static Texture volumeOnButtonTexture;
    public static Texture volumeOffButtonTexture;
    public static Texture shareButtonTexture;
    public static Texture menuLogoTexture;

    public static Texture whiteBarTexture2;
    public static Texture whiteBarTexture2b;
    public static Texture whiteBarTexture3;
    public static Texture whiteBarTexture4;
    public static Texture whiteBarTexture5;
    public static Texture whiteBarVerticalTexture2;
    public static Texture whiteBarVerticalTexture2b;
    public static Texture whiteBarVerticalTexture3;
    public static Texture whiteBarVerticalTexture4;
    public static Texture whiteBarVerticalTexture5;

    public static Texture kipperTexture;
    public static Texture tappingHand;

    public static Texture backgroundTexture1;
    public static Texture backgroundTexture2;
    public static Texture backgroundTexture3;
    public static Texture backgroundTexture4;
    public static Texture backgroundTexture5;
    public static Texture backgroundTexture6;
    public static Texture backgroundTexture7;

    public static Sound endGameSound;
    public static Sound highscoreSound;
    public static Sound buttonSound;
    public static Sound twistSound;

    public static Music menuMusic;

    public static BitmapFont font;

    public static void loadMenuTextures(){
        playButtonTexture = new Texture(Gdx.files.internal("menu/play.png"));
        highscoreButtonTexture = new Texture(Gdx.files.internal("menu/high_scores.png"));
        volumeOnButtonTexture = new Texture(Gdx.files.internal("menu/volume_on.png"));
        volumeOffButtonTexture = new Texture(Gdx.files.internal("menu/volume_off.png"));
        shareButtonTexture = new Texture(Gdx.files.internal("menu/share_button.png"));
        menuLogoTexture = new Texture(Gdx.files.internal("menu/twist.png"));
        font = new BitmapFont(Gdx.files.internal("font/cartoon.fnt"), Gdx.files.internal("font/cartoon.png"), false);
        font.setScale(0.25f);
    }

    public static void loadGameTextures(){
        // LOAD WHITE BARS or draw them rather
        whiteBarTexture2 = Drawing.getTextureBoundingRectangle(200, 100, 50, Color.WHITE);
        whiteBarTexture2b = Drawing.getTextureBoundingRectangle(250, 100, 50, Color.WHITE);
        whiteBarTexture3 = Drawing.getTextureBoundingRectangle(300, 100, 50, Color.WHITE);
        whiteBarTexture4 = Drawing.getTextureBoundingRectangle(400, 100, 50, Color.WHITE);
        whiteBarTexture5 = Drawing.getTextureBoundingRectangle(500, 100, 50, Color.WHITE);
        whiteBarVerticalTexture2 = Drawing.getTextureBoundingRectangle(100, 200, 50, Color.WHITE);
        whiteBarVerticalTexture2b = Drawing.getTextureBoundingRectangle(100, 250, 50, Color.WHITE);
        whiteBarVerticalTexture3 = Drawing.getTextureBoundingRectangle(100, 300, 50, Color.WHITE);
        whiteBarVerticalTexture4 = Drawing.getTextureBoundingRectangle(100, 400, 50, Color.WHITE);
        whiteBarVerticalTexture5 = Drawing.getTextureBoundingRectangle(100, 500, 50, Color.WHITE);

        // LOAD OTHERS
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

    public static void loadSounds()
    {
        //SFX
        buttonSound = Gdx.audio.newSound(Gdx.files.internal("sound/Button.wav"));
        highscoreSound = Gdx.audio.newSound(Gdx.files.internal("sound/High_Score.wav"));
        endGameSound = Gdx.audio.newSound(Gdx.files.internal("sound/Collide.wav"));
        twistSound = Gdx.audio.newSound(Gdx.files.internal("sound/Cube_Twist.wav"));
        //Music
        menuMusic = Gdx.audio.newMusic(Gdx.files.internal("sound/loop.mp3"));
        menuMusic.setLooping(true);

    }

    public static void dispose(){

    }
}
