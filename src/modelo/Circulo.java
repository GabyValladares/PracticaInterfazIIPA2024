/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Circulo implements FiguraGeometrica {

    private String nombre;
    private double radio;

    public Circulo() {

    }

    public Circulo(String nombre, double radio) {
        this.nombre = nombre;
        this.radio = radio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Datos del circulo\n"
                + "\n" + "Nombre:" + getNombre()
                + "\n" + " Radio:" + getRadio();
    }

    @Override
    public double perimetro() {
        return 2 * PI * getRadio();
    }

    @Override
    public void area() {
        double area = PI * getRadio() * getRadio();
        System.out.println("El area del circulo es:");
    }

}
