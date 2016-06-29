package com.example.ruben.project4;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class OtherPie extends AppCompatActivity {
    PieChart grafiek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_pie);
        Context context = this;

        ContextCompat.getColor(context,R.color.pie_2_1);
        ContextCompat.getColor(context,R.color.pie_2_2);
        ContextCompat.getColor(context,R.color.pie_2_3);
        ContextCompat.getColor(context,R.color.pie_2_4);
        ContextCompat.getColor(context,R.color.pie_2_5);
        ContextCompat.getColor(context,R.color.pie_2_6);
        ContextCompat.getColor(context,R.color.pie_2_7);

        grafiek = (PieChart) findViewById(R.id.piechart);

        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(21.4f, 0));
        entries.add(new Entry(15.8f, 1));
        entries.add(new Entry(15.5f, 2));
        entries.add(new Entry(12f, 3));
        entries.add(new Entry(6.6f, 4));
        entries.add(new Entry(6.3f, 5));
        entries.add(new Entry(22.4f, 6));


        PieDataSet dataset = new PieDataSet(entries,"");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("Zwart");
        labels.add("Blauw");
        labels.add("onbekend");
        labels.add("Grijs");
        labels.add("Zilver");
        labels.add("meerkleurig");
        labels.add("Overig");



        PieData data = new PieData(labels, dataset);
        Legend legend = grafiek.getLegend();
        grafiek.setData(data);
        grafiek.setHoleRadius(50f);
        grafiek.setTransparentCircleRadius(0f);
        grafiek.setDescription("Percentage meest gestolen fiets kleur.");
        grafiek.animateY(1000);
        dataset.setValueTextSize(10f);
        dataset.setColors(new int[]{R.color.pie_2_1,R.color.pie_2_2,R.color.pie_2_3,R.color.pie_2_4,R.color.pie_2_5,R.color.pie_2_6,R.color.pie_2_7},context);
        legend.setWordWrapEnabled((boolean) true);

    }
}
