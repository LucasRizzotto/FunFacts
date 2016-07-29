package com.example.magnopus.funfacts;

import java.util.Random;

public class FactBook {

    String[] mFactBook = {
            "Pop music causes brain cancer",
            "Life is meaningless but hey let's have a veggie burger",
            "Fun fact about fun facts, they are not fun",
            "X Gon give it to ya",
            "Osama Bin Laden was found through a traced call of him ordering pizza",
            "Bush did 9/11",
            "Dark humor is like food... Not everyone gets it",
            "Stupid people breed more because the alternative is having sex with you."
    };

    String mFact = "";

    // Methods
    public String getFact()
    {
        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt( mFactBook.length);
        mFact =  mFactBook[randomNumber];

        return mFact;
    }

}
