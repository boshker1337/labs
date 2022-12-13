package com.example.lab7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Animation topAnimation, bottomAnimation;
    ImageView image;
    Button getStarted;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topAnimation = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnimation = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        image =(ImageView) findViewById(R.id.imgLogo);
        getStarted =(Button)  findViewById(R.id.bthStarted);
        image.setAnimation(topAnimation);
        getStarted.setAnimation(bottomAnimation);
        getStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intnent = new Intent (MainActivity.this, CatalogActv.class);
                startActivity(intnent);
            }
        });

    }
}