
import java.util.ArrayList;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian Abraham Parra Pérez
 * # Control: C18550333
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int iVal = 10; //Se declara una variable de tipo entero con valor de 10
        Integer iValObj = 10; //Objeto de tipo integer
        iValObj = iValObj + iVal; //Valor objeto es igual al objeto más el valor
        ArrayList<Double> alMiArrayList = new ArrayList(); //Objeto de tipo arraylist con datos double
        alMiArrayList.add(7.0); //Se agrega un valor double a la lista
        alMiArrayList.add(3.1416); //Se agrega el valor del pi a la lista
        alMiArrayList.add(8.0); //Se agreega un valor double a la lista
        alMiArrayList.add(35.1); //Se agrega un valor de 35.1 a la lista
        alMiArrayList.add(8.0); //Se agrega un valor de tipo double 8.0 a la lista
        
        for(int i = 0; i< alMiArrayList.size(); i++){ //Ciclo for para recorrer los elementos del Array List
            System.out.print("[" + alMiArrayList.get(i) + "]");
        }
        /*alMiArrayList.add("Hola mundo"); //forzar al arraylist a un solo tipo de dato
        alMiArrayList.add(7.0);
        alMiArrayList.add(true); 
        alMiArrayList.get(0);*/
        
        LinkedList<Integer> miListaEnlazada = new LinkedList(); //Especificar tipo de dato: enteros
        miListaEnlazada.add(10); //Se agrega el valor entero 10
        miListaEnlazada.add(20); //Se agrega el valor entero 20
        miListaEnlazada.add(30); //Se agrega el valor entero 30
        miListaEnlazada.add(40); //Se agrega el valor entero 40
        miListaEnlazada.add(50); //Se agrega el valor entero 50
        System.out.println("Mi Lista enlazada:"); //Mensaje de salida
        System.out.println(miListaEnlazada); //Se muestra la lista enlazada
        for (int i = 0; i < miListaEnlazada.size(); i++){ //Ciclo for para recorrer los valores de la lista
            System.out.print("[" + miListaEnlazada.get(i) + "]");
        }
        miListaEnlazada.remove(3); //Se remueve el valor 3 de la lista
        System.out.println(""); //Espacio
        System.out.println(miListaEnlazada); //Se muestra la lista enlazada
    }
    
}
