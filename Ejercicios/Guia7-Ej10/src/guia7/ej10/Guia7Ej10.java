package guia7.ej10;

import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class Guia7Ej10 {

    public static void main(String[] args) {

        double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        //mostramos el arregloA por pantalla dandole llenandolo de forma aleatoria
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        for (int i = 0; i < arregloA.length; i++) {

            arregloA[i] = Math.random();

            System.out.println("Mostrar arregloA " + "[ " + arregloA[i] + " ]");

        }

        //Ordenamos el ArregloA de menor a mayor
        int[] a = {7, 2, 4, 8, 3, 9, 1, 5, 10, 6};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < 20; i++) {

            if (i < 10) {

                arregloB[i] = arregloA[i];

            } else {

                arregloB[i] = 0.50;
            }
        }
        for (int i = 0; i < 50; i++) {

            if (i < 20) {

                System.out.println("[ " + arregloA[i] + " ] -  [" + arregloB[i] + " ]");

            } else {

                System.out.println("[ " + arregloA[i] + " ]");

            }
        }
    }

}
