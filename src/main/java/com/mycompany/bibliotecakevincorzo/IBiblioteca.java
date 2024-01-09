package com.mycompany.bibliotecakevincorzo;


public interface IBiblioteca {

    void prestarRecurso(int id);

    String buscarRecursoPorTitulo(String titulo);

    void agregarRecurso(Recurso agregarRecurso);

    void mostrarRecursos();
}
