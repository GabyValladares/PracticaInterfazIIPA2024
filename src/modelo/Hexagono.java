/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author CASA PC
 */
public class Hexagono implements FiguraGeometrica {

    
    private double lado;

    
    public Hexagono() {
    }

    public Hexagono(double lado) {
        this.lado = lado;
    }

  
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

  

    @Override
    public String toString() {
        return "DATOS DEL HEXÁGONO\n"
                + "Lado: " + getLado();
    }

    @Override
    public void area() {
        double resultado = (3 * 1.732 * lado * lado) / 2; 
        System.out.println("El área del Hexágono es: " + resultado);
    }

    @Override
    public double perimetro() {
        return 6 * getLado();
    }
}

