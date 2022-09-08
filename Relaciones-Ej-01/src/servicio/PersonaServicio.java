/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gaston
 */
/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
*/
public class PersonaServicio {
    
    Scanner leer;
    PerroServicio pes;
        
    public PersonaServicio() {
        this.leer = new Scanner(System.in);
        this.pes = new PerroServicio();
    }
    
    public void crearPersonas(ArrayList<Persona> personas) {
        String nombre, apellido, resp;
        Integer edad, documento;
        
        do {
            System.out.println("Ingresar datos de la persona");
            System.out.print("Nombre: ");
            nombre = leer.next();
            System.out.print("Apellido: ");
            apellido = leer.next();
            System.out.print("Edad: ");
            edad = leer.nextInt();
            System.out.println("Número de documetn: ");
            documento = leer.nextInt();
            
            personas.add(new Persona(nombre, apellido, edad, documento));
            
            System.out.println("¿Desea cargar otra persona?(si/no)");
            resp = leer.next();
            
        } while (resp.equals("si"));
        
    }
    
    public void adopcion(ArrayList<Persona> personas,ArrayList<Perro> p) {
        System.out.println("");
        for (Persona persona : personas) {
            System.out.println("");
            System.out.println("Proceso de adopcion");
            System.out.println(persona.getNombre()+" realizara la adopcion:");
            persona.setPerro(pes.adoptarPerro(p));
            System.out.println("");
        }
    }
    
    public void mostrarPersonas(ArrayList<Persona> p) {
        System.out.println("Lista de personas");
        for (Persona persona : p) {
            System.out.println(persona.toString());
        }
    }
}
