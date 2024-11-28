/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Dell Core i7
 */
public class Trapecio implements FiguraGeometrica{
    
    ////1.ATRIBUTO
    private double baseUno;
    private double baseDos;
    private double altura;
    
    //2. CONSTRUCTORES

    public Trapecio() {
    }

    public Trapecio(double baseUno, double baseDos, double altura) {
        this.baseUno = baseUno;
        this.baseDos = baseDos;
        this.altura = altura;
    }
    
    //3. ENCAPSULAMIENTO

    public double getBaseUno() {
        return baseUno;
    }

    public void setBaseUno(double baseUno) {
        this.baseUno = baseUno;
    }

    public double getBaseDos() {
        return baseDos;
    }

    public void setBaseDos(double baseDos) {
        this.baseDos = baseDos;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
   //4. METODOS DE REGLA DE NEGOCIO

    @Override
    public String toString() {
        //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    
        return "DATOS DEL TRAPECIO \n"+ 
                "Base 1: " + getBaseUno()+"\n"+
                "Base 2: " + getBaseDos()+"\n"+
                "Altura: " + getAltura();
    }

    @Override
    public void area() {
        //IMPLEMENTACIÓN DE BLOQUE PERSONALIZADA
        double resultado = ((getBaseUno() + getBaseDos())*getAltura())/2;
        System.out.println("El área del Trapecio es: " + resultado);
    }

    @Override
    public double perimetro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
    
    
}
