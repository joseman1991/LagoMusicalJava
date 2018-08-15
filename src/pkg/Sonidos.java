/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

/**
 *
 * @author JOSE
 */
public class Sonidos {
    
    private int orden;
    private String sonido;

    public Sonidos() {
        this.orden=0;
        this.sonido="";
    }

    public Sonidos(String sonido) {
        this.orden=0;
        this.sonido = sonido;
    }

    
    
    
    public Sonidos(int orden, String sonido) {
        this.orden = orden;
        this.sonido = sonido;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
    
    
    
}
