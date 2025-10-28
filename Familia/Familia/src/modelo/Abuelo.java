/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Asus
 */
 

public class Abuelo extends Persona {

    public Abuelo(String nombres, String apellidos, int edad, String direccion, int anioNacimiento) {
        super(nombres, apellidos, edad, direccion, anioNacimiento);
    }

    
    
    @Override
    public void imprimir() {
        System.out.println("Abuelo: " + nombres + " " + apellidos + " (" + edad + " años)");
    }
}

