package com.desitum.twist.data;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.desitum.twist.libraries.Drawing;
import com.desitum.twist.libraries.Colors;

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

    public static Texture purpleBarTexture2;
    public static Texture purpleBarTexture2b;
    public static Texture purpleBarTexture3;
    public static Texture purpleBarTexture4;
    public static Texture purpleBarTexture5;
    public static Texture purpleBarVerticalTexture2;
    public static Texture purpleBarVerticalTexture2b;
    public static Texture purpleBarVerticalTexture3;
    public static Texture purpleBarVerticalTexture4;
    public static Texture purpleBarVerticalTexture5;
    public static Texture yellowBarTexture2;
    public static Texture yellowBarTexture2b;
    public static Texture yellowBarTexture3;
    public static Texture yellowBarTexture4;
    public static Texture yellowBarTexture5;
    public static Texture yellowBarVerticalTexture2;
    public static Texture yellowBarVerticalTexture2b;
    public static Texture yellowBarVerticalTexture3;
    public static Texture yellowBarVerticalTexture4;
    public static Texture yellowBarVerticalTexture5;
    public static Texture redBarTexture2;
    public static Texture redBarTexture2b;
    public static Texture redBarTexture3;
    public static Texture redBarTexture4;
    public static Texture redBarTexture5;
    public static Texture redBarVerticalTexture2;
    public static Texture redBarVerticalTexture2b;
    public static Texture redBarVerticalTexture3;
    public static Texture redBarVerticalTexture4;
    public static Texture redBarVerticalTexture5;
    public static Texture orangeBarTexture2;
    public static Texture orangeBarTexture2b;
    public static Texture orangeBarTexture3;
    public static Texture orangeBarTexture4;
    public static Texture orangeBarTexture5;
    public static Texture orangeBarVerticalTexture2;
    public static Texture orangeBarVerticalTexture2b;
    public static Texture orangeBarVerticalTexture3;
    public static Texture orangeBarVerticalTexture4;
    public static Texture orangeBarVerticalTexture5;
    public static Texture blueBarTexture2;
    public static Texture blueBarTexture2b;
    public static Texture blueBarTexture3;
    public static Texture blueBarTexture4;
    public static Texture blueBarTexture5;
    public static Texture blueBarVerticalTexture2;
    public static Texture blueBarVerticalTexture2b;
    public static Texture blueBarVerticalTexture3;
    public static Texture blueBarVerticalTexture4;
    public static Texture blueBarVerticalTexture5;
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
        // LOAD PURPLE BARS or draw them rather
        purpleBarTexture2 = Drawing.getTextureBoundingRectangle(200, 100, 50, Colors.PURPLE_BAR);
        purpleBarTexture2b = Drawing.getTextureBoundingRectangle(250, 100, 50, Colors.PURPLE_BAR);
        purpleBarTexture3 = Drawing.getTextureBoundingRectangle(300, 100, 50, Colors.PURPLE_BAR);
        purpleBarTexture4 = Drawing.getTextureBoundingRectangle(400, 100, 50, Colors.PURPLE_BAR);
        purpleBarTexture5 = Drawing.getTextureBoundingRectangle(500, 100, 50, Colors.PURPLE_BAR);
        purpleBarVerticalTexture2 = Drawing.getTextureBoundingRectangle(100, 200, 50, Colors.PURPLE_BAR);
        purpleBarVerticalTexture2b = Drawing.getTextureBoundingRectangle(100, 250, 50, Colors.PURPLE_BAR);
        purpleBarVerticalTexture3 = Drawing.getTextureBoundingRectangle(100, 300, 50, Colors.PURPLE_BAR);
        purpleBarVerticalTexture4 = Drawing.getTextureBoundingRectangle(100, 400, 50, Colors.PURPLE_BAR);
        purpleBarVerticalTexture5 = Drawing.getTextureBoundingRectangle(100, 500, 50, Colors.PURPLE_BAR);

        // LOAD ORANGE BARS or draw them rather
        orangeBarTexture2 = Drawing.getTextureBoundingRectangle(200, 100, 50, Colors.ORANGE_BAR);
        orangeBarTexture2b = Drawing.getTextureBoundingRectangle(250, 100, 50, Colors.ORANGE_BAR);
        orangeBarTexture3 = Drawing.getTextureBoundingRectangle(300, 100, 50, Colors.ORANGE_BAR);
        orangeBarTexture4 = Drawing.getTextureBoundingRectangle(400, 100, 50, Colors.ORANGE_BAR);
        orangeBarTexture5 = Drawing.getTextureBoundingRectangle(500, 100, 50, Colors.ORANGE_BAR);
        orangeBarVerticalTexture2 = Drawing.getTextureBoundingRectangle(100, 200, 50, Colors.ORANGE_BAR);
        orangeBarVerticalTexture2b = Drawing.getTextureBoundingRectangle(100, 250, 50, Colors.ORANGE_BAR);
        orangeBarVerticalTexture3 = Drawing.getTextureBoundingRectangle(100, 300, 50, Colors.ORANGE_BAR);
        orangeBarVerticalTexture4 = Drawing.getTextureBoundingRectangle(100, 400, 50, Colors.ORANGE_BAR);
        orangeBarVerticalTexture5 = Drawing.getTextureBoundingRectangle(100, 500, 50, Colors.ORANGE_BAR);

        //LOAD RED BARS or draw them rather
        redBarTexture2 = Drawing.getTextureBoundingRectangle(500, 100, 50, Colors.RED_BAR);
        redBarVerticalTexture2 = new Texture(Gdx.files.internal("game/red_bar_vertical.png"));

        // LOAD YELLOW BARS or draw them rather
        yellowBarTexture2 = new Texture(Gdx.files.internal("game/yellow_bar.png"));
        yellowBarVerticalTexture2 = new Texture(Gdx.files.internal("game/yellow_bar_vertical.png"));

        // LOAD BLUE BARS or draw them rather
        blueBarTexture2 = Drawing.getTextureBoundingRectangle(200, 100, 50, Colors.BLUE_BAR);
        blueBarTexture2b = Drawing.getTextureBoundingRectangle(200, 100, 50, Colors.BLUE_BAR);
        blueBarTexture3 = Drawing.getTextureBoundingRectangle(200, 100, 50, Colors.BLUE_BAR);
        blueBarTexture4 = Drawing.getTextureBoundingRectangle(200, 100, 50, Colors.BLUE_BAR);
        blueBarTexture5 = Drawing.getTextureBoundingRectangle(200, 100, 50, Colors.BLUE_BAR);
        blueBarVerticalTexture2 = Drawing.getTextureBoundingRectangle(100, 200, 50, Colors.BLUE_BAR);
        blueBarVerticalTexture2b = Drawing.getTextureBoundingRectangle(100, 250, 50, Colors.BLUE_BAR);
        blueBarVerticalTexture3= Drawing.getTextureBoundingRectangle(100, 300, 50, Colors.BLUE_BAR);
        blueBarVerticalTexture4 = Drawing.getTextureBoundingRectangle(100, 400, 50, Colors.BLUE_BAR);
        blueBarVerticalTexture5 = Drawing.getTextureBoundingRectangle(100, 500, 50, Colors.BLUE_BAR);

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
        //Music
        menuMusic = Gdx.audio.newMusic(Gdx.files.internal("sound/loop.mp3"));
        menuMusic.setLooping(true);

    }

    public static void dispose(){

    }
}
