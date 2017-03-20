package com.tallerandroid.covis_a;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.ListView;

import java.util.ArrayList;

public class DashboardActivity extends AppCompatActivity {
    ListView lvPublicaciones;
    AdaptadorLista adaptadorLista;
    ArrayList<Publicacion> publiciones;
    Publicacion p, p1, p3;

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

        p1 = new Publicacion();
        p1.setUsuario("Scarleth");
        p1.setProyecto("Adopcion de arboles");
        p1.setDescripcion("Publica las plantas que no caben en tu casa :3");
        publiciones.add(p1);

        p3 = new Publicacion();
        p3.setUsuario("Eric");
        p3.setProyecto("Reporte de animales");
        p3.setDescripcion("Reporte de perritos perdidos :( ");
        publiciones.add(p3);

        lvPublicaciones = (ListView) findViewById(R.id.lvPublicaciones);
        adaptadorLista = new AdaptadorLista(this, publiciones);

        lvPublicaciones.setAdapter(adaptadorLista);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);

        return true;
    }
}
