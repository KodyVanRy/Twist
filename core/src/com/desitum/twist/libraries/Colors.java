package com.desitum.twist.libraries;

import com.badlogic.gdx.graphics.Color;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by dvan6234 on 2/11/2015.
 */
public class Colors {
    public static final Color PURPLE_BAR = new Color(0.49f, 0.18f, 0.6f, 1);
    public static final Color BLUE_BAR = new Color(0.13f, 0.17f, 0.96f, 1);
    public static final Color ORANGE_BAR = new Color(0.99f, 0.45f, 0.07f, 1);
    public static final Color RED_BAR = new Color(0.88f, 0.07f, 0.15f, 1);
    public static final Color YELLOW_BAR = new Color(1, 1, 0.08f, 1);

    public static ArrayList<Color> gameColors;

    public static void load(){
        gameColors = new ArrayList<Color>();

        gameColors.add(PURPLE_BAR);
        gameColors.add(BLUE_BAR);
        gameColors.add(ORANGE_BAR);
        gameColors.add(RED_BAR);
        gameColors.add(YELLOW_BAR);
    }

    public static Color getRandomColor(){
        Random r = new Random();
        return gameColors.get(r.nextInt(gameColors.size() - 1));
    }
}
