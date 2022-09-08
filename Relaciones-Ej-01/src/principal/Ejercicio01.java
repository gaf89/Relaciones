/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;
import servicio.PerroServicio;
import servicio.PersonaServicio;

/**
 *
 * @author Gaston
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList();
        ArrayList<Perro> perros = new ArrayList();
        PersonaServicio ps = new PersonaServicio();
        PerroServicio pes = new PerroServicio();
        
        ps.crearPersonas(personas);
        pes.crearPerros(perros);
        ps.adopcion(personas, perros);
        System.out.println("");
        ps.mostrarPersonas(personas);
        
        
        
        
        
//        Persona ps1 = new Persona("nombre1", 30, 30123123);
//        Persona ps2 = new Persona("nombre2", 28, 27321321);
//        
//        Perro pr1 = new Perro("perro1", "Dogo", 5, "Grande");
//        Perro pr2 = new Perro("perro2", "Coker", 7, "Medio");
//        
//        ps1.getPerros().add(pr1);
//        ps2.getPerros().add(pr2);
//       
//        
//        System.out.println(ps1.toString());
//        System.out.println("");
//        System.out.println(ps2.toString());
        
    }
    
}
