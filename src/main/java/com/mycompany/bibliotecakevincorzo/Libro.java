package com.mycompany.bibliotecakevincorzo;


public class Libro extends Recurso{
    private final String autor;

    public Libro(String autor, int id, String titulo, boolean disponible) {
        super(id, titulo, disponible);
        this.autor = autor;
    }

   @Override
    public String toString() {
        return "Libro:" +" Titulo = "+this.getTitulo()+ ", Autor = " + autor +", ID = "+this.getId()+ ", "+ this.isDisponible();
    }
 


    
}
