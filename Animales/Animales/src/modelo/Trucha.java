/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Asus
 */
 
public class Trucha extends Pez {

    public Trucha(String nombre) {
        super(nombre, "Ríos", "Branquial", 1.5, 0.5, "Omnívora", true, 300, "dulce", 4);
    }

    public void saltar() {
        System.out.println(nombre + " salta fuera del agua.");
    }

    @Override
    public void imprimir() {
        System.out.println("Trucha: " + nombre + " - Tipo de agua: " + tipoAgua);
    }
}

