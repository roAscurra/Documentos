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
    private String nombreEmpresa;
    private String direccion;
    private float telefono;
    private Persona PersonaContacto;
    
    public Correo(){}

    public Correo(String nombreEmpresa, String direccion, float telefono, Persona PersonaContacto) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.telefono = telefono;
        this.PersonaContacto = PersonaContacto;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
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
