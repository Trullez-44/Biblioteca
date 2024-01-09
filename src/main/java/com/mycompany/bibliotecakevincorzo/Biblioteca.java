package com.mycompany.bibliotecakevincorzo;

import java.util.ArrayList;

public class Biblioteca implements IBiblioteca {

    ArrayList<Recurso> recursosDisponibles = new ArrayList<>();

    @Override
    public void prestarRecurso(int id) {
        for (Recurso recursosDisponible : recursosDisponibles) {
            if (recursosDisponible.getId() == id && recursosDisponible.isDisponible().equals("Disponible")) {
                recursosDisponible.setDisponible(false);
                System.out.println("Prestado correctamente");

                break;
            } else {
                System.out.println("No está disponible");
            }

        }
    }

    @Override
    public String buscarRecursoPorTitulo(String titulo) {
        for (Recurso recursosDisponible : recursosDisponibles) {
            if (recursosDisponible.getTitulo().equals(titulo)) {
                return recursosDisponible.toString();
            }
        }
        return "No se encuentró ninguno recurso con ese titulo";
    }

    @Override
    public void agregarRecurso(Recurso agregarRecurso) {
        recursosDisponibles.add(agregarRecurso);
        System.out.println("Correctamente añadidito");
    }

    @Override
    public void mostrarRecursos() {
        for (Recurso recursosDisponible : recursosDisponibles) {
            System.out.println(recursosDisponible);
        }
    }

}
