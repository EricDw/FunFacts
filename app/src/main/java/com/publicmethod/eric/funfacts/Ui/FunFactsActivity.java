package com.publicmethod.eric.funfacts.Ui;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
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
    public  static  final String TAG = FunFactsActivity.class.getSimpleName();

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

//        Declare our view variables and assign the Views from the layout file
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout mRelativeLayout = (RelativeLayout) findViewById(R.id.factLayout);


        factLabel.setText("");

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Update the label with our dynamic fact from FactBook
//                Do the same thing with the background color from ColorWheel

                int color = mColorWheel.getColor();
                String fact = mFactBook.getFact();
                mRelativeLayout.setBackgroundColor(color);
                factLabel.setText(fact);
                showFactButton.setTextColor(color);

            }
        };
        showFactButton.setOnClickListener(listener);
        Log.d(TAG,"Yay our activity was created!");
//        Toast.makeText(getApplicationContext(), "Yay our activity was created!", Toast.LENGTH_LONG).show();

    }
}
