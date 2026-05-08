package com.bancgestio.model;

import java.time.LocalDate;

/**
 * Classe abstracta que representa un compte bancari general.
 */
public abstract class Compte {

    private String numCompte;
    private LocalDate dataObertura;
    private double saldo;
    private double tipusInteres;
    private Client client;

    public Compte(String numCompte, LocalDate dataObertura, double saldo, double tipusInteres, Client client) {
        this.numCompte = numCompte;
        this.dataObertura = dataObertura;
        this.saldo = saldo;
        this.tipusInteres = tipusInteres;
        this.client = client;
    }

    public String getNumCompte() {
        return numCompte;
    }

    public LocalDate getDataObertura() {
        return dataObertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTipusInteres() {
        return tipusInteres;
    }

    public Client getClient() {
        return client;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Calcular l'interès específic de cada tipus de compte.
     */
    public abstract void calcularInteres();
}
