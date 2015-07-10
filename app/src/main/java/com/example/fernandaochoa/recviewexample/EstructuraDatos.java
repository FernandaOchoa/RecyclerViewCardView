package com.example.fernandaochoa.recviewexample;

/**
 * Created by Fernanda Ochoa on 09/07/2015.
 */
public class EstructuraDatos {

    private int imagen;
    private String nombre;
    private String cinta;

    public EstructuraDatos(int imagen, String nombre, String cinta) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.cinta = cinta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCinta() {
        return cinta;
    }

    public int getImagen() {
        return imagen;
    }
}
