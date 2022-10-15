package guia7.ej1;

import guia7.ej1.entidades.Libro;
import java.util.Scanner;

public class Guia7Ej1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

// Creo un Libro

        System.out.println("Ingrese los datos del Libro");
        Libro L1 = new Libro(leer.next(), leer.next(), leer.next(), leer.nextInt());

         System.out.println("El ISBN ingresado es " +L1.ISBN+" El Titulo del Libro es: "+L1.Titulo+ " El Autor es: "+L1.Autor+ " El Numero de Pagina es: "+L1.NPagina+"");
        
//        System.out.println("Ingrese el ISBN de Libro");
//        L1.ISBN = leer.next();
//        System.out.println("Ingrese el Titulo de Libro");
//        L1.Titulo = leer.next();
//        System.out.println("Ingrese el Autor del Libro");
//        L1.Autor = leer.next();
//        System.out.println("Ingrese el Numero de Pagina");
//        L1.NPagina = leer.nextInt();
//        
      
        

    }

}
