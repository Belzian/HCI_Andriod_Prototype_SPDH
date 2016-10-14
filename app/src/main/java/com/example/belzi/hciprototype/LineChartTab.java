package com.example.belzi.hciprototype;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class LineChartTab extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.activity_line_chart_tab, container, false);
        Intent intent = getActivity().getIntent();
        int categoryBtn = intent.getIntExtra(EXTRA_MESSAGE, R.id.vitaminBtn);
        TextView valueHeading = (TextView) view.findViewById(R.id.valueHeading);

        switch (categoryBtn){
            case R.id.carbTolBtn:
                valueHeading.setText("Carbohydrate Tolerance");
                break;
            case R.id.cardVasBtn:
                valueHeading.setText("Cardiovascular");
                break;
            case R.id.kidneyBtn:
                valueHeading.setText("Kidneys");
                break;
            case R.id.liverBtn:
                valueHeading.setText("Liver");
                break;
            case R.id.proteinBtn:
                valueHeading.setText("Protein");
                break;
            case R.id.redBloCelBtn:
                valueHeading.setText("Red Blood Cells");
                break;
            case R.id.reproBtn:
                valueHeading.setText("Reproductive");
                break;
            case R.id.thyroidBtn:
                valueHeading.setText("Thyroid");
                break;
            case R.id.vitaminBtn:
                valueHeading.setText("Vitamins and Minerals");
                break;
            case R.id.whiBloCelBtn:
                valueHeading.setText("White Blood Cells");
                break;
        }
        return view;

    }
}
