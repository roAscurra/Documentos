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
public class Documento {
    private Date fecha;
    private Persona autor;
    private Persona destinatario;
    private ArrayList<String> palabrasClaves;
    private boolean estadoEnvio;
    private EnteExterno enviadosA; //asociacion
    
    public Documento(){}
    public Documento(Date fecha, Persona autor, Persona destinatario, ArrayList<String> palabrasClaves, boolean estadoEnvio) {
        this.fecha = fecha;
        this.autor = autor;
        this.destinatario = destinatario;
        this.palabrasClaves = palabrasClaves;
        this.estadoEnvio = estadoEnvio;
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

    public Persona getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Persona destinatario) {
        this.destinatario = destinatario;
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

    public Documento(Date fecha, Persona autor, Persona destinatario, ArrayList<String> palabrasClaves, boolean estadoEnvio, EnteExterno enviadosA) {
        this.fecha = fecha;
        this.autor = autor;
        this.destinatario = destinatario;
        this.palabrasClaves = palabrasClaves;
        this.estadoEnvio = estadoEnvio;
        this.enviadosA = enviadosA;
    }
}
