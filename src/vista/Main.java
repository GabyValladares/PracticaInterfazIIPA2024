/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Cuadrado;
import modelo.FiguraGeometrica;
import modelo.Trapecio;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        
       //INSTANCIAR OBJETO PARA MOSTRAR RESULTADOS
       
        Trapecio t1= new Trapecio(5,8,6);   
        //System.out.println("DATOS CON toString ");
        System.out.println(t1.toString());
        t1.toString();
        t1.area();
        
        
    }  
    
}
