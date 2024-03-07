/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo.pkg6;

/**
 *
 * @author franc
 * 05/03/24
 */
import java.util.Scanner;

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String obtenerInformacion() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Que clase deseas ejecutar? (1 para Doctor, 2 para Deportista):");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> {
                // Crear una instancia de Doctor
            SubClaseDoctor doctor = new SubClaseDoctor("Dr. Smith", 40, "especialidad");
            System.out.println(doctor.obtenerInformacion());
            }

            case 2 -> {
                 // Crear una instancia de Deportista
            Deportista deportista = new Deportista("Ana", 25, "deporte");
            System.out.println(deportista.obtenerInformacion());
            }
            default -> System.out.println("Opción no válida. Elige 1 o 2.");
        }
       
    }
}