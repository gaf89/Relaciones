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
public class Cine {
    
    private Pelicula pelicula;
    private String sala;
    private Double precio;

    public Cine() {
    }

    public Cine(Pelicula pelicula, String sala, Double precio) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public String getSala() {
        return sala;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return pelicula + ", Sala: " + sala + ", Precio: $" + precio;
    }
    
    
}
