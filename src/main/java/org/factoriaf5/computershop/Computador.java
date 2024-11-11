package org.factoriaf5.computershop;

public class Computador {
    private String marca;
    private int memoria;  
    private String procesador;
    private String sistemaOperativo;
    private double precio;

    public Computador(String marca, int memoria, String procesador, String sistemaOperativo, double precio) {
        this.marca = marca;
        this.memoria = memoria;
        this.procesador = procesador;
        this.sistemaOperativo = sistemaOperativo;
        this.precio = precio;
    
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", Memoria: " + memoria + " GB, Procesador: " + procesador +
                ", Sistema Operativo: " + sistemaOperativo + ", Precio: $" + precio;
    }
}