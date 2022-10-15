package guia7.ej12;

import entidades.Persona;
import java.util.Locale;
import java.util.Scanner;
import servicio.ServicioPersona;

public class Guia7Ej12 {

    public static void main(String[] args) {

        ServicioPersona sp = new ServicioPersona();

        Persona p1 = sp.crearPersona();

        sp.calcularEdad(p1);

        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        
        int edad1=0;

        System.out.println("La edad ingresada es menor que la edad de la persona?: " + sp.menorQue(edad1, sp.calcularEdad(p1)));

        System.out.println("--------------------------");
        
        
        sp.mostrarPersona(p1);
        
    }

}
