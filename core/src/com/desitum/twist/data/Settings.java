package com.desitum.twist.data;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.graphics.Color;
import com.desitum.twist.screens.MainScreen;

/**
 * Created by kody on 1/31/15.
 */
public class Settings {
    public static float kipperSpeed = 8;
    public static float kipperSize = 1;
    public static Color kipperColor = new Color(0.1f, 0.1f, 0.5f, 1);
    public static float kipperX = MainScreen.FRUSTUM_WIDTH/2 - kipperSize/2;
    public static float kipperY = -1;

    public static boolean volumeOn = true;
    public static float volume = 1;
    public static int highscore;

    public static void getSound() {
        Preferences prefs = Gdx.app.getPreferences("settings");
        prefs.putBoolean("soundOn", volumeOn);
        prefs.flush();
        if(Settings.volumeOn == true)
        {
            Assets.menuMusic.setVolume(1);
            volume = 1;
        }
        else
        {
            Assets.menuMusic.setVolume(0);
            volume = 0;
        }
    }

    public static void load(){
        Preferences prefs = Gdx.app.getPreferences("settings");
        volumeOn = prefs.getBoolean("soundOn", true);
        highscore = prefs.getInteger("highscore", 0);
        getSound();
    }

    public static void saveScore(int score) {
        if (highscore > score){
            return;
        }
        highscore = score;
        Preferences prefs = Gdx.app.getPreferences("settings");
        prefs.putInteger("highscore", score);
        prefs.flush();
    }
}
