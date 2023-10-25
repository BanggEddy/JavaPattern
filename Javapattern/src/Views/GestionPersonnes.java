package Views;

import java.util.Scanner;
import models.Enseignants;
import models.Etudiants;

public class GestionPersonnes {

    private static GestionPersonnes instance = null;

    private GestionPersonnes() {
    }

    public static GestionPersonnes getInstance() {
        if (instance == null) {
            instance = new GestionPersonnes();
        }
        return instance;
    }

    public void gérerPersonnes() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Est-ce que vous êtes un étudiant ou un enseignant ? (etudiant/enseignant)");
        String role = scanner.next().toLowerCase();

        if (role.equals("etudiant")) {
            Etudiants etudiant = new Etudiants(1, "", "", "", 0, "");
            System.out.println("Veuillez saisir les informations de l'étudiant :");
            System.out.print("Nom : ");
            etudiant.setNom(scanner.next());
            System.out.print("Prénom : ");
            etudiant.setPrenom(scanner.next());

            System.out.println("L'étudiant :"+ etudiant.getNom() + " "+ etudiant.getPrenom()+ ", a été ajouté avec succès.");
        } else if (role.equals("enseignant")) {
            Enseignants enseignant = new Enseignants(1, "", "", "", 0, "", "");
            System.out.println("Veuillez saisir les informations de l'enseignant :");
            System.out.print("Nom : ");
            enseignant.setNom(scanner.next());
            System.out.print("Prénom : ");
            enseignant.setPrenom(scanner.next());

            System.out.println("L'enseignant " + enseignant.getNom()+" " + enseignant.getPrenom() + "a été ajouté avec succès" );
        } else {
            System.out.println("Rôle non reconnu.");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        GestionPersonnes gestionPersonnes = GestionPersonnes.getInstance();
        gestionPersonnes.gérerPersonnes();
    }
}
