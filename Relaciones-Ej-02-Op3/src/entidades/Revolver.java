/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;



/**
 *
 * @author Gaston
 */
/*
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:

• toString(): muestra información del revolver (posición actual y donde está el agua)
*/
public class Revolver {
    
    public int posicionActual;
    public int posicionAgua;

    public Revolver() {
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    //    • llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
//deben ser aleatorios.
    
    public void llenarRevolver() {
        setPosicionActual((int) (Math.random() * 6 + 1));
        setPosicionAgua((int) (Math.random() * 6 + 1));
    }
    
    public void mostrarRevolver() {
        System.out.println(toString());
    }
//    • mojar(): devuelve true si la posición del agua coincide con la posición actual
    
    public boolean mojar() {
        boolean mojar;
        mojar = posicionActual == posicionAgua;
        return mojar;
    }
    
//    • siguienteChorro(): cambia a la siguiente posición del tambor
    
    public void siguienteChorro() {
        int posiActual = getPosicionActual();
        if (posiActual < 6){
            setPosicionActual(posiActual+1);
        } else {
            if (posiActual == 6) {
                setPosicionActual(1);
            }
        }        
    }
    
    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
    
}
