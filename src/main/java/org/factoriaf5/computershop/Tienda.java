package org.factoriaf5.computershop;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String nombre;
    private String propietario;
    private String identificadorTributario;
    private List<Computador> computadores;

    public Tienda(String nombre, String propietario, String identificadorTributario) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.identificadorTributario = identificadorTributario;
        this.computadores = new ArrayList<>();
    }

    public void agregarComputador(Computador computador) {
        computadores.add(computador);
        System.out.println("Computador " + computador.getMarca() + " agregado a la tienda.");
    }

    public void eliminarComputador(String marca) {
        for (Computador computador : computadores) {
            if (computador.getMarca().equalsIgnoreCase(marca)) {
                computadores.remove(computador);
                System.out.println("Computador " + marca + " eliminado de la tienda.");
                return;
            }
        }
        System.out.println("No se encontró ningún computador con la marca " + marca + ".");
    }

    public Computador buscarComputador(String marca) {
        for (Computador computador : computadores) {
            if (computador.getMarca().equalsIgnoreCase(marca)) {
                System.out.println("Computador encontrado: " + computador);
                return computador;
            }
        }
        System.out.println("No se encontró ningún computador con la marca " + marca + ".");
        return null;
    }

    public void listarComputadores() {
        if (computadores.isEmpty()) {
            System.out.println("La tienda no tiene computadores disponibles.");
        } else {
            System.out.println("Lista de computadores en la tienda:");
            for (Computador computador : computadores) {
                System.out.println(computador);
            }
        }
    }
    public List<Computador> getComputadores() {
        return computadores;
    }
}
