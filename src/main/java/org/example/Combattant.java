package org.example;

import java.util.ArrayList;
import java.util.List;

public class Combattant {
    private String id;
    private String nom;
    private String prenom;
    private String nomCombattant;
    private double poids;
    private List<String> titres;

    private int victoires;
    private int defaites;
    private int egalites;

    public Combattant(String id, String nom, String prenom, String nomCombattant, double poids) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomCombattant = nomCombattant;
        this.poids = poids;
        this.titres = new ArrayList<>();
        this.victoires = 0;
        this.defaites = 0;
        this.egalites = 0;
    }

    public void ajouterTitre(String titre) {
        titres.add(titre);
    }
    public void ajouterVictoire() {
        victoires++;
    }
    public void ajouterDefaite() {
        defaites++;
    }
    public void ajouterEgalite() {
        egalites++;
    }

    public String getNomCombattant() {
        return nomCombattant;
    }
    public List<String> getTitres() {
        return titres;
    }

    @Override
    public String toString() {
        return nomCombattant + " (Victoires:" + victoires + " Defaites:" + defaites + " Egalités:" + egalites + ")";
    }
}
