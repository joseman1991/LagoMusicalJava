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
public class Grillo extends Animal {    

    public Grillo() {
        super();
        sonidosGrillo();
    }

    private void sonidosGrillo() {
        sonidos.clear();
        Sonidos sonido = new Sonidos("cric-cric");
        sonidos.add(sonido);
        sonido = new Sonidos("trri-trri");
        sonidos.add(sonido);
        sonido = new Sonidos("bri-bri");
        sonidos.add(sonido);       
    }

    
    
   

    

}
