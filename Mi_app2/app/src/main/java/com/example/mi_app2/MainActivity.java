package com.example.mi_app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=(Button) findViewById(R.id.Login);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent button1 = new Intent(MainActivity.this, Login_Activity.class);
                startActivity(button1);
            }
        });

        button2=(Button) findViewById(R.id.Registrar);
        button2.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View view) {
                Intent button2 = new Intent(MainActivity.this, Registrar.class);
                startActivity(button2);
            }
        });

    }


}