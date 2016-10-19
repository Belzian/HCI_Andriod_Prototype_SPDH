package com.example.belzi.hciprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class ListItemDetails extends DrawerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item_details);

        Intent intent = getIntent();
        String message = intent.getStringExtra(EXTRA_MESSAGE);
        String[] messageArray = message.split("#");

        TextView details = (TextView) findViewById(R.id.details);
        TextView title = (TextView) findViewById(R.id.title);
        title.setText(messageArray[0]);
        details.setText(messageArray[1]);
    }
}
