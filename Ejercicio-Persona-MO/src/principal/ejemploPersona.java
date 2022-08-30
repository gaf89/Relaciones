/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import entidad.Dni;
import entidad.Persona;

/**
 *
 * @author norae
 */
public class ejemploPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona p1 = new Persona();
        
        p1.setApellido("Fernandez");
        
        Dni doc1 = new Dni();
        
        doc1.setNumero(34123123);
        
        p1.setDocumento(doc1);
        
        System.out.println(p1.toString());
        
        Persona p2 = new Persona();
        
        p2.setNombre("Gaston");
        
        Dni doc2 = new Dni();
        
        doc2.setNumero(34321321);
        
        p2.setDocumento(doc2);
        
        System.out.println(p2.toString());
        
        
    }
    
}
