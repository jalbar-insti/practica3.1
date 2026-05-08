package com.bancgestio.model;

/**
 * Representa un valor financer dins d'una cartera de valors.
 */
public class Valor {

    private String nom;
    private int numTitols;
    private double preuCotitzacio;

    public Valor(String nom, int numTitols, double preuCotitzacio) {
        this.nom = nom;
        this.numTitols = numTitols;
        this.preuCotitzacio = preuCotitzacio;
    }

    public String getNom() {
        return nom;
    }

    public int getNumTitols() {
        return numTitols;
    }

    public double getPreuCotitzacio() {
        return preuCotitzacio;
    }
}
