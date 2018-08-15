/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author JOSE
 */
public class Canciones {

    private static int nCancion;
    private final  int numero;
    private final List<Sonidos> cancion;

    public Canciones() {
        this.cancion = new ArrayList<>();
        nCancion++;
        numero=nCancion;
    }

 
    public void asignarSonido(Sonidos sonido) {
        cancion.add(sonido);
    }

 
    public boolean entonarCancion(Sonidos sonido) {
        ordenar();
        boolean isSonido = false;
        int i;
        Sonidos get;
        for (i = 0; i < cancion.size(); i++) {
            get = cancion.get(i);
            if (sonido.getSonido().equals(get.getSonido())) {
                isSonido = true;
                i++;
                break;
            }
        }

        if (isSonido) {
            System.out.println("Sonido encontrado en cancion número " + numero);
            System.out.println("Cantando");
            for (; i < cancion.size(); i++) {
                get = cancion.get(i);
                System.out.println(get.getSonido());
            }
        }
        return isSonido;
    }
    
    private void ordenar(){
        Collections.sort(cancion,new Comparator<Sonidos>() {         
            public int compare(Sonidos o1, Sonidos o2) {
                return new Integer(o1.getOrden()).compareTo(o2.getOrden());
            }
        });
    }

   

}
