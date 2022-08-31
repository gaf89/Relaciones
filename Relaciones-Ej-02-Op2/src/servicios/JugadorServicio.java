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
public class JugadorServicio {
    
    Scanner leer;
        
    public JugadorServicio() {
        this.leer =  new Scanner(System.in);
    }
     
/*    • disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.*/
    
    public boolean disparo(RevolverServicio rs, Revolver r) {
        if (rs.mojar(r)) {
            System.out.println(" está mojado");
            return true;
        } else {
            System.out.println(" NO esta mojado");
            rs.siguienteChorro(r);
            return false;
        }        
    }
    
}
