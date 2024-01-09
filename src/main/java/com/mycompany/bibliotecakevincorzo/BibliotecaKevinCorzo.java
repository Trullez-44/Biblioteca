
package com.mycompany.bibliotecakevincorzo;

public class BibliotecaKevinCorzo {

    public static void main(String[] args) {
Recurso libro1 = new Libro("Kevin",01,"Libro1",true);
Recurso libro2 = new Libro("Kevin",02,"Libro2",false);
Recurso revista1 = new Revista(1,tipoRevista.DEPORTES, 03,"Revista1",true);
    Biblioteca biblioteca = new Biblioteca();
    biblioteca.agregarRecurso(libro1);
    biblioteca.agregarRecurso(libro2);
    biblioteca.agregarRecurso(revista1);
    biblioteca.prestarRecurso(1);
        System.out.println(biblioteca.buscarRecursoPorTitulo("Libro1"));
        System.out.println("Busqueda por titulo terminada");
    biblioteca.mostrarRecursos();
    }
}
