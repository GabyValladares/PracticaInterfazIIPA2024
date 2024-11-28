/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Cuadrado;
import modelo.Rectangulo;

import modelo.Hexagono;


/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {

        
       //INSTANCIAR OBJETO
       Cuadrado c1=new Cuadrado(9);
       
       Rectangulo r1=new Rectangulo(15, 6);
       
       


        Hexagono hexagono = new Hexagono(8);

        System.out.println(hexagono);

        hexagono.area();

        System.out.println("El perímetro del Hexágono es: " + hexagono.perimetro());
    }
}


        
        
        
     
        
        
        
      
    

