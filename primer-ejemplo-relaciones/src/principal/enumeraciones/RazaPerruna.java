/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.enumeraciones;

/**
 *
 * @author Gaston
 */
public enum RazaPerruna {
    BEAGLE (123123, "Beagle"), COCKER (4325, "Cocker"), PTIBULL (5896, "Pitbull"), BORDER_COLLIE (6541, "Border Collie");
    
    private Integer codigo;
    private String valor;
    
    private RazaPerruna(Integer codigo, String valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getValor() {
        return valor;
    }
    
    
}

