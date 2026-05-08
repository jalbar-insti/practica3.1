package com.bancgestio.model;

import java.time.LocalDate;

/**
 * Representa un compte a termini del banc.
 */
public class CompteTermini extends Compte {

    private int numMesos;

    public CompteTermini(String numCompte, LocalDate dataObertura, double saldo, double tipusInteres, Client client, int numMesos) {
        super(numCompte, dataObertura, saldo, tipusInteres, client);
        this.numMesos = numMesos;
    }

    public int getNumMesos() {
        return numMesos;
    }

    public void setNumMesos(int numMesos) {
        this.numMesos = numMesos;
    }

    @Override
    public void calcularInteres() {
        // Lògica de càlcul d'interès específic per compte a termini
    }
}
