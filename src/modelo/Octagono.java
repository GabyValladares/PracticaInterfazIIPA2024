/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Asus
 */
public class Octagono implements FiguraGeometrica {

    // Atributo
    private double lado;

    // Constructor
    public Octagono() {
    }

    // Encapsulamiento
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return """
               Datos del oct\u00e1gono
               Lado: """ + getLado();
    }

    @Override
    public void area() {
        // ladoAlCuadrado = Math.pow(getLado(), 2);
// raizDeDos = Math.sqrt(2);
//  suma = 1 + raizDeDos;
// multiplicacion = 2 * suma;
//  resultado = multiplicacion * ladoAlCuadrado;
        
        
        double resultado = 2 * (1 + Math.sqrt(2)) * Math.pow(getLado(), 2);
        System.out.println("El área del octágono es: " + resultado);
    }

    @Override
    public double perimetro() {
        return 8 * getLado();
    }
}
