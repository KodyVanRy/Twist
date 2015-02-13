package com.desitum.twist.android;

import android.content.Intent;
import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.desitum.twist.GooglePlayServicesInterface;
import com.desitum.twist.TwistGame;

public class AndroidLauncher extends AndroidApplication implements GooglePlayServicesInterface {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
        config.useImmersiveMode = true;
        config.useAccelerometer = false;
        config.useCompass = false;
        config.useWakelock = false;
		initialize(new TwistGame(this), config);
	}

    @Override
    public void getLeaderBoard() {

    }

    @Override
    public void submitScore() {
        System.out.println("Submited score");

    }

    @Override
    public void login() {

    }

    @Override
    public void logout() {

    }

    @Override
    public void shareScore(int score) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "I just got " + score + " on Twist! Try to beat me: https://play.google.com/store/apps/details?id=com.desitum.twist");
        sendIntent.setType("text/plain");
        startActivity(sendIntent);
    }
}
