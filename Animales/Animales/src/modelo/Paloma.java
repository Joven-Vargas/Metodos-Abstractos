/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Asus
 */

public class Paloma extends Ave {

    public Paloma(String nombre) {
        super(nombre, "Ciudad", "Pulmonar", 0.3, 0.25, "Granos", true, 2, 0.4, true);
    }

    public void arrullar() {
        System.out.println(nombre + " está arrullando.");
    }

    @Override
    public void imprimir() {
        System.out.println("Paloma: " + nombre + " - Alimentación: " + alimentacion);
    }
}

