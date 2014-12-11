package com.publicmethod.eric.funfacts.Utils;

import java.util.Random;

/**
 * Created by Eric on 2014-12-11.
 */
public class FactBook {

//    Declare member variables

    public String fact = "";
    public Random mRandomGenerator = new Random();
    public int mRandomNumber;
    public String[] mStatementsArray = new  String[]{
            "Ants Stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually mostly silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minuets for light from the sun to reach earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built."
    };

//    Declare methods

    public String getFact(){


    mRandomNumber = mRandomGenerator.nextInt(mStatementsArray.length);

//                Convert the number to a text fact from the String[]

    fact = mStatementsArray[mRandomNumber];
        return fact;
    }
}
