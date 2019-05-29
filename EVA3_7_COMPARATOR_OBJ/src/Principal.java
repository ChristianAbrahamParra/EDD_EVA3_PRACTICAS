
import java.util.Comparator;
import java.util.Iterator;
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

        LinkedList<Persona> llObjetos = new LinkedList(); //Nuestra lista aceptará datos de tipo persona
        llObjetos.add(new Persona()); //
        llObjetos.add(new Persona("Juan", "Pérez", 20)); //Se agrega una persona y su edad 
        llObjetos.add(new Persona("Matusalén", "Jiménez", 800)); //Se agrega una ppersonade edad 800
        llObjetos.add(new Persona("Ángela", "Vázquez", 18)); //Se agrega una persona de edad 18
        llObjetos.add(new Persona("Gustavo", "Vázquez", 20)); //Se agrega una persona de edad 20
        llObjetos.add(new Persona("Abelardo", "Vázquez", 24)); //Se agrega una persona de edad 24

        for (Iterator<Persona> iterator = llObjetos.iterator(); iterator.hasNext();) { //ciclo for
            Persona next = iterator.next();
            System.out.println("Nombre " + next.getNombre()); //Se obtiene el nombre
            System.out.println("Apellido " + next.getApellido()); //Se obtiene el apellido
            System.out.println("Edad: " + next.getEdad()); //Se obtiene la edad
            System.out.println("-----------------");
        }
        //Ordenamiento por nombre y apellido
        
        Comparator cEdad = new Comparator(){ //comparator de la edad

            @Override //abstracto
            public int compare(Object o1, Object o2) { //compare de objeto 1 y objeto 2
                Persona pPer1 = (Persona) o1; //Se declara de tipo Persona
                Persona pPer2 = (Persona) o2; //Se declara de tipo Persona
                return pPer1.getEdad() - pPer2.getEdad(); //Se restan para obtener el resultado
            }
            
        };
        llObjetos.sort(cEdad); //se recibe la edad
        System.out.println("LISTA ORDENADA POR EDAD");
        System.out.println("--------------------");
        for (Iterator<Persona> iterator = llObjetos.iterator(); iterator.hasNext();) {
            Persona next = iterator.next();
            System.out.println("Nombre " + next.getNombre()); //se obtiene el nombre
            System.out.println("Apellido " + next.getApellido()); //Se obtiene el apellido
            System.out.println("Edad: " + next.getEdad()); //Se obtiene la edad
            System.out.println("-----------------");
        }
        
        Comparator cApeNomb = new Comparator() {

            @Override //abstracto
            public int compare(Object o1, Object o2) { //compare objeto 1 y objeto 2
                Persona pPer1 = (Persona) o1; //de tipo Persona objeto 1
                Persona pPer2 = (Persona) o2; //de tipo Persona objeto 2
                char cAp1, cAp2; //Variables de tipo char
                cAp1 = pPer1.getApellido().charAt(0); //Se declara la primer variable para ordenar por apellido
                cAp2 = pPer2.getApellido().charAt(0); //Se declara la segunda variable para ordenar por apellido
                int iResu = cAp1 - cAp2; //El resultado es igual a la variable 1 menos variable 2
                if(iResu == 0){ //Si el resultado es igual a cero
                    char cNom1, cNom2; //variables de tipo char
                    
                    cNom1 = pPer1.getNombre().charAt(0);
                    cNom2 = pPer2.getNombre().charAt(0);
                    iResu = cNom1 - cNom2;
                }
                return iResu;
            }
        };
        
         //Comparar por edad
        
        llObjetos.sort(cApeNomb); //Sort se encarga
        
        
        System.out.println("LISTA ORDENADA POR NOMBRE Y APELLIDO");
        for (Iterator<Persona> iterator = llObjetos.iterator(); iterator.hasNext();) { //ciclo for
         Persona next = iterator.next();   
        System.out.println("Nombre " + next.getNombre()); //Se obtiene el nombre
            System.out.println("Apellido " + next.getApellido()); //Se obtiene el apellido
            System.out.println("Edad: " + next.getEdad()); //Se obtiene la edad
            System.out.println("-----------------");
        
        
        } 
        //Ordenar por apellido y nombre
        
        
        
        
            

    }

}

class Persona { //Clase Persona

    private String nombre; //atributo nombre
    private String apellido; //atributo apellido
    private int edad; //atributo de tipo entero edad

    public Persona() {
        nombre = "Christian"; //se asignan valores a loa atributos
        apellido = "Parra";
        edad = 19;
    }

    public Persona(String nombre, String apellido, int edad) { //Constructor con parámetros
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() { //Se obtiene el nombre
        return nombre;
    }

    public void setNombre(String nombre) { //Muestra el nombre
        this.nombre = nombre;
    }

    public String getApellido() { //Se obtiene el apellido
        return apellido;
    }

    public void setApellido(String apellido) { //Muestra el apellido
        this.apellido = apellido;
    }

    public int getEdad() { //Se obtiene la edad
        return edad;
    }

    public void setEdad(int edad) { //Muestra la edad
        this.edad = edad;
    }

}
