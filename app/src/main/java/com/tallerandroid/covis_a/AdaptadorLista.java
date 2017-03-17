package com.tallerandroid.covis_a;

import android.widget.ArrayAdapter;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by yesce on 16/03/2017.
 */



public class AdaptadorLista extends ArrayAdapter {


    Activity activity;
    ArrayList<Publicacion> publicaciones;

    public AdaptadorLista(Activity context, ArrayList<Publicacion> publicaciones){
        super(context, R.layout.item_listview, publicaciones);
        this.activity = context;
        this.publicaciones = publicaciones;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        ViewHolder vh = null;

        if (convertView == null) {
            LayoutInflater inflater = activity.getLayoutInflater();
            convertView = inflater.inflate(R.layout.item_listview, null);

            vh = new ViewHolder();
            vh.mImageViewUsuario = (ImageView)convertView.findViewById(R.id.ivUsuario);
            vh.mTextViewUsuario = (TextView) convertView.findViewById(R.id.tvUsuario);
            vh.mTextViewProyecto = (TextView) convertView.findViewById(R.id.tvProyecto);
            vh.mTextViewDescripcion = (TextView) convertView.findViewById(R.id.tvDescripcion);

            convertView.setTag(vh);

        } else {
            vh = (ViewHolder) convertView.getTag();
        }

        //vh.mImageViewUsuario.setImageDrawable(publicaciones.get(position).getImagenUsuario().getDrawable());
        vh.mTextViewUsuario.setText(publicaciones.get(position).getUsuario());
        vh.mTextViewProyecto.setText(publicaciones.get(position).getProyecto() + "");
        vh.mTextViewDescripcion.setText(publicaciones.get(position).getDescripcion() + "");

        return convertView;
    }

    static class ViewHolder{
        ImageView mImageViewUsuario;
        TextView mTextViewUsuario;
        TextView mTextViewProyecto;
        TextView mTextViewDescripcion;
    }
}
