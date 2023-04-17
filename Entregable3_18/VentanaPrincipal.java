package Entregable3_18;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCalcular = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCodigo = new javax.swing.JLabel();
        btnNombres = new javax.swing.JLabel();
        Btnhorastrabajadas = new javax.swing.JLabel();
        btnValorhora = new javax.swing.JLabel();
        btnRetencion = new javax.swing.JLabel();
        btnSalariobruto = new javax.swing.JLabel();
        btnSalarioneto = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtHorastrabajadas = new javax.swing.JTextField();
        txtValorhora = new javax.swing.JTextField();
        txtRetencion = new javax.swing.JTextField();
        txtSalariobruto = new javax.swing.JTextField();
        txtSalarioneto = new javax.swing.JTextField();
        txtNombres2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnCodigo.setText("Código:");

        btnNombres.setText("Nombres:");

        Btnhorastrabajadas.setText("Horas trabajadas(mes):");

        btnValorhora.setText("Valor hora:");

        btnRetencion.setText("% de retención:");

        btnSalariobruto.setText("Salario bruto:");

        btnSalarioneto.setText("Salario neto:");

        jLabel2.setText("Código:");

        jLabel3.setText("Nombres:");

        jMenu1.setText("Archivo");

        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Acerca");

        mnuAcerca.setText("Acerca");
        mnuAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAcercaActionPerformed(evt);
            }
        });
        jMenu2.add(mnuAcerca);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRetencion)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Btnhorastrabajadas)
                                .addComponent(btnCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnNombres, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(btnValorhora))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValorhora, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtHorastrabajadas)
                            .addComponent(txtNombres)
                            .addComponent(txtCodigo)
                            .addComponent(txtRetencion, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSalariobruto)
                            .addComponent(btnSalarioneto)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombres2)
                            .addComponent(txtSalariobruto)
                            .addComponent(txtSalarioneto)
                            .addComponent(txtCodigo2))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNombres)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btnhorastrabajadas)
                    .addComponent(txtHorastrabajadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnValorhora)
                    .addComponent(txtValorhora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRetencion)
                    .addComponent(txtRetencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombres2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSalariobruto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalariobruto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSalarioneto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalarioneto))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(btnReiniciar)
                    .addComponent(btnSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        //Codigo del boton btnCalcular:
        double horas_trabajadas,valor_hora,retefuente,salario_bruto,salario_neto;
        String codigo,nombres;
        codigo = txtCodigo.getText();
        nombres = txtNombres.getText();
        horas_trabajadas = Double.parseDouble(txtHorastrabajadas.getText());
        valor_hora = Double.parseDouble(txtValorhora.getText());
        retefuente = Double.parseDouble(txtRetencion.getText());
        salario_bruto = Empleado.calcular_salario_bruto(valor_hora, horas_trabajadas);
        salario_neto = Empleado.calcular_salario_neto(salario_bruto, retefuente);
        
        txtCodigo2.setText(codigo);
        txtNombres2.setText(nombres);
        txtSalariobruto.setText(String.valueOf(salario_bruto));
        txtSalarioneto.setText(String.valueOf(salario_neto));
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        // Codigo del boton btnReiniciar:
        txtCodigo.setText("");
        txtNombres.setText("");
        txtHorastrabajadas.setText("");
        txtValorhora.setText("");
        txtRetencion.setText("");
        txtCodigo2.setText("");
        txtNombres2.setText("");
        txtSalariobruto.setText("");
        txtSalarioneto.setText("");
        
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // Codigo del boton btnSalir:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        //Codigo del menu item mnuSalir
        dispose();
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAcercaActionPerformed
        //Codigo del menu item mnuAcerca:
        VentanaAcerca acerca = new VentanaAcerca();
        acerca.setVisible(true);    
    }//GEN-LAST:event_mnuAcercaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Btnhorastrabajadas;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel btnCodigo;
    private javax.swing.JLabel btnNombres;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JLabel btnRetencion;
    private javax.swing.JLabel btnSalariobruto;
    private javax.swing.JLabel btnSalarioneto;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel btnValorhora;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuAcerca;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigo2;
    private javax.swing.JTextField txtHorastrabajadas;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNombres2;
    private javax.swing.JTextField txtRetencion;
    private javax.swing.JTextField txtSalariobruto;
    private javax.swing.JTextField txtSalarioneto;
    private javax.swing.JTextField txtValorhora;
    // End of variables declaration//GEN-END:variables
}
