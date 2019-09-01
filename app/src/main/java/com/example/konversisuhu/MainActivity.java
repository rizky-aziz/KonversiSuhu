package com.example.konversisuhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editCelcius, editKelvin, editFahrenheit, editReamur;
    private Button btnKonversi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editCelcius = (EditText) findViewById(R.id.editCelcius);
        editKelvin = (EditText) findViewById(R.id.editKelvin);
        editFahrenheit = (EditText) findViewById(R.id.editFahrenheit);
        editReamur = (EditText) findViewById(R.id.editReamur);
        btnKonversi = (Button) findViewById(R.id.btnKonversi);

        btnKonversi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Double celcius = Double.parseDouble(String.valueOf(editCelcius.getText()));

        Double kelvin = celcius + 273;
        Double fahrenheit = celcius * 9/5 +32;
        Double reamur = celcius * 4/5;

        editKelvin.setText(kelvin.toString());
        editFahrenheit.setText(fahrenheit.toString());
        editReamur.setText(reamur.toString());
    }
}
