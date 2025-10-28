/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Asus
 */

public abstract class Oviparo extends Animal {
    protected boolean tieneHuevos;
    protected int cantidadHuevos;

    public Oviparo(String nombre, String habitat, String respiracion, double peso, double tamano, String alimentacion, boolean tieneHuevos, int cantidadHuevos) {
        super(nombre, habitat, respiracion, peso, tamano, alimentacion);
        this.tieneHuevos = tieneHuevos;
        this.cantidadHuevos = cantidadHuevos;
    }

    public void ponerHuevos() {
        if (tieneHuevos) {
            System.out.println(nombre + " ha puesto " + cantidadHuevos + " huevos.");
        } else {
            System.out.println(nombre + " no pone huevos.");
        }
    }

    @Override
    public abstract void imprimir();
}

