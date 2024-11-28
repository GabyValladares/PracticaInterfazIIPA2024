/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Triángulo implements FiguraGeometrica {

    // Atributos específicos del triángulo
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    // Constructor
    public Triángulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Métodos implementados de la interfaz
    @Override
    public void area() {
        double area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);
    }

    @Override
    public double perimetro() {
        double perimetro = lado1 + lado2 + lado3;
        System.out.println("El perímetro del triángulo es: " + perimetro);
        return perimetro;
    }

    // Métodos getters y setters
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

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    // Método toString
@Override
public String toString() {
    return "\n♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥\n" +
           "           T R I Á N G U L O           \n" +
           "♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥\n" +
           "♥ Base: " + base + " unidades\n" +
           "♥ Altura: " + altura + " unidades\n" +
           "♥ Lados: " + lado1 + ", " + lado2 + ", " + lado3 + " unidades\n" +
           "♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥";
}
}

