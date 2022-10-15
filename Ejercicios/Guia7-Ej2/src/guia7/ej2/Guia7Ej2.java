/*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = Math.PI * Math.pow(radio, 2)).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2*Math.Pi*Radio).*/

package guia7.ej2;

import guia7.ej2.entidades.Circunferencia;

public class Guia7Ej2 {

    public static void main(String[] args) {
     
        Circunferencia Circulo = new Circunferencia();
        
        Circulo.CrearCircunferencia();
        
        System.out.println("El área es igual a " + Circulo.Area());

        System.out.println("El perímetro es igual a " + Circulo.Perimetro());    
    }
    
}
