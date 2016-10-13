package com.example.belzi.hciprototype;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class OverallTab extends Fragment {
    private ListView lowLevelListView;
    private ListView highLevelListView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.activity_overall_tab, container, false);

        lowLevelListView = (ListView) view.findViewById(R.id.lowLevels);
        highLevelListView = (ListView) view.findViewById(R.id.highLevels);

        List<String> lowLevelArrayList = new ArrayList<String>();
        lowLevelArrayList.add("Vitamin B-12");
        lowLevelArrayList.add("Triglycerides");

        List<String> highLevelArrayList = new ArrayList<String>();
        highLevelArrayList.add("Testosterone");
        highLevelArrayList.add("IGF-1 Growth Hormone");

        ArrayAdapter<String> lowLevelArrayAdapter = new ArrayAdapter<String>(view.getContext(), android.R.layout.simple_list_item_1, lowLevelArrayList);
        lowLevelListView.setAdapter(lowLevelArrayAdapter);

        ArrayAdapter<String> highLevelArrayAdapter = new ArrayAdapter<String>(view.getContext(), android.R.layout.simple_list_item_1, highLevelArrayList);
        highLevelListView.setAdapter(highLevelArrayAdapter);

        lowLevelListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                String entry = (String) parent.getItemAtPosition(position);
                String message = "";
                switch (entry){
                    case "Vitamin B-12":
                        message = "Vitamin B-12#This is a sentence.";
                        break;
                    case "Triglycerides":
                        message = "Triglycerides#This is a sentence.";
                        break;
                }

                Intent intent = new Intent(view.getContext(), ListItemDetails.class);
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
            }
        });
        highLevelListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                String entry = (String) parent.getItemAtPosition(position);
                String message = "";
                switch (entry){
                    case "Testosterone":
                        message = "Testosterone#High testosterone is generally normal for males, " +
                                "however can also indicate anabolic steroid use or cancer of the " +
                                "testes. It is recommended to check up with your doctor.";
                        break;
                    case "IGF-1 Growth Hormone":
                        message = "IGF-1 Growth Hormone#This is a sentence.";
                        break;
                }

                Intent intent = new Intent(view.getContext(), ListItemDetails.class);
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
            }
        });

        return view;
    }


}
