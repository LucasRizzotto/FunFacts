package com.example.magnopus.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FunFacts extends AppCompatActivity {

    private static final String KEY_FACT = "KEY_FACT";
    private static final String KEY_COLOR = "KEY_COLOR";

    // View Variables
    private TextView mFunFactTextView;
    private Button mNewFactButton;
    private RelativeLayout mRelativeLayout;


    private FactBook mFactBook;
    private ColorWheel mColorWheel;
    private String mFact    ;
    private int mColor;


    // This function is run when the activity is created
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        mFactBook = new FactBook();
        mColorWheel = new ColorWheel();

        // Assign the views from the layout to the corresponding variables (according to ID)
        mFunFactTextView = (TextView) findViewById(R.id.funFactText);
        mNewFactButton = (Button) findViewById(R.id.funFactButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.funFactLayout);

        updateFact();

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
    updateFact();
}
};

        mNewFactButton.setOnClickListener(listener);
        }

private void updateFact() {
        // Get the fact and set it
        mFact = mFactBook.getFact();
        mFunFactTextView.setText(mFact);

        // Get the background and set it
        mColor = mColorWheel.getColor();
        mRelativeLayout.setBackgroundColor(mColor);
        mNewFactButton.setTextColor(mColor);
        }


// Stores the instance state
    // Bundles are used to transfer data across activities using key/value pairs
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(KEY_FACT, mFact);
        outState.putInt(KEY_COLOR, mColor);
    }


    // Restores the instance state
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        mFact = savedInstanceState.getString(KEY_FACT);
        mFunFactTextView.setText(mFact);
        mColor = savedInstanceState.getInt(KEY_COLOR);
        mRelativeLayout.setBackgroundColor(mColor);
        mNewFactButton.setTextColor(mColor);
    }


}
