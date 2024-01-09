package com.mycompany.bibliotecakevincorzo;

import java.util.ArrayList;
import java.util.List;


public abstract class Recurso {
    private int id;
    private String titulo;
    private boolean disponible;
     private static List<Integer> idsExistentes = new ArrayList<>();

    public Recurso(int id, String titulo, boolean disponible) {
         if (idsExistentes.contains(id)) {
            throw new IllegalArgumentException("El id ya existe");
        }
        this.id = id;
        this.titulo = titulo;
        this.disponible = disponible;
         idsExistentes.add(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String isDisponible() {
        if (disponible){
            return "Disponible";
        }
        else{
            return "No Disponible";
            
        }
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Recurso{" + "id=" + id + ", titulo=" + titulo + ", disponible=" + disponible + '}';
    }
    
}
