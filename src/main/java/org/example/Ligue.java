package org.example;

import java.util.ArrayList;
import java.util.List;

public class Ligue {
    private String nom;
    private List<Combattant> combattants;
    private List<Match> matchs;

    public Ligue(String nom) {
        this.nom = nom;
        this.combattants = new ArrayList<>();
        this.matchs = new ArrayList<>();
    }

    public void ajouterCombattant(Combattant combattant) {
        combattants.add(combattant);
    }

    public void ajouterMatch(Match match) {
        matchs.add(match);
    }

    public List<Match> getMatchsDe(String nomCombattant) {
        List<Match> result = new ArrayList<>();
        for (Match match : matchs) {
            if (match.combattant1.getNomCombattant().equals(nomCombattant) ||
                    match.combattant2.getNomCombattant().equals(nomCombattant)) {
                result.add(match);
            }
        }
        return result;
    }
}
