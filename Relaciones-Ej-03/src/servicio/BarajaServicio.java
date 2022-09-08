/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Baraja;
import entidad.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import principal.enumeraciones.Palo;

/**
 *
 * @author norae
 */
/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
*/
public class BarajaServicio {
    
    Scanner leer;
    Baraja baraja;
    Baraja usadas;
    
    public BarajaServicio() {
        this.leer = new Scanner(System.in);
        this.baraja = new Baraja();
        this.usadas = new Baraja();
}
    
    public void crearBaraja() {
        ArrayList<Carta> b1 = new ArrayList();
        ArrayList<Carta> b2 = new ArrayList();        
        usadas.setBaraja(b2);
        
        for (int i = 1; i <= 12; i++) {
            if ((i >= 1 && i <= 7) || (i >= 10 && i <= 12)) {
                for (Palo aux : Palo.values()) {
                    b1.add(new Carta(i, aux));
                }
            }
        }
        baraja.setBaraja(b1);
    }
    
//    • barajar(): cambia de posición todas las cartas aleatoriamente.
    
    public void barajar() {
        Collections.shuffle(baraja.getBaraja());
    }
    
//    • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
//se haya llegado al final, se indica al usuario que no hay más cartas.
    
    public void siguienteCarta() {
        Carta c = baraja.getBaraja().get(0);
        System.out.println("La siguiente carta es: "+c.toString());
    }
    
//    • cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    
    public int cartasDisponibles() {
        int cartasRest = baraja.getBaraja().size();
        System.out.println("La cantidad de cartas disponibles es: "+cartasRest);
        return cartasRest;
    }
    
    /*• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.*/
    
    public void darCartas() {
        int pedido;
        int cartasRest = baraja.getBaraja().size();
        System.out.println("Ingresar cuantas cartas quiere");
        pedido = leer.nextInt();
        
        if (cartasRest < pedido) {
            System.out.println("No hay cartas suficentes, no se repartiran las cartas");
        } else {
            System.out.println("Se entrega las cartas:");
            for (int i = 0; i < pedido; i++) {
                System.out.println(baraja.getBaraja().get(i));
            }
            for (int i = 0; i < pedido; i++) {
                usadas.getBaraja().add(baraja.getBaraja().get(0));
                baraja.getBaraja().remove(0);
            }
        }
    }
    
//    cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
//indicárselo al usuario
    
    public void cartasMonton() {
        if (baraja.getBaraja().size()==40) {
            System.out.println("No ha salido ninguna carta");
        } else {
            System.out.println("las Cartas Usadas son;");
            for (Carta aux : usadas.getBaraja()) {
                System.out.println(aux.toString());
            }
        }
    }
    
//    mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
//luego se llama al método, este no mostrara esa primera carta.
    
    
    public void mostrarBaraja() {      
        
        System.out.println("Cartas restantes");
        for (Carta aux : baraja.getBaraja()) {
            System.out.println(aux.toString());
        }
    }
    
    public void menu() {
        int opcion;
        
        crearBaraja();
        
        do {
            System.out.println("-------------------------------------------");
            System.out.println("MENÚ");
            System.out.println("1. Barajar");
            System.out.println("2. Mostrar siguiente carta");
            System.out.println("3. Mostrar cuantas cartas hay disponibles");
            System.out.println("4. Dar cartas");
            System.out.println("5. Mostrar las cartas que ya se ha utilizado");
            System.out.println("6. Mostrar las cartas restatntes");
            System.out.println("7. Salir");
            System.out.println("");
            opcion = leer.nextInt();
            switch(opcion) {
                case 1: barajar();
                        break;
                case 2: siguienteCarta();
                        break;
                case 3: cartasDisponibles();
                        break;
                case 4: darCartas();
                        break;
                case 5: cartasMonton();
                        break;
                case 6: mostrarBaraja();
                        break;
                case 7: System.out.println("Ejecucion Terminda");
                        break;
                default: System.out.println("Opcion no válida");
                        break;
            }
        } while (opcion != 7);
    }
    
    
}
