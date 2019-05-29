
import java.util.Comparator;
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
        
        LinkedList<String> llCadenas = new LinkedList(); //Se declara una lista enlazada que almacene valores enteros
        llCadenas.add("Hola"); //Se agrega un valor de tipo string Hola
        llCadenas.add("Mundo"); //Se agrega un valor de tipo string Mundo
        llCadenas.add("Cruel"); //Se agrega un valor de tipo string Cruel
        llCadenas.add("Estructura"); //Se agrega un valor de tipo string Estructura
        llCadenas.add("De"); //Se agrega un valor de tipo string De
        llCadenas.add("Datos"); //Se agrega un valor de tipo string Datos
        System.out.println(llCadenas); //Se imprimen las cadenas
        
        Comparator cOrdenCadenas = new Comparator(){

            @Override //abstracto
            public int compare(Object o1, Object o2) { //compare
                String cCade1 = (String) o1; //Se declara un string cCade1
                String cCade2 = (String) o2; //Se declara un string cCade2
                int iResu = 0; //iResu valor de cero
                //Comparar
                char c1, c2; //valores de tipo char
                c1 = cCade1.charAt(0);
                c2 = cCade2.charAt(0);
                
                while() //Tarea
               
                iResu = c1 - c2;
                
                
                
                
                return iResu;
            }
            
        };
        llCadenas.sort(cOrdenCadenas); //Sort se encarga de ordenar
        System.out.println(llCadenas); //Se imprime
    }
    
}
