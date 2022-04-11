package com.ibm.academia.appcubo.modelo;
import java.io.Serializable;

public class Caja implements Serializable {
    private int ancho;
    private int alto;
    private int profundo;

    public Caja() {
    }

    public Caja(int ancho) {
        this.ancho = ancho;
    }

    public Caja(int ancho, int alto) {
        this(ancho);
        this.alto = alto;
    }

    public Caja(int ancho, int alto, int profundo) {
        this(ancho,alto);
        this.profundo = profundo;
    }
    public int calcularVolumen(){
        return this.ancho * this.alto * this.profundo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getProfundo() {
        return profundo;
    }

    public void setProfundo(int profundo) {
        this.profundo = profundo;
    }
}
