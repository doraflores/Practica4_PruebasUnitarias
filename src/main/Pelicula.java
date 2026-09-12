package practica4;

import java.time.Year;

public class Pelicula {
    private String titulo;
    private String director;
    private int añoEstreno;
    private String genero;
    private int duracion;

    public Pelicula(String titulo, String director, int añoEstreno, String genero, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.añoEstreno = añoEstreno;
        this.genero = genero;
        this.duracion = duracion;
    }


    public String getInformacion() {
        return ("Título: " + titulo + ", Director: " + director + ", Año de estreno: " + añoEstreno + ", Género: " + genero + ", Duración: " + duracion + " minutos");
    }

    public boolean esClasica() {
        int añoActual = Year.now().getValue();
        return (añoActual - añoEstreno) >= 25;
    }

    public String toString() {
        return ("La pelicula " + titulo + " dirigida por " + director + ", se estreno en el año " + añoEstreno + ". Es del género " + genero + " y tiene una duración de " + duracion + " minutos.");
    }



    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public int getAñoEstreno() {
        return añoEstreno;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }
}
