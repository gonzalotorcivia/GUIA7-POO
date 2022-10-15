package guia7ej6;

import guia7ej6.entidades.Cafetera;

public class Guia7Ej6 {

    public static void main(String[] args) {

        Cafetera cafe = new Cafetera();

        cafe.llenarcafetera();

        cafe.setCapacidadMaxima(1000);

        cafe.servirTaza(0);

        System.out.println("La cantidad Actual es : " + cafe.getCantidadActual());

        cafe.agregarCafe(0);

        System.out.println("La cantidad Actual es : " + cafe.getCantidadActual());

        cafe.vaciarCafetera();
       
    }

}
