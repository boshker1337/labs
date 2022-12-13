package com.example.lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class BurgerCatalogACtv extends AppCompatActivity {
ArrayList<BurgerCatalog> burgers = new ArrayList<BurgerCatalog>();
ListView burgerList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger_catalog_actv);
        setData();
        burgerList = findViewById(R.id.burgers);
        BurgerCatalogAdapter burgerAdapter = new BurgerCatalogAdapter(this, R.layout.list_item, burgers);
        burgerList.setAdapter(burgerAdapter);
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                BurgerCatalog selectedBurger = (BurgerCatalog)parent.getItemAtPosition(position);
                Toast.makeText(BurgerCatalogACtv.this, selectedBurger.getName(), Toast.LENGTH_LONG).show();
            }
        };
        burgerList.setOnItemClickListener(itemClickListener);
    }

    private void setData() {
        burgers.add(new BurgerCatalog(R.drawable.beconburger, "Becon Burger", 6.56));
        burgers.add(new BurgerCatalog(R.drawable.fishburger, "Fish Burger", 6.56));
        burgers.add(new BurgerCatalog(R.drawable.chickenburger, "Chicken Burger", 7.45));
        burgers.add(new BurgerCatalog(R.drawable.goldburger, "Gold Burger", 9.54));
        burgers.add(new BurgerCatalog(R.drawable.beefburger, "Beef Burger", 5.32));
    }
}