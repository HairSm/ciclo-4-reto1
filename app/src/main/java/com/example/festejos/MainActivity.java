package com.example.festejos;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Resources res4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        res4 = getResources();
        Drawable drawable = res4.getDrawable(R.drawable.logo ,getTheme());

        ImageView imagenLogo = (ImageView) findViewById(R.id.logo1);
        imagenLogo.setImageDrawable(drawable);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuopciones, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        int id = item.getItemId();
        if (id== R.id.opcion1){
            Toast.makeText( this, "ACABAS DE ENTRAR A VER NUESTROS PRODUCTOS", Toast.LENGTH_LONG).show();

            Intent segundaPantalla = new Intent(getApplicationContext(), MainActivity2.class);
            startActivity(segundaPantalla);
        }
        if (id== R.id.opcion2){
            Toast.makeText( this, "ACABAS DE ENTRAR A NUESTROS SERVICIOS", Toast.LENGTH_LONG).show();

            Intent terceraPantalla = new Intent(getApplicationContext(), MainActivity3.class);
            startActivity(terceraPantalla);
        }
        if (id== R.id.opcion3){
            Toast.makeText( this, "ESTE ES NUESTRO CONTACTO", Toast.LENGTH_LONG).show();

            Intent cuartaPantalla = new Intent(getApplicationContext(), MainActivity4.class);
            startActivity(cuartaPantalla);
        }
        return super.onOptionsItemSelected(item);
    }
}