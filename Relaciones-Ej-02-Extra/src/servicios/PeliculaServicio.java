/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gaston
 */
public class PeliculaServicio {
 
    Scanner leer = new Scanner(System.in);
    
    
    public void cargarPeliculas(ArrayList<Pelicula> peliculas) {
        String titulo, director;
        int cantidad, duracion, edadMin;
        int clasificacion[] = {0, 7, 13, 16, 18};
                
        System.out.println("ingresar cantidad de peliculas");
        cantidad = leer.nextInt();
        
        for (int i = 1; i <= cantidad; i++) {
            titulo = "Titulo "+i;
            director = "Director "+i;
            duracion = (int) (Math.random()*180+60);
            edadMin = clasificacion[(int) (Math.random()*5+0)];
            
            peliculas.add(new Pelicula(titulo, duracion, edadMin, director));
        }
    }
    
    public void mostrarPeliculas(ArrayList<Pelicula> peliculas) {
        System.out.println("");
        System.out.println("Peliculas disponibles");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
    }
}
