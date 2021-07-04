package com.example.administrator.book;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinnerDropDownView;
    String[] spinnerValueHoldValue = {"Intro to html", "Intro to css", "Intro to php"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        spinnerDropDownView =(Spinner)findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, spinnerValueHoldValue);
        spinnerDropDownView.setAdapter(adapter);

        spinnerDropDownView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {

                //Toast.makeText(MainActivity.this, spinnerDropDownView.getSelectedItem().toString(), Toast.LENGTH_LONG).show();


            }



            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });










    }
    public void buttonC(View view){
        Intent i = new Intent(MainActivity.this, Main2Activity.class);
        String strName = spinnerDropDownView.getSelectedItem().toString();
        i.putExtra("STRING_I_NEED", strName);
        startActivity(i);
    }
}

