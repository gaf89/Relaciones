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
public class Espectador {
    
    private String nombre;
    private Integer edad;
    private Double saldo;

    public Espectador() {
    }

    public Espectador(String nombre, Integer edad, Double saldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.saldo = saldo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", edad: " + edad + ", saldo: " + saldo;
    }
    
    
    
}
