
import java.util.Scanner;

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
        int[] aiDatos = new int[20]; //Se declara un arreglo de tamaño 20
        
        for (int i = 0; i < aiDatos.length; i++) { //se recorren los valores del arreglo
            aiDatos[i] = (int) (Math.random() * 100) + 1; //Se generan valores aleatorios
            
    }
        
    imprimir(aiDatos); //Se imprimen los valores
    selectionSort(aiDatos); //Se implementa el método Sort a los valores
    imprimir(aiDatos); //Se imprimen los valores con el Sort implementado
    Scanner sInput = new Scanner(System.in); //Scanner para pedir datos al usuario
        System.out.println("Introduce un valor a buscar");
        int iVal = sInput.nextInt();
        int iPos = busquedaBinaria(aiDatos, iVal); //Nos pide el arreglo y el valor a buscar
        if(iPos == -1){ //Quiere decir que no lo encontro si nos regresa un menos 1
            System.out.println("El elemento no existe");
        } else{
            System.out.println("El elemento está en la posición " + iPos);
        }
    
    
    

    }
    
    public static void imprimir(int[] aiDatos) { //Método imprimir
        for (int i = 0; i < aiDatos.length; i++) { //Se recorren los valores del arreglo
            System.out.print("[" + aiDatos[i] + "]");
        }
        System.out.println("");
    }
    
    public static void selectionSort(int[] aiDatos) { //Método Selection Sort
        for (int i = 0; i < aiDatos.length; i++) { //Recorrer todos
            int iMin = i; //La primer posición
            for (int j = i + 1; j < aiDatos.length; j++) { //HAY QUE COMPARAR CON EL SIGUIENTE, POR ESO j;i
                if (aiDatos[j] < aiDatos[iMin]) {
                    iMin = j;
                }

            }
            if (iMin != i) { //Intercambiar dato
                int iTemp = aiDatos[i]; //Necesitamos crear una variable temporal y ahí guardamos i
                aiDatos[i] = aiDatos[iMin];
                aiDatos[iMin] = iTemp;

            }
        }

    }
    
    public static int busquedaBinaria(int[] aiDatos, int iVal ){ 
        return recurBusquedaBinaria(aiDatos, iVal, 0, aiDatos.length - 1); //Desde 0 hasta el elemento en lo alto
    }
    
    private static int recurBusquedaBinaria(int [] aiDatos, int iVal, int lo, int hi){ //porque lo vamos a invocar desde busquedaBinaria, //nECESITA EL VALOR QUE SE VA A BUSCAR, NECESITA 3 DATOS ENTEROS, VALOR A BUSCAR, BAJO Y ALTO
        int iMid = lo + ((hi - lo) / 2); //Regresa como resultado enteros
        int iResu = -1;
        if(aiDatos[iMid] == iVal){ //Primero verificamos que el dato que buscamos estè en medio, si no, hacemos el ciclo
            iResu = iMid;
        } else { //NO LO ENCONTRAMOS, REPETIMOS
            if(iVal < aiDatos[iMid]){ //Si es menor, enviamos
                iResu = recurBusquedaBinaria(aiDatos, iVal, lo, iMid - 1); //Guardamos el valor
            } else {
                iResu = recurBusquedaBinaria(aiDatos, iVal, iMid + 1, iMid - 1); //Guardamos el valor
            }
        
        }
   return iResu; //Regresa el resultado
    }
    
}
