package com.example.ruben.project4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;
import java.util.ArrayList;

public class LineChartt extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linechartt);

        LineChart lineChart = (LineChart) findViewById(R.id.chart);

        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(35f, 0));
        entries.add(new Entry(11f, 1));
        entries.add(new Entry(17f, 2));
        entries.add(new Entry(17f, 3));
        entries.add(new Entry(15f, 4));
        entries.add(new Entry(28f, 5));
        entries.add(new Entry(17f, 6));
        entries.add(new Entry(34f, 7));
        entries.add(new Entry(38f, 8));
        entries.add(new Entry(8f, 9));
        entries.add(new Entry(7, 10));
        entries.add(new Entry(2f, 11));
        entries.add(new Entry(40f, 12));

        LineDataSet dataset = new LineDataSet(entries, "The amount of stolen bicycles per month");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("Centrum");
        labels.add("Charlois");
        labels.add("Delfshaven");
        labels.add("Feijenoord");
        labels.add("Hillegersberg");
        labels.add("Hoogvliet");
        labels.add("IJsselmonde");
        labels.add("Kralingen");
        labels.add("Noord");
        labels.add("Ommoord");
        labels.add("Overschie");
        labels.add("Pernis");
        labels.add("West");

        LineData data = new LineData(labels, dataset);
        dataset.setColors(ColorTemplate.COLORFUL_COLORS);

        lineChart.setData(data);
        lineChart.animateY(2500);
        lineChart.setDescription("");
        lineChart.getAxisLeft().setDrawLabels(false);
        lineChart.getAxisRight().setDrawLabels(false);
    }
}
