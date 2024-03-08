/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo.pkg6;

 public class SubClaseDoctor extends Persona {
    private String especialidad;

    public SubClaseDoctor(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = "cardiologo";
}

    @Override
    public String obtenerInformacion() {
        return super.obtenerInformacion() + ", Especialidad: " + especialidad;
}
}