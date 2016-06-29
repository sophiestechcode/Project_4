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
        entries.add(new Entry(19552f, 0));
        entries.add(new Entry(19713f, 1));
        entries.add(new Entry(19257f, 2));
        entries.add(new Entry(19544f, 3));
        entries.add(new Entry(19750f, 4));
        entries.add(new Entry(19758f, 5));
        entries.add(new Entry(19198f, 6));
        entries.add(new Entry(18234f, 7));
        entries.add(new Entry(19047f, 8));
        entries.add(new Entry(19436f, 9));
        entries.add(new Entry(18291f, 10));
        entries.add(new Entry(19712f, 11));

        LineDataSet dataset = new LineDataSet(entries, "The amount of stolen bicycles per month");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("Jan");
        labels.add("Feb");
        labels.add("Mar");
        labels.add("Apr");
        labels.add("May");
        labels.add("Jun");
        labels.add("Jul");
        labels.add("Aug");
        labels.add("Sep");
        labels.add("Oct");
        labels.add("Nov");
        labels.add("Dec");

        LineData data = new LineData(labels, dataset);
        dataset.setColors(ColorTemplate.COLORFUL_COLORS);

        lineChart.setData(data);
        lineChart.animateY(2500);
        lineChart.setDescription("");
        lineChart.getAxisLeft().setDrawLabels(false);
        lineChart.getAxisRight().setDrawLabels(false);
    }
}
