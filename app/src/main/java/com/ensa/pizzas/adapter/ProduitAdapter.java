package com.ensa.pizzas.adapter;


import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ensa.pizzas.classes.Produit;

import java.util.List;

import com.ensa.pizzas.R;


public  class ProduitAdapter extends BaseAdapter {
    private List<Produit> prods;
    private LayoutInflater inflater;

    public ProduitAdapter(List<Produit> prods, Activity activity) {
        this.prods = prods;
        this.inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return prods.size();
    }


    @Override
    public Object getItem(int position) {
        return prods.get(position);
    }

    @Override
    public long getItemId(int position) {
        return prods.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
            convertView = inflater.inflate(R.layout.item, null);
        TextView nom = convertView.findViewById(R.id.nom);
        TextView nbringredients = convertView.findViewById(R.id.nbringredients);
        ImageView photo = (ImageView) convertView.findViewById(R.id.photo);
        TextView id = convertView.findViewById(R.id.id);
        //TextView detailsingred = convertView.findViewById(R.id.detailsingred);
        TextView duree = convertView.findViewById(R.id.duree);
        //TextView preparation = convertView.findViewById(R.id.preparation);
        //TextView description = convertView.findViewById(R.id.description);


       nom.setText(prods.get(position).getNom());
        nbringredients.setText(prods.get(position).getNbringredients()+"");
        //detailsingred.setText(produits.get(position).getDetailsingred()+"");
        duree.setText(prods.get(position).getDetailsingred()+"");
        //preparation.setText(produits.get(position).getPreparation()+"");
        //description.setText(produits.get(position).getDescription()+"");
        photo.setImageResource(prods.get(position).getPhoto());
        id.setText(prods.get(position).getId()+"");
        return convertView;
    }
}
