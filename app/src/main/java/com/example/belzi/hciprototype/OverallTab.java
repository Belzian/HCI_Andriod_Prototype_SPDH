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
        lowLevelArrayList.add("Vitamin B-12: 7 mg/L");
        lowLevelArrayList.add("Triglycerides: 90 mg/dL");

        List<String> highLevelArrayList = new ArrayList<String>();
        highLevelArrayList.add("Testosterone: 1103 ng/dL");
        highLevelArrayList.add("Insulin-like Growth Factor IGF-1: 170 ng/mL");

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
                    case "Vitamin B-12: 7 mg/L":
                        message = entry + "#Also known as anti-pernicious anemia factor. Necessary for red blood cell production, tissue repair, DNA synthesis, nervous system development.#Leukemia, renal failure, liver disease, polycythemia vera, heart failure, diabetes, obesity, COPD, high supplemental intake.#Pernicious anemia, inflammatory bowel disease, tapeworm, hypothyroidism, Zollinger-Ellison syndrome, bacterial overgrowth, dietary insufficiency, malabsorption, increased losses, aging, smoking, alcohol use, pregnancy, birth control medications, high supplemental doses of vitamins A and C.";
                        break;
                    case "Triglycerides: 90 mg/dL":
                        message = entry + "#Fat in the blood levels predict the body’s ability to metabolize fat.  When triglycerides are under 100, the LDL calculation is usually inflated. The triglyceride to HDL ratio might be the single best predictor of heart disease risk.  A ratio above 4:1 is cause for concern. The goal is a ratio of 2:1; the lower the better.#higher#lower";
                        break;
                }

                Intent intent = new Intent(view.getContext(), ValueInformation.class);
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
                    case "Testosterone: 1103 ng/dL":
                        message = entry + "#Responsible for the development of male secondary sex characteristics and sex drive (in both men and women). Secreted by testes, ovaries and adrenal glands. Exists in serum as both unbound (free) and bound. Unbound is active testosterone. Levels are subject to diurnal variation with a peak in the early morning.#For men: Anabolic steroid use, cancer of the testes.For women: Hyperthyroidism, adrenal tumors, androgen resistance, ovarian tumors, hirsutism, polycystic ovaries, some drugs, virilization, hilar cell tumors.#For men: Hypogonadism, Klinefelter’s syndrome, hypopituitarism, liver disease, some drugs, down syndrome, advanced age, alcohol abuse, some drugs.For women: Menopause, ovarian failure.";
                        break;
                    case "Insulin-like Growth Factor IGF-1: 170 ng/mL":
                        message = entry + "#A growth factor produced by the liver and muscles directly in response to growth hormone. IGF-1 can help evaluate pituitary function and diagnose situations related to growth hormone production.#Increased growth hormone production, puberty, pregnancy, pituitary tumors, obesity.#Deficiency or insensitivity to growth hormone, decreased pituitary function, advancing age, anorexia nervosa, malnutrition, diabetes, kidney disease, liver disease, high dose estrogen.";
                        break;
                }

                Intent intent = new Intent(view.getContext(), ValueInformation.class);
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
            }
        });

        return view;
    }


}
