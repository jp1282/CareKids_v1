package com.example.mi_app2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Principal extends AppCompatActivity {
    Button button6;

    String[] contactos = {"Llamame","S.O.S","Saliendo del Metro","Bajando de la Micro","Ayuda"};
    List<listadoelementos> elements;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        //Spinner
        Spinner Contactos = (Spinner) findViewById(R.id.spinnercontacto);
        ArrayAdapter aa= new ArrayAdapter(this, android.R.layout.simple_spinner_item,contactos);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Contactos.setAdapter(aa);

        init();

        button6=(Button) findViewById(R.id.btnEnviar);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Principal.this, "Mensaje Enviado", Toast.LENGTH_SHORT).show();
                }
            });

        init();
        }


    public void init(){
        elements = new ArrayList<>();
        elements.add(new listadoelementos("black","Papa","+56942366512"));
        elements.add(new listadoelementos("black","Mama","+56922352164"));


        listadoadaptador listado = new listadoadaptador(elements, this);
        RecyclerView recycler = findViewById(R.id.recycler1);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(listado);
    }

}