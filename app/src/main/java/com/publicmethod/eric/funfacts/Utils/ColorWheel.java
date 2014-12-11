package com.publicmethod.eric.funfacts.Utils;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Eric on 2014-12-11.
 */
public class ColorWheel {

//    Declare member variables

    public String color = "";
    public Random mRandomGenerator = new Random();
    public int mRandomNumber;
    public String[] mColorsArray = new  String[]{
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

//    Declare methods

    public int getColor(){


        mRandomNumber = mRandomGenerator.nextInt(mColorsArray.length);

//                Convert the number to a text fact from the String[]

        color = mColorsArray[mRandomNumber];
        int colorAsInt = Color.parseColor(color);
        return colorAsInt;
    }
}