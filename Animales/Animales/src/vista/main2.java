/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Aguila;
import modelo.Paloma;
import modelo.Trucha;

/**
 *
 * @author Asus
 */
 
public class main2 {
    public static void main(String[] args) {
        Aguila aguila = new Aguila("Águila Real");
        Paloma paloma = new Paloma("Palomita");
        Trucha trucha = new Trucha("Trucha Arcoíris");

        aguila.imprimir();
        aguila.volar();
        aguila.ponerHuevos();
        aguila.cazar();

        System.out.println("-------------------");

        paloma.imprimir();
        paloma.volar();
        paloma.arrullar();

        System.out.println("-------------------");

        trucha.imprimir();
        trucha.nadar();
        trucha.saltar();
    }
}

