package guia7.ej4.entidades;

import java.util.Scanner;

public class Rectangulo {
    
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void CrearRectangulo(){
           
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese la Base del Rectangulo");
        base=leer.nextInt();
        System.out.println("Ingrese la Altura del Rectangulo");
        altura=leer.nextInt();
    }    
    
    public int Superficie(){
    
        return base*altura;        
    }
        
    public int Perimetro() {
    
        return (base+altura)*2;            
    }    
    
    public void Dibujar(){
         
        for (int i = 0; i < altura; i++) {
        
            for (int j = 0; j < base; j++) {
            
                if (i == 0 || j == 0 || j == base-1 || i == altura-1) {
                   
                    System.out.print(" * ");
                    
                } else {
                  
                    System.out.print("   ");
                }
            }
            
            System.out.println(" ");
        }
    
    
    }
    
    }
    

