/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionglobal;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Persona {
    private String nombre;
    private String direccion;
    private int telefono;
    private Date fechaIngreso;
    private String cargo;
    private ArrayList<Documento> trabajador;
    public Persona(){}

    public Persona(String nombre, String direccion, int telefono, Date fechaIngreso, String cargo, ArrayList<Documento> trabajador) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaIngreso = fechaIngreso;
        this.cargo = cargo;
        this.trabajador = trabajador;
    }
}
