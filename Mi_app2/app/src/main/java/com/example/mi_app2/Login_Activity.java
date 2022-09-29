package com.example.mi_app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {
    Button button3;
    Button button4;
    EditText usuario;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usuario = (EditText) findViewById(R.id.textousuario);
        password = (EditText) findViewById(R.id.textopassword);

        button3=(Button) findViewById(R.id.volver);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent button3 = new Intent(Login_Activity.this, MainActivity.class);
                startActivity(button3);
            }
        });

        button4=(Button) findViewById(R.id.ingresar);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!usuario.getText().toString().isEmpty() & !password.getText().toString().isEmpty()){
                    Intent button4 = new Intent(Login_Activity.this, Principal.class);
                    startActivity(button4);
                }else{
                    Toast.makeText(Login_Activity.this, "Debes ingresar los datos de acceso", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}