package org.example;

import java.time.LocalDate;

public class MatchPourTitre extends Match {

    private String titre;

    public MatchPourTitre(String id, LocalDate date, String lieu, Combattant c1, Combattant c2, String titre) {
        super(id, date, lieu, c1, c2);
        this.titre = titre;
    }

    @Override
    public void terminer() {
        if (points1 > points2) {
            combattant1.ajouterVictoire();
            combattant2.ajouterDefaite();
            combattant1.ajouterTitre(titre);
        } else if (points2 > points1) {
            combattant2.ajouterVictoire();
            combattant1.ajouterDefaite();
            combattant2.ajouterTitre(titre);
        } else {
            combattant1.ajouterEgalite();
            combattant2.ajouterEgalite();
        }
    }
}
