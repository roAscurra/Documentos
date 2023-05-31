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
    
    public Documento(){}
    public Documento(Date fecha, Persona autor, Persona destinatario, ArrayList<String> palabrasClaves, boolean estadoEnvio) {
        this.fecha = fecha;
        this.autor = autor;
        this.destinatario = destinatario;
        this.palabrasClaves = palabrasClaves;
        this.estadoEnvio = estadoEnvio;
    }
}
