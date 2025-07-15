package models;

import static org.junit.Assume.assumeTrue;

public class Book {
    String titulo;
    String autor;
    int anio;

    public Book(String titulo, String autor, int anio){
        this.titulo=titulo;
        this.autor=autor;
        this.anio=anio;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return titulo + ", " + autor + ", " + anio;
    }
}
