package guia7.ej5.entidades;

import java.util.Scanner;

public class Cuenta {

    public int numerocuenta;
    public long dni;
    public int saldoactual;

    public Cuenta() {
    }

    public Cuenta(int numerocuenta, long dni, int saldoactual) {
        this.numerocuenta = numerocuenta;
        this.dni = dni;
        this.saldoactual = saldoactual;
    }

    public int getNumerocuenta() {
        return numerocuenta;
    }

    public long getDni() {
        return dni;
    }

    public int getSaldoactual() {
        return saldoactual;
    }

    public void setNumerocuenta(int numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldoactual(int saldoactual) {
        this.saldoactual = saldoactual;
    }

    public void CrearCuenta() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese su numero de Cuenta");
        numerocuenta = leer.nextInt();
        System.out.println("Ingrese su DNI");
        dni = leer.nextInt();
        System.out.println("Ingrese el Saldo Actual");
        saldoactual = leer.nextInt();
    }

    public void IngresarDinero(double ingreso) {

        saldoactual += ingreso;
    }

    public void RetirarDinero(double retiro) {

        if (retiro <= saldoactual) {

            saldoactual -= retiro;

        } else {

            saldoactual = 0;
        }

    }

    public void ExtraccionRapida() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el monto que desea retirar, no puede superar el 20% de su saldo");
        double extraccion = leer.nextDouble();

        while (extraccion > (saldoactual * 0.20)) {

            System.out.println("Ingrese otro importe el maximo disponible es: " + saldoactual * 0.20);

            extraccion = leer.nextDouble();

        }

        saldoactual -= extraccion;

    }

    public void ConsultarSaldo (){
    
        System.out.println("Su saldo es: "+saldoactual);
        
    }
    
    public void ConsultarDatos(){
    
        System.out.println("Bienvenido su Saldo Actual es: " + saldoactual + " Su Dni es: " + dni + " Su numero de cuenta es: " + numerocuenta);       
        
        
    }

    }
    


