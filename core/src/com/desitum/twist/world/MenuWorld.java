package com.desitum.twist.world;

import com.desitum.twist.objects.MenuButton;

import java.util.ArrayList;

/**
 * Created by kody on 1/30/15.
 */
public class MenuWorld {

    private ArrayList<MenuButton> menuButtons;

    private ArrayList<String> commands;

    private int state;

    public static final int ANIMATION = 0;
    public static final int READY = 1;

    public MenuWorld () {
        menuButtons = new ArrayList<MenuButton>();
        createItems();
    }

    private void createItems() {
        //Create each button and their parameters
        MenuButton playButton = new MenuButton("play", "Play", 1, 4);
        MenuButton volumeButton = new MenuButton("volume", "Volume", 1, 6);
        MenuButton scoreButton = new MenuButton("openScores","High Scores", 1, 8);

        //Add Buttons to the MenuButtons ArrayList
        menuButtons.add(playButton);
        menuButtons.add(volumeButton);
        menuButtons.add(scoreButton);
    }

    public int getState(){
        return this.state;
    }

    public ArrayList<MenuButton> getMenuButtons(){
        return this.menuButtons;
    }
}
