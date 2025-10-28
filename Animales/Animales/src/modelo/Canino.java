/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Asus
 */
 
public abstract class Canino extends Mamifero {
    public Canino(String nombre, String habitat, String respiracion, double peso, double tamano, String alimentacion, String raza, String pelaje, boolean tipo, String numExtremidades, int numDientes) {
        super(nombre, habitat, respiracion, peso, tamano, alimentacion, raza, pelaje, tipo, numExtremidades, numDientes);
    }
}

