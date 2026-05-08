package com.bancgestio.model;

import java.time.LocalDate;

/**
 * Factoria per crear comptes bancaris segons el tipus sol·licitat.
 */
public class FactoriaComptes {

    public static Compte crearCompte(String tipus, String numCompte, LocalDate dataObertura, double saldo, double tipusInteres, Client client, int numMesos) {
        if (tipus == null || client == null) {
            throw new IllegalArgumentException("El tipus i el client són obligatoris");
        }

        if (tipus.equalsIgnoreCase("corrent")) {
            return new CompteCorrent(numCompte, dataObertura, saldo, tipusInteres, client);
        }
        if (tipus.equalsIgnoreCase("termini")) {
            return new CompteTermini(numCompte, dataObertura, saldo, tipusInteres, client, numMesos);
        }

        throw new IllegalArgumentException("Tipus de compte desconegut: " + tipus);
    }
}
