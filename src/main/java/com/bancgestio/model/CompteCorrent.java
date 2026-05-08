package com.bancgestio.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Representa un compte corrent del banc.
 */
public class CompteCorrent extends Compte {

    private final List<TargetaCredit> targetes = new ArrayList<>();
    private final List<FonsInversio> fons = new ArrayList<>();
    private final List<CarteraValors> carteres = new ArrayList<>();

    public CompteCorrent(String numCompte, java.time.LocalDate dataObertura, double saldo, double tipusInteres, Client client) {
        super(numCompte, dataObertura, saldo, tipusInteres, client);
    }

    public List<TargetaCredit> getTargetes() {
        return Collections.unmodifiableList(targetes);
    }

    public List<FonsInversio> getFons() {
        return Collections.unmodifiableList(fons);
    }

    public List<CarteraValors> getCarteres() {
        return Collections.unmodifiableList(carteres);
    }

    public void addTargeta(TargetaCredit targeta) {
        if (targeta == null) {
            throw new IllegalArgumentException("La targeta no pot ser nul");
        }
        targetes.add(targeta);
    }

    public void addFons(FonsInversio fonsInversio) {
        if (fonsInversio == null) {
            throw new IllegalArgumentException("El fons d'inversio no pot ser nul");
        }
        fons.add(fonsInversio);
    }

    public void addCartera(CarteraValors cartera) {
        if (cartera == null) {
            throw new IllegalArgumentException("La cartera no pot ser nul");
        }
        carteres.add(cartera);
    }

    @Override
    public void calcularInteres() {
        // Lògica de càlcul d'interès específic per compte corrent
    }
}
