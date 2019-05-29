
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
       
        
        //COMPARATOR --> MECANISMO DE ORDENAMIENTO
        
        LinkedList<Integer> llDatos = new LinkedList(); //Se declara una lista enlazada que guarde valores enteros
        llDatos.add(100); //Se agrega un valor entero de 100
        llDatos.add(800); //Se agrega un valor entero de 800
        llDatos.add(400); //Se agrega un valor entero de 400
        llDatos.add(500); //Se agrega un valor entero de 500
        llDatos.add(300); //Se agrega un valor entero de 300
        System.out.println(llDatos); //Se imprimen los valores
        
        
        Comparator cmOrdena = new Comparator() { //Se declara un nuevo objeto de tipo comparator

            @Override 
            public int compare(Object o1, Object o2) {
                //Hay que regresar 
                //Positivo --> o1 > o2 (se debe hacer cambio)
                //Cero --> o1 = o2 son iguales
                //Negativo --> o1 < o2 no hay cambios
                
                int iVal1 = (int) o1;
                int iVal2 = (int) o2;
                return iVal1 - iVal2;
            }
        }; //Clase abstracta, necesitamos crear una clase anónima e implementar los métodos
        
        llDatos.sort(cmOrdena); //Sort se hace cargo del ordenamiento
        System.out.println(llDatos); //Se imprimen los datos
        
        //dwevuelve un valor para establecer la compraracion
        //A vs B
                
                //Entero -- Positivo cero negativo
        //A vs B > 0 A >B
        //A vs b = 0 A = B
        //A vs B > 0 A < B
        
    }
    
}
