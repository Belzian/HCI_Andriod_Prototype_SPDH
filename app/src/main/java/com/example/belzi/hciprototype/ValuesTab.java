package com.example.belzi.hciprototype;

import android.content.Intent;
import android.provider.LiveFolders;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class ValuesTab extends Fragment {
    private ListView categoryDetailListView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.activity_values_tab, container, false);
        Intent intent = getActivity().getIntent();
        int categoryBtn = intent.getIntExtra(EXTRA_MESSAGE, R.id.vitaminBtn);
        TextView categoryHeading = (TextView) view.findViewById(R.id.categoryHeading);

        List<String> categoryDetailArrayList = new ArrayList<String>();
        switch (categoryBtn){
            case R.id.carbTolBtn:
                categoryHeading.setText("Carbohydrate Tolerance");
                categoryDetailArrayList.add("Fasted insulin: 10 mcU/ml ");
                categoryDetailArrayList.add("Fasted glucose: 80 mg/dL");
                break;
            case R.id.cardVasBtn:
                categoryHeading.setText("Cardiovascular");
                categoryDetailArrayList.add("Total cholesterol: 120 mg/dL");
                categoryDetailArrayList.add("Low-density lipoprotein (LDL) cholesterol: 80 mg/dL ");
                categoryDetailArrayList.add("High-density lipoprotein (HDL) cholesterol: 65 mg/dL");
                categoryDetailArrayList.add("Triglycerides: 90 mg/dL");
                categoryDetailArrayList.add("C-reactive protein: 0.2 mg/L");
                break;
            case R.id.kidneyBtn:
                categoryHeading.setText("Kidneys");
                categoryDetailArrayList.add("Serum Creatinine: 110 mL/min");
                categoryDetailArrayList.add("Blood Urea Nitrogen: 14");
                break;
            case R.id.liverBtn:
                categoryHeading.setText("Liver");
                categoryDetailArrayList.add("aspartate aminotransferase (AST): 23.5 U/L");
                categoryDetailArrayList.add("aminotransferase (ALT): 32 U/L");
                break;
            case R.id.proteinBtn:
                categoryHeading.setText("Protein");
                categoryDetailArrayList.add("Serum globulin: 2.75 g/dL");
                categoryDetailArrayList.add("IgM component: 195mg/dL");
                categoryDetailArrayList.add("IgG component: 1150 mg/dL");
                categoryDetailArrayList.add("IgA component: 220 mg/dL");
                categoryDetailArrayList.add("Total protein: 7.1 g/dL");
                categoryDetailArrayList.add("Albumin to Globulin Ratio: 1.1 g/dL");
                break;
            case R.id.redBloCelBtn:
                categoryHeading.setText("Red Blood Cells");
                categoryDetailArrayList.add("Red Blood Cell (RBC): 5.4 M/mcL");
                categoryDetailArrayList.add("Hemoglobin (HB/Hgb)): 16.1 g/dL");
                categoryDetailArrayList.add("Hematocrit (HCT): 47 %");
                categoryDetailArrayList.add("Mean Cell Volume (MCV): 90 fL");
                categoryDetailArrayList.add("Mean Cell Hemoglobin (MCH): 30.1 pg");
                categoryDetailArrayList.add("Mean Cell Hb Conc (MCHC): 34 g/dL");
                categoryDetailArrayList.add("Red Cell Dist Width (RDW): 12.5 %");
                categoryDetailArrayList.add("Platelet count: 300 K/mcL");
                categoryDetailArrayList.add("Mean Platelet Volume: 9.5 fL");
                break;
            case R.id.reproBtn:
                categoryHeading.setText("Reproductive");
                categoryDetailArrayList.add("Testosterone: 1103 ng/dL");
                categoryDetailArrayList.add("Insulin-like Growth Factor IGF-1: 170 ng/mL");
                categoryDetailArrayList.add("Growth hormone:  226 pmol/L");
                categoryDetailArrayList.add("DHEA/DHEAs: 290 ug/dL");
                categoryDetailArrayList.add("Estradiol: 13 pg/mL");
                categoryDetailArrayList.add("PSA: 1.5 ng/mL");
                break;
            case R.id.thyroidBtn:
                categoryHeading.setText("Thyroid");
                categoryDetailArrayList.add("TSH – Thyroid Stimulating Hormone: 1.01");
                categoryDetailArrayList.add("T4 – Thyroxine Level: 17");
                categoryDetailArrayList.add("T3 - Triiodothyronine: 6");
                categoryDetailArrayList.add("Thyroid Antibodies - TPO & TGO: Negative");
                break;
            case R.id.vitaminBtn:
                categoryHeading.setText("Vitamins and Minerals");
                categoryDetailArrayList.add("25-hydroxyvitamin D [25(OH)D]: 45 mg/L");
                categoryDetailArrayList.add("1,25 (OH)2D: ");
                categoryDetailArrayList.add("Vitamin B-12: 7 mg/L");
                categoryDetailArrayList.add("Folic acid: 12 mg/L");
                categoryDetailArrayList.add("Calcium: 10.5 mg/dL");
                categoryDetailArrayList.add("Phosphorus: 5.5 mg/dL");
                categoryDetailArrayList.add("Sodium: 140 mEq/L");
                categoryDetailArrayList.add("Potassium: 4 mEq/L");
                categoryDetailArrayList.add("Chloride: 100 mEq/L");
                categoryDetailArrayList.add("Iron: 15 g/dL");
                categoryDetailArrayList.add("Transferrin: 220 mg/dL");
                categoryDetailArrayList.add("Total Iron Binding Capacity (TIBC): 300 mcg/dL");
                categoryDetailArrayList.add("Ferritin: 200 mcg/L");
                categoryDetailArrayList.add("Carbon dioxide: 25 mEq/L");
                break;
            case R.id.whiBloCelBtn:
                categoryHeading.setText("White Blood Cells");
                categoryDetailArrayList.add("White Blood Cell (WBC): 7.8 K/mcL");
                categoryDetailArrayList.add("Neutrophil: 53 %");
                categoryDetailArrayList.add("Lymphocyte: 31 %");
                categoryDetailArrayList.add("Monocyte: 5 %");
                categoryDetailArrayList.add("Eosinophil: 2.5 %");
                categoryDetailArrayList.add("Basophil: 1 %");
                categoryDetailArrayList.add("Neutrophil, Absolute: 4.8 K/mcL");
                categoryDetailArrayList.add("Lymphocyte, Absolute: 2.8 K/mcL");
                categoryDetailArrayList.add("Monocyte, Absolute: 0.4 K/mcL");
                categoryDetailArrayList.add("Eosinophil, Absolute: 0.2 K/mcL");
                categoryDetailArrayList.add("Basophil, Absolute: 0.1 K/mcL");
                break;
        }
        categoryDetailListView = (ListView) view.findViewById(R.id.categoryDetailList);




        ArrayAdapter<String> categoryDetailArrayAdapter = new ArrayAdapter<String>(view.getContext(), android.R.layout.simple_list_item_1, categoryDetailArrayList);
        categoryDetailListView.setAdapter(categoryDetailArrayAdapter);

        return view;
    }
}
