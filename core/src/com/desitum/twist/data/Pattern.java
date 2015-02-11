package com.desitum.twist.data;

import com.desitum.twist.objects.Bar;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by kody on 2/4/15.
 * can be used by kody and people in []
 */
public class Pattern {

    private ArrayList<Bar> pattern;
    private float topY;

    private static ArrayList<ArrayList<Bar>> patterns;

    private Pattern(int patternNum, float yPos){
        topY = 0;
        if (patternNum == 0){
            pattern = loadPattern1();
        } else if (patternNum == 1){
            pattern = loadPattern2();
        } else if (patternNum == 2){
            pattern = loadPattern3();
        } else if (patternNum == 3){
            pattern = loadPattern4();
        } else if (patternNum == 4){
            pattern = loadPattern5();
        } else if (patternNum == 5){
            pattern = loadPattern6();
        } else if (patternNum == 6){
            pattern = loadPattern7();
        } else if (patternNum == 7){
           pattern = loadPattern8();
        } else if (patternNum == 8){
            pattern = loadPattern9();
        }else if (patternNum == 9){
            pattern = loadPattern10();
        }
        topY = yPos + 13;
    }

    public static void loadPatterns(){
        patterns = new ArrayList<ArrayList<Bar>>();

        patterns.add(loadPattern1());
        patterns.add(loadPattern2());
        patterns.add(loadPattern3());
        patterns.add(loadPattern4());
        patterns.add(loadPattern5());
        patterns.add(loadPattern6());
        patterns.add(loadPattern7());
        patterns.add(loadPattern8());
        patterns.add(loadPattern9());
        patterns.add(loadPattern10());
    }

    private static ArrayList<Bar> loadPattern1()
    {
        ArrayList<Bar> pattern1 = new ArrayList<Bar>();
        Bar pattern1_bar1 = new Bar(3, 4, Bar.HORIZONTAL, new float[]{1, 0}, Assets.purpleBarTexture4);
        pattern1_bar1.setBarStoppingPointRight(6);
        Bar pattern1_bar2 = new Bar(3, 4, Bar.HORIZONTAL, new float[]{6, 2.5f}, Assets.purpleBarTexture4);
        pattern1_bar2.setBarStoppingPointLeft(4);
        Bar pattern1_bar3 = new Bar(3, 4, Bar.HORIZONTAL, new float[]{1, 5}, Assets.purpleBarTexture4);
        pattern1_bar3.setBarStoppingPointRight(6);
        Bar pattern1_bar4 = new Bar(3, 4, Bar.HORIZONTAL, new float[]{6, 7.5f}, Assets.purpleBarTexture4);
        pattern1_bar4.setBarStoppingPointLeft(4);
        pattern1.add(pattern1_bar1);
        pattern1.add(pattern1_bar2);
        pattern1.add(pattern1_bar3);
        pattern1.add(pattern1_bar4);

        return pattern1;
    }

    private static ArrayList<Bar> loadPattern2()
    {
        ArrayList<Bar> pattern2 = new ArrayList<Bar>();
        Bar pattern2_bar1 = new Bar(4, 4, Bar.HORIZONTAL, new float[]{1, 0}, Assets.purpleBarTexture4);
        pattern2_bar1.setBarStoppingPointRight(6);
        Bar pattern2_bar2 = new Bar(3, 3, Bar.HORIZONTAL, new float[]{3, 3}, Assets.purpleBarTexture3);
        pattern2_bar2.setBarStoppingPointRight(6f);
        Bar pattern2_bar3 = new Bar(2, 3, Bar.VERTICAL, new float[]{7, 0}, Assets.purpleBarTexture3);
        pattern2_bar3.setBarStoppingPointBottom(0);
        pattern2_bar3.setBarStoppingPointTop(6);
        Bar pattern2_bar4 = new Bar(3, 4, Bar.HORIZONTAL, new float[]{6, 6.5f}, Assets.purpleBarTexture4);
        pattern2_bar4.setBarStoppingPointLeft(2);
        pattern2.add(pattern2_bar1);
        pattern2.add(pattern2_bar2);
        pattern2.add(pattern2_bar3);
        pattern2.add(pattern2_bar4);

        return pattern2;
    }

    private static ArrayList<Bar> loadPattern3()
    {
        ArrayList<Bar> pattern3 = new ArrayList<Bar>();
        Bar pattern3_bar1 = new Bar(4, 2, Bar.HORIZONTAL, new float[]{0, 0}, Assets.purpleBarTexture2);
        pattern3_bar1.setBarStoppingPointRight(5);
        Bar pattern3_bar2 = new Bar(4, 2, Bar.HORIZONTAL, new float[]{8, 0}, Assets.purpleBarTexture2);
        pattern3_bar2.setBarStoppingPointLeft(5);
        Bar pattern3_bar3 = new Bar(4, 5, Bar.HORIZONTAL, new float[]{2, 2.5f}, Assets.purpleBarTexture5);
        pattern3_bar3.setBarStoppingPointRight(8);
        Bar pattern3_bar4 = new Bar(4, 5, Bar.HORIZONTAL, new float[]{3, 5f}, Assets.purpleBarTexture5);
        pattern3_bar4.setBarStoppingPointLeft(2);
        pattern3.add(pattern3_bar1);
        pattern3.add(pattern3_bar2);
        pattern3.add(pattern3_bar3);
        pattern3.add(pattern3_bar4);

        return pattern3;
    }

    private static ArrayList<Bar> loadPattern4()
    {
        ArrayList<Bar> pattern4 = new ArrayList<Bar>();
        Bar pattern4_bar1 = new Bar(7, 4, Bar.HORIZONTAL, new float[]{0, 0}, Assets.purpleBarTexture4);
        Bar pattern4_bar2 = new Bar(7, 4, Bar.HORIZONTAL, new float[]{8, 3}, Assets.purpleBarTexture4);
        Bar pattern4_bar3 = new Bar(7, 4, Bar.HORIZONTAL, new float[]{0, 6}, Assets.purpleBarTexture4);
        Bar pattern4_bar4 = new Bar(7, 4, Bar.HORIZONTAL, new float[]{8, 9}, Assets.purpleBarTexture4);
        pattern4.add(pattern4_bar1);
        pattern4.add(pattern4_bar2);
        pattern4.add(pattern4_bar3);
        pattern4.add(pattern4_bar4);

        return pattern4;
    }

    private static ArrayList<Bar> loadPattern5()
    {
        ArrayList<Bar> pattern5 = new ArrayList<Bar>();
        Bar pattern5_bar1 = new Bar(2, 4, Bar.VERTICAL, new float[]{0, 9}, Assets.orangeBarTexture2);
        pattern5_bar1.setBarStoppingPointTop(10);
        pattern5_bar1.setBarStoppingPointBottom(0);
        Bar pattern5_bar2 = new Bar(2, 4, Bar.VERTICAL, new float[]{9, 0}, Assets.orangeBarTexture2);
        pattern5_bar2.setBarStoppingPointTop(10);
        pattern5_bar2.setBarStoppingPointBottom(0);
        Bar pattern5_bar3 = new Bar(4, 3, Bar.HORIZONTAL, new float[]{1, 9}, Assets.orangeBarTexture2);
        pattern5_bar3.setBarStoppingPointLeft(2);
        pattern5_bar3.setBarStoppingPointRight(8);
        Bar pattern5_bar4 = new Bar(4, 3, Bar.HORIZONTAL, new float[]{8, 0}, Assets.orangeBarTexture2);
        pattern5_bar4.setBarStoppingPointLeft(2);
        pattern5_bar4.setBarStoppingPointRight(8);
        pattern5.add(pattern5_bar1);
        pattern5.add(pattern5_bar2);
        pattern5.add(pattern5_bar3);
        pattern5.add(pattern5_bar4);

        return pattern5;
    }

    private static ArrayList<Bar> loadPattern6()
    {
        ArrayList<Bar> pattern6 = new ArrayList<Bar>();
        Bar pattern6_bar1 = new Bar(2, 4, Bar.VERTICAL, new float[]{1, 10}, Assets.yellowBarTexture2);
        pattern6_bar1.setBarStoppingPointTop(10);
        pattern6_bar1.setBarStoppingPointBottom(0);
        Bar pattern6_bar2 = new Bar(2, 4, Bar.VERTICAL, new float[]{3, 5}, Assets.yellowBarTexture2);
        pattern6_bar2.setBarStoppingPointTop(10);
        pattern6_bar2.setBarStoppingPointBottom(0);
        Bar pattern6_bar3 = new Bar(2, 3, Bar.HORIZONTAL, new float[]{5, 10}, Assets.yellowBarTexture2);
        pattern6_bar3.setBarStoppingPointLeft(5);
        Bar pattern6_bar4 = new Bar(2, 3, Bar.HORIZONTAL, new float[]{5, 3}, Assets.yellowBarTexture2);
        pattern6_bar4.setBarStoppingPointLeft(5);
        pattern6.add(pattern6_bar1);
        pattern6.add(pattern6_bar2);
        pattern6.add(pattern6_bar3);
        pattern6.add(pattern6_bar4);

        return pattern6;
    }

    private static ArrayList<Bar> loadPattern7()
    {
        ArrayList<Bar> pattern7 = new ArrayList<Bar>();
        Bar pattern7_bar1 = new Bar(3.5f, 2.5f, Bar.HORIZONTAL, new float[]{0, 6}, Assets.redBarTexture2);
        pattern7_bar1.setBarStoppingPointRight(5);
        Bar pattern7_bar2 = new Bar(3.5f, 2.5f, Bar.HORIZONTAL, new float[]{7.5f, 6}, Assets.redBarTexture2);
        pattern7_bar2.setBarStoppingPointLeft(5);
        Bar pattern7_bar3 = new Bar(3.5f, 2.5f, Bar.HORIZONTAL, new float[]{0, 3}, Assets.redBarTexture2);
        pattern7_bar3.setBarStoppingPointRight(5);
        Bar pattern7_bar4 = new Bar(3.5f, 2.5f, Bar.HORIZONTAL, new float[]{7.5f, 3}, Assets.redBarTexture2);
        pattern7_bar4.setBarStoppingPointLeft(5);
        pattern7.add(pattern7_bar1);
        pattern7.add(pattern7_bar2);
        pattern7.add(pattern7_bar3);
        pattern7.add(pattern7_bar4);

        return pattern7;
    }

    private static ArrayList<Bar> loadPattern8()
    {
        ArrayList<Bar> pattern8 = new ArrayList<Bar>();
        Bar pattern8_bar1 = new Bar(4, 3, Bar.HORIZONTAL, new float[]{0, 9}, Assets.blueBarTexture3);
        Bar pattern8_bar2 = new Bar(4, 4, Bar.VERTICAL, new float[]{1, 0}, Assets.blueBarVerticalTexture4);
        pattern8_bar2.setBarStoppingPointTop(7.5f);
        pattern8_bar2.setBarStoppingPointBottom(0);
        Bar pattern8_bar3 = new Bar(4, 4, Bar.VERTICAL, new float[]{4.5f, 8}, Assets.blueBarVerticalTexture4);
        pattern8_bar3.setBarStoppingPointTop(7.5f);
        pattern8_bar3.setBarStoppingPointBottom(0);
        Bar pattern8_bar4 = new Bar(4, 4, Bar.VERTICAL, new float[]{8, 0}, Assets.blueBarVerticalTexture4);
        pattern8_bar4.setBarStoppingPointTop(7.5f);
        pattern8_bar4.setBarStoppingPointBottom(0);
        pattern8.add(pattern8_bar1);
        pattern8.add(pattern8_bar2);
        pattern8.add(pattern8_bar3);
        pattern8.add(pattern8_bar4);

        return pattern8;
    }

    private static ArrayList<Bar> loadPattern9()
    {
        ArrayList<Bar> pattern9 = new ArrayList<Bar>();
        Bar pattern9_bar1 = new Bar(3, 3, Bar.HORIZONTAL, new float[]{0, 9}, Assets.blueBarTexture3);
        Bar pattern9_bar2 = new Bar(3, 3, Bar.HORIZONTAL, new float[]{0, 4.5f}, Assets.blueBarTexture3);
        pattern9_bar2.setBarStoppingPointRight(5);
        Bar pattern9_bar3 = new Bar(3, 3, Bar.HORIZONTAL, new float[]{7, 4.5f}, Assets.blueBarTexture3);
        pattern9_bar3.setBarStoppingPointLeft(5);
        Bar pattern9_bar4 = new Bar(3, 3, Bar.HORIZONTAL, new float[]{9, 0}, Assets.blueBarTexture3);
        pattern9.add(pattern9_bar1);
        pattern9.add(pattern9_bar2);
        pattern9.add(pattern9_bar3);
        pattern9.add(pattern9_bar4);

        return pattern9;
    }

    private static ArrayList<Bar> loadPattern10()
    {
        ArrayList<Bar> pattern10 = new ArrayList<Bar>();
        Bar pattern10_bar1 = new Bar(4, 2, Bar.HORIZONTAL, new float[]{0, 5}, Assets.purpleBarTexture2);
        pattern10_bar1.setBarStoppingPointRight(5);
        Bar pattern10_bar2 = new Bar(4, 2, Bar.HORIZONTAL, new float[]{8, 5}, Assets.purpleBarTexture2);
        pattern10_bar2.setBarStoppingPointLeft(5);
        Bar pattern10_bar3 = new Bar(4, 5, Bar.HORIZONTAL, new float[]{2, 2.5f}, Assets.purpleBarTexture5);
        pattern10_bar3.setBarStoppingPointRight(8);
        Bar pattern10_bar4 = new Bar(4, 5, Bar.HORIZONTAL, new float[]{3, 0}, Assets.purpleBarTexture5);
        pattern10_bar4.setBarStoppingPointLeft(2);
        pattern10.add(pattern10_bar1);
        pattern10.add(pattern10_bar2);
        pattern10.add(pattern10_bar3);
        pattern10.add(pattern10_bar4);

        return pattern10;
    }
    public static Pattern getRandomPattern(float y){
        Pattern returnPattern;
        ArrayList<Bar> returnArray;

        Random rand = new Random();
        returnPattern = new Pattern(rand.nextInt(patterns.size()), y);
        returnArray = returnPattern.pattern;

        for (Bar bar: returnArray){
            bar.setBarY(y);
        }

        return returnPattern;
    }

    public ArrayList<Bar> getPattern(){
        return pattern;
    }

    public float getY(){
        return topY;
    }
}
