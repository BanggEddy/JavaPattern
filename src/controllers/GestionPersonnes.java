package controllers;

import java.util.Scanner;
import models.Enseignants;
import models.Etudiants;

public class GestionPersonnes {

    public static void main(String[] args) {
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

            // Affichages
            System.out.println("Informations de l'étudiant :");
            System.out.println("Nom : " + etudiant.getNom() + "   Prénom : " + etudiant.getPrenom());
            
        } else if (role.equals("enseignant")) {
            Enseignants enseignant = new Enseignants(1, "", "", "", 0, "", "");
            System.out.println("Veuillez saisir les informations de l'enseignant :");
            System.out.print("Nom : ");
            enseignant.setNom(scanner.next());
            System.out.print("Prénom : ");
            enseignant.setPrenom(scanner.next());

            // Affichages
            System.out.println("Informations de l'enseignant :");
            System.out.println("Nom : " + enseignant.getNom() + "  Prénom : " + enseignant.getPrenom());
        } else {
            System.out.println("Rôle non reconnu.");
        }

        // Fermez le scanner
        scanner.close();
    }
}
