/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Juego;
import entidades.Jugador;
import entidades.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gaston
 */
public class JuegoServicio {
    
    Scanner leer;
    Juego jg;
    RevolverServicio rs;
    
    public JuegoServicio() {
        this.leer =  new Scanner(System.in);
        this.jg = new Juego();
        this.rs = new RevolverServicio();
    }
    
     public void mostrarJugadores() {
        for (Jugador jugadore : jg.getJugadores()) {
            System.out.println(jugadore.toString());
        }
    }
     
     //    • llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
//y el revolver para guardarlos en los atributos del juego.
//10
    
    public void llenarJuego (ArrayList<Jugador> jugadores, Revolver r) {
        int id;
        int contador = 0;
        String nombre;
        
        System.out.println("Ingresar cantidad de juagadores");
        int cantJugadores = leer.nextInt();
                
        for (int i = 0; i < cantJugadores; i++) {
            id = ++contador;
            System.out.println("Ingresar nombre del jugador");
            nombre = leer.next();
            
            jugadores.add(new Jugador(id, nombre));
        }
        jg.setJugadores(jugadores);
        jg.setRevolver(r);
    }
    
/*    • ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.*/
    
    public void ronda(JugadorServicio j) {
        boolean mojado = false;
        do {
            for (Jugador jugadore : jg.getJugadores()) {
                System.out.print("El jugador "+jugadore.getNombre());
                if (mojado = j.disparo(rs, jg.getRevolver())) {
                    System.out.println("El juego a terminado");
                    break;
                } else {
                    System.out.println("Enter para la Siguiente ronda");
                    leer.skip("\n");
                    leer.nextLine();
                }
                
            }
        } while (mojado == false);
    }
     
}
