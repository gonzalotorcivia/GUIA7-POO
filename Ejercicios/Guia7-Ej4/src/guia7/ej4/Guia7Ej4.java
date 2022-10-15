package guia7.ej4;

import guia7.ej4.entidades.Rectangulo;

public class Guia7Ej4 {

    public static void main(String[] args) {

        Rectangulo r1 = new Rectangulo();
        
        r1.CrearRectangulo();
        
        System.out.println("La Superficie del Rectangulo es: "+r1.Superficie());
        
        System.out.println("El Perimetro del Rectangulo es: "+r1.Perimetro());
        
        r1.Dibujar();
        
        
        
        
        
        
    }
    
}
