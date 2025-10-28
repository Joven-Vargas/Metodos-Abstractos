/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Abuelo;
import modelo.Bisnieto;
import modelo.Nieto;
import modelo.Padre;

/**
 *
 * @author Asus
 */



public class main {
    public static void main(String[] args) {
        Abuelo abuelo = new Abuelo("José", "Vargas", 80, "Quito", 1945);
        Padre padre = new Padre("Carlos", "Vargas", 50, "Quito", 1975, abuelo);
        Nieto nieto = new Nieto("Isaac", "Vargas", 25, "Quito", 2000, padre);
        Bisnieto bisnieto = new Bisnieto("Mateo", "Vargas", 5, "Quito", 2020, nieto, "Curioso");

        abuelo.imprimir();
        padre.imprimir();
        nieto.imprimir();
        bisnieto.imprimir();
    }
}

