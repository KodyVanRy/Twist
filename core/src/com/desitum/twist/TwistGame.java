package com.desitum.twist;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.desitum.twist.com.desitum.twist.screens.MainScreen;

public class TwistGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
        ScreenAdapter mainScreen = new MainScreen();
	}

	@Override
	public void render () {

	}
}
