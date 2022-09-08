/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Cine;
import entidades.Espectador;
import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import principal.enumeraciones.Columnas;

/**
 *
 * @author Gaston
 */
public class CineServicio {
    
    Scanner leer = new Scanner(System.in);
    PeliculaServicio ps = new PeliculaServicio();
    
    public void crearAsientos(ArrayList<String> asientos) {
        
        
        for (int i = 8; i >= 1; i--) {
            for (Columnas aux : Columnas.values()) {
                
                asientos.add(i+aux.toString());
            }
        }
        
    }
    
    public void mostrarAsientos(ArrayList<String> asientos) {
        int cont = asientos.size()-6;
        
        Collections.sort(asientos);
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                if (j > 0) {
                    System.out.print("|");
                }
                if (asientos.get(cont).length() == 2){
                    System.out.print(asientos.get(cont)+" ");
                    cont++;
                } else {
                    System.out.print(asientos.get(cont));
                    cont++;
                }
            }
            System.out.println("");
            if (asientos.size() > 12) {
                cont -= 12;
            }
        }
      
    }
    
    public Cine crearFuncion (ArrayList<Pelicula> pelis) {
        String sala = "Sala "+((int) (Math.random()*10+1));
        Pelicula pelicula = null;
        String eleccion;
        double precio = 800;
        
        ps.mostrarPeliculas(pelis);
        System.out.println("");
        System.out.println("Ingrese el Título de la Película que se va a reproducir"); 
        
        eleccion = leer.nextLine();
        
        for (Pelicula peli : pelis) {
            if (eleccion.equals(peli.getTitulo())) {
                pelicula = peli;
            }
        }
        return new Cine(pelicula, sala, precio);
    }
    
    public void cargarFuncion (Cine funcion, ArrayList<Espectador> espe, ArrayList<String> asientos) {
                
        String asiento;
        int ubicacion;
        int entradas = 48;
        
        System.out.println("Informacion de la Funcion");
        System.out.println(funcion.toString());
        System.out.println("");
        
        for (Espectador espectador : espe) {
            System.out.println("Turno: "+espectador.getNombre());
            if (entradas > 0){
                if (espectador.getEdad() >= funcion.getPelicula().getEdadMin()) {
                    if (espectador.getSaldo() >= funcion.getPrecio()) {
                        ubicacion = (int) (Math.random()*48+0);
                        while (asientos.get(ubicacion).length() == 3) {
                            ubicacion = (int) (Math.random()*47+0);
                        }
                        asiento = asientos.get(ubicacion);
                        System.out.println("Entrada adquirida, ubicacion: "+asiento);
                        asientos.set(ubicacion, asiento+"X");
                        espectador.setSaldo(espectador.getSaldo()-funcion.getPrecio());
                        entradas--;
                    } else {
                        System.out.println("Saldo Insuficiente");
                    }
                } else {
                    System.out.println("No cumble con la edad mínima de la pelicula");
                }
            } else {
                System.out.println("Sala llena");
                break;
            }
        }
    }
}
