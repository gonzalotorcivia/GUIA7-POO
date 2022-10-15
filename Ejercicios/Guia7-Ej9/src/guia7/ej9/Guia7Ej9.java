package guia7.ej9;

import entidades.Matematica;

import static servicio.ServicioMatematica.devolverMayor;
import static servicio.ServicioMatematica.calcularPotencia;
import static servicio.ServicioMatematica.calcularRaiz;

public class Guia7Ej9 {

    public static void main(String[] args) {
        Matematica Mat1 = new Matematica();

        Mat1.setNum1((Math.random() * 10));

        Mat1.setNum2((Math.random() * 10));

        System.out.println("El numero 1 es: " + Mat1.getNum1());
        System.out.println("El numero 2 es: " + Mat1.getNum2());

        devolverMayor(Mat1);

        calcularPotencia(Mat1);

        calcularRaiz(Mat1);

    }
}
