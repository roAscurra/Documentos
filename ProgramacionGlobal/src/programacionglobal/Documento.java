/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionglobal;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Documento {
    private Date fecha;
    private Persona autor;
    private String empresa;
    private ArrayList<String> palabrasClaves;
    private boolean estadoEnvio;
    private EnteExterno enviadosA; //asociacion
    private Correo despachadoPor;
    private float numeroSeguimiento;
    private String nombreDoc;

    public Documento(){}
    public Documento(Date fecha, Persona autor, String empresa, ArrayList<String> palabrasClaves, boolean estadoEnvio, EnteExterno enviadosA, Correo despachadoPor, float numeroSeguimiento, String nombreDoc) {
        this.fecha = fecha;
        this.autor = autor;
        this.empresa = empresa;
        this.palabrasClaves = palabrasClaves;
        this.estadoEnvio = estadoEnvio;
        this.enviadosA = enviadosA;
        this.despachadoPor = despachadoPor;
        this.numeroSeguimiento = numeroSeguimiento;
        this.nombreDoc = nombreDoc;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public ArrayList<String> getPalabrasClaves() {
        return palabrasClaves;
    }

    public void setPalabrasClaves(ArrayList<String> palabrasClaves) {
        this.palabrasClaves = palabrasClaves;
    }

    public boolean isEstadoEnvio() {
        return estadoEnvio;
    }

    public void setEstadoEnvio(boolean estadoEnvio) {
        this.estadoEnvio = estadoEnvio;
    }

    public EnteExterno getEnviadosA() {
        return enviadosA;
    }

    public void setEnviadosA(EnteExterno enviadosA) {
        this.enviadosA = enviadosA;
    }

    public Correo getDespachadoPor() {
        return despachadoPor;
    }

    public float getNumeroSeguimiento() {
        return numeroSeguimiento;
    }

    public void setNumeroSeguimiento(float numeroSeguimiento) {
        this.numeroSeguimiento = numeroSeguimiento;
    }

    public void setDespachadoPor(Correo despachadoPor) {
        this.despachadoPor = despachadoPor;
    }

    public String getNombreDoc() {
        return nombreDoc;
    }

    public void setNombreDoc(String nombreDoc) {
        this.nombreDoc = nombreDoc;
    }
    public static void datosCorreo(Correo c1, Persona p){ //metodo agregado
        c1.setNombreEmpresa(JOptionPane.showInputDialog("Nombre de la empresa: "));
        c1.setDireccion(JOptionPane.showInputDialog("Direccion del correo: "));
        c1.setTelefono(Integer.parseInt(JOptionPane.showInputDialog("Telefono del correo: ")));
        c1.setPersonaContacto(p);
    }
    public static void documentosQueIncluyen(String unaPalabra, ArrayList<Documento> docs){
        System.out.println("Los documentos que incluyen la palabra ingresada son: ");
        for(int i=0;i<docs.size();i++){
           if(docs.get(i).getPalabrasClaves().get(i).equals(unaPalabra)){
               System.out.println(docs.get(i).getNombreDoc());
           }
        }
    }
    public static int cantidadEnEspera(ArrayList<Documento> docs){
        int cantidadEnEspera = 0;
        for(int i = 0; i< docs.size(); i++){
            if(docs.get(i).isEstadoEnvio() == false){
                cantidadEnEspera++;
            }
        }
        System.out.println("Documentos en espera: " + cantidadEnEspera);
        return cantidadEnEspera;
    }
}
