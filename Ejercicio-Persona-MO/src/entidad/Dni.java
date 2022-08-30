/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author norae
 */
public class Dni {
    
    private String serie;
    private Integer numero;

    public String getSerie() {
        return serie;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Dni{" + "serie=" + serie + ", numero=" + numero + '}';
    }
    
    
}
