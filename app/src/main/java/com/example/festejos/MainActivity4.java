package com.example.festejos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity4 extends AppCompatActivity {
    Resources res4;
    Drawable drawable4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        res4 = getResources();
        drawable4 = res4.getDrawable(R.drawable.edificio ,getTheme());

        ImageView imagen4 = (ImageView) findViewById(R.id.imageView4);
        imagen4.setImageDrawable(drawable4);
    }
}