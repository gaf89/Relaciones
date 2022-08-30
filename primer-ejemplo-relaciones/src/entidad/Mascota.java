/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import principal.enumeraciones.SexoAnimal;

/**
 *
 * @author Gaston
 */
public class Mascota<T> {
    
    private String nombre;
    private String apodo;
    private String tipo;
    private String color;
    private Integer edad;
    private boolean cola;
    private T raza;
    private int energia;
    private SexoAnimal sexo;
    
    public Mascota() {
        this.energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
    }

    
    
    public Mascota(String apodo, String tipo, Integer edad) {
        this.apodo = apodo;
        this.tipo = tipo;
        this.edad = edad;
        this.energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo, String color, Integer edad, boolean cola, T raza, int energia, SexoAnimal sexo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.energia = 1000;
        this.sexo = sexo;
    }
    
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(T raza) {
        this.raza = raza;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setSexo(SexoAnimal sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public Integer getEdad() {
        return edad;
    }

    public int getEnergia() {
        return energia;
    }

    public SexoAnimal getSexo() {
        return sexo;
    }

    public boolean isCola() {
        return cola;
    }

    public T getRaza() {
        return raza;
    }

   

    public int pasear(int energiaRestar) {
        
        //energia = energia - energiaRestar;
        energia -= energiaRestar;
        
        return energia;
    }
    
     public int pasear(int energiaRestar, int vueltas) {
        
         for (int i = 0; i < vueltas; i++) {
             energia -= energiaRestar;
         }
        
        return energia;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", energia=" + energia + ", sexo=" + sexo + '}';
    }
     
    
    
}
