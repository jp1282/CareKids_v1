package com.example.mi_app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registrar extends AppCompatActivity {
    Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        button5=(Button) findViewById(R.id.guardar);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent button5 = new Intent(Registrar.this, Login_Activity.class);
                startActivity(button5);
            }
        });
    }
}