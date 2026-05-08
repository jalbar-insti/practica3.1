package com.bancgestio.model;

import java.time.LocalDate;

/**
 * Representa un fons d'inversió associat a un compte corrent.
 */
public class FonsInversio {

    private String nom;
    private double importInversio;
    private double rendibilitat;
    private LocalDate dataObertura;
    private LocalDate dataVenciment;

    public FonsInversio(String nom, double importInversio, double rendibilitat, LocalDate dataObertura, LocalDate dataVenciment) {
        this.nom = nom;
        this.importInversio = importInversio;
        this.rendibilitat = rendibilitat;
        this.dataObertura = dataObertura;
        this.dataVenciment = dataVenciment;
    }

    public String getNom() {
        return nom;
    }

    public double getImportInversio() {
        return importInversio;
    }

    public double getRendibilitat() {
        return rendibilitat;
    }

    public LocalDate getDataObertura() {
        return dataObertura;
    }

    public LocalDate getDataVenciment() {
        return dataVenciment;
    }
}
