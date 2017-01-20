package com.alex.myproperties;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Properties;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{

            Properties properties = new Properties();
            properties.load(getAssets().open("prop"));

            String curso = properties.getProperty("curso");
            String alumnos = properties.getProperty("nalumnos");

            Log.d(getClass().getCanonicalName(), "Curso " + curso);
            Log.d(getClass().getCanonicalName(), "Nalumnos = " + alumnos);

        }catch (Exception e) {
            Log.e(getClass().getCanonicalName(), "Error de lectura", e);
        }
    }
}
