# Práctica 4 - Pruebas Unitarias (POO)

Este proyecto implementa las clases **Pelicula** y **Catalogo** en Java y desarrolla pruebas unitarias con **JUnit 5** para validar su correcto funcionamiento.

## Objetivo
Diseñar y ejecutar pruebas unitarias que verifiquen:
- Persistencia de datos en la clase `Pelicula`
- Métodos de información y clasificación (`getInformacion()`, `esClasica()`)
- Operaciones de gestión en `Catalogo` (`agregarPelicula()`, `getPeliculas()`, `buscarPeliculaPorTitulo()`)

## Estructura del proyecto
src/
└── main/practica4/
├── Pelicula.java
├── Catalogo.java
└── Main.java
└── test/practica4/
├── PeliculaTest.java
└── CatalogoTest.java

## Configuración
- Lenguaje: Java 17+
- Gestor: Gradle
- Librerías: JUnit 5

En `build.gradle`:
```gradle
dependencies {
    testImplementation 'org.junit.jupiter:junit-jupiter:5.10.0'
}
test {
    useJUnitPlatform()
}

./gradlew build

./gradlew test
