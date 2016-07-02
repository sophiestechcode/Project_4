package com.example.ruben.project4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import java.util.List;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    TextView M1;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);

//        dit zorgt ervoor wat button1 doet, als iemand daar op klikt.
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent knop = new Intent("android.intent.action.com.example.ruben.project4.NoteMain");
                startActivity(knop);

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent knop = new Intent("android.intent.action.com.example.ruben.project4.spinnermenu");
                startActivity(knop);

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent knop = new Intent("android.intent.action.com.example.ruben.project4.OtherPie");
                startActivity(knop);

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent knop = new Intent("android.intent.action.com.example.ruben.project4.PieChartt");
                startActivity(knop);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent knop = new Intent("android.intent.action.com.example.ruben.project4.BarChartt");
                startActivity(knop);

            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent knop = new Intent("android.intent.action.com.example.ruben.project4.LineChartt");
                startActivity(knop);
            }
        });

        DBHandler1 db1 = new DBHandler1(this);

        // Reading M1
        Log.d("Reading: ", "Reading M1..");
        List<M1> m1s = db1.getAllM1();

        for (M1 m1 : m1s) {
            String log = "Omschrijving: " + m1.getOmschrijving() + " ,Deelgemeente: " + m1.getDeelgemeente();
            // Writing shops to log
            Log.d("M1: : ", log);
        }

        DBHandler2 db2 = new DBHandler2(this);

        // Reading M2
        Log.d("Reading: ", "Reading M2..");
        List<M2> m2s = db2.getAllM2();

        for (M2 m2 : m2s) {
            String log = "MK_omschrijving: " + m2.getMK_omschrijving() + " ,Gemiddelde_maand: " + m2.getGemiddelde_maand();
            // Writing shops to log
            Log.d("M2: : ", log);
        }

        DBHandler3 db3 = new DBHandler3(this);

        // Reading M3
        Log.d("Reading: ", "Reading M3..");
        List<M3> m3s = db3.getAllM3();

        for (M3 m3 : m3s) {
            String log = "Wijknummer: " + m3.getWijknummer() + " ,Naam: " + m3.getNaam() + " ,Trommels: " + m3.getTrommels() + " ,Diefstallen: " + m3.getDiefstallen();
            // Writing shops to log
            Log.d("M3: : ", log);
        }

        DBHandler4 db4 = new DBHandler4(this);

        // Reading M4
        Log.d("Reading: ", "Reading M4..");
        List<M4> m4s = db4.getAllM4();

        for (M4 m4 : m4s) {
            String log = "MK_omschrijving: " + m4.getMK_omschrijving() + " ,Merk: " + m4.getMerk() + " ,Kleur: " + m4.getKleur();
            // Writing shops to log
            Log.d("M4: : ", log);
        }
    }

    public void connect(View view) {

    }

    public void display(String message) {

    }
}
