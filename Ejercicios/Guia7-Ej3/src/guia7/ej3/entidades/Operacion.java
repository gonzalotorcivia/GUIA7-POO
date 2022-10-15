package guia7.ej3.entidades;

import java.util.Scanner;

public class Operacion {

    private double num1;
    private double num2;

    public Operacion() {
    }

    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void CrearOperacion() {

        System.out.println("Ingrese el numero 1");

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        num1 = leer.nextInt();

        System.out.println("Ingrese el numero 2");

        num2 = leer.nextInt();

    }

    public double Suma() {

        return num1 + num2;
    }

    public double Resta() {

        return num1 - num2;
    }

    public double Multiplicar() {

        return num1 * num2;

    }

    public double dividir() {

        double divididos;

        if (num1 == 0 || num2 == 0) {

            divididos = 0;

        } else {
            divididos = num1 / num2;
        }

        return divididos;
    }

}
