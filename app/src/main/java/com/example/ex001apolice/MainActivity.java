package com.example.ex001apolice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtName;
    EditText txtAge;
    EditText txtSex;
    EditText txtCarValue;
    Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName = findViewById(R.id.txtName);
        txtAge = findViewById(R.id.txtAge);
        txtSex = findViewById(R.id.txtSex);
        txtCarValue = findViewById(R.id.txtCarValue);
        btnCalculate = findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generatePolicyValue(view);
            }
        });
    }

    public void generatePolicyValue (View view) {
        Apolice apolice = new Apolice(
                txtName.getText().toString(),
                Integer.parseInt(txtAge.getText().toString()),
                txtSex.getText().charAt(0),
                Double.parseDouble(txtCarValue.getText().toString())
        );
        double value = apolice.calculateVale();
        Toast.makeText(this, "Valor: " + value, Toast.LENGTH_LONG).show();
    }
}