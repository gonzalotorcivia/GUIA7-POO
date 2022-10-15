package guia7ej6.entidades;

import java.util.Scanner;

public class Cafetera {

    private int capacidadMaxima=1000;
    private int capacidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return capacidadActual;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCapacidadActual(int cantidadActual) {
        this.capacidadActual = cantidadActual;
    }

    public void llenarcafetera() {

        capacidadActual = capacidadMaxima;

    }

    public void servirTaza(int capacidadtaza) {

        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese el tamaño de su taza");
       
        capacidadtaza = leer.nextInt();
        
        if (capacidadActual >= capacidadtaza) {
            
            System.out.println("La taza se lleno con " +capacidadtaza);

            capacidadActual -= capacidadtaza;
            
        } 
        
        else {
                System.out.println("Su taza recibio: " +capacidadActual+ "de" + capacidadtaza);
                
                capacidadActual=0;          
        }    
    
       } 
    
       public void vaciarCafetera(){
       
           capacidadActual = 0;
           
           System.out.println("La cafetera esta vacia");
    }
    
    
    public void agregarCafe(int llenado){
    
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese la cantidad de Cafe");
        
        llenado = leer.nextInt();
        
        if (capacidadActual+llenado <= capacidadMaxima) {
            
            capacidadActual += llenado;
            
        } else {
            
            System.out.println("La cantidad ingresada supera: " + capacidadMaxima);
            
            capacidadActual = capacidadMaxima;
            
        }
   
    
    }

  
    }
                
  

