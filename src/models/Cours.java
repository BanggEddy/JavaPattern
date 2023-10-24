package models;

public class Cours {
    private int id;
    private String matieres;
    private String horaire;
    private String activite;

    public Cours(int id, String matieres, String horaire, String activite) {
        this.id = id;
        this.matieres = matieres;
        this.horaire = horaire;
        this.activite = activite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatieres() {
        return matieres;
    }

    public void setMatieres(String matieres) {
        this.matieres = matieres;
    }

    public String getHoraire() {
        return horaire;
    }

    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }

    public String getActivite() {
        return activite;
    }

    public void setActivite(String activite) {
        this.activite = activite;
    }


}
