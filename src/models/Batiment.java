package models;

public class Batiment {
    private int id;
    private String nom;
    private String adresse;
    private int cp;

    public Batiment(int id, String nom, String adresse, int cp) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.cp = cp;
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
}
