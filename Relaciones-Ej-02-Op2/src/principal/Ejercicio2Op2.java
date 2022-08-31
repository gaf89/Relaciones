/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import entidades.Juego;
import entidades.Revolver;
import servicios.JuegoServicio;
import servicios.JugadorServicio;
import servicios.RevolverServicio;

/**
 *
 * @author Gaston
 */
public class Ejercicio2Op2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RevolverServicio rs = new RevolverServicio();
        JugadorServicio js = new JugadorServicio();
        JuegoServicio jgs = new JuegoServicio();
        Revolver r1 = new Revolver();
        Juego j1 = new Juego();
        
        
        rs.llenarRevolver(r1);
        rs.mostrarRevolver(r1);
        System.out.println("");
        jgs.llenarJuego(j1.getJugadores(), r1);
        jgs.mostrarJugadores();
        jgs.ronda(js);
        
        
    }
    
}
