package views;

import controlador.Registro_SocioControlador;
import modelo.*;

public class Registro_Socio extends javax.swing.JFrame {
    RegistroSocio Socio = new RegistroSocio();
    Registro_SocioDao socioDao = new Registro_SocioDao();

    /**
     * Creates new form Registro_Socio
     */
    public Registro_Socio() {
        initComponents();
        setSize(649, 510);//Para que se queden las medidas que le dimos
        setResizable(false);//Para que el usuario no pueda modificar el tamaño.
        setTitle("Registro - Socio");//Para colocar un titulo a la ventana
        setLocationRelativeTo(null);//Impide mover la ventana
        this.repaint();
        
        //Controlador de registro de Socio
        Registro_SocioControlador socio_cuentae = new Registro_SocioControlador(Socio, socioDao, this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn_registro_socio_registrar = new javax.swing.JButton();
        txt_registro_socio_nombres = new javax.swing.JTextField();
        txt_registro_socio_cedula = new javax.swing.JTextField();
        txt_registro_socio_celular = new javax.swing.JTextField();
        txt_registro_socio_email = new javax.swing.JTextField();
        txt_registro_socio_tipo_vehiculo = new javax.swing.JTextField();
        txt_registro_socio_placa = new javax.swing.JTextField();
        txt_registro_socio_licencia = new javax.swing.JTextField();
        txt_registro_socio_usuario = new javax.swing.JTextField();
        txt_registro_socio_contraseña = new javax.swing.JTextField();
        txt_registro_socio_confirmar_contraseña = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_registro_socio_provincia = new javax.swing.JTextField();
        jL_socio_rol = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre y Apellido:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cedula:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Celular:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Provincia:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Correo Electrónico:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tipo de Vehículo:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Placa del Vehículo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tipo de Liencia del conductor:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 0));
        jLabel9.setText("UBER - SOCIO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nombre de Usuario:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Contraseña:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Confirmar Contraseña:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, -1, -1));

        btn_registro_socio_registrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_registro_socio_registrar.setText("Registrarse");
        jPanel1.add(btn_registro_socio_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, -1, -1));
        jPanel1.add(txt_registro_socio_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 190, -1));
        jPanel1.add(txt_registro_socio_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 110, -1));
        jPanel1.add(txt_registro_socio_celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 110, -1));
        jPanel1.add(txt_registro_socio_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 240, -1));
        jPanel1.add(txt_registro_socio_tipo_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 240, -1));
        jPanel1.add(txt_registro_socio_placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 240, -1));
        jPanel1.add(txt_registro_socio_licencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 240, -1));
        jPanel1.add(txt_registro_socio_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 210, -1));

        txt_registro_socio_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_registro_socio_contraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(txt_registro_socio_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 210, -1));
        jPanel1.add(txt_registro_socio_confirmar_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 210, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 120, 90));
        jPanel1.add(txt_registro_socio_provincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 240, -1));

        jL_socio_rol.setForeground(new java.awt.Color(0, 0, 51));
        jL_socio_rol.setText("SOCIO");
        jPanel1.add(jL_socio_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_registro_socio_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_registro_socio_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_registro_socio_contraseñaActionPerformed

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
            java.util.logging.Logger.getLogger(Registro_Socio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_Socio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_Socio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_Socio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_Socio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_registro_socio_registrar;
    public javax.swing.JLabel jL_socio_rol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField txt_registro_socio_cedula;
    public javax.swing.JTextField txt_registro_socio_celular;
    public javax.swing.JTextField txt_registro_socio_confirmar_contraseña;
    public javax.swing.JTextField txt_registro_socio_contraseña;
    public javax.swing.JTextField txt_registro_socio_email;
    public javax.swing.JTextField txt_registro_socio_licencia;
    public javax.swing.JTextField txt_registro_socio_nombres;
    public javax.swing.JTextField txt_registro_socio_placa;
    public javax.swing.JTextField txt_registro_socio_provincia;
    public javax.swing.JTextField txt_registro_socio_tipo_vehiculo;
    public javax.swing.JTextField txt_registro_socio_usuario;
    // End of variables declaration//GEN-END:variables
}
