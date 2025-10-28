/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Asus
 */
 
public abstract class Animal {
    protected String nombre;
    protected String habitat;
    protected String respiracion;
    protected double peso;
    protected double tamano;
    protected String alimentacion;
    protected boolean genero;
    protected int expectativaVida;
    protected String colorOjos;
    protected int tiempoGestacion;

    public Animal(String nombre, String habitat, String respiracion, double peso, double tamano, String alimentacion) {
        this.nombre = nombre;
        this.habitat = habitat;
        this.respiracion = respiracion;
        this.peso = peso;
        this.tamano = tamano;
        this.alimentacion = alimentacion;
    }

    public abstract void imprimir();
}
