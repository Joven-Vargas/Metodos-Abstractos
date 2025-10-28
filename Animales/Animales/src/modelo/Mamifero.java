/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Asus
 */
 
public abstract class Mamifero extends Animal {
    protected String raza;
    protected String pelaje;
    protected boolean tipo; // terrestre o acuático
    protected String numExtremidades;
    protected int numDientes;

    public Mamifero(String nombre, String habitat, String respiracion, double peso, double tamano, String alimentacion, String raza, String pelaje, boolean tipo, String numExtremidades, int numDientes) {
        super(nombre, habitat, respiracion, peso, tamano, alimentacion);
        this.raza = raza;
        this.pelaje = pelaje;
        this.tipo = tipo;
        this.numExtremidades = numExtremidades;
        this.numDientes = numDientes;
    }
}
