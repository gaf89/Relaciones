/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import entidad.Equipo;
import entidad.Jugador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gaston
 */
public class ejercicioJugador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();
        Jugador j3 = new Jugador();
        
        j1.setNombre("Frando");
        j1.setNumero(987);
        
        j2.setApellido("Contreras");
        j2.setPosicion("Del");
        
        j3.setNombre("Fernando");
        j3.setNumero(456);
        
        Equipo eq1 = new Equipo();
        
        eq1.getJugadores().add(j1);
        eq1.getJugadores().add(j2);
        eq1.getJugadores().add(j3);
        
        //List<Jugador> jug = new ArrayList();
//        
//        jug.add(j3);
//        jug.add(j1);
//        jug.add(j2);
//        
//        eq1.setJugadores(jug);
        
        
        
        System.out.println(eq1.toString());
    }
    
}
