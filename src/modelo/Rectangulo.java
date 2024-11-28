/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Carlos
 */
public class Rectangulo implements FiguraGeometrica{
    //1.ATRIBUTO
    private double base;
    private double altura;
    
    //2.CONSTRUCTORES

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //.ENCAPSULAMIENTO

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    //MÉTODOS DE REGLA DE NEGOCIO

    @Override
    public String toString() {
        return "DATOS DEL RECTANGULO:"+
                "Base:"+getBase()+
                "Altura:"+getAltura();
    }

    @Override
    public void area() {
        //IMPLEMENTACIÓN DE BLOQUE PERSONALIZADA
        double resultado= getBase() * getAltura();
        System.out.println("El área del rectangulo es:"+resultado);
        
    }

    @Override
    public double perimetro() {
        return 2*getAltura() + 2*getBase();
    }
    
    
    
}
