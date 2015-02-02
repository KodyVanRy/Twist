package com.desitum.twist.world;

import com.desitum.twist.data.Settings;
import com.desitum.twist.objects.Bar;
import com.desitum.twist.objects.Kipper;
import com.desitum.twist.screens.MainScreen;

import java.util.ArrayList;

/**
 * Created by kody on 1/31/15.
 */
public class GameWorld {

    ArrayList<Bar> bars;
    Kipper kipper;

    public GameWorld () {

        bars = new ArrayList<Bar>();
        kipper = new Kipper(Settings.kipperSpeed, Settings.kipperSize, Settings.kipperColor, Settings.kipperX, Settings.kipperY);

    }

    public void update(int state, float delta){

        if (state == MainScreen.GAME_RUNNING){
            // TODO need algorithm for producing new bars that don't overlap
            // will do while talking on phone
        }

        for (Bar bar: bars){
            bar.update(delta);
        }

        kipper.update(delta);

    }

    public ArrayList<Bar> getBars(){
        return bars;
    }

    public void toggleKipperDirection() {
        kipper.toggleKipperOrientation();
    }

}
