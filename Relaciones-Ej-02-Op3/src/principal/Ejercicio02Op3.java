/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import entidades.Juego;
import entidades.Jugador;
import entidades.Revolver;
import java.util.ArrayList;

/**
 *
 * @author Gaston
 */
public class Ejercicio02Op3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Revolver r1 = new Revolver();
        Juego j1 = new Juego();
        
        r1.llenarRevolver();
        r1.mostrarRevolver();
        System.out.println("");
        j1.llenarJuego(j1.getJugadores(), r1);
        j1.mostrarJugadores();
        System.out.println("");
        j1.ronda();
              
    }
    
}
