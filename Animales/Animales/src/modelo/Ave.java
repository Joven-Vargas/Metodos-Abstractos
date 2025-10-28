/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Asus
 */

public abstract class Ave extends Oviparo {
    protected double Largoala;
    protected boolean vuela;

    public Ave(String nombre, String habitat, String respiracion, double peso, double tamano, String alimentacion, boolean tieneHuevos, int cantidadHuevos, double envergaduraAlas, boolean vuela) {
        super(nombre, habitat, respiracion, peso, tamano, alimentacion, tieneHuevos, cantidadHuevos);
        this.Largoala = envergaduraAlas;
        this.vuela = vuela;
    }

    public void volar() {
        if (vuela) {
            System.out.println(nombre + " está volando.");
        } else {
            System.out.println(nombre + " no puede volar.");
        }
    }
}
