package com.example.belzi.hciprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.ProgressDialog;
import java.util.Timer;
import java.util.TimerTask;

public class BloodTester extends DrawerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood__tester);

    }

    public void beginSampling(View view){
        final ProgressDialog progressBar;
        progressBar = ProgressDialog.show(BloodTester.this, "Taking Blood Sample", "Please wait...");
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                BloodTester.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        progressBar.dismiss();
                        TextView t = (TextView) findViewById(R.id.bloodTextView);
                        t.setText("Sample Recieved and is being analyzed.\nYou will be notified when analyzing is complete.\nYou can use your phone whilst this process is carried out");
                        TextView t2 = (TextView) findViewById(R.id.textView6);
                        t2.setVisibility(View.GONE);
                        Button returnBtn = (Button) findViewById(R.id.bloodReturnBtn);
                        returnBtn.setVisibility(View.VISIBLE);
                        TextView beginSamplingBtn = (TextView) findViewById(R.id.beginSamplingBtn);
                        beginSamplingBtn.setVisibility(View.GONE);
                    }
                });
            }
        }, 5000);
    }


    public void returnToMain(View view){
        Intent intent = new Intent(BloodTester.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
