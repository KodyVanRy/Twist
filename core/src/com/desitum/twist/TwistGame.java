package com.desitum.twist;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.desitum.twist.data.Assets;
import com.desitum.twist.screens.MainScreen;

public class TwistGame extends Game {
	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
        Assets.loadMenuTextures();
        Screen mainScreen = new MainScreen();
        this.setScreen(mainScreen);
	}

	@Override
	public void render () {
        super.render();
	}

    @Override
    public void dispose () {
        super.dispose();

        getScreen().dispose();
    }
}
