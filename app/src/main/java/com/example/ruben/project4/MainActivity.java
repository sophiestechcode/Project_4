package com.example.ruben.project4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        M1 = (TextView) findViewById(R.id.M1);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);

//        dit zorgt ervoor wat button1 doet, als iemand daar op klikt.
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




//                URL url = null;
//                try {
//                    url = new URL("http://www.android.com/");
//                } catch (MalformedURLException e) {
//                    e.printStackTrace();
//                }
//                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
//                try {
//                    InputStream in = new BufferedInputStream(urlConnection.getInputStream());
//                    readStream(in);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                } finally {
//                    urlConnection.disconnect();
//                }

            }
        });
    }

    public void connect(View view) {

    }

    public void display(String message){

    }
}
