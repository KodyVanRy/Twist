package com.desitum.twist.world;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.desitum.twist.data.Pattern;
import com.desitum.twist.data.Settings;
import com.desitum.twist.objects.Bar;
import com.desitum.twist.objects.Kipper;
import com.desitum.twist.screens.MainScreen;

import java.util.ArrayList;
import java.util.Iterator;

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

    public void update(int state, OrthographicCamera cam, float delta){
        System.out.println("kippery : " + kipper.getY());
        if (state == MainScreen.GAME_RUNNING){
            if (bars.size() < 12){
                ArrayList<Bar> barsToAdd = Pattern.getRandomPattern((bars.size() > 0) ? bars.get(bars.size() - 1).getY() + 3 : kipper.getY() + 15);

                for (Bar bar: barsToAdd){
                    bars.add(bar);
                }
            }
        }

        Iterator<Bar> iter = bars.iterator();
        while (iter.hasNext()){
            Bar bar = iter.next();
            bar.update(delta);

            if (bar.getY() < cam.position.y - MainScreen.FRUSTUM_HEIGHT){
                iter.remove();
            }
        }

        kipper.update(delta);

    }

    public Kipper getKipper() {
        return kipper;
    }

    public ArrayList<Bar> getBars(){
        return bars;
    }

    public void toggleKipperDirection() {
        kipper.toggleKipperOrientation();
    }

}
