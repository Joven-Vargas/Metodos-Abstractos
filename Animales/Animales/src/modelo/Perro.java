/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Asus
 */
 
public class Perro extends Canino {
    public Perro(String nombre) {
        super(nombre, "Doméstico", "Pulmonar", 15.0, 0.5, "Carnívoro", "Labrador", "Corto", true, "4", 42);
    }

    public void ladra() {
        System.out.println(nombre + " está ladrando.");
    }

    @Override
    public void imprimir() {
        System.out.println("Perro: " + nombre + " - raza " + raza);
    }
}


