/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Espectador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gaston
 */
public class EspectadorServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public void crearEspectadores(ArrayList<Espectador> espectadores) {
        String nombre = "";
        int edad;
        double dinero;
        
        System.out.println("Ingresar al la cantidad de espectadores a crear");
        int cantEspectadores = leer.nextInt();
        
        for (int i = 1; i <= cantEspectadores; i++) {
            nombre = "Espectador "+i;
            edad = (int) (Math.random()*60+4);
            dinero = (Math.random()*5000+100);
            
            espectadores.add(new Espectador(nombre, edad, dinero));
        }
    }
    
    public void mostrarEspectadores(ArrayList<Espectador> espectadores) {
        for (Espectador espectadore : espectadores) {
            System.out.println(espectadore.toString());
        }
    }
    
}
