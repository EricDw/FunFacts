package com.publicmethod.eric.funfacts.Ui;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.publicmethod.eric.funfacts.R;
import com.publicmethod.eric.funfacts.Utils.ColorWheel;
import com.publicmethod.eric.funfacts.Utils.FactBook;


public class FunFactsActivity extends ActionBarActivity {


//                The empty quotes give the variable a value but its just a value of nothing.
//                This gives the system something to assign preventing a crash

    //                Declare all of our class variables
    public static final String TAG = FunFactsActivity.class.getSimpleName();

    private static final String KEY_COLOR = "KEY_COLOR";
    private static final String KEY_FACT = "KEY_FACT";

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();
    private int mColor;
    private String mFact;

    private TextView mFactLabel;
    private Button mShowFactButton;
    private RelativeLayout mRelativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

//        Declare our view variables and assign the Views from the layout file
        mFactLabel = (TextView) findViewById(R.id.factTextView);
        mShowFactButton = (Button) findViewById(R.id.showFactButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.factLayout);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Update the label with our dynamic fact from FactBook
//                Do the same thing with the background color from ColorWheel
                mFact = mFactBook.getFact();
                mFactLabel.setText(mFact);

                mColor = mColorWheel.getColor();
                mRelativeLayout.setBackgroundColor(mColor);
                mShowFactButton.setTextColor(mColor);

            }
        };
        mShowFactButton.setOnClickListener(listener);

        if (mFactLabel.getText().toString().isEmpty()) {
            mFact = mFactBook.getFirstFact();
            mFactLabel.setText(mFact);
            mColor = mColorWheel.getColorGreen();
            mShowFactButton.setTextColor(mColor);
            mRelativeLayout.setBackgroundColor(mColor);

        }

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString(KEY_FACT, mFact);
        outState.putInt(KEY_COLOR, mColor);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        mFact = savedInstanceState.getString(KEY_FACT);
        mFactLabel.setText(mFact);
        mColor = savedInstanceState.getInt(KEY_COLOR);
        mShowFactButton.setTextColor(mColor);
        mRelativeLayout.setBackgroundColor(mColor);

    }
}
