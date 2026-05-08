package com.bancgestio.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Representa un client del banc.
 */
public class Client extends Persona {

    private final List<Compte> comptes = new ArrayList<>();

    public Client(String dni, String nom, String adreca, String telefon) {
        super(dni, nom, adreca, telefon);
    }

    /**
     * Retorna la llista de comptes associats al client.
     */
    public List<Compte> getComptes() {
        return Collections.unmodifiableList(comptes);
    }

    /**
     * Afegeix un compte al client.
     */
    public void addCompte(Compte compte) {
        if (compte == null) {
            throw new IllegalArgumentException("El compte no pot ser nul");
        }
        comptes.add(compte);
    }
}
