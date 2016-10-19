package com.example.belzi.hciprototype;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class Feedback extends DrawerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
    }

    public void submitFeedback(View view){


        final ProgressDialog progressBar;
        progressBar = ProgressDialog.show(Feedback.this, "Submitting Feedback", "Please wait...");
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Feedback.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Button submitFeedBackBtn = (Button) findViewById(R.id.submitFeedBackBtn);
                        EditText feedBackEditText = (EditText) findViewById(R.id.feedBackEditText);
                        TextView feedbackThankYouTV = (TextView) findViewById(R.id.feedbackThankYouTV);

                        progressBar.dismiss();
                        submitFeedBackBtn.setVisibility(View.GONE);
                        feedBackEditText.setVisibility(View.GONE);
                        feedbackThankYouTV.setVisibility(View.VISIBLE);
                    }
                });
            }
        }, 2500);



    }
}
