/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Gaston
 */
/*
Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada. Luego, de las películas nos interesa saber
el título, duración, edad mínima y director. Por último, del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
*/
public class Pelicula {
    
    private String titulo;
    private Integer duracion;
    private Integer edadMin;
    private String director;

    public Pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public Pelicula(String titulo, Integer duracion, Integer edadMin, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMin = edadMin;
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public Integer getEdadMin() {
        return edadMin;
    }

    public String getDirector() {
        return director;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public void setEdadMin(Integer edadMin) {
        this.edadMin = edadMin;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula: " + "Título: " + titulo + ", Duracion: " + duracion + " minutos, Edad Míninma: " + edadMin + ", Director: " + director;
    }
    
    
}
