import models.Notes;
import models.Enseignants;
import models.Etudiants;
import java.util.Scanner;

import Views.GestionPersonnes;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Que souhaitez-vous faire ?");
        System.out.println("1. Ajouter une note");
        System.out.println("2. Ajouter une nouvelle personne");
        System.out.print("Choisissez une option (1 ou 2) : ");

        int choix = scanner.nextInt();

        if (choix == 1) {
        Notes sujet = new Notes();
        Etudiants etudiant1 = new Etudiants("Alice");
        Enseignants enseignant1 = new Enseignants("Smith");
        
        sujet.ajouterNotes(enseignant1);
        sujet.ajouterNotes(etudiant1);

        sujet.definirNote(15);
        } else if (choix == 2) {    
            System.out.println("Gestion des Personnes :");
            GestionPersonnes.main(args);
        } else {
            System.out.println("Option non valide.");
        }

        scanner.close();
    }
}
