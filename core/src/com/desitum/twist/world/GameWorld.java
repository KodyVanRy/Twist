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

    ArrayList<ArrayList<Bar>> bars;
    Kipper kipper;
    private float nextY = 0;

    public GameWorld () {

        bars = new ArrayList<ArrayList<Bar>>();
        kipper = new Kipper(Settings.kipperSpeed, Settings.kipperSize, Settings.kipperColor, Settings.kipperX, Settings.kipperY);

    }

    public void update(int state, OrthographicCamera cam, float delta){
        if (state == MainScreen.GAME_RUNNING){
            if (bars.size() < 12){
                ArrayList<Bar> barsToAdd = Pattern.getRandomPattern((bars.size() > 0) ? nextY + 3: kipper.getY() + 15);

                System.out.println("nextY: " + ((bars.size() > 0) ? nextY + 3 : kipper.getY() + 15));
            }
        }

        Iterator<ArrayList<Bar>> iter = bars.iterator();
        while (iter.hasNext()){
            ArrayList<Bar> pattern = iter.next();
            Iterator<Bar> iter2 = pattern.iterator();
            while (iter2.hasNext()){
            bar.update(delta);

            if (bar.getY() > kipper.getY() + 30){
                System.out.println("PROBLEM: " + (bar.getY() - kipper.getY()));
            }

            if (bar.getY() > nextY){
                nextY = bar.getY();
            }
            if (bar.getY() < cam.position.y - MainScreen.FRUSTUM_HEIGHT/2){
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
