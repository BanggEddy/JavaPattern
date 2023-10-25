package interfaces;

public interface Sujet {
    void ajouterNotes(Observateur observateur);
    void supprimerNotes(Observateur observateur);
    void notifierObservateurs();
}
