package com.example.festejos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    Resources res5;
    Resources res6;
    Resources res7;
    ImageView imagen5;
    ImageView imagen6;
    ImageView imagen7;
    Drawable drawable5;
    Drawable drawable6;
    Drawable drawable7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        res5 = getResources();
        drawable5 = res5.getDrawable(R.drawable.cmesa,getTheme());

        imagen5 = (ImageView) findViewById(R.id.imageView5);
        imagen5.setImageDrawable(drawable5);

        res6 = getResources();
        drawable6 = res6.getDrawable(R.drawable.arcos,getTheme());

        imagen6 = (ImageView) findViewById(R.id.imageView6);
        imagen6.setImageDrawable(drawable6);


        res7 = getResources();
        drawable7 = res7.getDrawable(R.drawable.cocteles,getTheme());

        imagen7 = (ImageView) findViewById(R.id.imageView7);
        imagen7.setImageDrawable(drawable7);



    }
}