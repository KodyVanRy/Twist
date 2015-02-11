package com.desitum.twist.data;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;

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

    public static Texture purpleBarTexture;
    public static Texture purpleBarVerticalTexture;
    public static Texture yellowBarTexture;
    public static Texture yellowBarVerticalTexture;
    public static Texture redBarTexture;
    public static Texture redBarVerticalTexture;
    public static Texture orangeBarTexture;
    public static Texture orangeBarVerticalTexture;
    public static Texture blueBarTexture;
    public static Texture blueBarVerticalTexture;
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
        purpleBarTexture = new Texture(Gdx.files.internal("game/purple_bar.png"));
        purpleBarVerticalTexture = new Texture(Gdx.files.internal("game/purple_bar_vertical.png"));
        orangeBarTexture = new Texture(Gdx.files.internal("game/orange_bar.png"));
        orangeBarVerticalTexture = new Texture(Gdx.files.internal("game/orange_bar_vertical.png"));
        redBarTexture = new Texture(Gdx.files.internal("game/red_bar.png"));
        redBarVerticalTexture = new Texture(Gdx.files.internal("game/red_bar_vertical.png"));
        yellowBarTexture = new Texture(Gdx.files.internal("game/yellow_bar.png"));
        yellowBarVerticalTexture = new Texture(Gdx.files.internal("game/yellow_bar_vertical.png"));
        blueBarTexture = new Texture(Gdx.files.internal("game/blue_bar.png"));
        blueBarVerticalTexture = new Texture(Gdx.files.internal("game/blue_bar_vertical.png"));
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
