package practica4;

import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Pelicula> peliculas;

    public Catalogo(){
        this.peliculas = new ArrayList<Pelicula>();
    }

    public void agregarPelicula(Pelicula pelicula){
        this.peliculas.add(pelicula);
    }

    /**
     * Metodo que regresa una cadena con la información de todas las peliculas
     * @return listaPeliculas
     */
    public String getPeliculas(){
        if(peliculas.isEmpty()){
            return "No se encuentra ninguna película registrada";
        }

        String listaPeliculas = ""; //cadena vacia
        for(int i = 0; i < peliculas.size(); i++){
            listaPeliculas = listaPeliculas + peliculas.get(i).getInformacion() + "\n";
        }
        return listaPeliculas;

    }

    public void buscarPeliculaPorTitulo(String titulo){
        if(titulo != null){
            titulo = titulo.trim();
        }

        boolean peliculaEncontrada = false;
        for(int i = 0; i < peliculas.size(); i++){
            Pelicula pelicula = peliculas.get(i);
            if(titulo.equalsIgnoreCase(pelicula.getTitulo())){
                System.out.println(pelicula.getInformacion());
                peliculaEncontrada = true;
                break;
            }
        }
        if (!peliculaEncontrada) {
            System.out.println("La pelicula ´" + titulo + "´ no fue encontrada.");
        }

    }

    public String toString(){
        return "Catalogo de peliculas.\n" + "Cantidad actual de peliculas: " + peliculas.size() + "\n" + getPeliculas();
    }

}
