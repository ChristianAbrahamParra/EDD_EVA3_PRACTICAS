
import java.util.ArrayList;
import java.util.Iterator;

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
        
        ArrayList<Integer> alDatos = new ArrayList(); //Clase abstracta que alacena valores enteros
        alDatos.add(100); //Se agrega un valor entero de 100
        alDatos.add(200);//Se agrega un valor entero de 200
        alDatos.add(300); //Se agrega un valor entero de 300
        alDatos.add(400); //Se agrega un valor entero de 400
        alDatos.add(500); //Se agrega un valor entero de 500
        //Imprimir cada dato
        for(int i = 0; i< alDatos.size(); i++){ //menos eficiente
            System.out.println("[" + alDatos.get(i) + "]"); //Se imprime cada valor
        }
        System.out.println("---------");
    for (Iterator<Integer> iterator = alDatos.iterator(); iterator.hasNext();){  //Ciclo for
    Integer next = iterator.next();
    System.out.println("[" + next + "]");
        }
    
    System.out.println("---------");
    Iterator itMiItera = alDatos.iterator();
    while(itMiItera.hasNext()){
            System.out.println("[" + itMiItera.next() + "]");
    }
    
}
}
