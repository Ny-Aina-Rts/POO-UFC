package org.example;

import java.time.LocalDate;

public abstract class Match {
    protected String id;
    protected LocalDate date;
    protected String lieu;
    protected Combattant combattant1;
    protected Combattant combattant2;

    protected int points1;
    protected int points2;

    public Match(String id, LocalDate date, String lieu, Combattant c1, Combattant c2) {
        this.id = id;
        this.date = date;
        this.lieu = lieu;
        this.combattant1 = c1;
        this.combattant2 = c2;
    }

    public void setPoints(int p1, int p2) {
        this.points1 = p1;
        this.points2 = p2;
    }

    public abstract void terminer();
}
