/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionglobal;

/**
 *
 * @author Usuario
 */
public class Correo {
    private String nombre;
    private String direccion;
    private float telefono;
    private Persona PersonaContacto;
    
    public Correo(){}

    public Correo(String nombre, String direccion, float telefono, Persona PersonaContacto) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.PersonaContacto = PersonaContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getTelefono() {
        return telefono;
    }

    public void setTelefono(float telefono) {
        this.telefono = telefono;
    }

    public Persona getPersonaContacto() {
        return PersonaContacto;
    }

    public void setPersonaContacto(Persona PersonaContacto) {
        this.PersonaContacto = PersonaContacto;
    }
    
    
}
