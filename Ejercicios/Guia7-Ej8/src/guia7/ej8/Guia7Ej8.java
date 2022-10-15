
package guia7.ej8;

import entidades.Cadena;
import java.util.Locale;
import java.util.Scanner;
import servicio.ServicioCadena;



public class Guia7Ej8 {

      public static void main(String[] args) {
       
          Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
          // creamos el objeto
          Cadena frase1 = new Cadena();
          
          System.out.println("Ingrese una frase o palabra");
          
          String fraseingresada = leer.nextLine();
          
          frase1.setFrase(fraseingresada);//guardo la frase atraves del set
          frase1.setLongitudfrase(fraseingresada.length()); //guardo la longitud atraves del set
          
          ServicioCadena sc = new ServicioCadena();
          
          //traigo del servicio los metodos
          System.out.println("La frase o palabra ingresada tiene " +sc.mostrarVocales(frase1)+ " vocales");
         
          sc.invertirFrase(frase1);
          
          sc.vecesRepetidos(frase1);
          
          System.out.println("Ingrese una nueva frase o palabra");
          String frase2 = leer.next();
          sc.compararLonguitud(frase1,frase2);
          
          System.out.println("Ingrese una nueva frase");
          String frase3 = leer.next();
          sc.unirfrase(frase1, frase3);
          
          
          System.out.println("Ingrese un Caracter");
          String caracterA = leer.next();
          sc.remplazar(frase1, caracterA);
          
          System.out.println("Ingrese la letra a verificar");
          String letra = leer.next();
          sc.contiene(frase1, letra);
          
    }
    
}
