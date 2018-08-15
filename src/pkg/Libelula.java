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
public class Libelula extends Animal {    

    public Libelula() {
        super();
        sonidosLibelula();
    }

    private void sonidosLibelula() {
        sonidos.clear();
        Sonidos sonido = new Sonidos("fiu");
        sonidos.add(sonido);
        sonido = new Sonidos("plop");
        sonidos.add(sonido);
        sonido = new Sonidos("pep");
        sonidos.add(sonido);        
    }

    
    
   

    

}
