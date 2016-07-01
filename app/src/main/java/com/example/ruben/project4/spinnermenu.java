package com.example.ruben.project4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by Ruben on 28-6-2016.
 */
public class spinnermenu extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner spinner;
    private static final String[]paths = {"","Centrum", "Charlois", "Delfshaven","Feijenoord","Hillegersberg","Hoogvliet"
            ,"Ijselmonde","Kralingen","Noord","Ommoord","Overschie","Pernis","West"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spinner = (Spinner)findViewById(R.id.dynamic_spinner);
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(spinnermenu.this,
                android.R.layout.simple_spinner_item,paths);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

    }

    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {

        switch (position) {
            case 0:
                break;
            case 1:
                Intent intent1 = new Intent(spinnermenu.this, Centrum.class);
                startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(spinnermenu.this, Charlois.class);
                startActivity(intent2);
                break;
            case 3:
                Intent intent3 = new Intent(spinnermenu.this, Delfshaven.class);
                startActivity(intent3);
                break;
            case 4:
                Intent intent4 = new Intent(spinnermenu.this, Feijenoord.class);
                startActivity(intent4);
                break;
            case 5:
                Intent intent5 = new Intent(spinnermenu.this, Hillegersberg.class);
                startActivity(intent5);
                break;
            case 6:
                Intent intent6 = new Intent(spinnermenu.this, Hoogvliet.class);
                startActivity(intent6);
                break;
            case 7:
                Intent intent7 = new Intent(spinnermenu.this, Ijselmonde.class);
                startActivity(intent7);
                break;
            case 8:
                Intent intent8 = new Intent(spinnermenu.this, Kralingen.class);
                startActivity(intent8);
                break;
            case 9:
                Intent intent9 = new Intent(spinnermenu.this, Noord.class);
                startActivity(intent9);
                break;
            case 10:
                Intent intent10 = new Intent(spinnermenu.this, Ommoord.class);
                startActivity(intent10);
                break;
            case 11:
                Intent intent11 = new Intent(spinnermenu.this, Overschie.class);
                startActivity(intent11);
                break;
            case 12:
                Intent intent12 = new Intent(spinnermenu.this, Pernis.class);
                startActivity(intent12);
                break;
            case 13:
                Intent intent13 = new Intent(spinnermenu.this, West.class);
                startActivity(intent13);
                break;


        }
    }
    public void onNothingSelected(AdapterView<?> parent) {

    }

    }
