/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christiann Abraham Parra Pérez
 * # Control: C18550333
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lista<String> miLista = new Lista(); //Declaramos una lista que almacena valores de tipo cadena
        miLista.agregarNodo("Hola"); //Se agrega al nodo la cadena Hola
        miLista.agregarNodo(" "); //Se agrega un espacio al nodo
        miLista.agregarNodo("Mundo"); // Se agrega al nodo la cadena mundo
        miLista.agregarNodo(" "); //Se agrega al nodo un espacio
        miLista.agregarNodo("Cruel"); //Se agrega al nodo la palabra cruel
        miLista.agregarNodo("!!!"); //Sr agrega al nodo signos de exclamación
        miLista.imprimir(); //Se llama al método imprimir para mostrar los valores
    }
    
}
//Tipos de datos genèricos
class Nodo<T>{ //T es cualquier tipo de dato
    private T dato; //atributo de tipo entero para almacenar el dato
    //Atributo para crear la lista (referencias)
    private Nodo sig; //enlace
    
    public Nodo(){
        sig = null; //la referencia debe ser inicializada a nulo
    }

    public Nodo(T dato) { //constructor que reciba el dato
        this.dato = dato;
        this.sig = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
}

class Lista<T>{ //Tipo de dato genérico
    
     private Nodo inicio; //de tipo nodo para apuntar a nodos. Va a marcar el inicio de la lista
    private Nodo fin;
    private int iCantNodos;

//Al crear la lista, inicia con cero elementos
    //Lista vacía
    //3 Estados: Vacía, con un Nodo, con N Nodos
    public Lista() {
        inicio = null; //Lo inicializamos con null
        fin = null; //debe valer null
    iCantNodos= 0;
    }

//Primer método: Agregar un Nodo
    //Método que reciba un Nodo
    
    //Eficiencia o (N)
    public void agregarNodo(T dato) { //Vamos a recibir un Nodo
        //Verificar el estado de la lista
        //Está vacía?
        Nodo<T> nNuevo = new Nodo(dato); //Nodo de tipo T, hay que enviarle el dato. Lo que importa es el tipo de dato que hay que almacenar
        if (inicio == null) { //Lista vacía
            inicio = nNuevo;
            fin = nNuevo; //Modificado, mayor eficiencia
        } else { //Lista con un nodo
            //Llevar al final de la lista
            /*Nodo nTemp = inicio;
             while(nTemp.getSig() != null ){ //No sabemos cuántos elementos hay, por eso while. Nos debemos de detener antes.
             nTemp = nTemp.getSig(); //Asi recorremos cada elemento
             }
             //Conectamos nTemp.sig --> nuevo
             nTemp.setSig(nNuevo);*/

            fin.setSig(nNuevo);
            fin = nNuevo;
            iCantNodos++;

        }

    }
    public void imprimir() {
        //lLEVAR AL FINAL DE LA LISTA
        Nodo nTemp = inicio;
        while (nTemp != null) { //Nos interesa recorrerlos todos
            System.out.print("[" + nTemp.getDato() + "]");
            nTemp = nTemp.getSig();
        } //lo esencial para recorrer las listas
        System.out.println("");
    }
}