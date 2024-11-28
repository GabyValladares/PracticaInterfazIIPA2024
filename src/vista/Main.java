/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Cuadrado;
import modelo.FiguraGeometrica;
import modelo.Triángulo;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        
       //INSTANCIAR OBJETO
       //Cuadrado c1=new Cuadrado(9);
       
               // Crear un objeto de la clase Triangulo
        Triángulo triangulo = new Triángulo(5.0, 3.0, 5.0, 4.0, 6.0);

        // Mostrar información del triángulo
        System.out.println(triangulo);

        // Calcular y mostrar el área del triángulo
        triangulo.area();

        // Calcular y mostrar el perímetro del triángulo
        triangulo.perimetro();
    }
}
        
        
        
        
        
        
        
        
        
    
    
