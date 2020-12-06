package Proyecto;

import com.sun.awt.AWTUtilities;
import java.awt.Cursor;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class VentanaPrincipal extends javax.swing.JFrame {
    
    int x, y;
    float TotalPago = 0;   // TOTAL a PAGAR
    String dni,nomb;
    ImageIcon img;

//        Calendar fechaActual;
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null); //CENTRAR VENTANA PRINCIPAL
        this.setTitle("Menu Principal");
//        horaFecha();
        mov();
    }

    public void mov() {
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 27, 27);
        AWTUtilities.setWindowShape(this, forma);
    }

//        public void horaFecha(){
//            fechaActual = new GregorianCalendar();
//            
//            calendarfecha.setCalendar(fechaActual);
//        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frmVenta = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClienteEncontrado = new javax.swing.JTable();
        btnBuscarCliente = new javax.swing.JButton();
        btnNuevoCliente = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtNombProducto = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductoEncontrado = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnSeleccionar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblVenta = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnEfectuar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        frmNuevoCliente = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNuevoDNI = new javax.swing.JTextField();
        txtNuevoNombre = new javax.swing.JTextField();
        txtNuevoApellido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnRegistraNuevoClie = new javax.swing.JButton();
        btnCancelaNuevoClie = new javax.swing.JButton();
        frmNuevoProducto = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNuevoDNI1 = new javax.swing.JTextField();
        txtNuevoNombre1 = new javax.swing.JTextField();
        txtNuevoApellido1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnRegistraNuevoClie1 = new javax.swing.JButton();
        btnCancelaNuevoClie1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        frmBuscarUsuario = new javax.swing.JFrame();
        tablaBuscarUsuario = new javax.swing.JPanel();
        btnR_BuscarUsuario = new javax.swing.JButton();
        cajaR_DNI2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        txtR_Nombre = new javax.swing.JLabel();
        txtR_ApellidoP = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        cajaR_Nombre = new javax.swing.JTextField();
        cajaR_ApellidoPaterno = new javax.swing.JTextField();
        cajaR_ApellidoMaterno = new javax.swing.JTextField();
        cajaR_NumeroDNI = new javax.swing.JTextField();
        cajaR_Direccion = new javax.swing.JTextField();
        cajaR_Telefono = new javax.swing.JTextField();
        cajaR_Usuario = new javax.swing.JTextField();
        btnCancelarRegistroP = new javax.swing.JButton();
        btnGuardarRegistroP = new javax.swing.JButton();
        cajaR_Contraseña = new javax.swing.JPasswordField();
        caja_id = new javax.swing.JTextField();
        txtPb = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaBuscarUsuarioRegistrado = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        opcR_Cargo = new javax.swing.JComboBox();
        frmAjuste = new javax.swing.JFrame();
        panelAjuste = new javax.swing.JPanel();
        btn_C_Habitaciones = new javax.swing.JButton();
        btn_C_Personal = new javax.swing.JButton();
        btnRegres = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        fondo_Ajuste = new javax.swing.JLabel();
        frmVeUL = new javax.swing.JFrame();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        opcTipoServicio = new javax.swing.JComboBox();
        txtTipoHabitacion = new javax.swing.JLabel();
        opcTipoHabitacion = new javax.swing.JComboBox();
        txtTipoPago = new javax.swing.JLabel();
        opcTipoPago = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        fechaSalida = new com.toedter.calendar.JDateChooser();
        txtNDias = new javax.swing.JLabel();
        cajaNDias = new javax.swing.JTextField();
        txtFechaSalida = new javax.swing.JLabel();
        fechaEntrada = new com.toedter.calendar.JDateChooser();
        opc_H_Matrimoniales = new javax.swing.JComboBox();
        opc_H_Estandar = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        opc_H_Dobles = new javax.swing.JComboBox();
        opc_H_Triples = new javax.swing.JComboBox();
        panelPNatural = new javax.swing.JPanel();
        txtNombrePNatural = new javax.swing.JLabel();
        txtApellidoPPNatural = new javax.swing.JLabel();
        txtApellidoMPNatural = new javax.swing.JLabel();
        txtDniPNatural = new javax.swing.JLabel();
        txtDireccionPNatural = new javax.swing.JLabel();
        cajaNombrePNAtural = new javax.swing.JTextField();
        cajaApellidoPPNatural = new javax.swing.JTextField();
        cajaApellidoMPNatural = new javax.swing.JTextField();
        cajaDniPNatural = new javax.swing.JTextField();
        cajaDireccionPNatural = new javax.swing.JTextField();
        txtBucarDNIPNatural = new javax.swing.JLabel();
        cajaBuscarDNIPNatural = new javax.swing.JTextField();
        btnBuscarPNatural = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaBuscarPNatural = new javax.swing.JTable();
        btnCancelarPNatural = new javax.swing.JButton();
        btnGuardarPNatural = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtTipoCliente = new javax.swing.JLabel();
        opcTipoCliente = new javax.swing.JComboBox();
        jLabel33 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        panelPJuridica = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        frmPersonaNatural = new javax.swing.JFrame();
        jPanel7 = new javax.swing.JPanel();
        txtDNIV = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        cajaTextoDNI = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        btnCancelarV = new javax.swing.JButton();
        btnGuardarV = new javax.swing.JButton();
        opcTipoPago1 = new javax.swing.JComboBox();
        txtTipoPago1 = new javax.swing.JLabel();
        jFrame1 = new javax.swing.JFrame();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btnVentas = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        btnConfigutacion = new javax.swing.JButton();
        btnX = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

        frmVenta.setMinimumSize(new java.awt.Dimension(900, 800));

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 900));

        jLabel1.setText("Ingrese DNI Cliente:");

        txtDNI.setToolTipText("");

        tblClienteEncontrado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cod Cliente", "Nombre Cliente", "Apellido Cliente"
            }
        ));
        jScrollPane1.setViewportView(tblClienteEncontrado);

        btnBuscarCliente.setText("Buscar Cliente");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        btnNuevoCliente.setText("Nuevo Cliente");
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingrese Nombre Producto:");

        txtNombProducto.setToolTipText("");

        btnBuscarProducto.setText("Buscar Producto");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        tblProductoEncontrado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cod Producto", "Nombre Producto", "Precio", "Saldo Actual"
            }
        ));
        jScrollPane2.setViewportView(tblProductoEncontrado);

        jLabel3.setText("Cantidad:");

        txtCantidad.setToolTipText("");

        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar de Lista");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tblVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod Producto", "Nomre Producto", "Precio Venta", "Cantidad", "SubTotal"
            }
        ));
        tblVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setViewportView(tblVenta);

        jLabel4.setText("TOTAL VENTA (S/.)");

        txtTotal.setToolTipText("");

        btnEfectuar.setText("EfectuarVenta");
        btnEfectuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEfectuarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel4)
                        .addGap(30, 30, 30)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(btnNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btnEfectuar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(33, 33, 33)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoCliente)
                    .addComponent(btnBuscarCliente))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnBuscarProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(296, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEfectuar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))))
        );

        javax.swing.GroupLayout frmVentaLayout = new javax.swing.GroupLayout(frmVenta.getContentPane());
        frmVenta.getContentPane().setLayout(frmVentaLayout);
        frmVentaLayout.setHorizontalGroup(
            frmVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        frmVentaLayout.setVerticalGroup(
            frmVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
        );

        frmNuevoCliente.setMinimumSize(new java.awt.Dimension(500, 300));

        jPanel2.setMinimumSize(new java.awt.Dimension(300, 300));

        jLabel5.setText("Ingrese DNI: ");

        jLabel6.setText("Ingrese Nombre:");

        jLabel7.setText("Ingrese Apellido: ");

        txtNuevoDNI.setPreferredSize(new java.awt.Dimension(200, 200));
        txtNuevoDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevoDNIActionPerformed(evt);
            }
        });

        txtNuevoNombre.setToolTipText("");

        txtNuevoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevoApellidoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("NUEVO CLIENTE");

        btnRegistraNuevoClie.setText("Registrar");
        btnRegistraNuevoClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistraNuevoClieActionPerformed(evt);
            }
        });

        btnCancelaNuevoClie.setText("Cancelar");
        btnCancelaNuevoClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelaNuevoClieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNuevoDNI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNuevoNombre)
                            .addComponent(txtNuevoApellido)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btnRegistraNuevoClie, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnCancelaNuevoClie, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNuevoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNuevoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistraNuevoClie)
                    .addComponent(btnCancelaNuevoClie))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout frmNuevoClienteLayout = new javax.swing.GroupLayout(frmNuevoCliente.getContentPane());
        frmNuevoCliente.getContentPane().setLayout(frmNuevoClienteLayout);
        frmNuevoClienteLayout.setHorizontalGroup(
            frmNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frmNuevoClienteLayout.setVerticalGroup(
            frmNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        frmNuevoProducto.setMinimumSize(new java.awt.Dimension(500, 300));

        jPanel3.setMinimumSize(new java.awt.Dimension(300, 300));

        jLabel9.setText("Ingrese Codigo Producto: ");

        jLabel10.setText("Ingrese Nombre Producto:");

        jLabel11.setText("Ingrese Precio Producto: ");

        txtNuevoDNI1.setPreferredSize(new java.awt.Dimension(200, 200));
        txtNuevoDNI1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevoDNI1ActionPerformed(evt);
            }
        });

        txtNuevoNombre1.setToolTipText("");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("NUEVO PRODUCTO");

        btnRegistraNuevoClie1.setText("Registrar");
        btnRegistraNuevoClie1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistraNuevoClie1ActionPerformed(evt);
            }
        });

        btnCancelaNuevoClie1.setText("Cancelar");
        btnCancelaNuevoClie1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelaNuevoClie1ActionPerformed(evt);
            }
        });

        jLabel13.setText("Ingrese Stock Producto:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNuevoDNI1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNuevoNombre1)
                            .addComponent(txtNuevoApellido1)
                            .addComponent(jTextField1)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(btnRegistraNuevoClie1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnCancelaNuevoClie1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel12)
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNuevoDNI1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNuevoNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNuevoApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistraNuevoClie1)
                    .addComponent(btnCancelaNuevoClie1))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout frmNuevoProductoLayout = new javax.swing.GroupLayout(frmNuevoProducto.getContentPane());
        frmNuevoProducto.getContentPane().setLayout(frmNuevoProductoLayout);
        frmNuevoProductoLayout.setHorizontalGroup(
            frmNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frmNuevoProductoLayout.setVerticalGroup(
            frmNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        frmBuscarUsuario.setMinimumSize(new java.awt.Dimension(1300, 570));

        tablaBuscarUsuario.setMinimumSize(new java.awt.Dimension(1300, 570));
        tablaBuscarUsuario.setPreferredSize(new java.awt.Dimension(1300, 570));
        tablaBuscarUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnR_BuscarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btnR_BuscarUsuario.setText("BUSCAR");
        btnR_BuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnR_BuscarUsuarioActionPerformed(evt);
            }
        });
        tablaBuscarUsuario.add(btnR_BuscarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 110, 110, 40));

        cajaR_DNI2.setPreferredSize(new java.awt.Dimension(200, 200));
        cajaR_DNI2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaR_DNI2ActionPerformed(evt);
            }
        });
        tablaBuscarUsuario.add(cajaR_DNI2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 120, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("BUSCAR USUARIO");
        tablaBuscarUsuario.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, -1, -1));

        jLabel14.setText("Ingrese Id:");
        tablaBuscarUsuario.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 70, -1));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Registro de Personal", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 18))); // NOI18N
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtR_Nombre.setText("Nombre:");
        jPanel8.add(txtR_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 54, -1, -1));

        txtR_ApellidoP.setText("Apellido Paterno:");
        jPanel8.add(txtR_ApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 85, -1, -1));

        jLabel22.setText("Apellido Materno:");
        jPanel8.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 115, -1, -1));

        jLabel23.setText("Numero de DNI:");
        jPanel8.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 145, -1, -1));

        jLabel24.setText("Direccion:");
        jPanel8.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 175, -1, -1));

        jLabel25.setText("Telefono:");
        jPanel8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 205, -1, -1));

        jLabel26.setText("Cargo:");
        jPanel8.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 234, -1, -1));

        jLabel27.setText("Usuario:");
        jPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 265, -1, -1));

        jLabel28.setText("Contraseña:");
        jPanel8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 295, -1, -1));
        jPanel8.add(cajaR_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 160, -1));
        jPanel8.add(cajaR_ApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 160, -1));

        cajaR_ApellidoMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaR_ApellidoMaternoActionPerformed(evt);
            }
        });
        jPanel8.add(cajaR_ApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 160, -1));
        jPanel8.add(cajaR_NumeroDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 160, -1));
        jPanel8.add(cajaR_Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 160, -1));
        jPanel8.add(cajaR_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 160, -1));

        cajaR_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaR_UsuarioActionPerformed(evt);
            }
        });
        jPanel8.add(cajaR_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 160, -1));

        btnCancelarRegistroP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelarRegistroP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton - Cancelar.png"))); // NOI18N
        btnCancelarRegistroP.setText("Limpiar");
        btnCancelarRegistroP.setBorderPainted(false);
        btnCancelarRegistroP.setContentAreaFilled(false);
        btnCancelarRegistroP.setFocusPainted(false);
        btnCancelarRegistroP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelarRegistroP.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelarRegistroP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarRegistroPActionPerformed(evt);
            }
        });
        jPanel8.add(btnCancelarRegistroP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        btnGuardarRegistroP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardarRegistroP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btnGuardarRegistroP.setText("Guardar");
        btnGuardarRegistroP.setBorderPainted(false);
        btnGuardarRegistroP.setContentAreaFilled(false);
        btnGuardarRegistroP.setFocusPainted(false);
        btnGuardarRegistroP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardarRegistroP.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardarRegistroP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarRegistroPActionPerformed(evt);
            }
        });
        jPanel8.add(btnGuardarRegistroP, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, -1));
        jPanel8.add(cajaR_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 160, 25));
        jPanel8.add(caja_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 60, -1));

        txtPb.setText("Administrador / Recepcionista");
        txtPb.setEnabled(false);
        jPanel8.add(txtPb, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 90, 20));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel8.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 160, -1));

        tablaBuscarUsuario.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 340, 460));

        tablaBuscarUsuarioRegistrado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "1er Apellido", "2do Apellido", "DNI", "Direccion", "Celular", "Nick", "Clave", "Cargo"
            }
        ));
        tablaBuscarUsuarioRegistrado.setName(""); // NOI18N
        jScrollPane4.setViewportView(tablaBuscarUsuarioRegistrado);

        tablaBuscarUsuario.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 840, 100));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        jButton3.setText("Eliminar");
        tablaBuscarUsuario.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 110, 110, 40));

        opcR_Cargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Administrador", "Recepcionista" }));
        tablaBuscarUsuario.add(opcR_Cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 160, -1));

        javax.swing.GroupLayout frmBuscarUsuarioLayout = new javax.swing.GroupLayout(frmBuscarUsuario.getContentPane());
        frmBuscarUsuario.getContentPane().setLayout(frmBuscarUsuarioLayout);
        frmBuscarUsuarioLayout.setHorizontalGroup(
            frmBuscarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablaBuscarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frmBuscarUsuarioLayout.setVerticalGroup(
            frmBuscarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablaBuscarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        frmAjuste.setMinimumSize(new java.awt.Dimension(670, 430));
        frmAjuste.setUndecorated(true);

        panelAjuste.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_C_Habitaciones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_C_Habitaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Hb128 - Off.png"))); // NOI18N
        btn_C_Habitaciones.setText("Habitaciones");
        btn_C_Habitaciones.setBorderPainted(false);
        btn_C_Habitaciones.setContentAreaFilled(false);
        btn_C_Habitaciones.setFocusPainted(false);
        btn_C_Habitaciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_C_Habitaciones.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Hb128 - on.png"))); // NOI18N
        btn_C_Habitaciones.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_C_Habitaciones.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_C_Habitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_C_HabitacionesActionPerformed(evt);
            }
        });
        panelAjuste.add(btn_C_Habitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        btn_C_Personal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_C_Personal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono - Personal_Off.png"))); // NOI18N
        btn_C_Personal.setText("Personal");
        btn_C_Personal.setBorderPainted(false);
        btn_C_Personal.setContentAreaFilled(false);
        btn_C_Personal.setFocusPainted(false);
        btn_C_Personal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_C_Personal.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono - Personal_On.png"))); // NOI18N
        btn_C_Personal.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_C_Personal.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_C_Personal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_C_PersonalActionPerformed(evt);
            }
        });
        panelAjuste.add(btn_C_Personal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        btnRegres.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono - Regresar_Off.png"))); // NOI18N
        btnRegres.setText("Regresar");
        btnRegres.setBorderPainted(false);
        btnRegres.setContentAreaFilled(false);
        btnRegres.setFocusPainted(false);
        btnRegres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegres.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono - Regresar_On.png"))); // NOI18N
        btnRegres.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnRegres.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresActionPerformed(evt);
            }
        });
        panelAjuste.add(btnRegres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jButton23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Inventario.png"))); // NOI18N
        jButton23.setText("Inventario");
        jButton23.setBorderPainted(false);
        jButton23.setContentAreaFilled(false);
        jButton23.setFocusPainted(false);
        jButton23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton23.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelAjuste.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton - Proveedores.png"))); // NOI18N
        jButton6.setText("Proveedores");
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelAjuste.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, -1, -1));
        panelAjuste.add(fondo_Ajuste, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 420));

        javax.swing.GroupLayout frmAjusteLayout = new javax.swing.GroupLayout(frmAjuste.getContentPane());
        frmAjuste.getContentPane().setLayout(frmAjusteLayout);
        frmAjusteLayout.setHorizontalGroup(
            frmAjusteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAjuste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frmAjusteLayout.setVerticalGroup(
            frmAjusteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAjuste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        frmVeUL.setMinimumSize(new java.awt.Dimension(820, 650));
        frmVeUL.setPreferredSize(new java.awt.Dimension(820, 650));

        jPanel6.setMinimumSize(new java.awt.Dimension(820, 650));
        jPanel6.setPreferredSize(new java.awt.Dimension(820, 650));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setText("Tipo de Servicio:");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 105, -1, -1));

        opcTipoServicio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Horas", "Dias" }));
        opcTipoServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcTipoServicioActionPerformed(evt);
            }
        });
        jPanel6.add(opcTipoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 90, -1));

        txtTipoHabitacion.setText("Tipo de Habitacion:");
        jPanel6.add(txtTipoHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 191, -1, -1));

        opcTipoHabitacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Estandar", "Matrimonial", "Doble", "Triple" }));
        opcTipoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcTipoHabitacionActionPerformed(evt);
            }
        });
        jPanel6.add(opcTipoHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 186, 100, -1));

        txtTipoPago.setText("Tipo de Pago:");
        jPanel6.add(txtTipoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 384, -1, -1));

        opcTipoPago.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Efectivo", "Tarjeta" }));
        jPanel6.add(opcTipoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 110, -1));

        jLabel21.setText("Fecha de Entrada:");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 287, -1, -1));
        jPanel6.add(fechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 120, 30));

        txtNDias.setText("Total de dias:");
        jPanel6.add(txtNDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 153, -1, -1));
        jPanel6.add(cajaNDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 148, 90, -1));

        txtFechaSalida.setText("Fecha de Salida:");
        jPanel6.add(txtFechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 337, -1, -1));
        jPanel6.add(fechaEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 120, 30));

        opc_H_Matrimoniales.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "201", "202", "302", "303", "401", "402" }));
        opc_H_Matrimoniales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opc_H_MatrimonialesActionPerformed(evt);
            }
        });
        jPanel6.add(opc_H_Matrimoniales, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 70, -1));

        opc_H_Estandar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "204", "206", "304", "305", "306" }));
        jPanel6.add(opc_H_Estandar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 70, -1));

        jLabel16.setText("Habitacion:");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 244, -1, -1));

        opc_H_Dobles.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "203", "205", "301", "307" }));
        jPanel6.add(opc_H_Dobles, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 70, -1));

        opc_H_Triples.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "403", "404" }));
        jPanel6.add(opc_H_Triples, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 70, -1));

        panelPNatural.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Persona Natural", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 18))); // NOI18N

        txtNombrePNatural.setText("Nombre:");

        txtApellidoPPNatural.setText("Apellido Paterno:");

        txtApellidoMPNatural.setText("Apellido Materno:");

        txtDniPNatural.setText("Numero de DNI:");

        txtDireccionPNatural.setText("Direccion:");

        txtBucarDNIPNatural.setText("Ingrese DNI");

        btnBuscarPNatural.setText("Buscar");

        tablaBuscarPNatural.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tablaBuscarPNatural);

        btnCancelarPNatural.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelarPNatural.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton - Cancelar.png"))); // NOI18N
        btnCancelarPNatural.setText("Cancelar");
        btnCancelarPNatural.setBorderPainted(false);
        btnCancelarPNatural.setContentAreaFilled(false);
        btnCancelarPNatural.setFocusPainted(false);
        btnCancelarPNatural.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelarPNatural.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelarPNatural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPNaturalActionPerformed(evt);
            }
        });

        btnGuardarPNatural.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardarPNatural.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btnGuardarPNatural.setText("Guardar");
        btnGuardarPNatural.setBorderPainted(false);
        btnGuardarPNatural.setContentAreaFilled(false);
        btnGuardarPNatural.setFocusPainted(false);
        btnGuardarPNatural.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardarPNatural.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jButton2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton2.setText("Agregar Acompañantes");
        jButton2.setFocusPainted(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelPNaturalLayout = new javax.swing.GroupLayout(panelPNatural);
        panelPNatural.setLayout(panelPNaturalLayout);
        panelPNaturalLayout.setHorizontalGroup(
            panelPNaturalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPNaturalLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(txtBucarDNIPNatural)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cajaBuscarDNIPNatural, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarPNatural)
                .addGap(151, 151, 151))
            .addGroup(panelPNaturalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPNaturalLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelPNaturalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPNaturalLayout.createSequentialGroup()
                        .addGroup(panelPNaturalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPNaturalLayout.createSequentialGroup()
                                .addGroup(panelPNaturalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellidoMPNatural)
                                    .addComponent(txtDniPNatural, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtDireccionPNatural, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPNaturalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelPNaturalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtApellidoPPNatural)
                                    .addComponent(txtNombrePNatural))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(panelPNaturalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cajaDireccionPNatural, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cajaDniPNatural, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cajaApellidoMPNatural, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cajaApellidoPPNatural, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cajaNombrePNAtural, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))
                    .addGroup(panelPNaturalLayout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(panelPNaturalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelarPNatural)
                    .addComponent(btnGuardarPNatural))
                .addGap(39, 39, 39))
        );
        panelPNaturalLayout.setVerticalGroup(
            panelPNaturalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPNaturalLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelPNaturalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBucarDNIPNatural)
                    .addComponent(cajaBuscarDNIPNatural, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPNatural))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelPNaturalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPNaturalLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnCancelarPNatural)
                        .addGap(33, 33, 33)
                        .addComponent(btnGuardarPNatural))
                    .addGroup(panelPNaturalLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(panelPNaturalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombrePNatural)
                            .addComponent(cajaNombrePNAtural, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelPNaturalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellidoPPNatural)
                            .addComponent(cajaApellidoPPNatural, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelPNaturalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellidoMPNatural)
                            .addComponent(cajaApellidoMPNatural, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelPNaturalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDniPNatural)
                            .addComponent(cajaDniPNatural, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelPNaturalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDireccionPNatural)
                            .addComponent(cajaDireccionPNatural, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel6.add(panelPNatural, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 470, 540));

        txtTipoCliente.setText("Tipo de Cliente:");
        jPanel6.add(txtTipoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 514, -1, -1));

        opcTipoCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Persona Natural", "Persona Juridica" }));
        opcTipoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcTipoClienteActionPerformed(evt);
            }
        });
        jPanel6.add(opcTipoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, -1, -1));

        jLabel33.setText("Monto a pagar:");
        jPanel6.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 429, -1, -1));

        jButton1.setText("Pagar");
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 150, -1));
        jPanel6.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 425, 70, 25));

        panelPJuridica.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Persona Juridica", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 18))); // NOI18N

        javax.swing.GroupLayout panelPJuridicaLayout = new javax.swing.GroupLayout(panelPJuridica);
        panelPJuridica.setLayout(panelPJuridicaLayout);
        panelPJuridicaLayout.setHorizontalGroup(
            panelPJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );
        panelPJuridicaLayout.setVerticalGroup(
            panelPJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        jPanel6.add(panelPJuridica, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 400, 440));

        jButton7.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton7.setText("Calcular");
        jPanel6.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 422, -1, 32));

        javax.swing.GroupLayout frmVeULLayout = new javax.swing.GroupLayout(frmVeUL.getContentPane());
        frmVeUL.getContentPane().setLayout(frmVeULLayout);
        frmVeULLayout.setHorizontalGroup(
            frmVeULLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frmVeULLayout.setVerticalGroup(
            frmVeULLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        frmPersonaNatural.setMinimumSize(new java.awt.Dimension(400, 350));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDNIV.setText("DNI:");
        jPanel7.add(txtDNIV, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        jButton4.setText("Buscar");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jPanel7.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 80, 30));

        cajaTextoDNI.setForeground(new java.awt.Color(238, 238, 238));
        cajaTextoDNI.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cajaTextoDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaTextoDNIActionPerformed(evt);
            }
        });
        jPanel7.add(cajaTextoDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 80, 24));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable2);

        jPanel7.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 340, 70));

        jButton5.setText("Nuevo Cliente");
        jButton5.setFocusPainted(false);
        jPanel7.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, -1, -1));

        btnCancelarV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelarV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton - Cancelar.png"))); // NOI18N
        btnCancelarV.setText("Cancelar");
        btnCancelarV.setBorderPainted(false);
        btnCancelarV.setContentAreaFilled(false);
        btnCancelarV.setFocusPainted(false);
        btnCancelarV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelarV.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel7.add(btnCancelarV, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        btnGuardarV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardarV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.png"))); // NOI18N
        btnGuardarV.setText("Guardar");
        btnGuardarV.setBorderPainted(false);
        btnGuardarV.setContentAreaFilled(false);
        btnGuardarV.setFocusPainted(false);
        btnGuardarV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardarV.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel7.add(btnGuardarV, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, -1, -1));

        opcTipoPago1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Efectivo", "Tarjeta" }));
        jPanel7.add(opcTipoPago1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 90, -1));

        txtTipoPago1.setText("Tipo dePago:");
        jPanel7.add(txtTipoPago1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, -1, -1));

        javax.swing.GroupLayout frmPersonaNaturalLayout = new javax.swing.GroupLayout(frmPersonaNatural.getContentPane());
        frmPersonaNatural.getContentPane().setLayout(frmPersonaNaturalLayout);
        frmPersonaNaturalLayout.setHorizontalGroup(
            frmPersonaNaturalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
        );
        frmPersonaNaturalLayout.setVerticalGroup(
            frmPersonaNaturalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
        );

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(jTable3);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(670, 400));
        setUndecorated(true);
        setResizable(false);

        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });
        jPanel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel5MouseDragged(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVentas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Venta128 - Off.png"))); // NOI18N
        btnVentas.setText("Ventas");
        btnVentas.setBorderPainted(false);
        btnVentas.setContentAreaFilled(false);
        btnVentas.setFocusPainted(false);
        btnVentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVentas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Venta128 - On.png"))); // NOI18N
        btnVentas.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnVentas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        jPanel5.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 130, 160));

        btnReportes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reporte128 - Off.png"))); // NOI18N
        btnReportes.setText("Reportes");
        btnReportes.setBorderPainted(false);
        btnReportes.setContentAreaFilled(false);
        btnReportes.setFocusPainted(false);
        btnReportes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReportes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reporte128 - On.png"))); // NOI18N
        btnReportes.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnReportes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel5.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 130, 160));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recepcion.png"))); // NOI18N
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 270, 230));

        btnConfigutacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConfigutacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ajuste128 - Off.png"))); // NOI18N
        btnConfigutacion.setText("Configuracion");
        btnConfigutacion.setBorderPainted(false);
        btnConfigutacion.setContentAreaFilled(false);
        btnConfigutacion.setFocusPainted(false);
        btnConfigutacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConfigutacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ajuste128 - On.png"))); // NOI18N
        btnConfigutacion.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnConfigutacion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConfigutacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigutacionActionPerformed(evt);
            }
        });
        jPanel5.add(btnConfigutacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 130, 160));

        btnX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton x - Sin F.png"))); // NOI18N
        btnX.setBorderPainted(false);
        btnX.setContentAreaFilled(false);
        btnX.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton x_On.png"))); // NOI18N
        btnX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXActionPerformed(evt);
            }
        });
        jPanel5.add(btnX, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 30, 25));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo - Recepcion.jpg"))); // NOI18N
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
        frmNuevoCliente.setLocationRelativeTo(null);  //CENTRAR VENTANA NUEVO CLIENTE
        frmNuevoCliente.setVisible(true);
    }//GEN-LAST:event_btnNuevoClienteActionPerformed


    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed

        dni = txtDNI.getText();

        DefaultTableModel dt = new DefaultTableModel();
        String query = "SELECT * FROM Cliente where DNICliente = " + dni + ";";

        tblClienteEncontrado.setModel(dt);
        dt.addColumn("DNI Cliente");
        dt.addColumn("Nombre");
        dt.addColumn("Apellido");

        cConnection con = new cConnection();

        try {
            PreparedStatement pstm = con.ObtenerConexion().prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getString("DNICliente"), rs.getString("Nombre"), rs.getString("Apellido")});
            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No existe Cliente. Puede Crear Nuevo.", "Mensaje", JOptionPane.CANCEL_OPTION);
        }
        txtNuevoDNI.setText(dni);
    }//GEN-LAST:event_btnBuscarClienteActionPerformed


    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed

        String nprod = txtNombProducto.getText();
        DefaultTableModel dt = new DefaultTableModel();

        String query = "SELECT * from Producto where NombProd LIKE '" + nprod + "%'";

        tblProductoEncontrado.setModel(dt);

        dt.addColumn("Codigo");
        dt.addColumn("Nombre Producto");
        dt.addColumn("Precio Venta");
        dt.addColumn("Saldo");
        cConnection con = new cConnection();

        try {
            Statement st = con.ObtenerConexion().createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                dt.addRow(new Object[]{rs.getString("CodProd"), rs.getString("NombProd"), rs.getString("Precio"), rs.getString("Stock")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No existe el Producto", "Mensaje", JOptionPane.CANCEL_OPTION);
        }
    }//GEN-LAST:event_btnBuscarProductoActionPerformed


    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed

        int filaSeleccionada = tblProductoEncontrado.getSelectedRow();

        try {
            if (filaSeleccionada == -1) //para validar que se seleccione fila
            {
                JOptionPane.showMessageDialog(null, "Debe Seleccionar Producto");
            } else {
                DefaultTableModel modelSeleccion = (DefaultTableModel) tblProductoEncontrado.getModel();
                String cod = tblProductoEncontrado.getValueAt(filaSeleccionada, 0).toString();
                String np = tblProductoEncontrado.getValueAt(filaSeleccionada, 1).toString();
                float pre = Float.parseFloat(tblProductoEncontrado.getValueAt(filaSeleccionada, 2).toString());
                int cant = Integer.parseInt(txtCantidad.getText());

                //Calcular Importe de fila
                float subT = pre * cant;
                String ImporteFila = String.valueOf(subT);

                //Pasar a la otra jtable
                DefaultTableModel modelVenta = (DefaultTableModel) tblVenta.getModel();
                modelVenta.addRow(new Object[]{cod, np, pre, cant, ImporteFila});

                TotalPago = TotalPago + subT;

                txtTotal.setText("" + TotalPago);
                txtCantidad.setText("");
                txtNombProducto.setText("");

            }
        } catch (Exception e) {

        }


    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        int filaSeleccionada = tblVenta.getSelectedRow();
        try {
            if (filaSeleccionada == -1) //para validar que se seleccione fila
            {
                JOptionPane.showMessageDialog(null, "Debe Seleccionar Producto");
            } else {
                String cod = tblVenta.getValueAt(filaSeleccionada, 0).toString();
                String nomb = (tblVenta.getValueAt(filaSeleccionada, 1).toString());
                double precio = Double.parseDouble(tblVenta.getValueAt(filaSeleccionada, 2).toString());
                String canti = tblVenta.getValueAt(filaSeleccionada, 3).toString();
                String subT = tblVenta.getValueAt(filaSeleccionada, 4).toString();

                DefaultTableModel modelo = (DefaultTableModel) tblVenta.getModel();
                modelo.removeRow(filaSeleccionada);

                TotalPago = TotalPago - Float.parseFloat(subT);
                txtTotal.setText("" + TotalPago);
            }
        } catch (Exception e) {

        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        frmVenta.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEfectuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEfectuarActionPerformed

        for (int i = 0; i < tblVenta.getRowCount(); i++) {
            try {
                cConnection con = new cConnection();
                int cantV = Integer.parseInt(tblVenta.getValueAt(i, 3).toString());
                float stotal = Float.parseFloat(tblVenta.getValueAt(i, 4).toString());

                Statement st = null;
                st = con.ObtenerConexion().createStatement();
                st.executeUpdate("INSERT INTO Venta(Cant,Subtotal)" + "values( " + cantV + " , " + stotal + ")");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se Pudo Agregar", "Mensaje", JOptionPane.CANCEL_OPTION);
                tblProductoEncontrado.removeAll();
                tblVenta.removeAll();
                tblClienteEncontrado.removeAll();
                txtDNI.setText("");
                txtTotal.setText("");
            }

        }
        JOptionPane.showMessageDialog(null, "Se registro correctamente la venta...");

        tblProductoEncontrado.removeAll();
        tblVenta.removeAll();
        tblClienteEncontrado.removeAll();
        txtDNI.setText("");
        txtTotal.setText("");

    }//GEN-LAST:event_btnEfectuarActionPerformed

    private void btnCancelaNuevoClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelaNuevoClieActionPerformed
        frmNuevoCliente.setVisible(false);
    }//GEN-LAST:event_btnCancelaNuevoClieActionPerformed

    private void btnRegistraNuevoClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraNuevoClieActionPerformed

        cConnection con = new cConnection();
        try {

            int dniC = Integer.parseInt(txtNuevoDNI.getText());

            String nom = txtNuevoNombre.getText();
            String ape = txtNuevoApellido.getText();

            Statement st = null;
            st = con.ObtenerConexion().createStatement();
            st.executeUpdate("INSERT INTO Cliente(DNICliente,Nombre,Apellido)" + "values(" + dniC + " ,' " + nom + " ', '" + ape + "')");

            JOptionPane.showMessageDialog(null, "Se registró cliente...");
            txtNuevoDNI.setText("");
            txtNuevoNombre.setText("");
            txtNuevoApellido.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se Pudo Agregar", "Mensaje", JOptionPane.CANCEL_OPTION);
            txtNuevoDNI.setText("");
            txtNuevoNombre.setText("");
            txtNuevoApellido.setText("");
        }

    }//GEN-LAST:event_btnRegistraNuevoClieActionPerformed

private void txtNuevoDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevoDNIActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_txtNuevoDNIActionPerformed

    private void txtNuevoDNI1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevoDNI1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuevoDNI1ActionPerformed

    private void btnRegistraNuevoClie1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistraNuevoClie1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistraNuevoClie1ActionPerformed

    private void btnCancelaNuevoClie1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelaNuevoClie1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelaNuevoClie1ActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        frmVeUL.setVisible(true);
        frmVeUL.setLocationRelativeTo(null);
        cajaNDias.setEnabled(false);
        txtNDias.setEnabled(false);
        cajaNDias.setVisible(false);
        txtNDias.setVisible(false);
        txtFechaSalida.setEnabled(false);
        fechaSalida.setEnabled(false);
        opc_H_Estandar.setEnabled(true);
        opc_H_Estandar.setVisible(true);
        opc_H_Matrimoniales.setVisible(false);
        panelPJuridica.setVisible(false);
        panelPNatural.setEnabled(false);
        txtNombrePNatural.setEnabled(false);
        cajaNombrePNAtural.setEnabled(false);
        txtApellidoPPNatural.setEnabled(false);
        cajaApellidoPPNatural.setEnabled(false);
        txtApellidoMPNatural.setEnabled(false);
        cajaApellidoMPNatural.setEnabled(false);
        txtDniPNatural.setEnabled(false);
        cajaDniPNatural.setEnabled(false);
        txtDireccionPNatural.setEnabled(false);
        cajaDireccionPNatural.setEnabled(false);
        txtBucarDNIPNatural.setEnabled(false);
        cajaBuscarDNIPNatural.setEnabled(false);
        btnBuscarPNatural.setEnabled(false);
        tablaBuscarPNatural.setEnabled(false);
        btnCancelarPNatural.setEnabled(false);
        btnGuardarPNatural.setEnabled(false);
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnConfigutacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigutacionActionPerformed
        frmAjuste.setVisible(true);
        frmAjuste.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnConfigutacionActionPerformed

    private void btnRegresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresActionPerformed
        frmAjuste.dispose();
    }//GEN-LAST:event_btnRegresActionPerformed

    private void opcTipoServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcTipoServicioActionPerformed
        int opcTipo;

        opcTipo = this.opcTipoServicio.getSelectedIndex();

        switch (opcTipo) {
            case 0:
                cajaNDias.setEnabled(false);
                txtNDias.setEnabled(false);
                fechaSalida.setEnabled(false);
                txtFechaSalida.setEnabled(false);
                cajaNDias.setVisible(false);
                txtNDias.setVisible(false);
                break;
            case 1:
                cajaNDias.setEnabled(true);
                txtNDias.setEnabled(true);
                fechaSalida.setEnabled(true);
                txtFechaSalida.setEnabled(true);
                cajaNDias.setVisible(true);
                txtNDias.setVisible(true);
                break;
        }

    }//GEN-LAST:event_opcTipoServicioActionPerformed

    private void cajaTextoDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaTextoDNIActionPerformed

    }//GEN-LAST:event_cajaTextoDNIActionPerformed

    private void btnXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnXActionPerformed

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        //
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseDragged
        Point p = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(p.x - x, p.y - y);
    }//GEN-LAST:event_jPanel5MouseDragged

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel5MousePressed

    private void btnR_BuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnR_BuscarUsuarioActionPerformed
        if (cajaR_DNI2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese el numero de DNI del usuario a buscar");
        }
        nomb = cajaR_DNI2.getText();
        DefaultTableModel tablaRegistroPersonal = new DefaultTableModel();
        String query = "SELECT * FROM Usuario where IdUsuario = " + nomb + ";";
        tablaBuscarUsuarioRegistrado.setModel(tablaRegistroPersonal);
        tablaRegistroPersonal.addColumn("Id");
        tablaRegistroPersonal.addColumn("Nombre");
        tablaRegistroPersonal.addColumn("Apelldo P");
        tablaRegistroPersonal.addColumn("Apelldo M");
        tablaRegistroPersonal.addColumn("DNI");
        tablaRegistroPersonal.addColumn("Direccion");
        tablaRegistroPersonal.addColumn("Celular");
        tablaRegistroPersonal.addColumn("Nick");
        tablaRegistroPersonal.addColumn("Clave");
        tablaRegistroPersonal.addColumn("Cargo");
        
        cConnection con = new cConnection();
        
        try{
            PreparedStatement pstm = con.ObtenerConexion().prepareStatement(query);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                tablaRegistroPersonal.addRow(new Object[]{rs.getString("IdUsuario"), rs.getString("Nombre"), rs.getString("PrimerA"), rs.getString("SegundoA"), rs.getString("NumeroDeDocumento"), rs.getString("Direccion"), rs.getString("Celular"), rs.getString("Nick"), rs.getString("Clave"), rs.getString("Cargo")});
            }//
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null, "No existe Cliente. Puede Crear Nuevo.", "Mensaje", JOptionPane.CANCEL_OPTION);
        }
        
   
        
        
    }//GEN-LAST:event_btnR_BuscarUsuarioActionPerformed

    private void cajaR_DNI2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaR_DNI2ActionPerformed

    }//GEN-LAST:event_cajaR_DNI2ActionPerformed

    private void btn_C_PersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_C_PersonalActionPerformed
        frmBuscarUsuario.setVisible(true);
        frmBuscarUsuario.setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_C_PersonalActionPerformed

    private void cajaR_ApellidoMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaR_ApellidoMaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaR_ApellidoMaternoActionPerformed

    private void btnCancelarRegistroPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarRegistroPActionPerformed
        cajaR_Nombre.setText("");
        cajaR_ApellidoPaterno.setText("");
        cajaR_ApellidoMaterno.setText("");
        cajaR_NumeroDNI.setText("");
        cajaR_Direccion.setText("");
        cajaR_Telefono.setText("");
        cajaR_Usuario.setText("");
        cajaR_Contraseña.setText("");
        cajaR_Nombre.requestFocus();
        opcR_Cargo.setSelectedIndex(0);
    }//GEN-LAST:event_btnCancelarRegistroPActionPerformed

    private void btnGuardarRegistroPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRegistroPActionPerformed
//        if (cajaR_Nombre.getText().equals("") || cajaR_ApellidoPaterno.getText().equals("") || cajaR_ApellidoPaterno.getText().equals("") || cajaR_NumeroDNI.getText().equals("") || cajaR_Direccion.getText().equals("") || cajaR_Telefono.getText().equals("") || cajaR_Usuario.getText().equals("") || cajaR_Contraseña.getText().equals("")) {
//            JOptionPane.showMessageDialog(null, "Rellene los campos necesarios para registrar los datos del usuario");
//        } else {
//            JOptionPane.showMessageDialog(null, "Guardando los datos del nuevo usuario");
//        }
        
        cConnection con = new cConnection();
        try {
//            int idusuario = Integer.parseInt(caja_id.getText());
            Statement st = null;
            st = con.ObtenerConexion().createStatement();
            st.executeUpdate("INSERT INTO Prueba(Nombre)  values(' Maycol ')");
            String nom = cajaR_Nombre.getText();
            String apePaterno = cajaR_ApellidoPaterno.getText();
            String apeMaterno = cajaR_ApellidoMaterno.getText();
            String n_Dni = cajaR_NumeroDNI.getText();
            String direccion = cajaR_Direccion.getText();
            int telefono = Integer.parseInt(cajaR_Telefono.getText());
            String Cargo = jTextField2.getText();   
            String UserRegistro = cajaR_Usuario.getText();
            String PassRegistro = cajaR_Contraseña.getText();

           
            
            JOptionPane.showMessageDialog(null, "Se registró cliente...");
            cajaR_Nombre.setText("");
            cajaR_ApellidoPaterno.setText("");
            cajaR_ApellidoMaterno.setText("");
            cajaR_NumeroDNI.setText("");
            cajaR_Direccion.setText("");
            cajaR_Telefono.setText("");
            opcR_Cargo.setSelectedIndex(0);
            cajaR_Usuario.setText("");
            cajaR_Contraseña.setText("");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se Pudo Agregar", "Mensaje", JOptionPane.CANCEL_OPTION);
        }
        cajaR_Nombre.setText("");
        cajaR_ApellidoPaterno.setText("");
        cajaR_ApellidoMaterno.setText("");
        cajaR_NumeroDNI.setText("");
        cajaR_Direccion.setText("");
        cajaR_Telefono.setText("");
        opcR_Cargo.setSelectedIndex(0);
        cajaR_Usuario.setText("");
        cajaR_Contraseña.setText("");
    }//GEN-LAST:event_btnGuardarRegistroPActionPerformed

    private void opc_H_MatrimonialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opc_H_MatrimonialesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opc_H_MatrimonialesActionPerformed

    private void opcTipoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcTipoHabitacionActionPerformed
        int opcTipoHb = opcTipoHabitacion.getSelectedIndex();

        switch (opcTipoHb) {
            case 0:
                opc_H_Estandar.setEnabled(true);
                opc_H_Estandar.setVisible(true);
                opc_H_Matrimoniales.setEnabled(false);
                opc_H_Matrimoniales.setVisible(false);
                opc_H_Dobles.setEnabled(false);
                opc_H_Dobles.setVisible(false);
                opc_H_Triples.setEnabled(false);
                opc_H_Triples.setVisible(false);
                break;

            case 1:
                opc_H_Estandar.setEnabled(false);
                opc_H_Estandar.setVisible(false);
                opc_H_Matrimoniales.setVisible(true);
                opc_H_Matrimoniales.setEnabled(true);
                opc_H_Dobles.setEnabled(false);
                opc_H_Dobles.setVisible(false);
                opc_H_Triples.setEnabled(false);
                opc_H_Triples.setVisible(false);
                break;

            case 2:
                opc_H_Estandar.setEnabled(false);
                opc_H_Estandar.setVisible(false);
                opc_H_Matrimoniales.setVisible(false);
                opc_H_Matrimoniales.setEnabled(false);
                opc_H_Dobles.setEnabled(true);
                opc_H_Dobles.setVisible(true);
                opc_H_Triples.setEnabled(false);
                opc_H_Triples.setVisible(false);
                break;
            case 3:
                opc_H_Estandar.setEnabled(false);
                opc_H_Estandar.setVisible(false);
                opc_H_Matrimoniales.setVisible(false);
                opc_H_Matrimoniales.setEnabled(false);
                opc_H_Dobles.setEnabled(false);
                opc_H_Dobles.setVisible(false);
                opc_H_Triples.setEnabled(true);
                opc_H_Triples.setVisible(true);
                break;
        }
    }//GEN-LAST:event_opcTipoHabitacionActionPerformed

    private void opcTipoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcTipoClienteActionPerformed
        int opcT_Cliente = opcTipoCliente.getSelectedIndex();

        switch (opcT_Cliente) {
            case 1:
                panelPNatural.setVisible(true);
                panelPNatural.setEnabled(true);
                panelPJuridica.setVisible(false);

                txtNombrePNatural.setEnabled(true);
                cajaNombrePNAtural.setEnabled(true);
                txtApellidoPPNatural.setEnabled(true);
                cajaApellidoPPNatural.setEnabled(true);
                txtApellidoMPNatural.setEnabled(true);
                cajaApellidoMPNatural.setEnabled(true);
                txtDniPNatural.setEnabled(true);
                cajaDniPNatural.setEnabled(true);
                txtDireccionPNatural.setEnabled(true);
                cajaDireccionPNatural.setEnabled(true);

                txtBucarDNIPNatural.setEnabled(true);
                cajaBuscarDNIPNatural.setEnabled(true);
                btnBuscarPNatural.setEnabled(true);
                tablaBuscarPNatural.setEnabled(true);
                btnCancelarPNatural.setEnabled(true);
                btnGuardarPNatural.setEnabled(true);
                break;

            case 2:
                panelPNatural.setVisible(false);
                panelPJuridica.setVisible(true);

        }
    }//GEN-LAST:event_opcTipoClienteActionPerformed

    private void btnCancelarPNaturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPNaturalActionPerformed

    }//GEN-LAST:event_btnCancelarPNaturalActionPerformed

    private void btn_C_HabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_C_HabitacionesActionPerformed
        frmVenta.setVisible(true);
    }//GEN-LAST:event_btn_C_HabitacionesActionPerformed

    private void cajaR_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaR_UsuarioActionPerformed
        
    }//GEN-LAST:event_cajaR_UsuarioActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        txtPb.setEnabled(true);
        txtPb.setVisible(false);
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void txtNuevoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevoApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuevoApellidoActionPerformed

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

//        try {
//            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
//        } catch (ClassNotFoundException ex) {
//////            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//////            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//////            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (UnsupportedLookAndFeelException ex) {
//////            Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
//        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarPNatural;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnCancelaNuevoClie;
    private javax.swing.JButton btnCancelaNuevoClie1;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarPNatural;
    private javax.swing.JButton btnCancelarRegistroP;
    private javax.swing.JButton btnCancelarV;
    private javax.swing.JButton btnConfigutacion;
    private javax.swing.JButton btnEfectuar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardarPNatural;
    private javax.swing.JButton btnGuardarRegistroP;
    private javax.swing.JButton btnGuardarV;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JButton btnR_BuscarUsuario;
    private javax.swing.JButton btnRegistraNuevoClie;
    private javax.swing.JButton btnRegistraNuevoClie1;
    private javax.swing.JButton btnRegres;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JButton btnVentas;
    private javax.swing.JButton btnX;
    private javax.swing.JButton btn_C_Habitaciones;
    private javax.swing.JButton btn_C_Personal;
    private javax.swing.JTextField cajaApellidoMPNatural;
    private javax.swing.JTextField cajaApellidoPPNatural;
    private javax.swing.JTextField cajaBuscarDNIPNatural;
    private javax.swing.JTextField cajaDireccionPNatural;
    private javax.swing.JTextField cajaDniPNatural;
    private javax.swing.JTextField cajaNDias;
    private javax.swing.JTextField cajaNombrePNAtural;
    private javax.swing.JTextField cajaR_ApellidoMaterno;
    private javax.swing.JTextField cajaR_ApellidoPaterno;
    private javax.swing.JPasswordField cajaR_Contraseña;
    private javax.swing.JTextField cajaR_DNI2;
    private javax.swing.JTextField cajaR_Direccion;
    private javax.swing.JTextField cajaR_Nombre;
    private javax.swing.JTextField cajaR_NumeroDNI;
    private javax.swing.JTextField cajaR_Telefono;
    private javax.swing.JTextField cajaR_Usuario;
    private javax.swing.JTextField cajaTextoDNI;
    private javax.swing.JTextField caja_id;
    private com.toedter.calendar.JDateChooser fechaEntrada;
    private com.toedter.calendar.JDateChooser fechaSalida;
    private javax.swing.JLabel fondo_Ajuste;
    private javax.swing.JFrame frmAjuste;
    private javax.swing.JFrame frmBuscarUsuario;
    private javax.swing.JFrame frmNuevoCliente;
    private javax.swing.JFrame frmNuevoProducto;
    private javax.swing.JFrame frmPersonaNatural;
    private javax.swing.JFrame frmVeUL;
    private javax.swing.JFrame frmVenta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JFrame jFrame1;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JComboBox opcR_Cargo;
    private javax.swing.JComboBox opcTipoCliente;
    private javax.swing.JComboBox opcTipoHabitacion;
    private javax.swing.JComboBox opcTipoPago;
    private javax.swing.JComboBox opcTipoPago1;
    private javax.swing.JComboBox opcTipoServicio;
    private javax.swing.JComboBox opc_H_Dobles;
    private javax.swing.JComboBox opc_H_Estandar;
    private javax.swing.JComboBox opc_H_Matrimoniales;
    private javax.swing.JComboBox opc_H_Triples;
    private javax.swing.JPanel panelAjuste;
    private javax.swing.JPanel panelPJuridica;
    private javax.swing.JPanel panelPNatural;
    private javax.swing.JTable tablaBuscarPNatural;
    private javax.swing.JPanel tablaBuscarUsuario;
    private javax.swing.JTable tablaBuscarUsuarioRegistrado;
    private javax.swing.JTable tblClienteEncontrado;
    private javax.swing.JTable tblProductoEncontrado;
    private javax.swing.JTable tblVenta;
    private javax.swing.JLabel txtApellidoMPNatural;
    private javax.swing.JLabel txtApellidoPPNatural;
    private javax.swing.JLabel txtBucarDNIPNatural;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JLabel txtDNIV;
    private javax.swing.JLabel txtDireccionPNatural;
    private javax.swing.JLabel txtDniPNatural;
    private javax.swing.JLabel txtFechaSalida;
    private javax.swing.JLabel txtNDias;
    private javax.swing.JTextField txtNombProducto;
    private javax.swing.JLabel txtNombrePNatural;
    private javax.swing.JTextField txtNuevoApellido;
    private javax.swing.JTextField txtNuevoApellido1;
    private javax.swing.JTextField txtNuevoDNI;
    private javax.swing.JTextField txtNuevoDNI1;
    private javax.swing.JTextField txtNuevoNombre;
    private javax.swing.JTextField txtNuevoNombre1;
    private javax.swing.JLabel txtPb;
    private javax.swing.JLabel txtR_ApellidoP;
    private javax.swing.JLabel txtR_Nombre;
    private javax.swing.JLabel txtTipoCliente;
    private javax.swing.JLabel txtTipoHabitacion;
    private javax.swing.JLabel txtTipoPago;
    private javax.swing.JLabel txtTipoPago1;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
