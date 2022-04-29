package com.example.cagataycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextNumber;
    EditText editTextNumber2;
    TextView textView;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber = findViewById(R.id.editTextNumber);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        textView = findViewById(R.id.textView);

        sharedPreferences = this.getSharedPreferences("com.example.cagataycalculator", Context.MODE_PRIVATE);
        int storeresult = sharedPreferences.getInt("storeresult" , 0);
        textView.setText(" " +storeresult);

    }


    public void toplama (View view) {

        Integer number1 = Integer.parseInt(editTextNumber.getText().toString());
        Integer number2 = Integer.parseInt(editTextNumber2.getText().toString());

        int result = number1 + number2;

        textView.setText(" " + result);
        sharedPreferences.edit().putInt("storeresult" ,result).apply();
    }

    public void cikarma (View view) {

        Integer number1 = Integer.parseInt(editTextNumber.getText().toString());
        Integer number2 = Integer.parseInt(editTextNumber2.getText().toString());

        int result = number1 - number2;

        textView.setText(" " + result);
        sharedPreferences.edit().putInt("storeresult" ,result).apply();
    }

    public void carpma (View view) {

        Integer number1 = Integer.parseInt(editTextNumber.getText().toString());
        Integer number2 = Integer.parseInt(editTextNumber2.getText().toString());

        int result = number1 * number2;

        textView.setText(" " + result);
        sharedPreferences.edit().putInt("storeresult" ,result).apply();
    }

    public void bolme (View view) {

        Integer number1 = Integer.parseInt(editTextNumber.getText().toString());
        Integer number2 = Integer.parseInt(editTextNumber.getText().toString());

        int result = number1 / number2;

        textView.setText(" " + result);
        sharedPreferences.edit().putInt("storeresult" ,result).apply();
    }


}