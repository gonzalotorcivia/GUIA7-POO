package guia7.ej7;

import entidades.Persona;
import servicios.servicioPersona;

public class Guia7Ej7 {

    public static void main(String[] args) {

        servicioPersona sp = new servicioPersona();

        
        Persona P1 = sp.crearPersona();
       // Persona P1 = new Persona("Jose",18,"H",80,1.80);
        
        int mayores = 0;
        int pesoideal = 0;
        int pesobajo = 0;
        int pesoalto = 0;

        if (sp.mayordeEdad(P1)) {

            System.out.println("La persona es mayor de edad");
            mayores++;
        } else {

            System.out.println("La persona es menor de edad");
        }

        switch (sp.calcularIMC(P1)) {

            case -1:
                System.out.println("Esta por debajo de su peso ideal");
                pesobajo++;
                break;
            case 0:
                System.out.println("Esta en su peso ideal");
                pesoideal++;
                break;
            case 1:
                System.out.println("Esta por encima de su peso ideal");
                pesoalto++;
                break;
        }
        //Persona P2 = sp.crearPersona();
        Persona P2 = new Persona("Juna",50,"M",50,1.50);
        if (sp.mayordeEdad(P2)) {

            System.out.println("La persona es mayor de edad");
            mayores++;
        } else {

            System.out.println("La persona es menor de edad");
        }

        switch (sp.calcularIMC(P2)) {

            case -1:
                System.out.println("Esta por debajo de su peso ideal");
                pesobajo++;
                break;

            case 0:
                System.out.println("Esta en su peso ideal");
                pesoideal++;
                break;
            case 1:
                System.out.println("Esta por encima de su peso ideal");
                pesoalto++;
                break;
        }
        //Persona P3 = sp.crearPersona();

        Persona P3 = new Persona("Martin",15,"H",60,1.20);
        
        if (sp.mayordeEdad(P3)) {

            System.out.println("La persona es mayor de edad");
            mayores++;
        } else {

            System.out.println("La persona es menor de edad");
        }

        switch (sp.calcularIMC(P3)) {

            case -1:
                System.out.println("Esta por debajo de su peso ideal");
                pesobajo++;
                break;
            case 0:
                System.out.println("Esta en su peso ideal");
                pesoideal++;
                break;
            case 1:
                System.out.println("Esta por encima de su peso ideal");
                pesoalto++;
                break;
        }
        //Persona P4 = sp.crearPersona();
        
        Persona P4 = new Persona("Josefina",15,"M",30,1.60);

        if (sp.mayordeEdad(P4)) {

            System.out.println("La persona es mayor de edad");
            mayores++;
        } else {

            System.out.println("La persona es menor de edad");
        }

        switch (sp.calcularIMC(P4)) {

            case -1:
                System.out.println("Esta por debajo de su peso ideal");
                pesobajo++;
                break;
            case 0:
                System.out.println("Esta en su peso ideal");
                pesoideal++;
                break;
            case 1:
                System.out.println("Esta por encima de su peso ideal");
                pesoalto++;
                break;
        }

        System.out.println("El porcentaje de mayores de edad es: " + ((float)mayores / 4 * 100) + "%");

        System.out.println("El porcentaje de peso bajo es: " + ((float)pesobajo / 4 * 100) + "%");

        System.out.println("El porcentaje de peso ideal es: " + ((float)pesoideal / 4 * 100) + "%");

        System.out.println("El porcentaje de peso alto es: " + ((float)pesoalto / 4 * 100) + "%");

    }

}
