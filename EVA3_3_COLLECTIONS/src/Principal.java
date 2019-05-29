
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

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
        // TODO code application logic here
        
        //STACK
        Stack<Integer> stPila = new Stack(); //Se declara un objeto de tipo stack que almacene valores enteros
        stPila.push(100); //Se agrega un valor entero de 100
        stPila.push(200); //Se agrega un valor entero de 200
        stPila.push(300); //Se agrega un valor entero de 300
        stPila.push(400); //Se agrega un valor entero de 400
        stPila.push(500); //Se agrega un valor entero de 500
        System.out.println(stPila); //Se imprimen los datos almacenados
        System.out.println(stPila.peek()); //Se imprimen los datos con el método peek
        System.out.println(stPila); //Se imprimen nuevamente los valores
        System.out.println(stPila.pop()); //Se imprimen los valores con método pop
        System.out.println(stPila); //Se imprimen los valores
        
        //COLAS - Queue
        
        Queue<Integer> qCola = new LinkedList(); //Se declara un objeto de tipo cola que almacene valores enteros
        qCola.add(100); //S eagrega un valor entero de 100
        qCola.add(200); //Se agrega un valor entero de 200
        qCola.add(300); //Se agrega un valor entero de 300
        qCola.add(400); //Se agrega un valor entero de 400
        qCola.add(500); //Se agrega un valor entero e 500
        qCola.add(600); //Se agrega un valor entero de 600
        System.out.println("--------QUEUE---------"); //QUEUE
        System.out.println(qCola); //Se imprimen los valores de la cola
        System.out.println(qCola.peek()); //Método peek
        System.out.println(qCola); //Se imprien nuevamente los valores
        System.out.println(qCola.poll()); //No lanza excepción
        System.out.println(qCola); //Se imprimmen nuevamente los valores
        
        //SETS - CONJUNTOS --> No hay elementos repetidos
        
        Set<Integer> stMiConjunto = new LinkedHashSet<>(); //clase abstracta
        stMiConjunto.add(100); //Se agrega un valor entero de 100
        stMiConjunto.add(200); //Se agrega un valor entero de 200
        stMiConjunto.add(300); //Se agrega un valor entero de 300
        stMiConjunto.add(400); //Se agrega un valor entero de 400
        stMiConjunto.add(100); //Se agrega un valor entero de 100
        stMiConjunto.add(200); //Se agrega un valor entero de 200
        System.out.println("------SET------"); //SET
        System.out.println(stMiConjunto); //Se imprimen los valores del conjunto SET
        
        
        
    }
    
}
