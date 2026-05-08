package com.bancgestio.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Representa una cartera de valors amb una composició de valors financers.
 */
public class CarteraValors {

    private final List<Valor> valors = new ArrayList<>();

    public List<Valor> getValors() {
        return Collections.unmodifiableList(valors);
    }

    public void addValor(Valor valor) {
        if (valor == null) {
            throw new IllegalArgumentException("El valor no pot ser nul");
        }
        valors.add(valor);
    }
}
