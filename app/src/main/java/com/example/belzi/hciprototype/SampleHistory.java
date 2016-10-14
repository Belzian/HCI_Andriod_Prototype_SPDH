package com.example.belzi.hciprototype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SampleHistory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_history);
        ListView sampleHistoryListView = (ListView) findViewById(R.id.sampleHistoryList);

        List<String> sampleHistoryArrayList = new ArrayList<String>();

        sampleHistoryArrayList.add("13/10/2016 4:46PM");
        sampleHistoryArrayList.add("12/10/2016 1:59PM");
        sampleHistoryArrayList.add("11/10/2016 7:36AM");
        sampleHistoryArrayList.add("10/10/2016 3:46PM");
        sampleHistoryArrayList.add("9/10/2016 2:25PM");
        sampleHistoryArrayList.add("8/10/2016 1:17PM");
        sampleHistoryArrayList.add("7/10/2016 4:25PM");
        sampleHistoryArrayList.add("6/10/2016 6:37PM");
        sampleHistoryArrayList.add("5/10/2016 9:59AM");
        sampleHistoryArrayList.add("4/10/2016 10:14AM");
        sampleHistoryArrayList.add("3/10/2016 11:28AM");
        sampleHistoryArrayList.add("2/10/2016 12:36PM");
        sampleHistoryArrayList.add("1/10/2016 7:47AM");
        sampleHistoryArrayList.add("30/9/2016 5:15PM");
        sampleHistoryArrayList.add("29/9/2016 8:53AM");
        sampleHistoryArrayList.add("28/9/2016 1:45PM");
        sampleHistoryArrayList.add("27/9/2016 12:24PM");

        ArrayAdapter<String> categoryDetailArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, sampleHistoryArrayList);
        sampleHistoryListView.setAdapter(categoryDetailArrayAdapter);
    }
}
