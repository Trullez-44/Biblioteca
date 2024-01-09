package com.mycompany.bibliotecakevincorzo;

public class Revista extends Recurso{
    private int numero;
    private tipoRevista tipo;

    public Revista(int numero, tipoRevista tipo, int id, String titulo, boolean disponible) {
        super(id, titulo, disponible);
        this.numero = numero;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Libro:" +" Titulo = "+this.getTitulo()+ ", Numero de Revista = " + numero+", Tipo de Revista = "+ tipo +", ID = "+this.getId()+ ", "+ this.isDisponible();
    }

}
