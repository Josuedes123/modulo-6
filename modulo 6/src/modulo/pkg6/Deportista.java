/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo.pkg6;

/**
 *
 * @author merce
 * Se crea el atributo deporte privado de tipo String.
-Se modifica el constructor Deportista que hereda (nombre, edad) de la super clase y establece el valor
-del atributo deporte como "Futbolista".
- se eliminan los atributos innecesarios siguentes
setNombre.  Establece el valor del atributo nombre.
setEdad(int edad): Establece el valor del atributo edad.
setDeporte(String deporte): Establece el valor del atributo deporte.
getNombre(): Devuelve el valor del atributo nombre.
getEdad(): Devuelve el valor del atributo edad.
getDeporte(): Devuelve el valor del atributo deporte.

Se sobre escribe el atributo de la super clase public String obtenerInformacion() y hizo concordar con el formato dado.
 */
public class Deportista extends Persona{
    
    private String nombre;
    private final String deporte;
    
    public Deportista(String nombre, int edad, String deporte) {
        super(nombre, edad);
        this.deporte = "Futbolista";
    }
     @Override
    public String obtenerInformacion() {
        return super.obtenerInformacion() + ", deporte: " + deporte;
    }
}
