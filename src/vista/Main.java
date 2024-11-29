/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Circulo;
import modelo.Cuadrado;
import modelo.FiguraGeometrica;

/**
 *
 * @author Usuario
 */
public class Main {

    public static void main(String[] args) {

        //INSTANCIAR OBJETO
        Cuadrado c1 = new Cuadrado(9);

        Circulo ci = new Circulo();
        ci.setNombre("Circulo");
        ci.setRadio(5);
        System.out.println(ci.toString());
       

    }
}
