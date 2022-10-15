package guia7.ejextra3;

import entidades.Raices;
import servicio.ServicioRaices;

public class Guia7EjExtra3 {

    public static void main(String[] args) {

        ServicioRaices sr = new ServicioRaices();
        
        Raices r1 = sr.crearRaices();
        
        double Discriminante = sr.getDiscriminate(r1);
        
        System.out.println("El valor discriminante es: " +Discriminante);
        
        sr.tieneRaices(Discriminante);
        
        sr.tieneRaiz(Discriminante);
        
        sr.obtenerRaices(Discriminante, r1);
        
        sr.obtenerRaiz(Discriminante, r1);
        
        sr.calcular(Discriminante, r1);
        
        
        
        
    }
    
}
