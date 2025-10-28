/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Asus
 */
 
public class Nieto extends Padre {
    private final Padre padre;

    public Nieto(String nombres, String apellidos, int edad, String direccion, int anioNacimiento, Padre padre) {
        super(nombres, apellidos, edad, direccion, anioNacimiento, padre);
        this.padre = padre;
    }

    @Override
    public void imprimir() {
        System.out.println("Nieto: " + nombres + " " + apellidos + " (" + edad + " años)");
        System.out.println("  Hijo de: " + padre.nombres + " " + padre.apellidos);
    }
}
