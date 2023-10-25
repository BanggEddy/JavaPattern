package models;

import interfaces.Observateur;

public class Etudiants extends Personnes implements Observateur{
    public Etudiants(int id, String nom, String prenom, String adresse, int cp, String ville) {
        super(id, nom, prenom, adresse, cp, ville);
    }

    public Etudiants(String nom) {
        super(0, nom, "", "", 0, "");
    }
    @Override
    public Etudiants clone() {
        return new Etudiants(id, nom, prenom, adresse, cp, ville);
    }
    @Override
    public void mettreAJour(Notes sujet) {
        Notes notes = (Notes) sujet;
        System.out.println("L'étudiant " + nom + " a eu la note de : " + notes.obtenirNote()+"/20");
    }
    
}