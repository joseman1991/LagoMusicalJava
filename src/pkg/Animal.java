/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JOSE
 */
public  class Animal  {

    protected final List<Sonidos> sonidos;
    private int index;

    public Animal() {
        this.sonidos = new ArrayList<>();
    }

 
    public Sonidos getSonido() {
        return sonidos.get(index);
    }

 
    public boolean isSonido(Sonidos sonido) {
        for (int i = 0; i < sonidos.size(); i++) {
            Sonidos get = sonidos.get(i);
            if (sonido.getSonido().equals(get.getSonido())) {
                return true;
            }
        }
        return false;
    }

    public void setIndex(int index) {
        this.index = index;
    }

}
