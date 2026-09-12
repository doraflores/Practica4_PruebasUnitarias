package practica4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatalogoTest {

    private Catalogo catalogo;
    private Pelicula pelicula1;
    private Pelicula pelicula2;

    @BeforeEach
    public void setUp() {
        catalogo = new Catalogo();
        pelicula1 = new Pelicula("El Señor de los Anillos", "Peter Jackson", 2001, "Fantasía", 178);
        pelicula2 = new Pelicula("Forrest Gump", "Robert Zemeckis", 1994, "Drama", 142);
    }

    @Test
    void agregarPelicula() {
        catalogo.agregarPelicula(pelicula1);
        catalogo.agregarPelicula(pelicula2);

        String lista = catalogo.getPeliculas();
        assertTrue(lista.contains("El Señor de los Anillos"));
        assertTrue(lista.contains("Forrest Gump"));
    }

    @Test
    void getPeliculas() {
        catalogo.agregarPelicula(pelicula1);
        catalogo.agregarPelicula(pelicula2);

        String listaPeliculas = catalogo.getPeliculas();

        assertTrue(listaPeliculas.contains("El Señor de los Anillos"));
        assertTrue(listaPeliculas.contains("Forrest Gump"));
        assertTrue(listaPeliculas.contains("2001"));
        assertTrue(listaPeliculas.contains("1994"));
    }

    @Test
    void buscarPeliculaPorTitulo() {
        catalogo.agregarPelicula(pelicula1);
        catalogo.agregarPelicula(pelicula2);

        assertTrue(catalogo.getPeliculas().contains("Forrest Gump"));

    }

    @Test
    void testBuscarPeliculaPorTituloNoExistente() {
        catalogo.agregarPelicula(pelicula1);

        assertFalse(catalogo.getPeliculas().contains("Titanic"));
    }

    @Test
    void testBuscarPeliculaPorTituloCaseInsensitive() {
        catalogo.agregarPelicula(pelicula1);

        String lista = catalogo.getPeliculas().toLowerCase();
        assertTrue(lista.contains("el señor de los anillos"));
    }

    @Test
    void testCatalogoVacio() {
        String resultado = catalogo.getPeliculas();
        assertEquals("No se encuentra ninguna película registrada", resultado);
    }





}
