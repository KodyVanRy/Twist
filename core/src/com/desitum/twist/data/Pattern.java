package com.desitum.twist.data;

import com.desitum.twist.objects.Bar;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by kody on 2/4/15.
 * can be used by kody and people in []
 */
public class Pattern {

    private static ArrayList<Bar> pattern1;
    private static ArrayList<Bar> pattern2;

    private static ArrayList<ArrayList<Bar>> patterns;

    public static void loadPatterns(){
        patterns = new ArrayList<ArrayList<Bar>>();

        loadPattern1();
        loadPattern2();
    }

    public static void loadPattern1()
    {
        pattern1 = new ArrayList<Bar>();
        Bar pattern1_bar1 = new Bar(4, 4, Bar.HORIZONTAL, new float[]{1, 0}, Assets.purpleBarTexture);
        pattern1_bar1.setBarStoppingPointRight(6);
        Bar pattern1_bar2 = new Bar(4, 4, Bar.HORIZONTAL, new float[]{6, 2.5f}, Assets.purpleBarTexture);
        pattern1_bar2.setBarStoppingPointLeft(4);
        Bar pattern1_bar3 = new Bar(4, 4, Bar.HORIZONTAL, new float[]{1, 5}, Assets.purpleBarTexture);
        pattern1_bar3.setBarStoppingPointRight(6);
        Bar pattern1_bar4 = new Bar(4, 4, Bar.HORIZONTAL, new float[]{6, 7.5f}, Assets.purpleBarTexture);
        pattern1_bar4.setBarStoppingPointLeft(4);
        pattern1.add(pattern1_bar1);
        pattern1.add(pattern1_bar2);
        pattern1.add(pattern1_bar3);
        pattern1.add(pattern1_bar4);

        patterns.add(pattern1);
    }

    public static void loadPattern2()
    {
        pattern2 = new ArrayList<Bar>();
        Bar pattern2_bar1 = new Bar(4, 4, Bar.HORIZONTAL, new float[]{1, 0}, Assets.redBarTexture);
        pattern2_bar1.setBarStoppingPointRight(12);
        Bar pattern2_bar2 = new Bar(3, 4, Bar.HORIZONTAL, new float[]{3, 1.5f}, Assets.redBarTexture);
        pattern2_bar2.setBarStoppingPointBottom(8);
        Bar pattern2_bar3 = new Bar(4, 4, Bar.VERTICAL, new float[]{2, 8}, Assets.redBarTexture);
        pattern2_bar3.setBarStoppingPointRight(12);
        Bar pattern2_bar4 = new Bar(3, 4, Bar.HORIZONTAL, new float[]{6, 6.5f}, Assets.redBarTexture);
        pattern2_bar4.setBarStoppingPointLeft(8);
        pattern1.add(pattern2_bar1);
        pattern1.add(pattern2_bar2);
        pattern1.add(pattern2_bar3);
        pattern1.add(pattern2_bar4);
    }

    public static ArrayList<Bar> getRandomPattern(float y){
        ArrayList<Bar> returnPattern;

        Random rand = new Random();
        returnPattern = (ArrayList<Bar>) patterns.get(rand.nextInt(patterns.size())).clone();

        for (Bar bar: returnPattern){
            bar.setBarY(bar.getY() + y);
        }

        return returnPattern;
    }

}
