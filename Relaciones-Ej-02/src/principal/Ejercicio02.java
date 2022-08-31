/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import servicio.RuletaServicio;

/**
 *
 * @author Gaston
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RuletaServicio rs = new RuletaServicio();
        
        rs.llenarRevolver();
        rs.mostrarRevolver();
        System.out.println("");
        rs.llenarJuego();
        rs.mostrarJugadores();
        System.out.println("");
        rs.ronda();
    }
    
}
