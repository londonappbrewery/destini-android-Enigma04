package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
   private TextView mStoryText;
   private Button top_Button;
   private Button bottom_Button;
    private int mStoryIndex = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryText = findViewById(R.id.storyTextView);
        top_Button = findViewById(R.id.buttonTop);
        bottom_Button = findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        top_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex == 1 || mStoryIndex == 2) {
                    mStoryText.setText(R.string.T3_Story);
                    top_Button.setText(R.string.T3_Ans1);
                    bottom_Button.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                } else if (mStoryIndex == 3)
                {
                    mStoryText.setText(R.string.T6_End);
                    top_Button.setVisibility(View.GONE);
                    bottom_Button.setVisibility(View.GONE);
                }
                }
        });

                // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
                bottom_Button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (mStoryIndex == 1) {
                            mStoryText.setText(R.string.T2_Story);
                            top_Button.setText(R.string.T2_Ans1);
                            bottom_Button.setText(R.string.T2_Ans2);
                            mStoryIndex = 2;
                        } else if (mStoryIndex == 2)
                        {
                            mStoryText.setText(R.string.T4_End);
                            top_Button.setVisibility(View.GONE);
                            bottom_Button.setVisibility(View.GONE);
                        } else if (mStoryIndex == 3)
                        {
                            mStoryText.setText(R.string.T5_End);
                            top_Button.setVisibility(View.GONE);
                            bottom_Button.setVisibility(View.GONE);
                        }
                    }
                });

    }
}
