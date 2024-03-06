/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modulo.pkg6;

public class SubClaseDoctor extends Persona {
    private String especialidad;

    
    public SubClaseDoctor(String nombre, String apellido, int edad, double salario, String numeroDeIdentificacion, String genero, String especialidad) {
        super(nombre, apellido, edad, salario, numeroDeIdentificacion, genero);
        this.especialidad = especialidad;
    }

    
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
