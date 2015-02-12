package com.desitum.twist;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.desitum.twist.data.Assets;
import com.desitum.twist.data.Pattern;
import com.desitum.twist.libraries.Colors;
import com.desitum.twist.screens.MainScreen;
import com.desitum.twist.screens.SplashScreen;

public class TwistGame extends Game {
    GooglePlayServicesInterface googlePlay;

    public TwistGame(GooglePlayServicesInterface gps){
        googlePlay = gps;
    }

	@Override
	public void create () {
        Screen splashScreen = new SplashScreen(googlePlay, this);
        this.setScreen(splashScreen);
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
