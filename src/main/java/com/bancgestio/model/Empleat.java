package com.bancgestio.model;

/**
 * Representa un empleat del banc.
 */
public class Empleat extends Persona {

    private Sucursal sucursal;

    public Empleat(String dni, String nom, String adreca, String telefon, Sucursal sucursal) {
        super(dni, nom, adreca, telefon);
        this.sucursal = sucursal;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
}
