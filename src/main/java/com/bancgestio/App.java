package com.bancgestio;

import java.time.LocalDate;

import com.bancgestio.model.Client;
import com.bancgestio.model.CompteCorrent;
import com.bancgestio.model.Sucursal;

/**
 * Classe principal del projecte per executar una demostració mínima.
 */
public class App {

    public static void main(String[] args) {
        Sucursal sucursal = new Sucursal("S001", "Carrer de l'Exemple, 10");
        Client client = new Client("12345678A", "Anna Pons", "Carrer Major, 5", "600123456");
        CompteCorrent compteCorrent = new CompteCorrent("ES000111222333", LocalDate.now(), 1200.0, 0.01, client);

        System.out.println("Client creat: " + client.getNom());
        System.out.println("Compte: " + compteCorrent.getNumCompte());
        System.out.println("Sucursal: " + sucursal.getIdentificador());
    }
}
