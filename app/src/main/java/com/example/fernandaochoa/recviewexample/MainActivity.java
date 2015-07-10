package com.example.fernandaochoa.recviewexample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Inicializar Animes
        List items = new ArrayList();

        items.add(new EstructuraDatos(R.mipmap.ninja, "Fernanda Ochoa", "Cinta Negra"));
        items.add(new EstructuraDatos(R.mipmap.ninja, "Salvador :D", "Cinta Negra"));
        items.add(new EstructuraDatos(R.mipmap.ninja, "Sebastian Gaona", "No Hay Cinta Laptop Sucia"));
        items.add(new EstructuraDatos(R.mipmap.ninja, "Emilio :D", "Cinta Negra"));
        items.add(new EstructuraDatos(R.mipmap.ninja, "Gerardo :P", "Cinta Negra"));
        items.add(new EstructuraDatos(R.mipmap.ninja, "Angel Gladin", "Cinta Negra"));
        items.add(new EstructuraDatos(R.mipmap.ninja, "Francisco Guzman", "Cinta Roja"));
        items.add(new EstructuraDatos(R.mipmap.ninja, "Javier Calderon", "Cinta Roja"));
        items.add(new EstructuraDatos(R.mipmap.ninja, "Luisa Andrino", "Cinta Roja"));
        items.add(new EstructuraDatos(R.mipmap.ninja, "Salguero", "Cinta Roja"));
        items.add(new EstructuraDatos(R.mipmap.ninja, "Rosita Malverde", "Cinta Roja"));
        items.add(new EstructuraDatos(R.mipmap.ninja, "Melvin Hdz", "Cinta Roja"));


        // Obtener el Recycler
        recycler = (RecyclerView) findViewById(R.id.reciclador);
        recycler.setHasFixedSize(true);

        // Usar un administrador para LinearLayout
        lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);

        // Crear un nuevo adaptador
        adapter = new EstructuraAdapter(items);
        recycler.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
