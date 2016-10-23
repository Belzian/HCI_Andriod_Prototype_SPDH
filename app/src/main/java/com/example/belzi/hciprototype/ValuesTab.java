package com.example.belzi.hciprototype;

import android.content.Intent;
import android.provider.LiveFolders;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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
        View view = inflater.inflate(R.layout.activity_values_tab, container, false);
        Intent intent = getActivity().getIntent();
        int categoryBtn = intent.getIntExtra(EXTRA_MESSAGE, R.id.vitaminBtn);
        TextView categoryHeading = (TextView) view.findViewById(R.id.categoryHeading);

        List<String> categoryDetailArrayList = new ArrayList<String>();
        switch (categoryBtn) {
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

        categoryDetailListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                String entry = (String) parent.getItemAtPosition(position);
                String message;
//                Reproductive
                if (entry.contains("Testosterone")) {
                    message = entry + "#Responsible for the development of male secondary sex characteristics and sex drive (in both men and women). Secreted by testes, ovaries and adrenal glands. Exists in serum as both unbound (free) and bound. Unbound is active testosterone. Levels are subject to diurnal variation with a peak in the early morning.#For men: Anabolic steroid use, cancer of the testes.For women: Hyperthyroidism, adrenal tumors, androgen resistance, ovarian tumors, hirsutism, polycystic ovaries, some drugs, virilization, hilar cell tumors.#For men: Hypogonadism, Klinefelter’s syndrome, hypopituitarism, liver disease, some drugs, down syndrome, advanced age, alcohol abuse, some drugs.For women: Menopause, ovarian failure.";
                } else if (entry.contains("IGF")) {
                    message = entry + "#A growth factor produced by the liver and muscles directly in response to growth hormone. IGF-1 can help evaluate pituitary function and diagnose situations related to growth hormone production.#Increased growth hormone production, puberty, pregnancy, pituitary tumors, obesity.#Deficiency or insensitivity to growth hormone, decreased pituitary function, advancing age, anorexia nervosa, malnutrition, diabetes, kidney disease, liver disease, high dose estrogen.";
                } else if (entry.contains("Growth hormone")) {
                    message = entry + "#A hormone secreted by the pituitary gland in response to exercise, deep sleep, hypoglycemia, glucagon, insulin and vasopressin. GH is essential to the growth process and metabolism.#Gigantism, acromegaly, uncontrolled diabetes, diabetes, fasting, anorexia nervosa, exercise.#Dwarfism, hypopituitarism, obesity, malnutrition, certain drugs/supplements, stress.";
                } else if (entry.contains("DHEA")) {
                    message = entry + "#\tAn androgen that can be metabolized into testosterone or estrogen. Released mainly by the adrenal glands – it can also be released by the testes and ovaries. Controlled by ACTH from the pituitary gland.#Adrenal tumors, PCOS, puberty.#Adrenal dysfunction, pituitary dysfunction.";
                } else if (entry.contains("Estradiol")) {
                    message = entry + "#\tAn important estrogen involved with sexual development. Produced mainly in the ovaries, but also in the adrenal glands and testes. Levels vary in menstruating women. Useful for diagnosing the reason behind amenorrhea.#Puberty, gynecomastia, ovarian tumor.#Turner syndrome, ovarian failure, rapid weight loss, low body fat, anorexia nervosa, malnutrition.";
                } else if (entry.contains("PSA")) {
                    message = entry + "#\tA screening recommended for males 40 years or older. PSA is produced by the prostate gland. Normal PSA levels don’t rule out prostate cancer. Nearly 25% of prostate cancers are missed by this lab alone.#Prostate cancer, prostate enlargement.#Not significant.";
                }

//                Carbohydrate tolerance
                else if (entry.contains("Fasted insulin")) {
                    message = entry + "#Insulin is a hormone secreted by the pancreas in response to increases in blood sugar, usually following a meal.#Pancreatic tumors, type 2 diabetes, acromegaly, Cushing’s syndrome, obesity (most common cause), diabetes medications, birth control medications.#Type 1 diabetes, hypopituitarism, diabetes medications.";
                } else if (entry.contains("Fasted glucose")) {
                    message = entry + "#\tBlood sugar. High values will occur if someone isn’t fasted. Beyond that, a true high fasted blood sugar indicates insulin resistance. If you are fasted, and your blood glucose is above 126 mg/dL, you have diabetes.#Diabetes, Cushing’s disease, stress, acromegaly, pituitary adenoma, hemochromatosis, pancreatitis, glucagonoma, liver disease, renal disease, vitamin B deficiency, pregnancy, catabolic steroid use, pregnancy, diuretics, obesity, sedentary habits, alcohol use, aspirin use, smoking.#Insulinomas, Addison’s disease, ACTH deficiency, starvation, liver disease, enzyme deficiency disease, reactive hypoglycemia, exercise, anabolic steroid use, acetaminophen use, high hematocrit.";
                }

//                Cardiovascular
                else if (entry.contains("Total cholesterol")) {
                    message = entry + "#Cholesterol is necessary for building brain and nerve cells, along with various hormones.Too much of it floating around the blood is associated with cardiovascular disease (CVD). Some experts claim that if you keep this under 150 mg/dL – you’ll be “heart attack resistant.#higher#lower”";
                } else if (entry.contains("Low-density")) {
                    message = entry + "#This compound carries cholesterol to body cells from the liver. Small, dense LDL levels have a strong association to CVD.#higher#lower";
                } else if (entry.contains("High-density")) {
                    message = entry + "#This compound carries cholesterol from cells back to the liver. There is a strong relationship between HDL and CVD. The ratio of total cholesterol to HDL is considered a better predictor of heart disease than total cholesterol or LDL. The goal is to have a ratio of 5:1 or lower in men; 4.4:1 in women. An optimum ratio is 3.5:1 or lower in men, 3.4:1 or lower in women.#higher#lower";
                } else if (entry.contains("Triglycerides")) {
                    message = entry + "#Fat in the blood levels predict the body’s ability to metabolize fat.  When triglycerides are under 100, the LDL calculation is usually inflated. The triglyceride to HDL ratio might be the single best predictor of heart disease risk.  A ratio above 4:1 is cause for concern. The goal is a ratio of 2:1; the lower the better.#higher#lower";
                } else if (entry.contains("C-reactive")) {
                    message = entry + "#A marker for low grade inflammation. Useful in predicting CVD.#higher#lower";
                }

//                Kidneys
                else if (entry.contains("Serum Creatinine")) {
                    message = entry + "#This is a metabolic by-product of muscle metabolism that must be filtered by the kidneys. Since muscle creatine breaks down into creatinine, someone with more muscle will have abundant creatine and potentially higher creatinine levels. When there is disordered kidney function, the ability to excrete creatinine diminishes.#higher#lower";
                } else if (entry.contains("Blood Urea Nitrogen")) {
                    message = entry + "#Urea is a waste product of protein metabolism eliminated from the body through urine, feces, and perspiration. BUN is a measure for kidney function because if filtration in the kidneys can’t keep up with elimination, kidney function is likely diminished.#higher#lower";
                }

//                Liver
                else if (entry.contains("asparate")) {
                    message = entry + "#An enzyme found mainly in the liver, heart, and muscles – organs with high metabolic activity.#higher#lower";
                } else if (entry.contains("aminotransferase")) {
                    message = entry + "#Enzyme found mainly in the liver.#Damage to the liver from alcohol, inflammation, increased body fat, mononucleosis, some drugs, heart attack, aspirin, strenuous exercise.#Not significant.";
                }

//                Protein
                else if (entry.contains("Serum globulin")) {
                    message = entry + "#Information#higher#lower";
                } else if (entry.contains("IgM component")) {
                    message = entry + "#Information#higher#lower";
                } else if (entry.contains("IgG component")) {
                    message = entry + "#Information#higher#lower";
                } else if (entry.contains("IgA component")) {
                    message = entry + "#Information#higher#lower";
                } else if (entry.contains("Total protein")) {
                    message = entry + "#Proteins are important building blocks of all cells and tissues. Proteins are necessary for your body’s growth, development, and health. Blood contains albumin and globulin. Albumin proteins keep fluid from leaking out of your blood vessels. Globulin proteins play an important role in your immune system.#Inflammation or infections, such as viral hepatitis B or C, or HIV\n" +
                            "Bone marrow disorders, such as multiple myeloma or Waldenstrom’s disease#Bleeding\n" +
                            "Liver disorder\n" +
                            "Kidney disorder, such as a nephrotic disorder or glomerulonephritis\n" +
                            "Malnutrition\n" +
                            "Malabsorption conditions, such as celiac disease or inflammatory bowel disease\n" +
                            "Extensive burns\n" +
                            "Agammaglobulinemia, which is an inherited condition in which your blood doesn’t have enough of a type of globulin, affecting the strength of your immune system\n" +
                            "Inflammatory conditions\n" +
                            "Delayed post-surgery recovery";
                } else if (entry.contains("Albumin to Globulin Ratio")) {
                    message = entry + "#These are proteins made in the liver and released into the blood. They are useful for evaluating overall health and nutrition status. Globulin fights disease. Albumin makes up about 2/3 of the total protein in the body and keeps water inside blood vessels.#Albumin: Dehydration.Globulin: Severe liver disease, infectious disease, blood disease, autoimmune disease, tuberculosis, multiple myelomas.#Albumin: Malnutrition, overhydration, liver disease, kidney disease, bone fractures, severe injury, inflammation, infection, Crohn’s disease, heart failure, thyroid dysfunction, slow bleeding, pregnancy, bed rest, certain medications.Globulin: Malnutrition, overhydration.";
                }

//                Red Blood Cells
                else if (entry.contains("Red Blood Cell")) {
                    message = entry + "#These are the most common cells found in blood. They carry oxygen from the lungs to body cells and transfer carbon dioxide from the cells to the lungs. They lack a nucleus, which allows more room to store hemoglobin, the oxygen binding protein.Anemia is a condition in which there is a reduction of circulating red blood cells, the amount of hemoglobin, or the volume of packed cells (hematocrit).#Polycythemia vera, renal disease, tumors, high altitude, cardiovascular disease and dehydration, pregnancy, some drugs.#Anemia, lymphomas, myeloproliferative disorders, hemorrhage, Addison’s disease, infections, recumbent positioning during blood draw, advanced age.";
                } else if (entry.contains("Hemoglobin")) {
                    message = entry + "#Gives red blood cells their color. Necessary for transferring oxygen and carbon dioxide.#Polycythemia vera, heart failure, COPD, pregnancy, recent blood transfusions, changes in fluid intake, high altitude, lots of exercise.#Anemia (iron deficiency, pernicious, etc.), liver disease, hypothyroidism, hemorrhage, reactions to drugs, smoking, various illnesses.";
                } else if (entry.contains("Hematocrit")) {
                    message = entry + "#The percentage of red blood cells in relation to total blood volume.#Erythrocytosis, polycythemia vera, shock, altitude, pregnancy, dehydration.#Anemia, leukemia, lymphoma, adrenal insufficiency, blood loss, hemolytic reactions.";
                } else if (entry.contains("Mean Cell Volume")) {
                    message = entry + "#Determines cell size and can help to classify anemia. Microcytic anemias are usually due to disorders of iron metabolism, heme synthesis, and globin synthesis. Macrocytic anemias are usually due to vitamin B12 or folate deficiency.# # ";
                } else if (entry.contains("Mean Cell Hemoglobin")) {
                    message = entry + "#Measures average weight of hemoglobin per red blood cell. Helps to diagnose severely anemic patients. High blood lipids and high WBC counts can falsely elevate MCH.# # ";
                } else if (entry.contains("Mean Cell Hb Conc")) {
                    message = entry + "#Measures average concentration of hemoglobin in red blood cells. Helps with monitoring therapy for anemia.#Spherocytosis.#Iron deficiency, blood loss.";
                } else if (entry.contains("Red Cell Dist Width")) {
                    message = entry + "#Indicates the degree of red blood cell size variations. This test is of no value if you don’t have anemia. This test can be altered with alcohol consumption.#Iron deficiency, vitamin B12 deficiency, folate deficiency.#Not significant.";
                } else if (entry.contains("Platelet count")) {
                    message = entry + "#\tThese are the smallest of the formed elements in blood. They help to stop bleeding by forming clots and assist in vessel integrity. A mean platelet volume (MPV) can help determine bleeding disorders.#Leukemia, polycythemia vera, splenectomy, iron deficiency anemia, asphyxiation, rheumatoid arthritis, infections, lymphomas, inflammatory bowel disease, renal failure, altitude, exercise, birth control medications, winter, lots of excitement.#Pernicious anemia, blood transfusions, infections, heart failure, thrombopoietin deficiency, chemotherapy, HIV, alcohol, renal insufficiency, before menstruation, pregnancy.";
                } else if (entry.contains("Mean Platelet Volume")) {
                    message = entry + "#\tThese are the smallest of the formed elements in blood. They help to stop bleeding by forming clots and assist in vessel integrity. A mean platelet volume (MPV) can help determine bleeding disorders.#Leukemia, polycythemia vera, splenectomy, iron deficiency anemia, asphyxiation, rheumatoid arthritis, infections, lymphomas, inflammatory bowel disease, renal failure, altitude, exercise, birth control medications, winter, lots of excitement.#Pernicious anemia, blood transfusions, infections, heart failure, thrombopoietin deficiency, chemotherapy, HIV, alcohol, renal insufficiency, before menstruation, pregnancy.";
                }

//                Thyroid
                else if (entry.contains("TSH")) {
                    message = entry + "#The thyroid has large hormone storage potential and a slow rate of turnover. TSH is secreted by the pituitary gland and stimulates thyroid gland function, leading to the release of T3 and T4. TSH secretion is regulated by T3 and T4 (feedback inhibition) and is stimulated by thyrotropin-releasing hormone (released from the hypothalamus). This test is the most sensitive for primary hypothyroidism.#An under-active thyroid, advanced age, amphetamine abuse.#An overactive thyroid, corticosteroid use, too much thyroid replacement medication. TSH tends to go down later in the day.";
                } else if (entry.contains("T4")) {
                    message = entry + "#T4 has four atoms of iodine attached. This test shows the total amount of T4, consisting of T4 bound to carrier proteins and unbound T4 available to cells. Bound T4 is inactive.#Hyperthyroidism, high estrogen levels from pregnancy, birth control use, estrogen replacement, hepatitis, lymphoma, heroin use, excessive iodine intake.#Steroid use, liver disease, hypothyroidism, aspirin, nephritic syndrome.";
                } else if (entry.contains("T3")) {
                    message = entry + "#T3 has three iodine atoms attached and more metabolic action than T4, but the effect is short lived. This test is helpful for diagnosing T3 toxicosis and hyperthyroidism. Not useful for diagnosing hypothyroidism.#Hyperthyroidism, T3 toxicosis, thyroid medication use, heroin use, estrogen use, pregnancy, iodine deficiency goiter.#Hypothyroidism, anabolic steroid use, aspirin, niacin use, fasting, malnutrition.";
                } else if (entry.contains("Thyroid Antibodies")) {
                    message = entry + "#Information#higher#lower";
                }

//                Vitamins and Minerals
                else if (entry.contains("vitamin D")) {
                    message = entry + "#The amount of vitamin D that has been produced in the body from sun, food and supplements. The half-life is 15 days. This lab can help indicate bone defects. Low levels are associated with immune disorders, CVD and some cancers.#Excessive supplementation or consumption from food.#Dietary insufficiency.";
                } else if (entry.contains("1,25 (OH)2D")) {
                    message = entry + "#\tThis lab is not a good indicator of vitamin D status, as it has a short half life of only 15 hours and levels in the blood are regulated tightly by hormones and minerals. 1,25 (OH)2D only starts to decline when a severe deficiency of vitamin D is present.# # ";
                } else if (entry.contains("Vitamin B-12")) {
                    message = entry + "#\tAlso known as anti-pernicious anemia factor. Necessary for red blood cell production, tissue repair, DNA synthesis, nervous system development.#Leukemia, renal failure, liver disease, polycythemia vera, heart failure, diabetes, obesity, COPD, high supplemental intake.#Pernicious anemia, inflammatory bowel disease, tapeworm, hypothyroidism, Zollinger-Ellison syndrome, bacterial overgrowth, dietary insufficiency, malabsorption, increased losses, aging, smoking, alcohol use, pregnancy, birth control medications, high supplemental doses of vitamins A and C.";
                } else if (entry.contains("Folic acid")) {
                    message = entry + "#\tNeeded for normal cell function. It is formed by bacteria in the intestines and is stored in the liver. It’s also in foods like green leafy vegetables, fruits, nuts, seeds, whole grains, legumes, and eggs. Folic acid levels in the blood can increase with vitamin B12 deficiency.#Bacterial overgrowth, dietary excess, vitamin B12 deficiency.#Dietary insufficiency, malabsorption, pregnancy, hypothyroidism, megaloblastic anemia, liver disease, celiac disease, vitamin B6 deficiency, carcinomas, inflammatory bowel diseases, anticonvulsant Rx, antimalarial Rx, antacid Rx, birth control Rx.";
                } else if (entry.contains("Calcium")) {
                    message = entry + "#tightly regulated in the body by the parathyroid gland, kidney and vitamin D. Measures can be abnormal with blood and bone disease, kidney disease, hormonal imbalances, intestinal disorders, excessive intake of vitamin C.# # ";
                } else if (entry.contains("Phosphorus")) {
                    message = entry + "#tightly regulated in the body by the parathyroid gland, kidney and vitamin D. Measures can be abnormal with blood and bone disease, kidney disease, hormonal imbalances, intestinal disorders, excessive intake of vitamin C.# # ";
                } else if (entry.contains("Sodium")) {
                    message = entry + "#An electrolyte necessary for fluid balance and cellular activity. Regulated by kidneys and adrenal glands.#Dehydration.#Vomiting, diarrhea, sweating, fluid overload disorders.";
                } else if (entry.contains("Potassium")) {
                    message = entry + "#Electrolyte important for muscles. Very low and very high levels are associated with heart rhythm abnormalities.#Kidney failure, excessive intake of high potassium foods/supplements.#Fluid loss from medications (diuretics), diarrhea, vomiting.";
                } else if (entry.contains("Chloride")) {
                    message = entry + "#Electrolyte regulated by the kidneys and adrenal glands. A high or low level usually corresponds to a high or low level of sodium or potassium.# # ";
                } else if (entry.contains("Iron")) {
                    message = entry + "#\tThis mineral is necessary for red blood cells and is the basis of hemoglobin. Iron can be lost through the intestinal and urinary tract, and through the menstrual cycle. Lost iron must be replaced in the diet. Iron losses in men and post-menopausal women are very low. All iron blood test results can be altered by alcohol consumption, estrogens, birth control, antibiotics, aspirin, and testosterone. Levels also change with the time of day.#Hemolytic anemia, iron poisoning, iron overload syndromes, hemochromatosis, transfusions, excessive supplementations, liver damage, vitamin B6 deficiency, lead poisoning, leukemia, nephritis.#Iron deficiency anemia, blood loss, infections, pregnancy, progesterone birth control pills, pernicious anemia remission, inadequate iron absorption, menstruation, dietary insufficiency, chronic inflammatory diseases.";
                } else if (entry.contains("Transferrin")) {
                    message = entry + "#\tA transport protein largely synthesized by the liver that regulates iron absorption.#Iron deficiency anemia, pregnancy, estrogen therapy.#Microcytic anemia, protein deficiency, infection, liver disease, renal disease, iron overload.";
                } else if (entry.contains("Total Iron Binding")) {
                    message = entry + "#Correlates with transferrin. And iron test without TIBC and transferrin is of limited value.#Iron deficiency, pregnancy, blood loss, hepatitis.#Protein deficiency, hemochromatosis, non-iron-deficiency anemia, liver cirrhosis, renal diseases, hyperthyroidism.";
                } else if (entry.contains("Ferritin")) {
                    message = entry + "#\tReflects body iron stores and is the most reliable indicator of total body iron status (other than testing bone marrow). May also be a marker of inflammation if elevated.#Iron overload, iron supplements, inflammatory disease, liver disease, leukemia, hyperthyroidism, renal diseases, age, meat consumption.#Iron deficiency anemia.";
                } else if (entry.contains("Carbon dioxide")) {
                    message = entry + "#This reflects the acid status of blood.#Lung disease, Cushing’s syndrome, Conn’s syndrome.#Increased acidity from uncontrolled diabetes, kidney disease, metabolic disorders, chronic hyperventilation, Addison’s disease, diarrhea, aspirin overdose.";
                }

//                White Blood Cells
                else if (entry.contains("White Blood Cell")) {
                    message = entry + "#These come in many different shapes and sizes. They have a role in the immune response. When the body is damaged, they increase. WBCs produce, transport, and distribute antibodies as well. Alone, a WBC count doesn’t tell you much.#Acute infection, leukemia, tissue injury, malignant neoplasms, uremia, drug use, hemorrhage, post-splenectomy, polycythemia vera, tissue necrosis, steroid therapy (ACTH), afternoon/evening hours.#Viral infections, bacterial infections, hypersplenism, bone marrow depression, bone marrow disorders, pernicious anemia, AM hours, improper blood draw (hemoconcentration).";
                } else if (entry.contains("Neutrophil")) {
                    message = entry + "#The most abundant white blood cells that destroy bacteria in the body.#Bacterial infection, inflammation, metabolic intoxications, drugs, hemorrhage, hemolytic anemia, myeloproliferative disease, malignant neoplasms, stress, labor, menstruation, steroid use.#Stem cell disorder, infections, drug use, anemia, chemotherapy, some drugs, temperature changes.";
                } else if (entry.contains("Lymphocyte")) {
                    message = entry + "#Involved with viral infections like measles, chickenpox and mononucleosis.#Leukemia, mononucleosis, viral diseases, tuberculosis, Crohn’s disease, Addison’s disease, thyrotoxicosis, African-American race, exercise, stress, menstruation.#Chemotherapy, radiation, steroid treatment, aplastic anemia, malignancies, immune disorders, tuberculosis, renal failure, heart failure.";
                } else if (entry.contains("Monocyte")) {
                    message = entry + "#Help to combat severe infections.#Bacterial infection, tuberculosis, syphilis, leukemia, certain carcinomas, lymphomas, Gaucher’s disease, trauma, ulcerative colitis, sprue, certain poisons.#Prednisone, hairy cell leukemia, HIV, bone marrow injury.";
                } else if (entry.contains("Eosinophil")) {
                    message = entry + "#Usually involved with allergic disorders and parasitic infections.#Allergies, asthma, tapeworm, endocrine disorders, myeloproliferative disorders, infections, skin diseases, GI diseases, aspirin sensitivity, poisons, stress, PM hours.#Cushing’s syndrome, drugs, infections, AM hours.";
                } else if (entry.contains("Basophil")) {
                    message = entry + "#Involved in parasitic infections and some allergic disorders.#Leukemia, Hodgkin’s disease, myeloproliferative disorders, hypothyroidism, flu, polycythemia vera, hemolytic anemia.#Infection, hyperthyroidism, stress, steroids, chemotherapy, radiation.";
                } else if (entry.contains("Neutrophil, Absolute")) {
                    message = entry + "#The most abundant white blood cells that destroy bacteria in the body.#Bacterial infection, inflammation, metabolic intoxications, drugs, hemorrhage, hemolytic anemia, myeloproliferative disease, malignant neoplasms, stress, labor, menstruation, steroid use.#Stem cell disorder, infections, drug use, anemia, chemotherapy, some drugs, temperature changes.";
                } else if (entry.contains("Lymphocyte, Absolute")) {
                    message = entry + "#Involved with viral infections like measles, chickenpox and mononucleosis.#Leukemia, mononucleosis, viral diseases, tuberculosis, Crohn’s disease, Addison’s disease, thyrotoxicosis, African-American race, exercise, stress, menstruation.#Chemotherapy, radiation, steroid treatment, aplastic anemia, malignancies, immune disorders, tuberculosis, renal failure, heart failure.";
                } else if (entry.contains("Monocyte, Absolute")) {
                    message = entry + "#Help to combat severe infections.#Bacterial infection, tuberculosis, syphilis, leukemia, certain carcinomas, lymphomas, Gaucher’s disease, trauma, ulcerative colitis, sprue, certain poisons.#Prednisone, hairy cell leukemia, HIV, bone marrow injury.";
                } else if (entry.contains("Eosinophil, Absolute")) {
                    message = entry + "#Usually involved with allergic disorders and parasitic infections.#Allergies, asthma, tapeworm, endocrine disorders, myeloproliferative disorders, infections, skin diseases, GI diseases, aspirin sensitivity, poisons, stress, PM hours.#Cushing’s syndrome, drugs, infections, AM hours.";
                } else if (entry.contains("Basophil, Absolute")) {
                    message = entry + "#Involved in parasitic infections and some allergic disorders.#Leukemia, Hodgkin’s disease, myeloproliferative disorders, hypothyroidism, flu, polycythemia vera, hemolytic anemia.#Infection, hyperthyroidism, stress, steroids, chemotherapy, radiation.";
                }

//                Default
                else {
                    message = "Some Value#This is a sentence about this value.#higher#lower";
                }

                Intent intent = new Intent(view.getContext(), ValueInformation.class);
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
            }
        });

        return view;
    }
}
