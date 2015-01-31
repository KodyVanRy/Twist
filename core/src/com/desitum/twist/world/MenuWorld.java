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
        //TODO create items
        MenuButton playButton = new MenuButton("play", "Play", 1, 4);
        menuButtons.add(playButton);
    }

    public int getState(){
        return this.state;
    }

    public ArrayList<MenuButton> getMenuButtons(){
        return this.menuButtons;
    }
}
