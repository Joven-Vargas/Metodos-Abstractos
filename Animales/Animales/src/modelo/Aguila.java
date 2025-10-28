/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Asus
 */

public class Aguila extends Ave {

    public Aguila(String nombre) {
        super(nombre, "Montañas", "Pulmonar", 6.0, 1.0, "Carnívora", true, 2, 2.1, true);
    }

    public void cazar() {
        System.out.println(nombre + " está cazando a su presa.");
    }

    @Override
    public void imprimir() {
        System.out.println("Águila: " + nombre + " - Largo de alas: " + Largoala + " m");
    }
}

