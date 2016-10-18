package com.example.belzi.hciprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class ValueInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_value_information);

        Intent intent = getIntent();
        String message = intent.getStringExtra(EXTRA_MESSAGE);
        String[] messageArray = message.split("#");
        TextView title = (TextView) findViewById(R.id.title);
        TextView information = (TextView) findViewById(R.id.information);
        TextView higherWithInformation = (TextView) findViewById(R.id.higherWithInformation);
        TextView lowerWithInformation = (TextView) findViewById(R.id.lowerWithInformation);

        title.setText(messageArray[0]);
        information.setText(messageArray[1]);
        higherWithInformation.setText(messageArray[2]);
        lowerWithInformation.setText(messageArray[3]);
    }
}
