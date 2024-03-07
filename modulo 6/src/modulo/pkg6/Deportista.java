/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo.pkg6;

/**
 *
 * @author merce
 */
public class Deportista {
    
    private String nombre;
    private int edad;
    private String deporte;

    
    public Deportista(String nombre, int edad, String deporte) {
        this.nombre = nombre;
        this.edad = edad;
        this.deporte = deporte;
    }

   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDeporte() {
        return deporte;
        }
        
        public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Deporte: " + deporte);
    }

    
    public static void main(String[] args) {
        Deportista deportista = new Deportista("Juan", 25, "FÃºtbol");

        System.out.println("InformaciÃ³n del deportista:");
        deportista.mostrarInformacion();

        
        deportista.setEdad(26);

        
        System.out.println("\nInformaciÃ³n actualizada del deportista:");
        deportista.mostrarInformacion();
    }
}
