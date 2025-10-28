/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Asus
 */
 

public class Padre extends Abuelo {
    private final Abuelo abuelo;

    public Padre(String nombres, String apellidos, int edad, String direccion, int anioNacimiento, Abuelo abuelo) {
        super(nombres, apellidos, edad, direccion, anioNacimiento);
        this.abuelo = abuelo;
    }

    @Override
    public void imprimir() {
        System.out.println("Padre: " + nombres + " " + apellidos + " (" + edad + " años)");
        System.out.println("  Hijo de: " + abuelo.nombres + " " + abuelo.apellidos);
    }
}

