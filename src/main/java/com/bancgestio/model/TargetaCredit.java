package com.bancgestio.model;

import java.time.LocalDate;

/**
 * Representa una targeta de crèdit associada a un compte corrent.
 */
public class TargetaCredit {

    private String tipus;
    private String numero;
    private String titular;
    private LocalDate dataCaducitat;

    public TargetaCredit(String tipus, String numero, String titular, LocalDate dataCaducitat) {
        this.tipus = tipus;
        this.numero = numero;
        this.titular = titular;
        this.dataCaducitat = dataCaducitat;
    }

    public String getTipus() {
        return tipus;
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public LocalDate getDataCaducitat() {
        return dataCaducitat;
    }
}
