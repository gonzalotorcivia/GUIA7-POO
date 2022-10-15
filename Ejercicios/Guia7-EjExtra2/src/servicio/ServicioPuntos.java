package servicio;

import entidades.Puntos;
import java.util.Locale;
import java.util.Scanner;

public class ServicioPuntos {

    public Puntos crarPuntos() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        Double x1,x2,y1,y2;

        System.out.println("Ingrese el valor para el punto x1");
        x1 = leer.nextDouble();
        System.out.println("Ingrese el valor para el punto y1");
        y1 = leer.nextDouble();
         System.out.println("Ingrese el valor para el punto x2");
        x2 = leer.nextDouble();
        System.out.println("Ingrese el valor para el punto y2");
        y2 = leer.nextDouble();
        
        return new Puntos(x1, x2, y1, y2);
    }

    public Double puntosDistancia(Puntos p1){
        
        
             
      return Math.sqrt(Math.pow((p1.getX2()- p1.getX1()), 2) + Math.pow ((p1.getY2()- p1.getY1()), 2));
       
      
      
    }

}
