package com.desitum.twist.data;

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

    public static void getSound() {
        if(Settings.volumeOn == true)
        {
            Assets.menuMusic.setVolume(1);
            Assets.buttonSound.setVolume(0, 1);
            Assets.endGameSound.setVolume(0, 1);
            Assets.highscoreSound.setVolume(0, 1);
        }
        else
        {
            Assets.menuMusic.setVolume(0);
            Assets.buttonSound.setVolume(0, 0);
            Assets.endGameSound.setVolume(0, 0);
            Assets.highscoreSound.setVolume(0, 0);
        }
    }
}
