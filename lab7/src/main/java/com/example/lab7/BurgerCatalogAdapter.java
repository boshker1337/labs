package com.example.lab7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import org.w3c.dom.Text;

import java.util.List;

public class BurgerCatalogAdapter extends ArrayAdapter<BurgerCatalog> {
    private LayoutInflater inflater;
    private int layot;
    private List<BurgerCatalog> burgers;

    public BurgerCatalogAdapter(@NonNull Context context, int resource, @NonNull List<BurgerCatalog> objects) {
        super(context, resource, objects);
        this.burgers = burgers;
        this.layot = layot;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View contentView, ViewGroup parent){
        View view = inflater.inflate(this.layot,parent,false);
        ImageView image =  view.findViewById(R.id.imgBurger);
        TextView name =  view.findViewById(R.id.nameProduct);
        TextView cost =  view.findViewById(R.id.txvCost);
        BurgerCatalog burger = burgers.get(position);
        image.setImageResource(burger.getImage());
        name.setText(burger.getName());
        cost.setText(burger.getCost().toString());
        return view;
    }
}
