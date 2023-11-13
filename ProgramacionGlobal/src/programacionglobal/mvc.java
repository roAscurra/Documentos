/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package programacionglobal;

import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class mvc extends javax.swing.JFrame {

    /**
     * Creates new form mvc
     */
    public mvc() {
        initComponents();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); //para hacer fecha
        ArrayList<Persona> trabajadores = new ArrayList();
        ArrayList<Documento> documentos = new ArrayList();
        Documento d = new Documento(); //para poder acceder a los metodos
        
        buttonGroup1.add(trabajador);
        buttonGroup1.add(buscarPalabra);
        buttonGroup2.add(si);
        buttonGroup2.add(no);
        buttonGroup3.add(si1);
        buttonGroup3.add(no1);
        buttonGroup4.add(si2);
        buttonGroup4.add(no2);
        buttonGroup5.add(si3);
        buttonGroup5.add(no3);
        buttonGroup6.add(si4);
        buttonGroup6.add(no4);
        
        //inhabilito todo al principio
        palabraClave.setVisible(false);
        palabraBuscar.setEnabled(false);
        JLabel1.setVisible(false);
        nombrePersona.setEnabled(false);
        JLabel2.setVisible(false);
        cargo.setEnabled(false);
        jLabel3.setVisible(false);
        fechaIngreso.setEnabled(false);
        jLabel4.setVisible(false);
        direccion.setEnabled(false);
        jLabel5.setVisible(false);
        telefono.setEnabled(false);
        
        jLabel16.setVisible(false);
        si.setEnabled(false);
        no.setEnabled(false);
        jLabel6.setVisible(false);
        nombreDoc.setEnabled(false);
        jLabel18.setVisible(false);
        nombreDest.setEnabled(false);
        jLabel7.setVisible(false);
        direccionDestinatario.setEnabled(false);
        jLabel8.setVisible(false);
        telDestinatario.setEnabled(false);
        
        jLabel14.setVisible(false);
        cantPalabrasClaves.setEnabled(false);
        
        jLabel5.setVisible(false);
        si1.setEnabled(false);
        no1.setEnabled(false);
        
        jLabel16.setVisible(false);
        jLabel10.setVisible(false);
        nombreEmpresa.setEnabled(false);
        jLabel11.setVisible(false);
        direccionCorreo.setEnabled(false);
        jLabel12.setVisible(false);
        telefonoCorreo.setEnabled(false);
        jLabel13.setVisible(false);
        numSeguimiento.setEnabled(false);
        
        jLabel1.setVisible(false);
        si2.setEnabled(false);
        no2.setEnabled(false);
        jLabel2.setVisible(false);
        si3.setEnabled(false);
        no3.setEnabled(false);
        jLabel17.setVisible(false);
        si4.setEnabled(false);
        no4.setEnabled(false);        
        
        trabajador.addActionListener((ActionEvent e) -> { //si selecciona trabajador
            if(trabajador.isSelected()){
                JLabel1.setVisible(true);
                nombrePersona.setEnabled(true);
                JLabel2.setVisible(true);
                cargo.setEnabled(true);
                jLabel3.setVisible(true);
                fechaIngreso.setEnabled(true);
                jLabel4.setVisible(true);
                direccion.setEnabled(true);
                jLabel5.setVisible(true);
                telefono.setEnabled(true);
                jLabel16.setVisible(true);
                si.setEnabled(true);
                no.setEnabled(true);
                
                Persona p1 = new Persona();
                trabajadores.add(p1);
                String nombre = nombrePersona.getText();
                p1.setNombre(nombre);
                String cargoPersona = cargo.getText();
                p1.setCargo(cargoPersona);
                //ARREGLAR ESTO DE FECHA 
                /*Date ingresoFecha = formato.parse(fechaIngreso.getText()); 
                p1.getFechaIngreso(formato.format(ingresoFecha));*/ 
                String dir = direccion.getText();
                p1.setDireccion(dir);
                String tel = telefono.getText();
                p1.setTelefono(Integer.parseInt(tel));
            }    
        });
        si.addActionListener((ActionEvent e) -> {
            if(si.isSelected()){
                jLabel6.setVisible(true);
                nombreDoc.setEnabled(true);
                jLabel18.setVisible(true);
                nombreDest.setEnabled(true);
                jLabel7.setVisible(true);
                direccionDestinatario.setEnabled(true);
                jLabel8.setVisible(true);
                telDestinatario.setEnabled(true); 
                jLabel14.setVisible(false);
                cantPalabrasClaves.setEnabled(false);
                si1.setVisible(true);
                si1.setEnabled(true);
                no1.setVisible(true);
                no1.setEnabled(true);
            
                Documento doc1 = new Documento();
                documentos.add(doc1);
                EnteExterno dest = new EnteExterno();
                ArrayList<String> palabrasClaves = new ArrayList();
                doc1.setAutor(trabajadores.get(0));
                //ARREGLAR ESTO DE FECHA 
                /*Date ingresoFecha = formato.parse(fechaIngreso.getText()); 
                p1.getFechaIngreso(formato.format(ingresoFecha));*/ 
                doc1.setEstadoEnvio(false);
                String destinatario = nombreDest.getText();
                dest.setNombre(destinatario);
                String dirDest = direccionDestinatario.getText();
                dest.setDireccion(dirDest);
                String telDest = telDestinatario.getText();
                dest.setTelefono(Integer.parseInt(telDest));
                dest.setTiene(doc1);
                doc1.setEnviadosA(dest);
                int cantPalabras = Integer.parseInt(cantPalabrasClaves.getText());
                for(int i=0; i< cantPalabras; i++){
                    palabrasClaves.add(JOptionPane.showInputDialog("Ingrese palabra clave " + (i+1)));
                }
                doc1.setPalabrasClaves(palabrasClaves);
            }
        });
        no.addActionListener((ActionEvent e) -> {
                if(no.isSelected()){
                    jLabel17.setVisible(true);
                    si4.setEnabled(true);
                    no4.setEnabled(true);
                }
        });
        si1.addActionListener((ActionEvent e) -> {
            if(si1.isSelected()){
                //ACÀ PODEMOS DIRECTAMENTE LLAMAR AL METODO Y SINO HAY QUE MODIFICAR ESTO
                jLabel16.setVisible(false);
                jLabel10.setVisible(false);
                nombreEmpresa.setEnabled(false);
                jLabel11.setVisible(false);
                direccionCorreo.setEnabled(false);
                jLabel12.setVisible(false);
                telefonoCorreo.setEnabled(false);
                jLabel13.setVisible(false);
                numSeguimiento.setEnabled(false);
                jLabel1.setVisible(false);
                si2.setEnabled(false);
                no2.setEnabled(false);
                //LLAMO AL METODO Y NO OCUPO LO DE ARRIBA                
                Correo c = new Correo(); //creo que lo creo demas
                documentos.get(0).datosCorreo(c, trabajadores.get(0)); //le paso como parametro la primer persona q ingreso datos
                documentos.get(0).setNumeroSeguimiento(Float.parseFloat(numSeguimiento.getText()));     
            }
        });
        no1.addActionListener((ActionEvent e) -> {
            if(no1.isSelected()){
                jLabel2.setVisible(true);
                si3.setEnabled(true);
                no3.setEnabled(true);
            }
        });
        //FALTA HACER ESTO DOS COSOS, SI QUIERE CREAR MAS DOC Y TRABAJADORES
        si2.addActionListener((ActionEvent e) -> {
            if(si2.isSelected()){
                documentos.get(0).setEstadoEnvio(true);
            }
        });
        no2.addActionListener((ActionEvent e) -> {
            if(no3.isSelected()){

            }
        });
        //FALTA HACER ESTO DOS COSOS, SI QUIERE CREAR MAS DOC Y TRABAJADORES
        si3.addActionListener((ActionEvent e) -> {
            if(si3.isSelected()){

            }
        });
        no3.addActionListener((ActionEvent e) -> {
            if(no3.isSelected()){

            }
        });
        guardar.addActionListener((ActionEvent e) -> {
            if(guardar.isSelected()){
                // Persistencia de los datos de los trabajadores
                String rutaArchivoTrabajadores = "trabajadores.txt";
                //en caso de que el archivo exista. Se utiliza 'true' para abrir los archivos en modo de apendizaje, lo que permite agregar nuevos datos al final del archivo sin eliminar los existentes.
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivoTrabajadores, true))) { 
                    for (Persona trabajador : trabajadores) {
                        String datosTrabajador = "Nombre: " + trabajador.getNombre() + ", Cargo: " + trabajador.getCargo() + ", Fecha de Ingreso: " + formato.format(trabajador.getFechaIngreso()) + ", Dirección: " + trabajador.getDireccion() + ", Teléfono: " + trabajador.getTelefono();
                        writer.write(datosTrabajador);
                        writer.newLine();
                    }
                    System.out.println("Datos de los trabajadores guardados correctamente en el archivo.");
                } catch (IOException ex) {
                    System.out.println("Error al guardar los datos de los trabajadores en el archivo: " + ex.getMessage());
                }
                // Persistencia de los datos de los documentos
                String rutaArchivoDocumentos = "documentos.txt";
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivoDocumentos, true))) {
                    for (Documento documento : documentos) {
                        String datosDocumento = "Autor: " + documento.getAutor().getNombre() + ", Nombre del documento: " + documento.getNombreDoc() + ", Fecha: " + formato.format(documento.getFecha()) + ", Estado de Envío: " + documento.isEstadoEnvio();
                        // Aquí puedes agregar más información relacionada con el documento, como el destinatario, palabras clave, etc.
                        writer.write(datosDocumento);
                        writer.newLine();
                    }
                    System.out.println("Datos de los documentos guardados correctamente en el archivo.");
                } catch (IOException ex) {
                    System.out.println("Error al guardar los datos de los documentos en el archivo: " + ex.getMessage());
                }
                // Después de obtener la cantidad de documentos en espera
                int cantidadEnEspera = d.cantidadEnEspera(documentos);
                // Persistencia de la cantidad de documentos en espera
                String rutaArchivoCantidadEnEspera = "cantidadEnEspera.txt";
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivoCantidadEnEspera, true))) {
                    writer.write(String.valueOf(cantidadEnEspera));
                    writer.newLine();
                    System.out.println("Cantidad de documentos en espera guardada correctamente en el archivo.");
                } catch (IOException ex) {
                    System.out.println("Error al guardar la cantidad de documentos en espera en el archivo: " + ex.getMessage());
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jComboBox1 = new javax.swing.JComboBox<>();
        no3 = new javax.swing.JRadioButton();
        si3 = new javax.swing.JRadioButton();
        jTextField5 = new javax.swing.JTextField();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        trabajador = new javax.swing.JRadioButton();
        buscarPalabra = new javax.swing.JRadioButton();
        JLabel1 = new javax.swing.JLabel();
        nombrePersona = new javax.swing.JTextField();
        JLabel2 = new javax.swing.JLabel();
        cargo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fechaIngreso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        no = new javax.swing.JRadioButton();
        si = new javax.swing.JRadioButton();
        nombreDoc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        direccionDestinatario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        telDestinatario = new javax.swing.JTextField();
        cantPalabrasClaves = new javax.swing.JTextField();
        si1 = new javax.swing.JRadioButton();
        no1 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nombreEmpresa = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        direccionCorreo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        telefonoCorreo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        numSeguimiento = new javax.swing.JTextField();
        no2 = new javax.swing.JRadioButton();
        si2 = new javax.swing.JRadioButton();
        si4 = new javax.swing.JRadioButton();
        no4 = new javax.swing.JRadioButton();
        si5 = new javax.swing.JRadioButton();
        no5 = new javax.swing.JRadioButton();
        palabraClave = new javax.swing.JLabel();
        palabraBuscar = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        nombreDest = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonGroup3.add(no3);
        no3.setText("No");

        buttonGroup3.add(si3);
        si3.setText("Si");

        jTextField5.setText("¿El documento ha sido enviado?");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(trabajador);
        trabajador.setText("Trabajador");
        trabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trabajadorActionPerformed(evt);
            }
        });

        buttonGroup1.add(buscarPalabra);
        buscarPalabra.setText("Buscar palabra clave en documentos");
        buscarPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPalabraActionPerformed(evt);
            }
        });

        JLabel1.setText("Nombre:");

        nombrePersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrePersonaActionPerformed(evt);
            }
        });

        JLabel2.setText("Cargo:");

        cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargoActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha de Ingreso:");

        fechaIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaIngresoActionPerformed(evt);
            }
        });

        jLabel4.setText("Direccion:");

        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });

        jLabel5.setText("Telefono:");

        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });

        buttonGroup2.add(no);
        no.setText("No");

        buttonGroup2.add(si);
        si.setText("Si");

        nombreDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreDocActionPerformed(evt);
            }
        });

        jLabel6.setText("Nombre del doc:");

        jLabel7.setText("Direccion del destinatario:");

        direccionDestinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionDestinatarioActionPerformed(evt);
            }
        });

        jLabel8.setText("Telefono del destinatario:");

        telDestinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telDestinatarioActionPerformed(evt);
            }
        });

        cantPalabrasClaves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantPalabrasClavesActionPerformed(evt);
            }
        });

        buttonGroup3.add(si1);
        si1.setText("Si");

        buttonGroup3.add(no1);
        no1.setText("No");

        jLabel9.setText("Los siguientes datos corresponden al correo por el cual envia el doc");

        jLabel10.setText("Nombre de la Empresa:");

        nombreEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreEmpresaActionPerformed(evt);
            }
        });

        jLabel11.setText("Direccion:");

        direccionCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionCorreoActionPerformed(evt);
            }
        });

        jLabel12.setText("Telefono:");

        telefonoCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoCorreoActionPerformed(evt);
            }
        });

        jLabel13.setText("Numero de seguimiento:");

        numSeguimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numSeguimientoActionPerformed(evt);
            }
        });

        buttonGroup4.add(no2);
        no2.setText("No");

        buttonGroup4.add(si2);
        si2.setText("Si");

        buttonGroup5.add(si4);
        si4.setText("Si");

        buttonGroup5.add(no4);
        no4.setText("No");

        buttonGroup6.add(si5);
        si5.setText("Si");

        buttonGroup6.add(no5);
        no5.setText("No");

        palabraClave.setText("Palabra clave que desea buscar:");

        palabraBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                palabraBuscarActionPerformed(evt);
            }
        });

        jLabel14.setText("¿Cuàntas palabras claves tiene?");

        jLabel15.setText("¿Desea enviar el documento?");

        jLabel1.setText("¿El documento ha sido enviado?");

        jLabel2.setText("¿Desea crear otro documento?");

        jLabel17.setText("¿Hay otro trabajador de la empresa?");

        jLabel16.setText("¿Desea crear un documento?");

        jLabel18.setText("Nombre del Destinatario:");

        nombreDest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreDestActionPerformed(evt);
            }
        });

        guardar.setText("Guardar datos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(direccionCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telefonoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(numSeguimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(no2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(no4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(si5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(no5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(si4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(si2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(trabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(buscarPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JLabel1)
                            .addComponent(palabraClave)
                            .addComponent(JLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(palabraBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(direccionDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(no1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(cantPalabrasClaves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(si, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(telDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombreDest, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(si1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172))))
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(guardar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trabajador)
                    .addComponent(buscarPalabra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(palabraClave)
                    .addComponent(palabraBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel2)
                    .addComponent(cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(12, 12, 12)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(no)
                    .addComponent(si))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(nombreDest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccionDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantPalabrasClaves, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(24, 24, 24)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(no1)
                    .addComponent(si1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(nombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(direccionCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(telefonoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(numSeguimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(no2)
                    .addComponent(si2))
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(no4)
                    .addComponent(si4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(no5))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(si5)))
                .addGap(18, 18, 18)
                .addComponent(guardar)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void trabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trabajadorActionPerformed

    private void nombrePersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrePersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrePersonaActionPerformed

    private void cargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargoActionPerformed

    private void fechaIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaIngresoActionPerformed

    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionActionPerformed

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoActionPerformed

    private void nombreDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreDocActionPerformed

    private void direccionDestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionDestinatarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionDestinatarioActionPerformed

    private void telDestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telDestinatarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telDestinatarioActionPerformed

    private void cantPalabrasClavesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantPalabrasClavesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantPalabrasClavesActionPerformed

    private void nombreEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreEmpresaActionPerformed

    private void direccionCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionCorreoActionPerformed

    private void telefonoCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoCorreoActionPerformed

    private void numSeguimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numSeguimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numSeguimientoActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void buscarPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPalabraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarPalabraActionPerformed

    private void palabraBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_palabraBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_palabraBuscarActionPerformed

    private void nombreDestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreDestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreDestActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mvc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mvc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mvc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mvc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mvc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel JLabel1;
    public static javax.swing.JLabel JLabel2;
    public static javax.swing.JRadioButton buscarPalabra;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    public static javax.swing.JTextField cantPalabrasClaves;
    public static javax.swing.JTextField cargo;
    public static javax.swing.JTextField direccion;
    public static javax.swing.JTextField direccionCorreo;
    public static javax.swing.JTextField direccionDestinatario;
    public static javax.swing.JTextField fechaIngreso;
    public static javax.swing.JButton guardar;
    private javax.swing.JComboBox<String> jComboBox1;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel jLabel14;
    public static javax.swing.JLabel jLabel15;
    public static javax.swing.JLabel jLabel16;
    public static javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField5;
    public static javax.swing.JRadioButton no;
    public static javax.swing.JRadioButton no1;
    public static javax.swing.JRadioButton no2;
    public static javax.swing.JRadioButton no3;
    public static javax.swing.JRadioButton no4;
    public static javax.swing.JRadioButton no5;
    private javax.swing.JTextField nombreDest;
    private javax.swing.JTextField nombreDoc;
    public static javax.swing.JTextField nombreEmpresa;
    public static javax.swing.JTextField nombrePersona;
    public static javax.swing.JTextField numSeguimiento;
    public static javax.swing.JTextField palabraBuscar;
    private javax.swing.JLabel palabraClave;
    public static javax.swing.JRadioButton si;
    public static javax.swing.JRadioButton si1;
    public static javax.swing.JRadioButton si2;
    public static javax.swing.JRadioButton si3;
    public static javax.swing.JRadioButton si4;
    public static javax.swing.JRadioButton si5;
    public static javax.swing.JTextField telDestinatario;
    public static javax.swing.JTextField telefono;
    public static javax.swing.JTextField telefonoCorreo;
    public static javax.swing.JRadioButton trabajador;
    // End of variables declaration//GEN-END:variables
}
