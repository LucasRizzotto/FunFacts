package com.example.magnopus.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Magnopus on 6/24/2016.
 */
public class ColorWheel {

    private String[] colorList = {
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
    String currentColor;
    int currentColorAsInt;

    // Methods
    public int getColor()
    {
        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(colorList.length);
        currentColor = colorList[randomNumber];
        currentColorAsInt = Color.parseColor(currentColor);
        return currentColorAsInt;
    }

}
