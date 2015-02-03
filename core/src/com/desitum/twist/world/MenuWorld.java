package com.desitum.twist.world;

import com.desitum.twist.data.Assets;
import com.desitum.twist.objects.MenuButton;
import com.desitum.twist.screens.MainScreen;

import java.util.ArrayList;

/**
 * Created by kody on 1/30/15.
 * can be used by kody and people in [Zack]
 */
public class MenuWorld {
    private ArrayList<MenuButton> menuButtons;

    public MenuWorld () {
        menuButtons = new ArrayList<MenuButton>();
        createItems();
    }

    private void createItems() {
        //Create each button and their parameters
        MenuButton playButton = new MenuButton(MainScreen.PLAY, 1, 8, Assets.playButtonTexture);
        MenuButton scoreButton = new MenuButton(MainScreen.OPEN_SCORES, 1, 6, Assets.highscoreButtonTexture);
        MenuButton volumeButton = new MenuButton(MainScreen.VOLUMES, 1, 4, Assets.volumeOnButtonTexture);

        //Add Buttons to the MenuButtons ArrayList
        menuButtons.add(playButton);
        menuButtons.add(scoreButton);
        menuButtons.add(volumeButton);
    }

    public ArrayList<MenuButton> getMenuButtons(){
        return this.menuButtons;
    }
}



