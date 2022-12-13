package com.example.lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.lang.reflect.Constructor;

public class CatalogActv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog_actv);
        Button constructSubway  = (Button) findViewById(R.id.constructSubway);
    }
    public void burgerCatalog(View view){
        Intent intent = new Intent(CatalogActv.this, BurgerCatalogACtv.class);
        startActivity(intent);
    }
}