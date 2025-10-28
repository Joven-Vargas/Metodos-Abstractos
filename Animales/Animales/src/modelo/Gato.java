/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Asus
 */

public class Gato extends Felino {
    public Gato(String nombre) {
        super(nombre, "Doméstico", "Pulmonar", 5.0, 0.3, "Carnívoro", "Angora", "Suave", true, "4", 30);
    }

    public void maulla() {
        System.out.println(nombre + " está maullando.");
    }

    @Override
    public void imprimir() {
        System.out.println("Gato: " + nombre + " - raza " + raza);
    }
}