package com.desitum.twist.world;

import com.desitum.twist.objects.Bar;
import com.desitum.twist.objects.Kipper;
import com.desitum.twist.data.Settings;

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

    public void update(float delta){

        for (Bar bar: bars){
            bar.update(delta);
        }

    }
}
