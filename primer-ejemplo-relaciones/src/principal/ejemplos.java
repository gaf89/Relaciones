/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import entidad.Mascota;
import entidad.Usuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import principal.enumeraciones.RazaGatuna;
import principal.enumeraciones.RazaPerruna;
import principal.enumeraciones.SexoHumano;

/**
 *
 * @author Gaston
 */
public class ejemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String razainput = "BEAGLE";
        
        for (RazaPerruna aux : RazaPerruna.values()) {
           // System.out.println(aux);
            
            if (aux.name().equals(razainput)) {
                System.out.println("Raza input es igual al enum "+aux);
            }
        }
                    
        
        Usuario u2 = new Usuario();
       
        u2.setSexo(SexoHumano.HOMBRE);
                
        System.out.println(u2.getSexo());
        
        System.out.println(RazaPerruna.BEAGLE.getCodigo());
        System.out.println(RazaPerruna.COCKER.getValor());
        System.out.println(RazaPerruna.PTIBULL.toString());
        
        
        Mascota m1 = new Mascota<RazaPerruna>("Fer", "Chiquito", "Perro");
        
        m1.setRaza(RazaPerruna.COCKER);
                
        Mascota m2 = new Mascota<RazaGatuna>("Pepa", "Lola", "Gato");
        
        m2.setRaza(RazaGatuna.NARANJOSC);
        
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        
        List<Mascota> mascotas = new ArrayList();
        
        mascotas.add(m1);
        mascotas.add(m2);
        
        
        Usuario u = new Usuario();
        
        u.setApellido("Fernandez");
        u.setSexo(SexoHumano.HOMBRE);
        u.setNacimiento(new Date("03/23/1989"));
        u.setMascotaFavorita(m2);
        u.setMascotas(mascotas);
        
        System.out.println(u.getNacimiento());
        System.out.println(u.toString());
        
    }
    
}
