/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Asus
 */

public class Bisnieto extends Nieto {
    private final String atributo1;
    private final Nieto padre;

    public Bisnieto(String nombres, String apellidos, int edad, String direccion, int anioNacimiento, Nieto padre, String atributo1) {
        super(nombres, apellidos, edad, direccion, anioNacimiento, padre);
        this.padre = padre;
        this.atributo1 = atributo1;
    }

    @Override
    public void imprimir() {
        System.out.println("Bisnieto: " + nombres + " " + apellidos + " (" + edad + " años)");
        System.out.println("  Hijo de: " + padre.nombres + " " + padre.apellidos);
        System.out.println("  Atributo especial: " + atributo1);
    }
}

