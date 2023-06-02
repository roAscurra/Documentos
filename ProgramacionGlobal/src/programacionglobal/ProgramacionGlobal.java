/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacionglobal;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ProgramacionGlobal {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException, IOException {
        // TODO code application logic here
        int esTrabajador;
        Documento d = new Documento();
        Persona p = new Persona();
        ArrayList<Persona> trabajadores = new ArrayList();
        ArrayList<Documento> documentos = new ArrayList();
        esTrabajador = JOptionPane.showConfirmDialog(null, "Eres trabajador de la empresa?");
        while(esTrabajador==0){
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Persona p1 = new Persona();
            trabajadores.add(p1);
            p1.setNombre(JOptionPane.showInputDialog("Ingrese su nombre: "));
            /*p1.setCargo(JOptionPane.showInputDialog("Cargo que tiene: "));
            p1.setFechaIngreso(formato.parse(JOptionPane.showInputDialog("Fecha de Ingreso (dd/MM/yyyy): ")));
            //System.out.println(formato.format(p1.getFechaIngreso()));
            p1.setDireccion(JOptionPane.showInputDialog("Su direccion: "));
            p1.setTelefono(Float.parseFloat(JOptionPane.showInputDialog("Telefono personal: ")));
            //Persistencia con los datos del trabajador
            // Crear una cadena con los datos a guardar en el archivo
            /*String datosTrabajador = "Nombre: "+p1.getNombre() + ", Cargo:" + p1.getCargo() + ", Fecha de Ingreso: " + formato.format(p1.getFechaIngreso()) + ", Direccion: " + p1.getDireccion() + ", Telefono: " + p1.getTelefono();
            // Especificar la ruta y el nombre del archivo
            String rutaArchivo = "trabajadores.txt";
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
                // Escribir los datos en el archivo
                writer.write(datosTrabajador);
                writer.newLine(); // Agregar una nueva línea después de cada trabajador
                System.out.println("Datos del trabajador guardados correctamente en el archivo.");
            } catch (IOException e) {
                System.out.println("Error al guardar los datos del trabajador en el archivo: " + e.getMessage());
            }*/
            //pregunto si quiere crear un documento
            int creaDocumento;
            creaDocumento = JOptionPane.showConfirmDialog(null, "Desea crear un documento? ");
            while(creaDocumento == 0){
                Documento doc1 = new Documento();
                documentos.add(doc1);
                EnteExterno dest = new EnteExterno();
                Correo c = new Correo();
                ArrayList<String> palabrasClaves = new ArrayList();
                doc1.setAutor(p1);
                doc1.setNombreDoc(JOptionPane.showInputDialog("Nombre del documento: "));
                /*doc1.setFecha(formato.parse(JOptionPane.showInputDialog("Fecha (dd/MM/yyyy): ")));
                doc1.setEstadoEnvio(false);
                dest.setNombre(JOptionPane.showInputDialog("Nombre del destinatario: "));
                dest.setDireccion(JOptionPane.showInputDialog("Direccion del destinario: "));
                dest.setTelefono(Float.parseFloat(JOptionPane.showInputDialog("Telefono del destinatario: ")));
                dest.setTiene(doc1);
                doc1.setEnviadosA(dest);
                int cantPalabras = Integer.parseInt(JOptionPane.showInputDialog("Cuantas palabras claves tiene el documento?"));
                for(int i=0; i< cantPalabras; i++){
                    palabrasClaves.add(JOptionPane.showInputDialog("Ingrese palabra clave " + (i+1)));
                }
                doc1.setPalabrasClaves(palabrasClaves);
                int enviarDoc;
                enviarDoc = JOptionPane.showConfirmDialog(null, "Desea enviar el documento? ");
                if(enviarDoc == 0){
                    JOptionPane.showMessageDialog(null,"Debe ingresar los siguientes datos que corresponden al correo por el cual envia el documento");
                    doc1.datosCorreo(c, p1);
                    doc1.setNumeroSeguimiento(Float.parseFloat(JOptionPane.showInputDialog("Ingrese numero de seguimiento: ")));
                    doc1.setEstadoEnvio(true);               
                }*/
                creaDocumento = JOptionPane.showConfirmDialog(null, "Desea crear otro documento? ");
            }       
            esTrabajador = JOptionPane.showConfirmDialog(null, "¿Hay otro trabajador de la empresa?");
        }

        int buscarPalabra;
        buscarPalabra = JOptionPane.showConfirmDialog(null, "Quiere buscar una palabra clave en los documentos?");
        if(buscarPalabra == 0 ){
/*
            String palabra;
            palabra = JOptionPane.showInputDialog(null, "Ingrese la palabra que desea buscar");
            d.documentosQueIncluyen(palabra, documentos);*/
        }
        p.autorMasProductivo(documentos, trabajadores);

    }
}
