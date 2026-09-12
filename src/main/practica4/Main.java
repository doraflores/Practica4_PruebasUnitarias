package practica4;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Catalogo catalogo = new Catalogo();

        // Creaacion de 3 objetos pelicula
        Pelicula pelicula1 = new Pelicula("Iron Man", "Jon favreau", 2008, "Acción", 126);
        Pelicula pelicula2 = new Pelicula("Spider-Man", "Sam Raimi", 2002, "Acción", 121);
        Pelicula pelicula3 = new Pelicula("Náufrago", "Robert Zemeckis", 2000, "Aventura", 143);

        // Añadiendolos a un objeto catalogo
        catalogo.agregarPelicula(pelicula1);
        catalogo.agregarPelicula(pelicula2);
        catalogo.agregarPelicula(pelicula3);

        // Utilizando getPeliculas() para mostrar toda la informacion
        System.out.println("Lista del catálogo");
        System.out.println(catalogo.getPeliculas());

        // Buscar pelicula con el metodo buscarPeliculaPorTitulo()
        System.out.println("\nResultado de la búsqueda");
        catalogo.buscarPeliculaPorTitulo("Iron Man");
        catalogo.buscarPeliculaPorTitulo("Thor");

        // Saber si las peliculas del catalogo se consideran clasicas
        // Prueba de caso que no es verdadero
        if(pelicula1.esClasica()){
            System.out.println(pelicula1.getTitulo() + " es una película clásica.");
        }else{
            System.out.println(pelicula1.getTitulo() + " no es una película clásica, es moderna.");
        }
        // Prueba de caso verdadero
        if(pelicula3.esClasica()){
            System.out.println(pelicula3.getTitulo() + " es una película clásica.");
        }else{
            System.out.println(pelicula3.getTitulo() + " no es una película clásica, es moderna.");
        }

        // prueba de pelicula con antiguedad Límite
        Pelicula limite = new Pelicula("Rápido y furioso", "Rob Cohen", 2001, "Acción", 106);

        System.out.println("¿La película ´" + limite.getTitulo() + "´ es clásica?");

        if(limite.esClasica()){
            System.out.println("La película " + limite.getTitulo() +  " tiene exactamente 25 años, se considera clásica.");
        }else{
            System.out.println("¡¡ERROR!! La película no cumple los 25 años exactos.");
        }
    }
}
