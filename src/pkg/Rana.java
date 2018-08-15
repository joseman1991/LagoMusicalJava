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
public class Rana extends Animal {    

    public Rana() {
        super();
        sonidosRana();
    }

    private void sonidosRana() {
        sonidos.clear();
        Sonidos sonido = new Sonidos("brr");//0
        sonidos.add(sonido);
        sonido = new Sonidos("birip");//1
        sonidos.add(sonido);
        sonido = new Sonidos("brrah");//2
        sonidos.add(sonido);
        sonido = new Sonidos("croac");//3
        sonidos.add(sonido);
    }

    
    
   

    

}
