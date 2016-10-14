package com.example.belzi.hciprototype;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    public void startCustomiseCategories(View view){
        Intent intent = new Intent(this, CustomiseCategories.class);
        this.startActivity(intent);
    }

    public void startEditAccount(View view){
        Intent intent = new Intent(this, EditAccount.class);
        this.startActivity(intent);
    }

    public void pairDevice(View view){
        final ProgressDialog progressBar;
        progressBar = ProgressDialog.show(Settings.this, "Pairing Device", "Please wait...");
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Settings.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        progressBar.dismiss();
                        CharSequence text = "Device Successfully Paired";
                        int duration = Toast.LENGTH_SHORT;
                        Context context = getApplicationContext();
                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                });
            }
        }, 5000);
    }
}
