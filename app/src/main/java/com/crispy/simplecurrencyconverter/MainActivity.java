package com.crispy.simplecurrencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertClicked(View view) {
        EditText dollarField = (EditText) findViewById(R.id.moneyTextField);
        Double dollarAmount = Double.parseDouble(dollarField.getText().toString());
        Double pound = 0.695889;

        Toast.makeText(getApplicationContext(), "£" + (dollarAmount * pound), Toast.LENGTH_LONG).show();
    }

}
