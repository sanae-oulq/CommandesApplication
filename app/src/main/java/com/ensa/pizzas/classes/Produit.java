package com.ensa.pizzas.classes;

public class Produit {
    private int id;
    private String nom;
    private int ingredients;
    private int photo;
    private String duree;
    private String detailsingred;
    private String preparation;
    private String description;
    private int comp;

    public Produit(){}

    public Produit(String nom,int ingredients,int photo,String detailsingred,String duree,String preparation, String description){
        this.id = ++comp;
        this.nom=nom;
        this.ingredients=ingredients;
        this.photo=photo;
        this.detailsingred=detailsingred;
        this.duree=duree;
        this.preparation=preparation;
        this.description=description;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbringredients=" + ingredients +
                ", photo=" + photo +
                ", duree=" + duree +
                ", detailsingred='" + detailsingred + '\'' +
                ", preparation='" + preparation + '\'' +
                ", description='" + description +
                '}';
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree =duree;
    }

    public int getNbringredients() {
        return ingredients;
    }

    public void setNbringredients(int ingredients) {
        this.ingredients = ingredients;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetailsingred() {
        return detailsingred;
    }

    public void setDetailsingred(String detailsingred) {
        this.detailsingred = detailsingred;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

