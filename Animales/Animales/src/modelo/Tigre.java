/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Asus
 */

public class Tigre extends Felino {
    public Tigre(String nombre) {
        super(nombre, "Selva", "Pulmonar", 200.0, 2.5, "Carnívoro", "Bengala", "Rayado", true, "4", 30);
    }

    public void chuff() {
        System.out.println(nombre + " hace chuff.");
    }

    public void gruñe() {
        System.out.println(nombre + " está gruñendo.");
    }

    @Override
    public void imprimir() {
        System.out.println("Tigre: " + nombre + " - raza " + raza);
    }
}