package com.desitum.twist;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.desitum.twist.data.Assets;
import com.desitum.twist.data.Pattern;
import com.desitum.twist.libraries.Colors;
import com.desitum.twist.screens.MainScreen;

public class TwistGame extends Game {
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
        Colors.load();
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
