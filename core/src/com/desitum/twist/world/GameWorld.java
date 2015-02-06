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

    ArrayList<Pattern> patterns;
    Kipper kipper;
    private float nextY = 0;

    public GameWorld () {

        patterns = new ArrayList<Pattern>();
        kipper = new Kipper(Settings.kipperSpeed, Settings.kipperSize, Settings.kipperColor, Settings.kipperX, Settings.kipperY);

    }

    public void update(int state, OrthographicCamera cam, float delta){
        if (state == MainScreen.GAME_RUNNING){
            if (patterns.size() < 3){
                Pattern patternToAdd = Pattern.getRandomPattern((patterns.size() > 0) ? nextY: kipper.getY() + 10);

                patterns.add(patternToAdd);

                nextY = patternToAdd.getY();
            }
        }

        Iterator<Pattern> iter = patterns.iterator();
        while (iter.hasNext()){
            Pattern pattern = iter.next();
            Iterator<Bar> iter2 = pattern.getPattern().iterator();
            while (iter2.hasNext()) {
                Bar bar = iter2.next();
                bar.update(delta);
            }
            if (pattern.getY() < kipper.getY() - 3) {
                iter.remove();
            }
        }

        kipper.update(delta);

    }

    public Kipper getKipper() {
        return kipper;
    }

    public ArrayList<Bar> getBars(){
        ArrayList<Bar> bars = new ArrayList<Bar>();

        for (Pattern p: patterns){
            for (Bar b: p.getPattern()){
                bars.add(b);
            }
        }

        return bars;
    }

    public void toggleKipperDirection() {
        kipper.toggleKipperOrientation();
    }

}
