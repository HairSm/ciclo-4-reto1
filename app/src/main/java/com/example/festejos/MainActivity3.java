package com.example.festejos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {
    Resources res;
    Resources res2;
    Resources res3;
    Drawable drawable;
    Drawable drawable2;
    Drawable drawable3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        res = getResources();
         drawable = res.getDrawable(R.drawable.dulces ,getTheme());

        ImageView imagen1 = (ImageView) findViewById(R.id.imageView);
        imagen1.setImageDrawable(drawable);

        res2 = getResources();
         drawable2 = res2.getDrawable(R.drawable.salones ,getTheme());

        ImageView imagen2 = (ImageView) findViewById(R.id.imageView2);
        imagen2.setImageDrawable(drawable2);

        res3 = getResources();
        drawable3 = res3.getDrawable(R.drawable.tematica ,getTheme());

        ImageView imagen3 = (ImageView) findViewById(R.id.imageView3);
        imagen3.setImageDrawable(drawable3);
    }
}