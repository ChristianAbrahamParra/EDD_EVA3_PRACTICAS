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
        System.nanoTime(); //mil millonésima de segundo

        int[] aiDatos = new int[1000000]; //Se declara un arreglo
        int[] aiCopia = new int[aiDatos.length]; //Se declara una copia del arreglo
        int[] aiCopia2 = new int[aiDatos.length]; //Se declara una segunda copia del arreglo
        int[] aiCopia3 = new int[aiDatos.length]; //Se declara una tercera copia del arreglo
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int) (Math.random() * 100) + 1;
            aiCopia[i] = aiDatos[i]; //Para hacer una buena comparación tiene que ser los mismos datos
            aiCopia2[i] = aiDatos[i];
            aiCopia3[i] = aiDatos[i];
        }

        long iIni, iFin, iResu; // se declaran tres variables de tipo long
        imprimir(aiDatos); //se imprimen los datos
        System.out.println("ARREGLO ORDENADO: Selection Sort");
        iIni = System.nanoTime(); //Se manda a llamar a nano time para establecer el inicio
        selectionSort(aiDatos); //Se imprimen los datos
        iFin = System.nanoTime(); //Se manda a llamar a nano time para establecer el final
        iResu = iFin - iIni; //Se determina el resultado del tiempo restando el final con el inicio
        System.out.println("Tiempo selection = " + iResu);
        imprimir(aiDatos); //Se imprimen los datos

        System.out.println("ARREGLO ORDENADO: Insertion Sort");
        iIni = System.nanoTime(); //Se manda a llamar a nano time para establecer el inicio
        insertionSort(aiCopia); //Se imprimen los datos
        iFin = System.nanoTime(); //Se manda a llamar a nano time para establecer el final
        iResu = iFin - iIni; //Se determina el resultado del tiempo restando el final con el inicio
        System.out.println("Tiempo insertion = " + iResu);
        imprimir(aiCopia); //Se imprimen los datos de la copia

        System.out.println("ARREGLO ORDENADO: Bubble Sort");
        iIni = System.nanoTime(); //Se manda a llamar a nano time para establecer el inicio
        bubbleSort(aiCopia2); //Se imprimen los datos de la copia 2
        iFin = System.nanoTime(); //Se manda a llamar a nano time para establecer el final
        iResu = iFin - iIni; //Se determina el resultado del tiempo restando el final con el inicio
        System.out.println("Tiempo bubble = " + iResu);
        imprimir(aiCopia2); //Se imprimen los datos de la copia 2

        System.out.println("ARREGLO ORDENADO: Quick Sort");
        iIni = System.nanoTime(); //Se manda a llamar a nano time para establecer el inicio
        quickSort(aiCopia3, 0, aiCopia3.length - 1); //Se imprimen los datos de la copia 3, recibiendo 3 parámetros
        iFin = System.nanoTime(); //Se manda a llamar a nano time para establecer el final
        iResu = iFin - iIni; //Se determina el resultado del tiempo restando el final con el inicio
        System.out.println("Tiempo Quick = " + iResu);
        imprimir(aiCopia3); //Se imprimen los datos de la copia 3

    }

    public static void imprimir(int[] aiDatos) { //Método imprimir 
        for (int i = 0; i < aiDatos.length; i++) { //se recorren los valores del arreglo
            System.out.print("[" + aiDatos[i] + "]");
        }
        System.out.println("");
    }

    //Eficiencia es O(n^2) -- Comparaciones
    //O(N)-- Intercambio
    public static void selectionSort(int[] aiDatos) { //Método selection
        for (int i = 0; i < aiDatos.length; i++) { //Recorrer todos
            int iMin = i; //La primer posición
            for (int j = i + 1; j < aiDatos.length; j++) { //HAY QUE COMPARAR CON EL SIGUIENTE, POR ESO j;i
                if (aiDatos[j] < aiDatos[iMin]) {
                    iMin = j;
                }

            }
            if (iMin != i) { //Intercambiar dato
                int iTemp = aiDatos[i]; //Necesitamos crear una variable temporal y ahí guardamos i
                aiDatos[i] = aiDatos[iMin]; //Intercambio
                aiDatos[iMin] = iTemp; //Intercambio

            }
        }

    }

    //Intercambia más -- O(n2)
    public static void insertionSort(int[] aiDatos) { //Tomamos el primer elemento y lo colocamos donde es
        // 2 for

        //i, insP, Prev, Temp
        for (int i = 1; i < aiDatos.length; i++) { //Ciclo for para empezar desde 1 el arreglo
            int insP = aiDatos[i]; //insP es igual a i
            int j = i - 1; //j es igual a i -1

            while (j >= 0 && aiDatos[j] > insP) {
                aiDatos[j + 1] = aiDatos[j];
                j--;
            }
            aiDatos[j + 1] = insP;
            //aiDatos[insP] = iTemp;
        }
    }

    //Eficiencia:
//Comparaciones O(n2)
//Intercambios O(n2)
    public static void bubbleSort(int[] aiDatos) {

        boolean sorted = false;
        int Final = aiDatos.length - 1;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < aiDatos.length - 1; i++) {
                if (aiDatos[i] > aiDatos[i + 1]) {
                    swap(aiDatos, i, i + 1);
                    sorted = false;

                }
            }
            Final--;
        }
    }

    public static void swap(int[] aiDatos, int i, int j) { //Para hacer el intercambio más rápido y ahorrar tiepo
        int iTemp = aiDatos[i];
        aiDatos[i] = aiDatos[j];
        aiDatos[j] = iTemp;
    }

    public static void quickSort(int[] aiDatos, int Primero, int Final) {
        int i, j, Pivote;
        i = Primero;
        j = Final;
        Pivote = aiDatos[(Primero + Final) / 2];
        do {
            while (aiDatos[i] < Pivote) {
                i++;
            }
            while (aiDatos[j] > Pivote) {
                j--;
            }
            if (i <= j) {
                int iTemp = aiDatos[i];
                aiDatos[i] = aiDatos[j];
                aiDatos[j] = iTemp;
                i++;
                j--;
            }
        } while (i <= j);
        if (Primero < j) {
            quickSort(aiDatos, Primero, j);

        }
        if (i < Final) {
            quickSort(aiDatos, i, Final);
        }

    }
}
    
    
    
    
    



//Algoritmo de ordenamiento y de búsqueda
