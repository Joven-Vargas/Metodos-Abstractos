/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Gato;
import modelo.Lobo;
import modelo.Perro;
import modelo.Tigre;

/**
 *
 * @author Asus
 */

public class main {
    public static void main(String[] args) {
        Perro perro = new Perro("Firulais");
        Lobo lobo = new Lobo("Akela");
        Gato gato = new Gato("Michi");
        Tigre tigre = new Tigre("Shere Khan");

        perro.imprimir();
        perro.ladra();

        lobo.imprimir();
        lobo.aulla();

        gato.imprimir();
        gato.maulla();

        tigre.imprimir();
        tigre.chuff();
        tigre.gruñe();
    }
}

