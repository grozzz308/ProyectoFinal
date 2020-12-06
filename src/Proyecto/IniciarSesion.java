package Proyecto;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class IniciarSesion extends javax.swing.JFrame {
    int x,y;
    public IniciarSesion() {
        initComponents();
        btnTransparente();
        setLocationRelativeTo(null);  // centrar ventana
        round();
    }
    private void round(){
        Shape forma = new RoundRectangle2D.Double(0,0,this.getBounds().width,this.getBounds().height,27,27);
        AWTUtilities.setWindowShape(this, forma);
    }
    
    private void btnTransparente(){
        txtUser.setOpaque(false);
//              btnSalir.setContentAreaFilled(false);
//              jButton2.setForeground(Color.green);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FrmRegistro = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        cajaNombresUsuario = new javax.swing.JTextField();
        cajaApellidosUsuario = new javax.swing.JTextField();
        cajaUsuarioRg = new javax.swing.JTextField();
        cajaPasswordRg = new javax.swing.JPasswordField();
        txtNombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        imagenRegistro = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnIniciarSesion = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        txtPassw = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        barraUsuario = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnX = new javax.swing.JButton();

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(cajaNombresUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 300, 30));
        jPanel2.add(cajaApellidosUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 300, 30));
        jPanel2.add(cajaUsuarioRg, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 300, 30));
        jPanel2.add(cajaPasswordRg, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 300, 30));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtNombre.setText("Nombres:");
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 300, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setText("Apellidos:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 300, -1));

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtUsuario.setText("Usuario");
        jPanel2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 300, -1));

        txtContraseña.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtContraseña.setText("Contraseña:");
        jPanel2.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 300, -1));

        btnRegistrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 300, 40));

        imagenRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UserRegister.png"))); // NOI18N
        jPanel2.add(imagenRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        javax.swing.GroupLayout FrmRegistroLayout = new javax.swing.GroupLayout(FrmRegistro.getContentPane());
        FrmRegistro.getContentPane().setLayout(FrmRegistroLayout);
        FrmRegistroLayout.setHorizontalGroup(
            FrmRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FrmRegistroLayout.setVerticalGroup(
            FrmRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(350, 500));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(400, 600));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        btnIniciarSesion.setBackground(new java.awt.Color(0, 102, 153));
        btnIniciarSesion.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton - Inicia S.png"))); // NOI18N
        btnIniciarSesion.setText("Iniciar Sesion");
        btnIniciarSesion.setBorderPainted(false);
        btnIniciarSesion.setContentAreaFilled(false);
        btnIniciarSesion.setFocusPainted(false);
        btnIniciarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIniciarSesion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton - Inicia S_Off.png"))); // NOI18N
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 270, 50));

        txtUser.setBorder(null);
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 240, 36));

        txtPassw.setToolTipText("");
        txtPassw.setBorder(null);
        txtPassw.setMinimumSize(new java.awt.Dimension(150, 20));
        txtPassw.setName(""); // NOI18N
        txtPassw.setOpaque(false);
        jPanel1.add(txtPassw, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 240, 36));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo - Inicio Sesion.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 130, 150));
        jPanel1.add(barraUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 270, 10));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 372, 270, 10));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/candado.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 30));

        btnX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton x - Sin F.png"))); // NOI18N
        btnX.setBorderPainted(false);
        btnX.setContentAreaFilled(false);
        btnX.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton x_On.png"))); // NOI18N
        btnX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXActionPerformed(evt);
            }
        });
        jPanel1.add(btnX, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 30, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
    
}//GEN-LAST:event_txtUserActionPerformed

private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
   
    cConnection cn = new cConnection(); // invoca a la clase que conecta

    Statement st = null;
    ResultSet rs = null;
    String query;

    int band = 0; //bandera para verificación

    String user = txtUser.getText();
    String passw = txtPassw.getText();

    query = "select * from Usuario where Nick='" + user + "' and Clave='" + passw + "'";
    
    try {
        st = cn.ObtenerConexion().createStatement();
        rs = st.executeQuery(query);

        while (rs.next()) {
            if (rs.getString(1) == null) {
                band = 0;  // no coincide user o passw
            } else {
                band = 1;
            }
        }
    } catch (SQLException ex) {
        JOptionPane.showConfirmDialog(null, "ERROR DE ACCESO" + ex);
    }

    if (band == 1) {
//        Carga loading = new Carga();
//        loading.setVisible(true);
        VentanaPrincipal prin = new VentanaPrincipal();
        prin.setVisible(true);
        this.dispose();
    } else {
        JOptionPane.showMessageDialog(null, "ERROR. Vuelva a Ingresar");
        this.setVisible(rootPaneCheckingEnabled);   // muestra la ventana actual
        this.txtUser.setText("");
        this.txtPassw.setText("");
        this.txtUser.requestFocus();
    }
}//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String nombreT = "";
        String apellidoT = "";
        String UserR = "";
        String ContraReg = "";

        nombreT = cajaNombresUsuario.getText();
        apellidoT = cajaApellidosUsuario.getText();

        for(int i=0;i<cajaPasswordRg.getPassword().length;i++){
            ContraReg += cajaPasswordRg.getPassword()[i];
        }

        JOptionPane.showMessageDialog(null, "Usuario Registrado Correctamente");
        setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnXActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        x = evt.getX(); y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        Point p = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(p.x-x,p.y-y);
    }//GEN-LAST:event_jPanel1MouseDragged

    public static void main(String args[]) {
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

            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame FrmRegistro;
    private javax.swing.JSeparator barraUsuario;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnX;
    private javax.swing.JTextField cajaApellidosUsuario;
    private javax.swing.JTextField cajaNombresUsuario;
    private javax.swing.JPasswordField cajaPasswordRg;
    private javax.swing.JTextField cajaUsuarioRg;
    private javax.swing.JLabel imagenRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel txtContraseña;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JPasswordField txtPassw;
    private javax.swing.JTextField txtUser;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
