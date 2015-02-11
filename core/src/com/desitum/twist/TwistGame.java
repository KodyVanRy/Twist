package com.desitum.twist;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.desitum.twist.data.Assets;
import com.desitum.twist.data.Pattern;
import com.desitum.twist.screens.MainScreen;

public class TwistGame extends Game {
	SpriteBatch batch;
	Texture img;
    GooglePlayServicesInterface googlePlay;

    public TwistGame(GooglePlayServicesInterface gps){
        googlePlay = gps;
    }

	@Override
	public void create () {
        Assets.loadMenuTextures();
        Assets.loadGameTextures();
        Assets.loadBackgroundTextures();
        Assets.loadSounds();
        Pattern.loadPatterns();
        Screen mainScreen = new MainScreen(googlePlay);
        this.setScreen(mainScreen);
	}

	@Override
	public void render () {
        super.render();
	}

    @Override
    public void dispose () {
        super.dispose();

        Assets.dispose();

        getScreen().dispose();
    }

}
