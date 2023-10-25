package models;

import interfaces.Observateur;

public class Enseignants extends Personnes implements Observateur{
    private String matieres;

    public Enseignants(int id, String nom, String prenom, String adresse, int cp, String ville, String matieres) {
        super(id, nom, prenom, adresse, cp, ville);
        this.matieres = matieres;
    }

    public Enseignants(String nom) {
        super(0, nom, "", "", 0, "");
    }
    public String getMatieres() {
        return matieres;
    }

    public void setMatieres(String matieres) {
        this.matieres = matieres;
    }

    @Override
    public Enseignants clone() {
        return new Enseignants(id, nom, prenom, adresse, cp, ville, matieres);
    }
    @Override
    public void mettreAJour(Notes sujet) {
        System.out.println("L'enseignant " + nom + " a ajouté une note." );
    }
}
