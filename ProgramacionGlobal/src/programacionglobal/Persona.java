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
    private float telefono;
    private Date fechaIngreso;
    private String cargo;
    private ArrayList<Documento> documentos; //asociacion
    public Persona(){}

    public Persona(String nombre, String direccion, float telefono, Date fechaIngreso, String cargo, ArrayList<Documento> documentos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaIngreso = fechaIngreso;
        this.cargo = cargo;
        this.documentos = documentos;
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

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public ArrayList<Documento> getDocumentos() {
        return documentos;
    }

    public void setTrabajador(ArrayList<Documento> documentos) {
        this.documentos = documentos;
    }
    public static void autorMasProductivo(ArrayList<Documento> docs, ArrayList<Persona> autores){
        Persona autorMasProductivo = null;
        int maxDoc = 0;
        for(int i=0 ; i < autores.size(); i++ ){
            int cantDoc = 0;
            for(int j = 0; j< docs.size(); j++){
                if(docs.get(j).getAutor().equals(autores.get(i).getNombre())){
                    cantDoc++;
                }
            }
            if(cantDoc > maxDoc){
                maxDoc = cantDoc;
                autorMasProductivo = autores.get(i);
            }
        }
        System.out.println("El empleado que mas documentos ha confeccionado es: "+autorMasProductivo.getNombre());
    }
}
