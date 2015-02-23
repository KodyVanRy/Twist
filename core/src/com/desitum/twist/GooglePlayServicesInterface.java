package com.desitum.twist;

/**
 * Created by kody on 1/31/15.
 */
public interface GooglePlayServicesInterface {

    public void getLeaderBoard();
    public void submitScore();
    public void showAd();
    public void hideAd();
    public void unlockAchievement(int achievement);
    public void login();
    public void logout();
    public void shareScore(int score);
}
