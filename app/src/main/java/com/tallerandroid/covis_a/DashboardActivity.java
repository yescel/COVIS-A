package com.tallerandroid.covis_a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class DashboardActivity extends AppCompatActivity {
    ListView lvPublicaciones;
    AdaptadorLista adaptadorLista;
    ArrayList<Publicacion> publiciones;
    Publicacion p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        publiciones = new ArrayList<>();
        p = new Publicacion();
        p.setUsuario("Yessica");
        p.setProyecto("Reforestacion laguito");
        p.setDescripcion("Plantaremos arboles en las instalaciones del laguito, apuntense! ;)");

        publiciones.add(p);

        lvPublicaciones = (ListView) findViewById(R.id.lvPublicaciones);
        adaptadorLista = new AdaptadorLista(this, publiciones);

        lvPublicaciones.setAdapter(adaptadorLista);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);

        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();//obtenemos el id del item que le dimos clic en la barra de menu

        //noinspection SimplifiableIfStatement
        if (id == R.id.Perfil) { //podemos hacer un switch o varios activity
            Intent intent = new Intent(DashboardActivity.this, PerfilActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
