/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author JOSE
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal animal;
        Canciones cancion1 = new Canciones();
        Canciones cancion2 = new Canciones();
        Canciones cancion3 = new Canciones();
        boolean isSonido=false;
        //sonidos de la rana
        animal = new Rana();

        Componer(animal, 0, 1);
        cancion1.asignarSonido(animal.getSonido());
        Componer(animal, 2, 4);
        cancion1.asignarSonido(animal.getSonido());

        Componer(animal, 1, 2);
        cancion2.asignarSonido(animal.getSonido());
        Componer(animal, 3, 4);
        cancion2.asignarSonido(animal.getSonido());

        Componer(animal, 2, 4);
        cancion3.asignarSonido(animal.getSonido());

        //sonidos de la libelula
        animal = new Libelula();
        Componer(animal, 0, 2);
        cancion1.asignarSonido(animal.getSonido());

        Componer(animal, 2, 1);
        cancion2.asignarSonido(animal.getSonido());

        Componer(animal, 1, 2);
        cancion3.asignarSonido(animal.getSonido());

        //sonidos del grillo
        animal = new Grillo();
        Componer(animal, 0, 3);
        cancion1.asignarSonido(animal.getSonido());

        Componer(animal, 1, 3);
        cancion2.asignarSonido(animal.getSonido());

        Componer(animal, 2, 1);
        cancion3.asignarSonido(animal.getSonido());

        Componer(animal, 0, 3);
        cancion3.asignarSonido(animal.getSonido());

        List<Canciones> canciones = new ArrayList<>();
        canciones.add(cancion1);
        canciones.add(cancion2);
        canciones.add(cancion3);

        Scanner leer = new Scanner(System.in);
        int op;
        do {
            System.out.println("MENU");
            System.out.println("1.- Escribir Sonido");
            System.out.println("2.- Salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    String sonido = leer.next();
                    for (int i = 0; i < canciones.size(); i++) {
                        Canciones get = canciones.get(i);
                        if((isSonido = get.entonarCancion(new Sonidos(sonido))))
                            break;
                    }
                    
                    if(!isSonido){
                        System.out.println("Sonido no encontrado");
                    }
                    break;

                case 2:
                    System.out.println("Saliendo");
                    break;

                default:
                    break;
            }

        } while (op != 2);

    }

    private static void Componer(Animal animal, int index, int orden) {
        animal.setIndex(index);
        animal.getSonido().setOrden(orden);
    }

}
