/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplobd4o;

import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Ordenador
 */
public class GestionPersonas extends javax.swing.JFrame {

    Controlador controlador;

    /**
     * Creates new form GestionPersonas
     */
    public GestionPersonas() {
        initComponents();
        this.controlador = new Controlador();
        TablaPersona.setModel(this.controlador.mostrarpersonas());
        seleccionarpersonas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPersona = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelDatosPersona = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdPersona = new javax.swing.JTextField();
        txtNombrePersona = new javax.swing.JTextField();
        txtApellidoPersona = new javax.swing.JTextField();
        btnGuardarPersona = new javax.swing.JButton();
        btnEditarPersona = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaPersona = new javax.swing.JTable();
        btnEliminarPersona = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Persona");

        jPanelDatosPersona.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Persona"));

        jLabel2.setText("ID:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellido:");

        btnGuardarPersona.setText("Guardar");
        btnGuardarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPersonaActionPerformed(evt);
            }
        });

        btnEditarPersona.setText("Editar");
        btnEditarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPersonaActionPerformed(evt);
            }
        });

        TablaPersona.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(TablaPersona);

        btnEliminarPersona.setText("Eliminar");
        btnEliminarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPersonaActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDatosPersonaLayout = new javax.swing.GroupLayout(jPanelDatosPersona);
        jPanelDatosPersona.setLayout(jPanelDatosPersonaLayout);
        jPanelDatosPersonaLayout.setHorizontalGroup(
            jPanelDatosPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosPersonaLayout.createSequentialGroup()
                .addGroup(jPanelDatosPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosPersonaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelDatosPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDatosPersonaLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(44, 44, 44)
                                .addComponent(txtIdPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDatosPersonaLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelDatosPersonaLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtApellidoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(jPanelDatosPersonaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnGuardarPersona)
                .addGap(31, 31, 31)
                .addComponent(btnEditarPersona)
                .addGap(49, 49, 49)
                .addComponent(btnEliminarPersona)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiar)
                .addGap(91, 91, 91))
        );
        jPanelDatosPersonaLayout.setVerticalGroup(
            jPanelDatosPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosPersonaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellidoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanelDatosPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarPersona)
                    .addComponent(btnEditarPersona)
                    .addComponent(btnEliminarPersona)
                    .addComponent(btnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelPersonaLayout = new javax.swing.GroupLayout(jPanelPersona);
        jPanelPersona.setLayout(jPanelPersonaLayout);
        jPanelPersonaLayout.setHorizontalGroup(
            jPanelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPersonaLayout.createSequentialGroup()
                .addGap(341, 341, 341)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelPersonaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanelDatosPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelPersonaLayout.setVerticalGroup(
            jPanelPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPersonaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanelDatosPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPersonaActionPerformed
        try {
            int id = Integer.valueOf(txtIdPersona.getText());
            String nombre = txtNombrePersona.getText();
            String apellido = txtApellidoPersona.getText();
            boolean insertado = controlador.InsertarPersona(id, nombre, apellido);
            if (insertado == true) {
                JOptionPane.showMessageDialog(rootPane, "Persona Guardada");
                limpiarCampos();
                TablaPersona.setModel(controlador.mostrarpersonas());
            } else {
                JOptionPane.showMessageDialog(rootPane, "Algo Fallo al guardar la persona", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException | HeadlessException e) {
            JOptionPane.showMessageDialog(rootPane, "El ID introducico no es un numero", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarPersonaActionPerformed

    private void btnEditarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPersonaActionPerformed
        int id = Integer.valueOf(txtIdPersona.getText());
        String nombre = txtNombrePersona.getText();
        String apellido = txtApellidoPersona.getText();
        boolean insertado = controlador.ActualizarPersona(id, nombre, apellido);
        if (insertado == true) {
            JOptionPane.showMessageDialog(rootPane, "Persona Actuaizada");
            limpiarCampos();
            TablaPersona.setModel(controlador.mostrarpersonas());
        } else {
            JOptionPane.showMessageDialog(rootPane, "Algo Fallo al Actualizar la persona", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarPersonaActionPerformed

    private void btnEliminarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPersonaActionPerformed
        try {
            int id = Integer.parseInt(txtIdPersona.getText());
            boolean eliminado = controlador.EliminarPersona(id);
            if (eliminado == true) {
                JOptionPane.showMessageDialog(rootPane, "Persona Eliminada");
                limpiarCampos();
                TablaPersona.setModel(controlador.mostrarpersonas());
            } else {
                JOptionPane.showMessageDialog(rootPane, "Algo fallo al eliminar", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException | HeadlessException e) {
            JOptionPane.showMessageDialog(rootPane, "El ID introducido no es un numero", "ERROR", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnEliminarPersonaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    public void seleccionarpersonas() {
        TablaPersona.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent Mouse_evt) {
                if (Mouse_evt.getClickCount() == 1) {
                    txtIdPersona.setText(TablaPersona.getValueAt(TablaPersona.getSelectedRow(), 2).toString());
                    txtNombrePersona.setText(TablaPersona.getValueAt(TablaPersona.getSelectedRow(), 0).toString());
                    txtApellidoPersona.setText(TablaPersona.getValueAt(TablaPersona.getSelectedRow(), 1).toString());
                }
            }});          
    }

    public Persona registrarpersona() {
        if (txtIdPersona.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El campo Id  no tiene datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtIdPersona.requestFocus();
            return null;
        }
        
        if (txtNombrePersona.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El campo Nombre  no tiene datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtNombrePersona.requestFocus();
            return null;
        }
        if (txtApellidoPersona.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El campo Apellido  no tiene datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtApellidoPersona.requestFocus();
            return null;
        }
        Persona persona = new Persona();
        persona.setID(Integer.parseInt(txtIdPersona.getText()));
        persona.setAPELLIDOS(txtApellidoPersona.getText());
        persona.setAPELLIDOS(txtApellidoPersona.getText());
        return persona;

    }

    public Persona buscarpersona() {
        Persona p = new Persona();
        txtIdPersona.setText(String.valueOf(p.getID()));
        txtNombrePersona.setText(p.getNOMBRE());
        txtApellidoPersona.setText(p.getAPELLIDOS());
        return p;
    }


    public void limpiarCampos() {
        txtIdPersona.setText("");
        txtNombrePersona.setText("");
        txtApellidoPersona.setText("");
    }

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
            java.util.logging.Logger.getLogger(GestionPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionPersonas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaPersona;
    private javax.swing.JButton btnEditarPersona;
    private javax.swing.JButton btnEliminarPersona;
    private javax.swing.JButton btnGuardarPersona;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelDatosPersona;
    private javax.swing.JPanel jPanelPersona;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtApellidoPersona;
    private javax.swing.JTextField txtIdPersona;
    private javax.swing.JTextField txtNombrePersona;
    // End of variables declaration//GEN-END:variables
}
