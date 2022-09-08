/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import entidades.Cine;
import entidades.Espectador;
import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.CineServicio;
import servicios.EspectadorServicio;
import servicios.PeliculaServicio;

/**
 *
 * @author Gaston
 */
public class Ej02Extra {

    Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
     
        ArrayList<String> asientos = new ArrayList();
        ArrayList<Espectador> espectadores = new ArrayList();
        ArrayList<Pelicula> peliculas = new ArrayList();
        CineServicio cs = new CineServicio();
        EspectadorServicio es = new EspectadorServicio();
        PeliculaServicio ps = new PeliculaServicio();
        
        
        cs.crearAsientos(asientos);
//        cs.mostrarAsientos(asientos);
        es.crearEspectadores(espectadores);
        System.out.println("");
        es.mostrarEspectadores(espectadores);
        System.out.println("");
        ps.cargarPeliculas(peliculas);
        Cine funcion = cs.crearFuncion(peliculas);
        System.out.println("");
        cs.cargarFuncion(funcion, espectadores, asientos);
        System.out.println("");
        System.out.println("");
        cs.mostrarAsientos(asientos);
        System.out.println("");
        es.mostrarEspectadores(espectadores);
    }
    
}
