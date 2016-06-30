package com.example.ruben.project4;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import java.util.ArrayList;


public class PieChartt extends AppCompatActivity {


    PieChart grafiek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piechartt);

        Context context = this;

        grafiek = (PieChart) findViewById(R.id.piechart);
        ContextCompat.getColor(context,R.color.pie_1_1);
        ContextCompat.getColor(context,R.color.pie_1_2);
        ContextCompat.getColor(context,R.color.pie_1_3);
        ContextCompat.getColor(context,R.color.pie_1_4);
        ContextCompat.getColor(context,R.color.pie_1_5);
        ContextCompat.getColor(context,R.color.pie_1_6);

        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(12.1f, 0));
        entries.add(new Entry(23.4f, 1));
        entries.add(new Entry(5.4f, 2));
        entries.add(new Entry(6.3f, 3));
        entries.add(new Entry(5.3f, 4));
        entries.add(new Entry(47.5f, 4));


        PieDataSet dataset = new PieDataSet(entries, "");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("Batavus");
        labels.add("Gazelle");
        labels.add("Giant");
        labels.add("Piaggio");
        labels.add("Sparta");
        labels.add("Overig");



        PieData data = new PieData(labels, dataset);
        grafiek.setData(data);
        grafiek.setHoleRadius(50f);
        grafiek.setTransparentCircleRadius(0f);
        grafiek.animateY(1000);
        dataset.setValueTextSize(12f);
        dataset.setColors(ColorTemplate.PASTEL_COLORS);
        grafiek.setDescription("");
        dataset.setColors(new int[]{R.color.pie_1_6,R.color.pie_1_1,R.color.pie_1_2,R.color.pie_1_5,R.color.pie_1_4,R.color.pie_1_3},context);

    }






}
