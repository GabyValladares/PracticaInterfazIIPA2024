/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Cuadrado;
import modelo.FiguraGeometrica;
import modelo.Octagono;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Octágono
        Octagono octagono = new Octagono();
        octagono.setLado(5.0);   // Establecer el valor del lado

        // Mostrar los datos del octágono
        System.out.println(octagono.toString());
        
        // Calcular y mostrar el área
        octagono.area();
        
        // Calcular y mostrar el perímetro
        double perimetro = octagono.perimetro();
        System.out.println("El perímetro del octágono es: " + perimetro);
    }
}
