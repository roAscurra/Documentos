/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionglobal;

/**
 *
 * @author Usuario
 */
public class EnteExterno {
    private String nombre;
    private String direccion;
    private float telefono;
    private Documento tiene; //asociacion
    
    public EnteExterno(){}

    public EnteExterno(String nombre, String direccion, float telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
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

    public Documento getTiene() {
        return tiene;
    }

    public void setTiene(Documento tiene) {
        this.tiene = tiene;
    }

    public EnteExterno(String nombre, String direccion, float telefono, Documento tiene) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tiene = tiene;
    }
    
}
