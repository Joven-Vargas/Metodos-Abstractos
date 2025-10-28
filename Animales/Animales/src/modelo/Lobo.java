/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Asus
 */


public class Lobo extends Canino {
    public Lobo(String nombre) {
        super(nombre, "Bosque", "Pulmonar", 30.0, 0.8, "Carnívoro", "Lobo gris", "Espeso", true, "4", 40);
    }

    public void aulla() {
        System.out.println(nombre + " está aullando.");
    }

    @Override
    public void imprimir() {
        System.out.println("Lobo: " + nombre + " - raza " + raza);
    }
}


