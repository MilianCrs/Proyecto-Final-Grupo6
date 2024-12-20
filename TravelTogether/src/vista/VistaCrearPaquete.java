/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.toedter.calendar.JTextFieldDateEditor;
import entidad.Alojamiento;
import entidad.Ciudad;
import entidad.Compras;
import entidad.Paquete;
import entidad.Pasaje;
import entidad.Pension;
import entidad.Turista;
import java.awt.CardLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.table.DefaultTableModel;
import persistencia.AlojamientoData;
import persistencia.CiudadData;
import persistencia.ComprasData;
import persistencia.PaqueteData;
import persistencia.PasajeData;
import persistencia.TuristaData;

/**
 *
 * @author Mila
 */
public class VistaCrearPaquete extends javax.swing.JInternalFrame {

    private final ArrayList<Turista> guardarTurista = new ArrayList<>();
    String[] columnNames = {"Ciudad", "Nombre", "Tipo", "Precio", "Capacidad", "Estado"};
    DefaultTableModel model = new DefaultTableModel(columnNames, 0);
    private double precioPasaje;
    private double precioAlojamiento;
    private double presupuestoBase;
    private double presupuestoFinal;

    public VistaCrearPaquete() {
        initComponents();
        cargarCiudad();
        ComboOrigen.addActionListener(e -> actualizarPrecio());
        ComboDestino.addActionListener(e -> actualizarPrecio());
        ComboAsiento.addActionListener(e -> actualizarPrecio());

        RadioAvion.addActionListener(e -> actualizarPrecio());
        RadioColectivo.addActionListener(e -> actualizarPrecio());
        RadioBarco.addActionListener(e -> actualizarPrecio());

        RadioSinPension.addActionListener(e -> actualizarPresupuesto());
        RadioDesayuno.addActionListener(e -> actualizarPresupuesto());
        RadioMediaPension.addActionListener(e -> actualizarPresupuesto());
        RadioPensionCompleta.addActionListener(e -> actualizarPresupuesto());

        RadioSi.addActionListener(e -> actualizarPresupuesto());
        RadioNo.addActionListener(e -> actualizarPresupuesto());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoTransporte = new javax.swing.ButtonGroup();
        GrupoMenu = new javax.swing.ButtonGroup();
        GrupoTraslados = new javax.swing.ButtonGroup();
        PanelPrincipal = new javax.swing.JPanel();
        PanelTurista = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        FieldDni = new javax.swing.JTextField();
        FieldApellido = new javax.swing.JTextField();
        FieldEmail = new javax.swing.JTextField();
        FieldNombre = new javax.swing.JTextField();
        FieldEdad = new javax.swing.JTextField();
        FieldTelefono = new javax.swing.JTextField();
        BotonSalir = new javax.swing.JButton();
        BotonSiguiente = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        LabelViajeros = new javax.swing.JLabel();
        Numero = new javax.swing.JLabel();
        BotonSumar = new javax.swing.JButton();
        BotonRestar = new javax.swing.JButton();
        Advertencia = new javax.swing.JLabel();
        BotonEstablecer = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();
        Contador = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        PanelPasaje = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ComboOrigen = new javax.swing.JComboBox<>();
        ComboDestino = new javax.swing.JComboBox<>();
        Calendario2 = new com.toedter.calendar.JDateChooser();
        Calendario = new com.toedter.calendar.JDateChooser();
        RadioAvion = new javax.swing.JRadioButton();
        RadioColectivo = new javax.swing.JRadioButton();
        RadioBarco = new javax.swing.JRadioButton();
        jButton5 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        BotonSalir1 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        ComboAsiento = new javax.swing.JComboBox<>();
        LabelAsiento = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        LabelPrecio = new javax.swing.JLabel();
        PanelAlojamiento = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        ComboAlojamiento = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaAlojamiento = new javax.swing.JTable();
        jLabel35 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        RadioSi = new javax.swing.JRadioButton();
        RadioNo = new javax.swing.JRadioButton();
        RadioPensionCompleta = new javax.swing.JRadioButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        RadioMediaPension = new javax.swing.JRadioButton();
        RadioDesayuno = new javax.swing.JRadioButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        RadioSinPension = new javax.swing.JRadioButton();
        jLabel37 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        Label89 = new javax.swing.JLabel();
        LabelAlojamiento = new javax.swing.JLabel();
        PanelFinal = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        TipoAlojamientoFinal = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        cantidadFinal = new javax.swing.JLabel();
        TransporteFinal = new javax.swing.JLabel();
        CategoriaFinal = new javax.swing.JLabel();
        DesdeFinal = new javax.swing.JLabel();
        HastaFinal = new javax.swing.JLabel();
        FechaIdaFinal = new javax.swing.JLabel();
        FechaVueltaFinal = new javax.swing.JLabel();
        HoraFinal = new javax.swing.JLabel();
        AlojamientoFinal = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        MenuFinal = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        TrasladosFinal = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        CostoFinalPaquete = new javax.swing.JLabel();

        setClosable(true);

        PanelPrincipal.setLayout(new java.awt.CardLayout());

        ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/icono2.jpg"));
        Image miImagen = imagen.getImage();
        PanelTurista = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                g.drawImage(miImagen, 0, 0, getWidth(), getHeight(), this);
            }
        };
        PanelTurista.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Turista ");
        PanelTurista.add(jLabel2);
        jLabel2.setBounds(61, 98, 87, 32);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DNI");
        PanelTurista.add(jLabel3);
        jLabel3.setBounds(61, 288, 56, 26);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre");
        jLabel4.setToolTipText("");
        PanelTurista.add(jLabel4);
        jLabel4.setBounds(60, 200, 86, 26);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellido");
        PanelTurista.add(jLabel5);
        jLabel5.setBounds(420, 200, 79, 26);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mail");
        PanelTurista.add(jLabel6);
        jLabel6.setBounds(420, 380, 45, 26);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Edad");
        PanelTurista.add(jLabel7);
        jLabel7.setBounds(61, 382, 50, 26);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Telefono");
        PanelTurista.add(jLabel8);
        jLabel8.setBounds(420, 290, 97, 26);

        FieldDni.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        FieldDni.setEnabled(false);
        FieldDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldDniKeyTyped(evt);
            }
        });
        PanelTurista.add(FieldDni);
        FieldDni.setBounds(61, 332, 200, 32);

        FieldApellido.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        FieldApellido.setEnabled(false);
        PanelTurista.add(FieldApellido);
        FieldApellido.setBounds(420, 240, 200, 30);

        FieldEmail.setToolTipText("Ingrese el correo en formato: turista@dominio.com");
        FieldEmail.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        FieldEmail.setEnabled(false);
        FieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldEmailActionPerformed(evt);
            }
        });
        PanelTurista.add(FieldEmail);
        FieldEmail.setBounds(420, 420, 200, 32);

        FieldNombre.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        FieldNombre.setEnabled(false);
        FieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldNombreActionPerformed(evt);
            }
        });
        PanelTurista.add(FieldNombre);
        FieldNombre.setBounds(61, 240, 200, 30);

        FieldEdad.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        FieldEdad.setEnabled(false);
        FieldEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldEdadKeyTyped(evt);
            }
        });
        PanelTurista.add(FieldEdad);
        FieldEdad.setBounds(60, 420, 60, 32);

        FieldTelefono.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        FieldTelefono.setEnabled(false);
        FieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldTelefonoActionPerformed(evt);
            }
        });
        FieldTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FieldTelefonoKeyTyped(evt);
            }
        });
        PanelTurista.add(FieldTelefono);
        FieldTelefono.setBounds(420, 330, 200, 32);

        BotonSalir.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        BotonSalir.setText("Salir");
        BotonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonSalir.setEnabled(false);
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        PanelTurista.add(BotonSalir);
        BotonSalir.setBounds(60, 510, 150, 46);

        BotonSiguiente.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        BotonSiguiente.setText("Siguiente");
        BotonSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonSiguiente.setEnabled(false);
        BotonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSiguienteActionPerformed(evt);
            }
        });
        PanelTurista.add(BotonSiguiente);
        BotonSiguiente.setBounds(480, 510, 150, 47);

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("¿Cuantos viajan?");
        PanelTurista.add(jLabel15);
        jLabel15.setBounds(370, 80, 173, 42);

        LabelViajeros.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        LabelViajeros.setForeground(new java.awt.Color(255, 255, 255));
        LabelViajeros.setText("Viajero");
        PanelTurista.add(LabelViajeros);
        LabelViajeros.setBounds(280, 130, 80, 40);

        Numero.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Numero.setForeground(new java.awt.Color(255, 255, 255));
        Numero.setText("1");
        PanelTurista.add(Numero);
        Numero.setBounds(420, 140, 20, 24);

        BotonSumar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        BotonSumar.setText("+");
        BotonSumar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSumarActionPerformed(evt);
            }
        });
        PanelTurista.add(BotonSumar);
        BotonSumar.setBounds(440, 130, 39, 40);

        BotonRestar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        BotonRestar.setText("-");
        BotonRestar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRestar.setEnabled(false);
        BotonRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRestarActionPerformed(evt);
            }
        });
        PanelTurista.add(BotonRestar);
        BotonRestar.setBounds(370, 130, 35, 40);

        Advertencia.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Advertencia.setForeground(new java.awt.Color(255, 51, 51));
        PanelTurista.add(Advertencia);
        Advertencia.setBounds(250, 180, 340, 17);

        BotonEstablecer.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        BotonEstablecer.setText("Establecer");
        BotonEstablecer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonEstablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEstablecerActionPerformed(evt);
            }
        });
        PanelTurista.add(BotonEstablecer);
        BotonEstablecer.setBounds(500, 130, 120, 37);

        BotonGuardar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        BotonGuardar.setText("Guardar");
        BotonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonGuardar.setEnabled(false);
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });
        PanelTurista.add(BotonGuardar);
        BotonGuardar.setBounds(270, 510, 150, 47);

        Contador.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Contador.setForeground(new java.awt.Color(255, 255, 255));
        Contador.setText("1");
        PanelTurista.add(Contador);
        Contador.setBounds(154, 98, 13, 32);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Creación de Paquete");
        PanelTurista.add(jLabel1);
        jLabel1.setBounds(200, 10, 279, 37);

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Campos Obligatorios");
        PanelTurista.add(jLabel27);
        jLabel27.setBounds(70, 470, 160, 40);

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 0));
        jLabel28.setText("*");
        PanelTurista.add(jLabel28);
        jLabel28.setBounds(500, 200, 30, 30);

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 0));
        jLabel29.setText("*");
        PanelTurista.add(jLabel29);
        jLabel29.setBounds(510, 290, 30, 30);

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 0));
        jLabel30.setText("*");
        PanelTurista.add(jLabel30);
        jLabel30.setBounds(140, 200, 30, 30);

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 0));
        jLabel31.setText("*");
        PanelTurista.add(jLabel31);
        jLabel31.setBounds(100, 290, 30, 30);

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 0, 0));
        jLabel32.setText("*");
        PanelTurista.add(jLabel32);
        jLabel32.setBounds(100, 290, 30, 30);

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 0));
        jLabel33.setText("*");
        PanelTurista.add(jLabel33);
        jLabel33.setBounds(110, 380, 30, 30);

        jLabel49.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 0));
        jLabel49.setText("*");
        PanelTurista.add(jLabel49);
        jLabel49.setBounds(50, 480, 30, 30);

        PanelPrincipal.add(PanelTurista, "PanelTurista");

        PanelPasaje = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                g.drawImage(miImagen, 0, 0, getWidth(), getHeight(), this);
            }
        };
        PanelPasaje.setName(""); // NOI18N
        PanelPasaje.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Pasaje");
        PanelPasaje.add(jLabel9);
        jLabel9.setBounds(300, 0, 84, 49);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ciudad Origen:");
        PanelPasaje.add(jLabel10);
        jLabel10.setBounds(30, 70, 132, 22);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ciudad Destino:");
        PanelPasaje.add(jLabel11);
        jLabel11.setBounds(360, 70, 140, 22);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Fecha Check-in:");
        PanelPasaje.add(jLabel12);
        jLabel12.setBounds(30, 122, 142, 30);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Fecha Check-out:");
        PanelPasaje.add(jLabel13);
        jLabel13.setBounds(360, 122, 154, 30);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Transporte ");
        PanelPasaje.add(jLabel14);
        jLabel14.setBounds(290, 230, 120, 24);

        DefaultComboBoxModel<Ciudad> modeloOrigen = new DefaultComboBoxModel<>();
        ComboOrigen.setModel(modeloOrigen);
        ComboOrigen.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboOrigenItemStateChanged(evt);
            }
        });
        ComboOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboOrigenActionPerformed(evt);
            }
        });
        ComboOrigen.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                ComboOrigenPropertyChange(evt);
            }
        });
        PanelPasaje.add(ComboOrigen);
        ComboOrigen.setBounds(170, 70, 170, 26);

        DefaultComboBoxModel<Ciudad> modeloDestino = new DefaultComboBoxModel<>();
        ComboDestino.setModel(modeloDestino);
        ComboDestino.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboDestinoItemStateChanged(evt);
            }
        });
        ComboDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboDestinoActionPerformed(evt);
            }
        });
        PanelPasaje.add(ComboDestino);
        ComboDestino.setBounds(510, 70, 160, 26);

        Calendario2.setEnabled(false);
        Calendario.addPropertyChangeListener("date", new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if (Calendario.getDate() != null) {
                    Calendario2.setEnabled(true);
                }

                Date selectedDate = Calendario.getDate();

                if (selectedDate != null) {
                    Calendar cal2 = Calendar.getInstance();
                    cal2.setTime(selectedDate);
                    cal2.add(Calendar.DAY_OF_MONTH, 5); // Añadir un día

                    // Habilitar solo fechas a partir del día siguiente en el segundo calendario
                    Calendario2.setMinSelectableDate(cal2.getTime());
                }

            }
        });

        JTextFieldDateEditor editor1 = (JTextFieldDateEditor) Calendario2.getDateEditor();
        editor1.setEditable(false);
        Calendario2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Calendario2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        PanelPasaje.add(Calendario2);
        Calendario2.setBounds(520, 120, 150, 29);

        Date fechaActual = new Date();
        Calendario.setMinSelectableDate(fechaActual);

        JTextFieldDateEditor editor = (JTextFieldDateEditor) Calendario.getDateEditor();
        editor.setEditable(false);
        Calendario.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                CalendarioAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Calendario.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                CalendarioPropertyChange(evt);
            }
        });
        PanelPasaje.add(Calendario);
        Calendario.setBounds(180, 120, 160, 29);

        RadioAvion.setActionCommand("Avion");
        GrupoTransporte.add(RadioAvion);
        RadioAvion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RadioAvion.setForeground(new java.awt.Color(255, 255, 255));
        RadioAvion.setText("Avion");
        PanelPasaje.add(RadioAvion);
        RadioAvion.setBounds(100, 390, 90, 28);

        RadioColectivo.setActionCommand("Colectivo");
        GrupoTransporte.add(RadioColectivo);
        RadioColectivo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RadioColectivo.setForeground(new java.awt.Color(255, 255, 255));
        RadioColectivo.setText("Colectivo");
        PanelPasaje.add(RadioColectivo);
        RadioColectivo.setBounds(290, 390, 110, 28);

        RadioBarco.setActionCommand("Barco");
        GrupoTransporte.add(RadioBarco);
        RadioBarco.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RadioBarco.setForeground(new java.awt.Color(255, 255, 255));
        RadioBarco.setText("Barco");
        PanelPasaje.add(RadioBarco);
        RadioBarco.setBounds(500, 390, 80, 28);

        jButton5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton5.setText("Continuar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        PanelPasaje.add(jButton5);
        jButton5.setBounds(490, 510, 140, 40);

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Costo actual por Persona:");
        PanelPasaje.add(jLabel17);
        jLabel17.setBounds(40, 460, 230, 40);

        jLabel80.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(51, 204, 0));
        jLabel80.setText("$");
        PanelPasaje.add(jLabel80);
        jLabel80.setBounds(270, 470, 10, 20);

        ImageIcon barco = new ImageIcon(getClass().getResource("/imagenes/barco.png"));
        Image miImagen1 = barco.getImage();
        jLabel19 = new javax.swing.JLabel(){
            public void paintComponent(Graphics g){
                g.drawImage(miImagen1, 0, 0, getWidth(), getHeight(), this);
            }
        };
        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        PanelPasaje.add(jLabel19);
        jLabel19.setBounds(490, 280, 90, 90);

        ImageIcon avion = new ImageIcon(getClass().getResource("/imagenes/plano.png"));
        Image miImagen2 = avion.getImage();
        jLabel20 = new javax.swing.JLabel(){
            public void paintComponent(Graphics g){
                g.drawImage(miImagen2, 0, 0, getWidth(), getHeight(), this);
            }
        };
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        PanelPasaje.add(jLabel20);
        jLabel20.setBounds(100, 280, 90, 90);

        ImageIcon autobus = new ImageIcon(getClass().getResource("/imagenes/autobus-alternativo.png"));
        Image miImagen3 = autobus.getImage();
        jLabel21 = new javax.swing.JLabel(){
            public void paintComponent(Graphics g){
                g.drawImage(miImagen3, 0, 0, getWidth(), getHeight(), this);
            }
        };
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        PanelPasaje.add(jLabel21);
        jLabel21.setBounds(300, 280, 90, 90);

        BotonSalir1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        BotonSalir1.setText("Salir");
        BotonSalir1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalir1ActionPerformed(evt);
            }
        });
        PanelPasaje.add(BotonSalir1);
        BotonSalir1.setBounds(30, 510, 150, 40);

        SpinnerDateModel model = new SpinnerDateModel();
        jSpinner1.setModel(model);
        JSpinner.DateEditor editor4 = new JSpinner.DateEditor(jSpinner1, "HH:mm");
        jSpinner1.setEditor(editor4);
        JFormattedTextField Horas = ((JSpinner.DefaultEditor) jSpinner1.getEditor()).getTextField();
        Horas.setEditable(false);
        PanelPasaje.add(jSpinner1);
        jSpinner1.setBounds(180, 170, 70, 30);

        jLabel22.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Hora de Salida:");
        PanelPasaje.add(jLabel22);
        jLabel22.setBounds(30, 170, 140, 30);

        jLabel23.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Asiento:");
        PanelPasaje.add(jLabel23);
        jLabel23.setBounds(360, 170, 80, 30);

        ComboAsiento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ComboAsiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Asiento", "Estandar", "Premium" }));
        ComboAsiento.setToolTipText("Con el asiento premium, disfruta de asientos de mayor calidad, mejores vistas y la posibilidad de personalizar tu comida a tu gusto para una experiencia de viaje más cómoda y placentera.");
        ComboAsiento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboAsientoItemStateChanged(evt);
            }
        });
        ComboAsiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboAsientoActionPerformed(evt);
            }
        });
        PanelPasaje.add(ComboAsiento);
        ComboAsiento.setBounds(460, 170, 210, 30);

        LabelAsiento.setForeground(new java.awt.Color(255, 255, 255));
        PanelPasaje.add(LabelAsiento);
        LabelAsiento.setBounds(420, 200, 230, 20);

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Añade 5% al Costo Actual");
        PanelPasaje.add(jLabel24);
        jLabel24.setBounds(480, 420, 150, 16);

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Añade 7% al Costo Actual");
        PanelPasaje.add(jLabel25);
        jLabel25.setBounds(70, 420, 150, 16);

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Añade 3% al Costo Actual");
        PanelPasaje.add(jLabel26);
        jLabel26.setBounds(280, 420, 150, 16);
        PanelPasaje.add(jSeparator2);
        jSeparator2.setBounds(20, 220, 650, 10);

        LabelPrecio.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelPrecio.setForeground(new java.awt.Color(51, 204, 0));
        PanelPasaje.add(LabelPrecio);
        LabelPrecio.setBounds(280, 470, 100, 20);

        PanelPrincipal.add(PanelPasaje, "PanelPasaje");

        PanelAlojamiento = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                g.drawImage(miImagen, 0, 0, getWidth(), getHeight(), this);
            }
        };
        PanelAlojamiento.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Alojamiento");
        PanelAlojamiento.add(jLabel16);
        jLabel16.setBounds(270, 0, 140, 38);

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Elija el tipo de alojamiento:");
        PanelAlojamiento.add(jLabel34);
        jLabel34.setBounds(20, 40, 240, 50);

        ComboAlojamiento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ComboAlojamiento.setForeground(new java.awt.Color(255, 255, 255));
        ComboAlojamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Alojamiento", "Hotel", "Hostel", "Cabaña" }));
        ComboAlojamiento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboAlojamientoItemStateChanged(evt);
            }
        });
        ComboAlojamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboAlojamientoActionPerformed(evt);
            }
        });
        PanelAlojamiento.add(ComboAlojamiento);
        ComboAlojamiento.setBounds(260, 50, 210, 30);

        TablaAlojamiento.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TablaAlojamiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ciudad", "Nombre", "Tipo", "Precio por Noche", "Cantidad", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaAlojamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaAlojamientoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaAlojamiento);

        PanelAlojamiento.add(jScrollPane1);
        jScrollPane1.setBounds(20, 140, 650, 130);

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Seleccione algun Alojamiento");
        PanelAlojamiento.add(jLabel35);
        jLabel35.setBounds(20, 110, 210, 20);
        PanelAlojamiento.add(jSeparator1);
        jSeparator1.setBounds(20, 90, 650, 20);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("Presupuestar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PanelAlojamiento.add(jButton1);
        jButton1.setBounds(510, 540, 160, 40);

        jButton3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton3.setText("Volver");
        PanelAlojamiento.add(jButton3);
        jButton3.setBounds(30, 540, 100, 40);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(null);

        jLabel42.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel42.setText("¿Traslados hacia el hotel?");
        jPanel2.add(jLabel42);
        jLabel42.setBounds(10, 170, 190, 30);

        RadioSi.setActionCommand("Si");
        RadioSi.setBackground(new java.awt.Color(204, 204, 204));
        GrupoTraslados.add(RadioSi);
        RadioSi.setText("Si");
        jPanel2.add(RadioSi);
        RadioSi.setBounds(200, 170, 43, 30);

        RadioNo.setActionCommand("No");
        RadioNo.setBackground(new java.awt.Color(204, 204, 204));
        GrupoTraslados.add(RadioNo);
        RadioNo.setText("No");
        jPanel2.add(RadioNo);
        RadioNo.setBounds(250, 170, 50, 30);

        RadioPensionCompleta.setActionCommand("Pension Completa");
        RadioPensionCompleta.setBackground(new java.awt.Color(204, 204, 204));
        GrupoMenu.add(RadioPensionCompleta);
        RadioPensionCompleta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        RadioPensionCompleta.setText("Pension Completa");
        jPanel2.add(RadioPensionCompleta);
        RadioPensionCompleta.setBounds(120, 130, 160, 28);

        jLabel38.setForeground(new java.awt.Color(102, 102, 102));
        jLabel38.setText("(Incluye Todas las Comidas) +8% al presupuesto");
        jPanel2.add(jLabel38);
        jLabel38.setBounds(280, 130, 280, 30);

        jLabel41.setForeground(new java.awt.Color(102, 102, 102));
        jLabel41.setText("(Incluye Desayuno y Cena) +5% al presupuesto");
        jPanel2.add(jLabel41);
        jLabel41.setBounds(260, 100, 270, 30);

        RadioMediaPension.setActionCommand("Media Pension");
        RadioMediaPension.setBackground(new java.awt.Color(204, 204, 204));
        GrupoMenu.add(RadioMediaPension);
        RadioMediaPension.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        RadioMediaPension.setText("Media Pension");
        jPanel2.add(RadioMediaPension);
        RadioMediaPension.setBounds(120, 100, 140, 28);

        RadioDesayuno.setActionCommand("Desayuno Incluido");
        RadioDesayuno.setBackground(new java.awt.Color(204, 204, 204));
        GrupoMenu.add(RadioDesayuno);
        RadioDesayuno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        RadioDesayuno.setText("Desayuno Incluido");
        RadioDesayuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioDesayunoActionPerformed(evt);
            }
        });
        jPanel2.add(RadioDesayuno);
        RadioDesayuno.setBounds(120, 70, 161, 28);

        jLabel40.setForeground(new java.awt.Color(102, 102, 102));
        jLabel40.setText("(Incluye Desayuno solamente) +2% al presupuesto");
        jPanel2.add(jLabel40);
        jLabel40.setBounds(280, 70, 290, 30);

        jLabel39.setForeground(new java.awt.Color(102, 102, 102));
        jLabel39.setText("(No incluye comidas)");
        jPanel2.add(jLabel39);
        jLabel39.setBounds(240, 40, 120, 30);

        RadioSinPension.setActionCommand("Sin Pension");
        RadioSinPension.setBackground(new java.awt.Color(204, 204, 204));
        GrupoMenu.add(RadioSinPension);
        RadioSinPension.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        RadioSinPension.setText("Sin Pension");
        jPanel2.add(RadioSinPension);
        RadioSinPension.setBounds(120, 40, 120, 28);

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel37.setText("Tipos de menu:");
        jPanel2.add(jLabel37);
        jLabel37.setBounds(10, 70, 110, 50);

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel36.setText("Menu");
        jPanel2.add(jLabel36);
        jLabel36.setBounds(280, 0, 70, 32);

        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("+1% al presupuesto");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(300, 170, 130, 30);

        PanelAlojamiento.add(jPanel2);
        jPanel2.setBounds(20, 280, 650, 210);

        jLabel43.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Costo Actual:");
        PanelAlojamiento.add(jLabel43);
        jLabel43.setBounds(20, 500, 120, 30);

        Label89.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Label89.setForeground(new java.awt.Color(51, 204, 0));
        Label89.setText("$");
        PanelAlojamiento.add(Label89);
        Label89.setBounds(140, 500, 10, 30);

        LabelAlojamiento.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelAlojamiento.setForeground(new java.awt.Color(51, 204, 0));
        PanelAlojamiento.add(LabelAlojamiento);
        LabelAlojamiento.setBounds(150, 500, 100, 30);

        PanelPrincipal.add(PanelAlojamiento, "PanelAlojamiento");

        PanelFinal = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                g.drawImage(miImagen, 0, 0, getWidth(), getHeight(), this);
            }
        };
        PanelFinal.setLayout(null);

        ImageIcon logo = new ImageIcon(getClass().getResource("/imagenes/logo.jpg"));
        Image milogo = logo.getImage();
        jLabel44 = new javax.swing.JLabel(){
            public void paintComponent(Graphics g){
                g.drawImage(milogo, 0, 0, getWidth(), getHeight(), this);
            }
        };
        PanelFinal.add(jLabel44);
        jLabel44.setBounds(20, 40, 320, 120);

        jLabel45.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Paquete");
        PanelFinal.add(jLabel45);
        jLabel45.setBounds(295, 0, 93, 32);

        jLabel55.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel55.setText("Celi Leandro");
        PanelFinal.add(jLabel55);
        jLabel55.setBounds(130, 420, 90, 20);

        jLabel56.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel56.setText("Cadelgo Lautaro");
        PanelFinal.add(jLabel56);
        jLabel56.setBounds(120, 460, 120, 20);

        jLabel57.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel57.setText("Colombero Luciano");
        PanelFinal.add(jLabel57);
        jLabel57.setBounds(110, 480, 140, 20);

        jLabel58.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel58.setText("Caceres Milian");
        PanelFinal.add(jLabel58);
        jLabel58.setBounds(120, 500, 110, 20);

        jLabel59.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel59.setText("Becerra Martin");
        PanelFinal.add(jLabel59);
        jLabel59.setBounds(120, 440, 120, 20);

        jLabel60.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 0, 51));
        jLabel60.setText("BY GRUPO 6");
        PanelFinal.add(jLabel60);
        jLabel60.setBounds(120, 520, 120, 40);

        jTextArea1.setBackground(new java.awt.Color(210, 210, 206));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("\"Gracias por utilizar nuestro sistema. Todos \t        los datos proporcionados han sido              procesados correctamente y tu información     ha sido registrada con éxito. Asegúrate de        revisar la confirmación antes de finalizar             cualquier acción para evitar posibles           errores. Si tienes alguna duda o necesitas       realizar cambios adicionales, no dudes en       contactarnos. Estamos comprometidos en brindarte la mejor experiencia y asegurarnos de que todos los detalles sean precisos para               tu comodidad y satisfacción.\"");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelFinal.add(jTextArea1);
        jTextArea1.setBounds(20, 170, 325, 400);

        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setText("Comprar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        PanelFinal.add(jButton2);
        jButton2.setBounds(530, 530, 140, 40);

        jButton4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton4.setText("Me Arrepenti");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        PanelFinal.add(jButton4);
        jButton4.setBounds(360, 530, 160, 40);
        PanelFinal.add(jLabel52);
        jLabel52.setBounds(370, 160, 0, 0);

        jPanel1.setLayout(null);

        jLabel54.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel54.setText("Transporte:");
        jPanel1.add(jLabel54);
        jLabel54.setBounds(10, 80, 90, 20);

        jLabel46.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel46.setText("Cantidad de Turistas:");
        jPanel1.add(jLabel46);
        jLabel46.setBounds(10, 50, 150, 20);

        jLabel48.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel48.setText("Fecha de ida:");
        jPanel1.add(jLabel48);
        jLabel48.setBounds(10, 200, 100, 19);

        jLabel47.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel47.setText("Hasta:");
        jPanel1.add(jLabel47);
        jLabel47.setBounds(10, 170, 43, 19);

        TipoAlojamientoFinal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(TipoAlojamientoFinal);
        TipoAlojamientoFinal.setBounds(10, 290, 70, 20);

        jLabel51.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel51.setText("Desde:");
        jPanel1.add(jLabel51);
        jLabel51.setBounds(10, 140, 49, 19);

        jLabel53.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel53.setText("Hora:");
        jPanel1.add(jLabel53);
        jLabel53.setBounds(10, 260, 48, 19);

        jLabel50.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel50.setText("Fecha de Vuelta:");
        jPanel1.add(jLabel50);
        jLabel50.setBounds(10, 230, 130, 19);

        jLabel61.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel61.setText("Su Paquete");
        jPanel1.add(jLabel61);
        jLabel61.setBounds(100, 10, 110, 20);

        jLabel62.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel62.setText("Categoria:");
        jPanel1.add(jLabel62);
        jLabel62.setBounds(10, 110, 80, 19);

        cantidadFinal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cantidadFinal.setForeground(new java.awt.Color(102, 102, 102));
        cantidadFinal.setText("cantidad");
        jPanel1.add(cantidadFinal);
        cantidadFinal.setBounds(160, 50, 130, 20);

        TransporteFinal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TransporteFinal.setForeground(new java.awt.Color(102, 102, 102));
        TransporteFinal.setText("tipo");
        jPanel1.add(TransporteFinal);
        TransporteFinal.setBounds(100, 80, 120, 19);

        CategoriaFinal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        CategoriaFinal.setForeground(new java.awt.Color(102, 102, 102));
        CategoriaFinal.setText("tipo");
        jPanel1.add(CategoriaFinal);
        CategoriaFinal.setBounds(90, 110, 140, 19);

        DesdeFinal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        DesdeFinal.setForeground(new java.awt.Color(102, 102, 102));
        DesdeFinal.setText("jLabel66");
        jPanel1.add(DesdeFinal);
        DesdeFinal.setBounds(70, 140, 240, 19);

        HastaFinal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        HastaFinal.setForeground(new java.awt.Color(102, 102, 102));
        HastaFinal.setText("jLabel67");
        jPanel1.add(HastaFinal);
        HastaFinal.setBounds(60, 170, 250, 19);

        FechaIdaFinal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FechaIdaFinal.setForeground(new java.awt.Color(102, 102, 102));
        FechaIdaFinal.setText("jLabel68");
        jPanel1.add(FechaIdaFinal);
        FechaIdaFinal.setBounds(110, 200, 170, 19);

        FechaVueltaFinal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FechaVueltaFinal.setForeground(new java.awt.Color(102, 102, 102));
        FechaVueltaFinal.setText("jLabel69");
        jPanel1.add(FechaVueltaFinal);
        FechaVueltaFinal.setBounds(130, 230, 140, 19);

        HoraFinal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        HoraFinal.setForeground(new java.awt.Color(102, 102, 102));
        HoraFinal.setText("jLabel70");
        jPanel1.add(HoraFinal);
        HoraFinal.setBounds(50, 260, 180, 19);

        AlojamientoFinal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        AlojamientoFinal.setForeground(new java.awt.Color(102, 102, 102));
        AlojamientoFinal.setText("jLabel71");
        jPanel1.add(AlojamientoFinal);
        AlojamientoFinal.setBounds(70, 290, 150, 19);

        jLabel72.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel72.setText("Menu:");
        jPanel1.add(jLabel72);
        jLabel72.setBounds(10, 320, 44, 19);

        MenuFinal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        MenuFinal.setForeground(new java.awt.Color(102, 102, 102));
        MenuFinal.setText("jLabel73");
        jPanel1.add(MenuFinal);
        MenuFinal.setBounds(60, 320, 170, 19);

        jLabel74.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel74.setText("Traslados:");
        jPanel1.add(jLabel74);
        jLabel74.setBounds(10, 350, 90, 19);

        TrasladosFinal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TrasladosFinal.setForeground(new java.awt.Color(102, 102, 102));
        TrasladosFinal.setText("jLabel75");
        jPanel1.add(TrasladosFinal);
        TrasladosFinal.setBounds(90, 350, 170, 19);

        jLabel76.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel76.setText("Costo Final:");
        jPanel1.add(jLabel76);
        jLabel76.setBounds(20, 410, 110, 20);

        CostoFinalPaquete.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        CostoFinalPaquete.setForeground(new java.awt.Color(0, 153, 0));
        CostoFinalPaquete.setText("jLabel77");
        jPanel1.add(CostoFinalPaquete);
        CostoFinalPaquete.setBounds(130, 410, 170, 20);

        PanelFinal.add(jPanel1);
        jPanel1.setBounds(360, 40, 310, 450);

        PanelPrincipal.add(PanelFinal, "PanelFinal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSiguienteActionPerformed

        CardLayout cardLayout = (CardLayout) PanelPrincipal.getLayout();
        cardLayout.show(PanelPrincipal, "PanelPasaje");
        PanelPrincipal.validate();
        PanelPrincipal.repaint();
    }//GEN-LAST:event_BotonSiguienteActionPerformed

    private void ComboOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboOrigenActionPerformed

    }//GEN-LAST:event_ComboOrigenActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Ciudad origen = (Ciudad) ComboOrigen.getSelectedItem();
        Ciudad destino = (Ciudad) ComboDestino.getSelectedItem();

        if (!checkeoPasaje()) {

            if (!origen.getContinente().equals(destino.getContinente()) && RadioColectivo.isSelected()) {

                JOptionPane.showMessageDialog(this, "Si viaja a otro continente no puede ir en colectivo.", "Advertencia", JOptionPane.WARNING_MESSAGE);

            } else {

                int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?. No podrá cambiar los datos una vez confirmado.", "Confirmación", JOptionPane.YES_NO_OPTION);

                if (respuesta == JOptionPane.YES_OPTION) {
                    CardLayout cardLayout = (CardLayout) PanelPrincipal.getLayout();
                    cardLayout.show(PanelPrincipal, "PanelAlojamiento");
                    PanelPrincipal.validate();
                    PanelPrincipal.repaint();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Complete los campos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void FieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldTelefonoActionPerformed

    private void BotonRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRestarActionPerformed

        int num = Integer.parseInt(Numero.getText());
        num--;

        if (num < 1 || num == 1) {
            BotonRestar.setEnabled(false);
            Numero.setText(String.valueOf(num));
        } else {
            BotonRestar.setEnabled(true);
            Numero.setText(String.valueOf(num));
            Advertencia.setText("");
        }

        if (num == 1) {
            LabelViajeros.setText("Viajero");
        }
    }//GEN-LAST:event_BotonRestarActionPerformed

    private void BotonSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSumarActionPerformed
        int num = Integer.parseInt(Numero.getText());
        num++;
        if (num <= 7) {
            Numero.setText(String.valueOf(num));
        }

        if (num > 7) {
            Advertencia.setText("No se pueden ingresar mas de 7 turistas");
        } else {
            Advertencia.setText("");
        }

        if (num > 1) {
            LabelViajeros.setText("Viajeros");
            BotonRestar.setEnabled(true);
        }

    }//GEN-LAST:event_BotonSumarActionPerformed

    private void BotonEstablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEstablecerActionPerformed
        int resultado = JOptionPane.showConfirmDialog(this, "¿Seguro de la eleccion? Este proceso no se podra cambiar.");
        if (resultado == JOptionPane.YES_OPTION) {
            FieldNombre.setEnabled(true);
            FieldApellido.setEnabled(true);
            FieldDni.setEnabled(true);
            FieldEdad.setEnabled(true);
            FieldEmail.setEnabled(true);
            FieldTelefono.setEnabled(true);
            BotonSalir.setEnabled(true);
            BotonGuardar.setEnabled(true);
            BotonEstablecer.setEnabled(false);
            BotonRestar.setEnabled(false);
            BotonSumar.setEnabled(false);
        }
    }//GEN-LAST:event_BotonEstablecerActionPerformed

    private void FieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldNombreActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        try {
            int contador = Integer.parseInt(Contador.getText());
            int num = Integer.parseInt(Numero.getText());

            if (!checkeoTurista()) {
                String email = FieldEmail.getText().isEmpty() ? null : FieldEmail.getText();
                Long telefono = FieldTelefono.getText().isEmpty() ? null : Long.parseLong(FieldTelefono.getText());

                Turista t = new Turista(Integer.parseInt(FieldDni.getText()), FieldNombre.getText(), FieldApellido.getText(), Integer.parseInt(FieldEdad.getText()), telefono, email);
                guardarTurista.add(t);
                JOptionPane.showMessageDialog(this, "El Turista fue agregado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                contador++;
                Contador.setText(String.valueOf(contador));
                vaciarCamposTurista();
            }

            if (contador > num) {
                BotonGuardar.setEnabled(false);
                BotonSiguiente.setEnabled(true);
            }
        } catch (NumberFormatException w) {
            JOptionPane.showMessageDialog(this, "Ingrese datos Válidos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void FieldDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldDniKeyTyped
        char dni = evt.getKeyChar();
        if (!Character.isDigit(dni)) {
            evt.consume();
        }
    }//GEN-LAST:event_FieldDniKeyTyped

    private void FieldEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldEdadKeyTyped
        char edad = evt.getKeyChar();
        if (!Character.isDigit(edad)) {
            evt.consume();
        }
    }//GEN-LAST:event_FieldEdadKeyTyped

    private void FieldTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldTelefonoKeyTyped

    }//GEN-LAST:event_FieldTelefonoKeyTyped

    private void FieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldEmailActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        int resultado = JOptionPane.showConfirmDialog(this, "Si sales, se borrará toda la información ingresada. ¿Deseas continuar?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (resultado == JOptionPane.YES_OPTION) {
            this.dispose();
        }

    }//GEN-LAST:event_BotonSalirActionPerformed

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        RadioAvion.setSelected(true);
        actualizarPrecio();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        Ciudad origen = (Ciudad) ComboOrigen.getSelectedItem();
        Ciudad destino = (Ciudad) ComboDestino.getSelectedItem();

        if (origen.getContinente().equals(destino.getContinente())) {
            RadioColectivo.setSelected(true);
            actualizarPrecio();
        }

    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        RadioBarco.setSelected(true);
        actualizarPrecio();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void CalendarioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_CalendarioPropertyChange

    }//GEN-LAST:event_CalendarioPropertyChange

    private void Calendario2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Calendario2AncestorAdded

    }//GEN-LAST:event_Calendario2AncestorAdded

    private void CalendarioAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_CalendarioAncestorAdded

    }//GEN-LAST:event_CalendarioAncestorAdded

    private void BotonSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalir1ActionPerformed
        int resultado = JOptionPane.showConfirmDialog(this, "Si sales, se borrará toda la información ingresada. ¿Deseas continuar?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (resultado == JOptionPane.YES_OPTION) {
            this.dispose();
        }

    }//GEN-LAST:event_BotonSalir1ActionPerformed

    private void ComboAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboAsientoActionPerformed
        if (ComboAsiento.getSelectedItem().equals("Premium")) {
            LabelAsiento.setText("Esta opcion añade un 3% al Costo Actual.");
        }

        if (ComboAsiento.getSelectedItem().equals("Estandar")) {
            LabelAsiento.setText("");
        }

    }//GEN-LAST:event_ComboAsientoActionPerformed

    private void ComboOrigenPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ComboOrigenPropertyChange

    }//GEN-LAST:event_ComboOrigenPropertyChange

    private void ComboOrigenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboOrigenItemStateChanged

    }//GEN-LAST:event_ComboOrigenItemStateChanged

    private void ComboDestinoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboDestinoItemStateChanged

    }//GEN-LAST:event_ComboDestinoItemStateChanged

    private void ComboAsientoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboAsientoItemStateChanged
        ComboAsiento.removeItem("Seleccione Asiento");

    }//GEN-LAST:event_ComboAsientoItemStateChanged

    private void ComboAlojamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboAlojamientoActionPerformed

        DefaultTableModel alomodel = (DefaultTableModel) TablaAlojamiento.getModel();
        alomodel.setRowCount(0);
        AlojamientoData ad = new AlojamientoData();

        String select = (String) ComboAlojamiento.getSelectedItem();
        Ciudad city = (Ciudad) ComboDestino.getSelectedItem();

        List<Alojamiento> alojamientos = ad.listarAlojamientosXCiudadYTipo(city.getNombre(), select);

        for (Alojamiento aux : alojamientos) {
            alomodel.addRow(new Object[]{
                aux.getNbreCiudad(),
                aux.getNombre(),
                aux.getTipo(),
                aux.getPrecioNoche(),
                aux.getCapacidad(),
                aux.getEstado()

            });
        }


    }//GEN-LAST:event_ComboAlojamientoActionPerformed

    private void RadioDesayunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioDesayunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioDesayunoActionPerformed

    private void ComboDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboDestinoActionPerformed

    private void ComboAlojamientoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboAlojamientoItemStateChanged
        ComboAlojamiento.removeItem("Seleccione Alojamiento");
    }//GEN-LAST:event_ComboAlojamientoItemStateChanged

    private void TablaAlojamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaAlojamientoMouseClicked
        int fila = TablaAlojamiento.getSelectedRow();

        if (fila != -1) {
            Object valorCelda = TablaAlojamiento.getValueAt(fila, 3);

            if (valorCelda != null && valorCelda instanceof Number) {
                double precioPorNoche = Double.parseDouble(valorCelda.toString());
                 System.out.println(precioPorNoche);
                actualizarPresupuestoConAlojamiento(precioPorNoche);
            }
        }
    }//GEN-LAST:event_TablaAlojamientoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        CardLayout cardLayout = (CardLayout) PanelPrincipal.getLayout();

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String calendario1 = formato.format(Calendario.getDate());
        String calendario2 = formato.format(Calendario2.getDate());

        Date horaSeleccionada = (Date) jSpinner1.getValue();
        SimpleDateFormat formato2 = new SimpleDateFormat("HH:mm");
        String hora = formato2.format(horaSeleccionada);

        int num = Integer.parseInt(Numero.getText());
        
        int selectedRow = TablaAlojamiento.getSelectedRow();

        if (checkeoAlojamiento()) {
            JOptionPane.showMessageDialog(this, "No puede haber campos sin elegir", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            //Paquete Final
            cantidadFinal.setText(String.valueOf(num));
            TransporteFinal.setText(GrupoTransporte.getSelection().getActionCommand());
            CategoriaFinal.setText((String) ComboAsiento.getSelectedItem());
            DesdeFinal.setText(ComboOrigen.getSelectedItem().toString());
            HastaFinal.setText(ComboDestino.getSelectedItem().toString());
            FechaIdaFinal.setText(calendario1);
            FechaVueltaFinal.setText(calendario2);
            HoraFinal.setText(hora);
            TipoAlojamientoFinal.setText(ComboAlojamiento.getSelectedItem().toString());
            AlojamientoFinal.setText((String) TablaAlojamiento.getValueAt(selectedRow, 1));
            MenuFinal.setText(GrupoMenu.getSelection().getActionCommand());
            TrasladosFinal.setText(GrupoTraslados.getSelection().getActionCommand());
            CostoFinalPaquete.setText("$ " + String.valueOf(presupuestoFinal));

            //Pasar a Paquete Final
            cardLayout.show(PanelPrincipal, "PanelFinal");
            PanelPrincipal.revalidate();
            PanelPrincipal.repaint();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea realizar la compra?", "Confirmación de compra", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        int asiento = 0;
        if(ComboAsiento.getSelectedItem().equals("Estandar")){
            asiento = 1;
        }
        
        if(ComboAsiento.getSelectedItem().equals("Premium")){
            asiento = 2;
        }
        
        
        Date hora = (Date) jSpinner1.getValue();
        
        LocalDate horalocal = hora.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        float traslado = 0;
        
        if(GrupoTraslados.getSelection().getActionCommand().equals("Si")){
            traslado = 1;
        }
        
        if(GrupoTraslados.getSelection().getActionCommand().equals("No")){
            traslado = 2;
        }
        
        int selectedRow = TablaAlojamiento.getSelectedRow();
        
        Date fechaini = Calendario.getDate();
            LocalDate localDate = fechaini.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Date fechafin = Calendario2.getDate();
            LocalDate localDate1 = fechafin.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            
        double porcentaje = 0;
        if(GrupoMenu.getSelection().getActionCommand().equals("Sin Pension")){
            porcentaje = 0;
        }
        
        if(GrupoMenu.getSelection().getActionCommand().equals("Desayuno Incluido")){
            porcentaje = 2;
        }
        
        if(GrupoMenu.getSelection().getActionCommand().equals("Media Pension")){
            porcentaje = 5;
        }
        
        if(GrupoMenu.getSelection().getActionCommand().equals("Pension Completa")){
            porcentaje = 8;
        }
        if (respuesta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Compra confirmada.");
            
            //agregar Turista
            TuristaData td = new TuristaData();
            for (Turista aux : guardarTurista) {
                td.cargarTurista(aux);
            }
            
            //agregar paquete
            PasajeData pd = new PasajeData();
            Pasaje pasaje = new Pasaje(horalocal,(Ciudad)ComboOrigen.getSelectedItem(),(Ciudad)ComboDestino.getSelectedItem(), asiento, GrupoTransporte.getSelection().getActionCommand());
            pd.guardarPasaje(pasaje);
            
            //agregar alojamiento
            AlojamientoData ad = new AlojamientoData();
            
            //agregar pension 
            Pension pension = new Pension(3,GrupoMenu.getSelection().getActionCommand(),porcentaje);
            
            //agregar paquete
            PaqueteData paq = new PaqueteData();
            Paquete paquete = new Paquete(2, localDate, localDate1, pasaje, ad.buscarAlojamientoPorNombre((String) TablaAlojamiento.getValueAt(selectedRow, 1)), pension, (Ciudad)ComboOrigen.getSelectedItem(), (Ciudad)ComboDestino.getSelectedItem(), traslado, presupuestoFinal, guardarTurista.get(0));
            
            //agregar compra
            ComprasData comdat = new ComprasData();
            Compras compra = new Compras();
        compra.setPaquete(paquete);
        compra.setCiudad(paquete.getDestino());
        compra.setTemporada(compra.calcularTemporada(paquete));
        comdat.generarCompra(compra);
        
        this.dispose();
            
        } else {
            JOptionPane.showMessageDialog(null, "Compra cancelada.");
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    public boolean checkeoTurista() {
        String email = FieldEmail.getText();
        String telefono = FieldTelefono.getText();
        String expresion = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String expresionTelefono = "^[0-9]{10,15}$";

        if (FieldNombre.getText().isEmpty() || FieldApellido.getText().isEmpty() || FieldDni.getText().isEmpty() || FieldEdad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos obligatorios deben ser completos.", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }

        if (!email.isEmpty() && !email.matches(expresion)) {
            JOptionPane.showMessageDialog(null, "El formato del correo electrónico no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        if (telefono.isEmpty() || !telefono.matches(expresionTelefono)) {
            JOptionPane.showMessageDialog(null, "El teléfono debe tener al menos 10 digitos.", "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }

        return false;
    }

    public void vaciarCamposTurista() {
        FieldNombre.setText("");
        FieldApellido.setText("");
        FieldDni.setText("");
        FieldEmail.setText("");
        FieldEdad.setText("");
        FieldTelefono.setText("");
    }

    public boolean checkeoPasaje() {

        return (ComboOrigen.getSelectedItem().equals("Seleccione Ciudad") || ComboDestino.getSelectedItem().equals("Seleccione Ciudad") || (Calendario.getDate() == null) || (Calendario2.getDate() == null) || ComboAsiento.getSelectedItem().equals("Seleccione Asiento") || (GrupoTransporte.getSelection() == null));
    }

    public boolean checkeoAlojamiento() {

        return (GrupoMenu.getSelection() == null && GrupoTraslados.getSelection() == null);
    }

    public void cargarCiudad() {

        CiudadData c = new CiudadData();

        List<Ciudad> ciudad = c.listarCiudades();

        for (Ciudad c1 : ciudad) {

            ComboOrigen.addItem(c1);
            ComboDestino.addItem(c1);
        }

    }

    public void actualizarPrecio() {
        Ciudad origen = (Ciudad) ComboOrigen.getSelectedItem();
        Ciudad destino = (Ciudad) ComboDestino.getSelectedItem();

        if (origen == null || destino == null) {
            return;
        }

        if (!origen.getContinente().equals(destino.getContinente())) {
            precioPasaje = 30000;
            RadioColectivo.setEnabled(false);
        } else {
            precioPasaje = 10000;
            RadioColectivo.setEnabled(true);
        }

        double precioFinal = precioPasaje;
        
        LocalDate fechaInicio = null;
    LocalDate fechaFin = null;

    if (Calendario.getDate() != null) {
        fechaInicio = Calendario.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    if (Calendario2.getDate() != null) {
        fechaFin = Calendario2.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    if (fechaInicio == null || fechaFin == null) {
        return;
    }

    double ajusteTemporada = calcularTemporada(fechaInicio, fechaFin);
    precioFinal += precioFinal * ajusteTemporada;
        
        if ("Premium".equals(ComboAsiento.getSelectedItem())) {
            precioFinal *= 1.03;
        }

        if (RadioAvion.isSelected()) {
            precioFinal *= 1.07;
        } else if (RadioColectivo.isSelected()) {
            precioFinal *= 1.03;
        } else if (RadioBarco.isSelected()) {
            precioFinal *= 1.05;
        }

        double cantidad = Double.parseDouble(Numero.getText());
        LabelPrecio.setText(String.valueOf(precioFinal));
        double precioTotal = precioFinal * cantidad;
        LabelAlojamiento.setText(String.valueOf(precioTotal));
        presupuestoBase = precioTotal;
    }

    private void actualizarPresupuesto() {
        presupuestoFinal = presupuestoBase;

        if (RadioSinPension.isSelected()) {
            presupuestoFinal += presupuestoBase * 0;
        } else if (RadioDesayuno.isSelected()) {
            presupuestoFinal += presupuestoBase * 0.02;
        } else if (RadioMediaPension.isSelected()) {
            presupuestoFinal += presupuestoBase * 0.05;
        } else if (RadioPensionCompleta.isSelected()) {
            presupuestoFinal += presupuestoBase * 0.08;
        }

        if (RadioSi.isSelected()) {
            presupuestoFinal += presupuestoBase * 0.01;
        }
        
        presupuestoFinal += precioAlojamiento;

        LabelAlojamiento.setText(String.valueOf(presupuestoFinal));
    }
    
    private void actualizarPresupuestoConAlojamiento(double precioPorNoche) {

        LocalDate fechaInicio = Calendario.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaFin = Calendario2.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        long diferenciaEnDias = ChronoUnit.DAYS.between(fechaInicio, fechaFin);

        precioAlojamiento = precioPorNoche * diferenciaEnDias;

        presupuestoFinal = presupuestoBase + precioAlojamiento;


        LabelAlojamiento.setText(String.valueOf(presupuestoFinal));

             
        actualizarPresupuesto();
    }
    
    private double calcularTemporada(LocalDate fechaInicio, LocalDate fechaFin) {

    LocalDate inicio = Calendario.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    LocalDate fin = Calendario2.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

    LocalDate inicioAlta1 = LocalDate.of(inicio.getYear(), 12, 15);
    LocalDate finAlta1 = LocalDate.of(inicio.getYear() + 1, 2, 28);
    LocalDate inicioAlta2 = LocalDate.of(inicio.getYear(), 7, 1);
    LocalDate finAlta2 = LocalDate.of(inicio.getYear(), 7, 31);
    

    LocalDate inicioMedia1 = LocalDate.of(inicio.getYear(), 9, 21);
    LocalDate finMedia1 = LocalDate.of(inicio.getYear(), 12, 21);
    LocalDate inicioMedia2 = LocalDate.of(inicio.getYear() + 1, 4, 13);
    LocalDate finMedia2 = LocalDate.of(inicio.getYear() + 1, 4, 17);
  
    if (fechaInicio.isAfter(inicioAlta1) && fechaInicio.isBefore(finAlta1) || fechaInicio.isAfter(inicioAlta2) && fechaInicio.isBefore(finAlta2)) {
        return 0.30;
    }

    else if (fechaInicio.isAfter(inicioMedia1) && fechaInicio.isBefore(finMedia1) || fechaInicio.isAfter(inicioMedia2) && fechaInicio.isBefore(finMedia2)) {
        return 0.15;
    }

    return 0.0; 
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Advertencia;
    private javax.swing.JLabel AlojamientoFinal;
    private javax.swing.JButton BotonEstablecer;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonRestar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton BotonSalir1;
    private javax.swing.JButton BotonSiguiente;
    private javax.swing.JButton BotonSumar;
    private com.toedter.calendar.JDateChooser Calendario;
    private com.toedter.calendar.JDateChooser Calendario2;
    private javax.swing.JLabel CategoriaFinal;
    private javax.swing.JComboBox<String> ComboAlojamiento;
    private javax.swing.JComboBox<String> ComboAsiento;
    private javax.swing.JComboBox<Ciudad> ComboDestino;
    private javax.swing.JComboBox<Ciudad> ComboOrigen;
    private javax.swing.JLabel Contador;
    private javax.swing.JLabel CostoFinalPaquete;
    private javax.swing.JLabel DesdeFinal;
    private javax.swing.JLabel FechaIdaFinal;
    private javax.swing.JLabel FechaVueltaFinal;
    private javax.swing.JTextField FieldApellido;
    private javax.swing.JTextField FieldDni;
    private javax.swing.JTextField FieldEdad;
    private javax.swing.JTextField FieldEmail;
    private javax.swing.JTextField FieldNombre;
    private javax.swing.JTextField FieldTelefono;
    private javax.swing.ButtonGroup GrupoMenu;
    private javax.swing.ButtonGroup GrupoTransporte;
    private javax.swing.ButtonGroup GrupoTraslados;
    private javax.swing.JLabel HastaFinal;
    private javax.swing.JLabel HoraFinal;
    private javax.swing.JLabel Label89;
    private javax.swing.JLabel LabelAlojamiento;
    private javax.swing.JLabel LabelAsiento;
    private javax.swing.JLabel LabelPrecio;
    private javax.swing.JLabel LabelViajeros;
    private javax.swing.JLabel MenuFinal;
    private javax.swing.JLabel Numero;
    private javax.swing.JPanel PanelAlojamiento;
    private javax.swing.JPanel PanelFinal;
    private javax.swing.JPanel PanelPasaje;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelTurista;
    private javax.swing.JRadioButton RadioAvion;
    private javax.swing.JRadioButton RadioBarco;
    private javax.swing.JRadioButton RadioColectivo;
    private javax.swing.JRadioButton RadioDesayuno;
    private javax.swing.JRadioButton RadioMediaPension;
    private javax.swing.JRadioButton RadioNo;
    private javax.swing.JRadioButton RadioPensionCompleta;
    private javax.swing.JRadioButton RadioSi;
    private javax.swing.JRadioButton RadioSinPension;
    private javax.swing.JTable TablaAlojamiento;
    private javax.swing.JLabel TipoAlojamientoFinal;
    private javax.swing.JLabel TransporteFinal;
    private javax.swing.JLabel TrasladosFinal;
    private javax.swing.JLabel cantidadFinal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
