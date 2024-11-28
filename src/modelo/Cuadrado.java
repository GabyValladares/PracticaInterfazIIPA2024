/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Cuadrado implements FiguraGeometrica {

    //1.ATRIBUTO
    private double lado;

    //2.CONSTRUCTORES
    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    //3. ENCAPSULAMIENTO
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    
    //MÉTODOS DE REGLA DE NEGOCIO 

    @Override
    public String toString() {
        return "DATOS DEL CUADRARO\n"
                + "Lado:" + getLado();
    }

    @Override
    public void area() {
        //IMPLEMENTACIÓN DE BLOQUE PERSONALIZADA
        double resultado = getLado() * getLado();
        System.out.println("El área del Cuadrado es:" + resultado);
    }

    @Override
    public double perimetro() {
       
        return 4 * getLado();
    }

}
