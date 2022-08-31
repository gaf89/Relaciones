/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;


import entidades.Revolver;
import java.util.Scanner;

/**
 *
 * @author Gaston
 */
public class RevolverServicio {
    
    Scanner leer;
            
    public RevolverServicio() {
        this.leer =  new Scanner(System.in);
    }
    
    //    • llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
//deben ser aleatorios.
    
    public void llenarRevolver(Revolver r) {
        r.setPosicionActual((int) (Math.random() * 6 + 1));
        r.setPosicionAgua((int) (Math.random() * 6 + 1));
    }
    
    public void mostrarRevolver(Revolver r) {
        System.out.println(r.toString());
    }
//    • mojar(): devuelve true si la posición del agua coincide con la posición actual
    
    public boolean mojar(Revolver r) {
        boolean mojar;
        mojar = r.getPosicionActual() == r.getPosicionAgua();
        return mojar;
    }
    
//    • siguienteChorro(): cambia a la siguiente posición del tambor
    
    public void siguienteChorro(Revolver r) {
        int posiActual = r.getPosicionActual();
        if (posiActual < 6){
            r.setPosicionActual(posiActual+1);
        } else {
            if (posiActual == 6) {
                r.setPosicionActual(1);
            }
        }        
    }
    
}
