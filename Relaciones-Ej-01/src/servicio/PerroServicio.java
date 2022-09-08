/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Perro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gaston
 */
public class PerroServicio {
    
    Scanner leer;
        
    public PerroServicio() {
        this.leer = new Scanner(System.in);
    }
    
    public void crearPerros(ArrayList<Perro> perros) {
        String nombre, raza, tamano, resp;
        Integer edad;
        
        do{
            System.out.println("Ingresar Datos del perro");
            System.out.print("Nombre: ");
            nombre = leer.next();
            System.out.print("Raza: ");
            raza = leer.next();
            System.out.print("Edad: ");
            edad = leer.nextInt();
            System.out.print("Tamaño: ");
            tamano = leer.next();
            
            perros.add(new Perro(nombre, raza, edad, tamano));
            
            System.out.println("¿Desea ingresar otro perro?(si/no)");
            resp = leer.next();
            
        } while (resp.equals("si"));
    }
    
    public Perro adoptarPerro(ArrayList<Perro> perros) {
        String nombre, resp;
        int cont = 0;
        Perro p1 = null;

        mostrarPerros(perros);
      
        System.out.println("Ingrese el nombre del perro que desea adoptar");
        nombre = leer.next();          
        
        for (Perro perro : perros) {            
            if (perro.getNombre().equals(nombre)) {              
                System.out.println("La adopcion ha sido confirmada");
                p1 = perros.get(cont);                
                perros.remove(cont);
                break;
            }
        cont++;
        }
        
        return p1;
    }
    
    
    public void mostrarPerros(ArrayList<Perro> perros) {
        System.out.println("");
        System.out.println("Lista de Perros para adoptar");
        
        for (Perro perro : perros) {
            System.out.println(perro.toString());
        }
    }
    
  
}
