package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import interfaces.Observateur;
import interfaces.Sujet;

public class Notes implements Sujet{
    private int id;
    private int etudiantId; 
    private String matieres;
    private float coefs;
    private float notes;
    private LocalDateTime date;
    private List<Observateur> observateurs = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEtudiantId() {
        return etudiantId;
    }

    public void setEtudiantId(int etudiantId) {
        this.etudiantId = etudiantId;
    }

    public String getMatieres() {
        return matieres;
    }

    public void setMatieres(String matieres) {
        this.matieres = matieres;
    }

    public Float getCoefs() {
        return coefs;
    }

    public void setCoefs(Float coefs) {
        this.coefs = coefs;
    }

    public Float getNotes() {
        return notes;
    }

    public void setNotes(Float notes) {
        this.notes = notes;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    //Méthodes: 
    @Override
    public void ajouterNotes(Observateur observateur) {
        observateurs.add(observateur);
    }

    @Override
    public void supprimerNotes(Observateur observateur) {
        observateurs.remove(observateur);
    }

    @Override
    public void notifierObservateurs() {
        for (Observateur observateur : observateurs) {
            observateur.mettreAJour(this);
        }
    }


    public void definirNote(float notes) {
        this.notes = notes;
        notifierObservateurs();
    }

    public float obtenirNote() {
        return notes;
    }
}
