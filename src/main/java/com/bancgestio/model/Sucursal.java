package com.bancgestio.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Representa una sucursal del banc.
 */
public class Sucursal {

    private String identificador;
    private String adreca;
    private final List<Empleat> empleats = new ArrayList<>();

    public Sucursal(String identificador, String adreca) {
        this.identificador = identificador;
        this.adreca = adreca;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getAdreca() {
        return adreca;
    }

    public List<Empleat> getEmpleats() {
        return Collections.unmodifiableList(empleats);
    }

    public void addEmpleat(Empleat empleat) {
        if (empleat == null) {
            throw new IllegalArgumentException("L'empleat no pot ser nul");
        }
        empleats.add(empleat);
    }
}
