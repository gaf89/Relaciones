/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gaston
 */
/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
10

Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
*/
public class Juego {
    
    Scanner leer = new Scanner(System.in);
    Jugador j1 = new Jugador();
    
    private ArrayList<Jugador> jugadores = new ArrayList();
    private Revolver revolver;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }
     
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }
    
     public void mostrarJugadores() {
        for (Jugador jugadore : getJugadores()) {
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
        setJugadores(jugadores);
        setRevolver(r);
    }
    
/*    • ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.*/
    
    public void ronda() {
        boolean mojado = false;
        do {
            for (Jugador jugadore : getJugadores()) {
                System.out.print("El jugador "+jugadore.getNombre());
                if (mojado = j1.disparo(revolver)) {
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
