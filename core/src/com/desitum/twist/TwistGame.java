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

    public static final int FIRST_TIME = 0;
    public static final int BEGINNER_TWISTER = 1;
    public static final int NOVICE_TWISTER = 2;
    public static final int ADVANCED_TWISTER = 3;
    public static final int MASTER_TWISTER = 4;

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
