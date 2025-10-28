/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Asus
 */

public abstract class Pez extends Oviparo {
    protected String tipoAgua; // dulce o salada
    protected int numAletas;

    public Pez(String nombre, String habitat, String respiracion, double peso, double tamano, String alimentacion, boolean tieneHuevos, int cantidadHuevos, String tipoAgua, int numAletas) {
        super(nombre, habitat, respiracion, peso, tamano, alimentacion, tieneHuevos, cantidadHuevos);
        this.tipoAgua = tipoAgua;
        this.numAletas = numAletas;
    }

    public void nadar() {
        System.out.println(nombre + " está nadando en agua " + tipoAgua + ".");
    }
}
