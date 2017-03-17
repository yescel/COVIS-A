package com.tallerandroid.covis_a;

import android.widget.ImageView;

/**
 * Created by yesce on 16/03/2017.
 */

public class Publicacion {

    String usuario;
    String proyecto;
    String descripcion;
    ImageView imagenUsuario;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getProyecto(){
        return  proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ImageView getImagenUsuario(){
        return  imagenUsuario;
    }

    public void setImagenUsuario(ImageView imagenUsuario) {
        this.imagenUsuario = imagenUsuario;
    }
}
