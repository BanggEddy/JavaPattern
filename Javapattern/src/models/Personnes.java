package models;

import interfaces.Prototype;

public class Personnes implements Prototype {
    protected int id;
    protected String nom;
    protected String prenom;
    protected String adresse;
    protected int cp;
    protected String ville;

    public Personnes(int id, String nom,String prenom, String adresse, int cp, String ville) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.cp = cp;
        this.ville = ville;
    }  
    
    @Override
    public Personnes clone() {
        return new Personnes(id, nom, prenom, adresse, cp, ville);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }
    
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
    public int getCp() {
        return cp;
    }
    
    public void setCp(int cp) {
        this.cp = cp;
    }
    
    public String getVille() {
        return ville;
    }
    
    public void setVille(String ville) {
        this.ville = ville;
    }
}
