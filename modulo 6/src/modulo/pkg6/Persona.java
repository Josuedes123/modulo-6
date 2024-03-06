/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo.pkg6;

/**
 *
 * @author franc
 */
public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String obtenerInformacion() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }

    public void establecerInformacion(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public static void main(String[] args) {
        // Crear una instancia de Persona
        Persona persona = new Persona("Juan", 30);
        System.out.println(persona.obtenerInformacion());
    }
}

