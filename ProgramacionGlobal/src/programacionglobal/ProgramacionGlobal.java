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
        esTrabajador = JOptionPane.showConfirmDialog(null, "Eres trabajador de la empresa?");
        if(esTrabajador==0){
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Persona p1 = new Persona();
            p1.setNombre(JOptionPane.showInputDialog("Ingrese su nombre: "));
            p1.setCargo(JOptionPane.showInputDialog("Cargo que tiene: "));
            p1.setFechaIngreso(formato.parse(JOptionPane.showInputDialog("Fecha de Ingreso (dd/MM/yyyy): ")));
            //System.out.println(formato.format(p1.getFechaIngreso()));
            p1.setDireccion(JOptionPane.showInputDialog("Direccion: "));
            p1.setTelefono(Float.parseFloat(JOptionPane.showInputDialog("Telefono: ")));
            //Persistencia con los datos del trabajador
            // Crear una cadena con los datos a guardar en el archivo
            String datosTrabajador = "Nombre: "+p1.getNombre() + ", Cargo:" + p1.getCargo() + ", Fecha de Ingreso: " + formato.format(p1.getFechaIngreso()) + ", Direccion: " + p1.getDireccion() + ", Telefono: " + p1.getTelefono();
            // Especificar la ruta y el nombre del archivo
            String rutaArchivo = "trabajadores.txt";
                        try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
                // Escribir los datos en el archivo
                writer.write(datosTrabajador);
                writer.newLine(); // Agregar una nueva línea después de cada trabajador
                System.out.println("Datos del trabajador guardados correctamente en el archivo.");
            } catch (IOException e) {
                System.out.println("Error al guardar los datos del trabajador en el archivo: " + e.getMessage());
            }
        }
    }
}
