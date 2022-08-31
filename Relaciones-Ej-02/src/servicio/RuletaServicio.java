/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Juego;
import entidades.Jugador;
import entidades.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gaston
 */
public class RuletaServicio {
    
    Scanner leer;
    Revolver r1;
    Juego jg;
    
    public RuletaServicio() {
        this.leer =  new Scanner(System.in);
        this.r1 = new Revolver();
        this.jg = new Juego();
    }
    
//    • llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
//deben ser aleatorios.
    
    public void llenarRevolver() {
        r1.setPosicionActual((int) (Math.random() * 6 + 1));
        r1.setPosicionAgua((int) (Math.random() * 6 + 1));
    }
    
    public void mostrarRevolver() {
        System.out.println(r1.toString());
    }
//    • mojar(): devuelve true si la posición del agua coincide con la posición actual
    
    public boolean mojar() {
        boolean mojar;
        mojar = r1.getPosicionActual() == r1.getPosicionAgua();
        return mojar;
    }
    
//    • siguienteChorro(): cambia a la siguiente posición del tambor
    
    public void siguienteChorro() {
        int posiActual = r1.getPosicionActual();
        if (posiActual < 6){
            r1.setPosicionActual(posiActual+1);
        } else {
            if (posiActual == 6) {
                r1.setPosicionActual(1);
            }
        }        
    }
    
    public void mostrarJugadores() {
        for (Jugador jugadore : jg.getJugadores()) {
            System.out.println(jugadore.toString());
        }
    }
    
/*    • disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.*/
    
    public boolean disparo() {
        if (mojar()) {
            System.out.println(" está mojado");
            return true;
        } else {
            System.out.println(" NO esta mojado");
            siguienteChorro();
            return false;
        }        
    }
    
//    • llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
//y el revolver para guardarlos en los atributos del juego.
//10
    
    public void llenarJuego () {
        int id;
        int contador = 0;
        String nombre;
        
        System.out.println("Ingresar cantidad de juagadores");
        int cantJugadores = leer.nextInt();
        ArrayList jugadores = new ArrayList();
        
        for (int i = 0; i < cantJugadores; i++) {
            id = ++contador;
            System.out.println("Ingresar nombre del jugador");
            nombre = leer.next();
            
            jugadores.add(new Jugador(id, nombre));
        }
        jg.setJugadores(jugadores);
    }
    
/*    • ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.*/
    
    public void ronda() {
        boolean mojado = false;
        do {
            for (Jugador jugadore : jg.getJugadores()) {
                System.out.print("El jugador "+jugadore.getNombre());
                if (mojado = disparo()) {
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
