package views;

public class Socio_Detalle_Viaje extends javax.swing.JFrame {

    /**
     * Creates new form Socio_Detalle_Viaje
     */
    public Socio_Detalle_Viaje() {
        initComponents();
        setSize(660, 525);//Para que se queden las medidas que le dimos
        setResizable(false);//Para que el usuario no pueda modificar el tamaño.
        setTitle("Detalle del Viaje");//Para colocar un titulo a la ventana
        setLocationRelativeTo(null);//Centra la pantalla
        this.repaint();
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
        txt_detalle_destino = new javax.swing.JTextField();
        txt_detalle_ubicacion = new javax.swing.JTextField();
        txt_detalle_usuario = new javax.swing.JTextField();
        txt_detalle_nombres = new javax.swing.JTextField();
        txt_detalle_fecha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btn_detalle_atras = new javax.swing.JButton();
        btn_detalle_precio = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(43, 81, 132));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 118, 0));
        jLabel1.setText("Detalles del Viaje");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Destino:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ubicación:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usuario:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre y Apellido:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, 20));
        jPanel1.add(txt_detalle_destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 440, -1));
        jPanel1.add(txt_detalle_ubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 440, -1));
        jPanel1.add(txt_detalle_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 230, -1));
        jPanel1.add(txt_detalle_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 230, -1));
        jPanel1.add(txt_detalle_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 190, -1));

        jLabel7.setText("jLabel7");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 180, 120));

        btn_detalle_atras.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_detalle_atras.setText("Atrás");
        jPanel1.add(btn_detalle_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, -1, -1));

        btn_detalle_precio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_detalle_precio.setText("Asignar Precio");
        jPanel1.add(btn_detalle_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Si el viaje es a Futuro");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Socio_Detalle_Viaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Socio_Detalle_Viaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Socio_Detalle_Viaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Socio_Detalle_Viaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Socio_Detalle_Viaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_detalle_atras;
    private javax.swing.JButton btn_detalle_precio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_detalle_destino;
    private javax.swing.JTextField txt_detalle_fecha;
    private javax.swing.JTextField txt_detalle_nombres;
    private javax.swing.JTextField txt_detalle_ubicacion;
    private javax.swing.JTextField txt_detalle_usuario;
    // End of variables declaration//GEN-END:variables
}