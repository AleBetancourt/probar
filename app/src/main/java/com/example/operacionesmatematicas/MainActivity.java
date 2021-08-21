package com.example.operacionesmatematicas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = (EditText) findViewById(R.id.num1);
        n2 = (EditText) findViewById(R.id.num2);

        Button suma = (Button) findViewById(R.id.btnsuma);
        Button resta = (Button) findViewById(R.id.btnresta);
        Button mult = (Button) findViewById(R.id.btnmul);
        Button div = (Button) findViewById(R.id.btndiv);


        suma.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                float num1 = new Float (n1.getText().toString());
                float num2 = new Float (n2.getText().toString());
                res.setText("Resultado: "+ (num1+num2));

            }
        });

        resta.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                float num1 = new Float (n1.getText().toString());
                float num2 = new Float (n2.getText().toString());
                res.setText("Resultado: "+ (num1-num2));

            }
        });


        mult.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                float num1 = new Float (n1.getText().toString());
                float num2 = new Float (n2.getText().toString());
                res.setText("Resultado: "+ (num1*num2));

            }
        });

        div.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                float num1 = new Float (n1.getText().toString());
                float num2 = new Float (n2.getText().toString());
                res.setText("Resultado: "+ (num1/num2));

            }
        });

    }
    public void sumar (View view){
        Intent btnsumar = new Intent(this,Pantalla2.class) ;
        startActivity(btnsumar);

    }

    public void restar (View view){
        Intent btnsumar = new Intent(this,Pantalla2.class) ;
        startActivity(btn);

    }
}