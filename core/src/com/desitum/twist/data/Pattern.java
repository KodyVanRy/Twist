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
    private static ArrayList<Bar> pattern3;
    private static ArrayList<Bar> pattern4;
    private static ArrayList<Bar> pattern5;
    private static ArrayList<Bar> pattern6;

    private static ArrayList<ArrayList<Bar>> patterns;

    public static void loadPatterns(){
        patterns = new ArrayList<ArrayList<Bar>>();

        loadPattern1();
        loadPattern2();
        loadPattern3();
        loadPattern4();
        loadPattern5();
        loadPattern6();
    }

    public static void loadPattern1()
    {
        pattern1 = new ArrayList<Bar>();
        Bar pattern1_bar1 = new Bar(3, 4, Bar.HORIZONTAL, new float[]{1, 0}, Assets.purpleBarTexture);
        pattern1_bar1.setBarStoppingPointRight(6);
        Bar pattern1_bar2 = new Bar(3, 4, Bar.HORIZONTAL, new float[]{6, 2.5f}, Assets.purpleBarTexture);
        pattern1_bar2.setBarStoppingPointLeft(4);
        Bar pattern1_bar3 = new Bar(3, 4, Bar.HORIZONTAL, new float[]{1, 5}, Assets.purpleBarTexture);
        pattern1_bar3.setBarStoppingPointRight(6);
        Bar pattern1_bar4 = new Bar(3, 4, Bar.HORIZONTAL, new float[]{6, 7.5f}, Assets.purpleBarTexture);
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
        pattern2_bar1.setBarStoppingPointRight(6);
        Bar pattern2_bar2 = new Bar(3, 3, Bar.HORIZONTAL, new float[]{3, 3}, Assets.redBarTexture);
        pattern2_bar2.setBarStoppingPointRight(7.8f);
        Bar pattern2_bar3 = new Bar(2, 3, Bar.VERTICAL, new float[]{7, 0}, Assets.redBarTexture);
        pattern2_bar3.setBarStoppingPointBottom(0);
        pattern2_bar3.setBarStoppingPointTop(6);
        Bar pattern2_bar4 = new Bar(3, 4, Bar.HORIZONTAL, new float[]{6, 6.5f}, Assets.redBarTexture);
        pattern2_bar4.setBarStoppingPointLeft(2);
        pattern2.add(pattern2_bar1);
        pattern2.add(pattern2_bar2);
        pattern2.add(pattern2_bar3);
        pattern2.add(pattern2_bar4);

        patterns.add(pattern2);
    }

    public static void loadPattern3()
    {
        pattern3 = new ArrayList<Bar>();
        Bar pattern3_bar1 = new Bar(4, 2, Bar.HORIZONTAL, new float[]{0, 0}, Assets.purpleBarTexture);
        pattern3_bar1.setBarStoppingPointRight(5);
        Bar pattern3_bar2 = new Bar(4, 2, Bar.HORIZONTAL, new float[]{8, 0}, Assets.purpleBarTexture);
        pattern3_bar2.setBarStoppingPointLeft(5);
        Bar pattern3_bar3 = new Bar(4, 5, Bar.HORIZONTAL, new float[]{2, 2.5f}, Assets.purpleBarTexture);
        pattern3_bar3.setBarStoppingPointRight(8);
        Bar pattern3_bar4 = new Bar(4, 5, Bar.HORIZONTAL, new float[]{3, 5f}, Assets.purpleBarTexture);
        pattern3_bar4.setBarStoppingPointLeft(2);
        pattern3.add(pattern3_bar1);
        pattern3.add(pattern3_bar2);
        pattern3.add(pattern3_bar3);
        pattern3.add(pattern3_bar4);

        patterns.add(pattern3);
    }

    public static void loadPattern4()
    {
        pattern4 = new ArrayList<Bar>();
        Bar pattern4_bar1 = new Bar(7, 3, Bar.HORIZONTAL, new float[]{0, 0}, Assets.blueBarTexture);
        pattern4_bar1.setBarStoppingPointRight(9);
        Bar pattern4_bar2 = new Bar(7, 3, Bar.HORIZONTAL, new float[]{8, 3.8f}, Assets.blueBarTexture);
        pattern4_bar2.setBarStoppingPointLeft(1);
        Bar pattern4_bar3 = new Bar(7, 3, Bar.HORIZONTAL, new float[]{0, 7.6f}, Assets.blueBarTexture);
        pattern4_bar3.setBarStoppingPointRight(9);
        Bar pattern4_bar4 = new Bar(7, 3, Bar.HORIZONTAL, new float[]{8, 11.4f}, Assets.blueBarTexture);
        pattern4_bar4.setBarStoppingPointLeft(1);
        pattern4.add(pattern4_bar1);
        pattern4.add(pattern4_bar2);
        pattern4.add(pattern4_bar3);
        pattern4.add(pattern4_bar4);

        patterns.add(pattern4);
    }

    public static void loadPattern5()
    {
        pattern5 = new ArrayList<Bar>();
        Bar pattern5_bar1 = new Bar(2, 4, Bar.VERTICAL, new float[]{0, 12}, Assets.orangeBarTexture);
        pattern5_bar1.setBarStoppingPointTop(12);
        pattern5_bar1.setBarStoppingPointBottom(0);
        Bar pattern5_bar2 = new Bar(2, 4, Bar.VERTICAL, new float[]{9, 0}, Assets.orangeBarTexture);
        pattern5_bar2.setBarStoppingPointTop(12);
        pattern5_bar2.setBarStoppingPointBottom(0);
        Bar pattern5_bar3 = new Bar(4, 3, Bar.HORIZONTAL, new float[]{2, 10}, Assets.orangeBarTexture);
        pattern5_bar3.setBarStoppingPointRight(9);
        Bar pattern5_bar4 = new Bar(4, 3, Bar.HORIZONTAL, new float[]{9, 5}, Assets.orangeBarTexture);
        pattern5_bar4.setBarStoppingPointLeft(2);
        pattern5.add(pattern5_bar1);
        pattern5.add(pattern5_bar2);
        pattern5.add(pattern5_bar3);
        pattern5.add(pattern5_bar4);

        patterns.add(pattern5);
    }

    public static void loadPattern6()
    {
        pattern6 = new ArrayList<Bar>();
        Bar pattern6_bar1 = new Bar(2, 4, Bar.VERTICAL, new float[]{0, 12}, Assets.yellowBarTexture);
        pattern6_bar1.setBarStoppingPointTop(12);
        pattern6_bar1.setBarStoppingPointBottom(0);
        Bar pattern6_bar2 = new Bar(2, 4, Bar.VERTICAL, new float[]{3.5f, 5}, Assets.yellowBarTexture);
        pattern6_bar2.setBarStoppingPointTop(12);
        pattern6_bar2.setBarStoppingPointBottom(0);
        Bar pattern6_bar3 = new Bar(2, 3, Bar.HORIZONTAL, new float[]{5, 12}, Assets.yellowBarTexture);
        pattern6_bar3.setBarStoppingPointLeft(5);
        Bar pattern6_bar4 = new Bar(2, 4, Bar.HORIZONTAL, new float[]{5, 9}, Assets.yellowBarTexture);
        pattern6_bar4.setBarStoppingPointLeft(1);
        pattern6.add(pattern6_bar1);
        pattern6.add(pattern6_bar2);
        pattern6.add(pattern6_bar3);
        pattern6.add(pattern6_bar4);

        patterns.add(pattern6);
    }

    public static ArrayList<Bar> getRandomPattern(float y){
        ArrayList<Bar> returnPattern;

        Random rand = new Random();
        returnPattern = (ArrayList<Bar>) patterns.get(rand.nextInt(patterns.size())).clone();

        for (Bar bar: returnPattern){
            bar.setBarY(y);
        }

        return returnPattern;
    }

}
