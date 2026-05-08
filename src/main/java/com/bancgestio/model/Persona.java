package com.bancgestio.model;

/**
 * Classe abstracta que representa una persona dins del sistema bancari.
 */
public abstract class Persona {

    private String dni;
    private String nom;
    private String adreca;
    private String telefon;

    public Persona(String dni, String nom, String adreca, String telefon) {
        this.dni = dni;
        this.nom = nom;
        this.adreca = adreca;
        this.telefon = telefon;
    }

    public String getDni() {
        return dni;
    }

    public String getNom() {
        return nom;
    }

    public String getAdreca() {
        return adreca;
    }

    public String getTelefon() {
        return telefon;
    }
}
