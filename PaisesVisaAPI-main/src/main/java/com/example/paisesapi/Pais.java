package com.example.paisesapi;

import org.springframework.data.annotation.Id;

import java.util.HashMap;
import java.util.Map;

public class Pais {
    @Id
    private String id;
    private String nombre;
    private Map<String, String> restriccionesDeVisa;

    public Pais(String nombre) {
        this.nombre = nombre;
        this.restriccionesDeVisa = new HashMap<>();
    }

    public void agregarRestriccionDeVisa(String paisDestino, String visa) {
        restriccionesDeVisa.put(paisDestino, visa);
    }

    public String getNombre() {
        return nombre;
    }

    public Map<String, String> getRestriccionesDeVisa() {
        return restriccionesDeVisa;
    }
}
