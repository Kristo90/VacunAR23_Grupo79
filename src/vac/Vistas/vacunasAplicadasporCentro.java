/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vac.Vistas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vac.Data.ConsultaData;

/**
 *
 * @author Ana y Guille
 */
public class vacunasAplicadasporCentro extends javax.swing.JInternalFrame {
    
    private DefaultTableModel tabla = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };


    /**
     * Creates new form vacunasAplicadasporCentro
     */
    public vacunasAplicadasporCentro() {
        initComponents();
        armarCabecera();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jCvacunatorio = new javax.swing.JComboBox<>();
        jBsalir1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTaplicaxCentro = new javax.swing.JTable();
        jBbuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Gulim", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Vacunas aplicadas por Vacunatorio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 580, 40));

        jLabel11.setFont(new java.awt.Font("Gulim", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Vacunatorio:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, 20));

        jCvacunatorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "1- Cruz Roja Central", "2- Centro Cultural Leo Messi", "3- Club Social y Deportivo Cebollitas", "5- Escuela Normal N°10" }));
        jCvacunatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCvacunatorioActionPerformed(evt);
            }
        });
        getContentPane().add(jCvacunatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 190, -1));

        jBsalir1.setBackground(new java.awt.Color(255, 153, 153));
        jBsalir1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jBsalir1.setForeground(new java.awt.Color(51, 51, 51));
        jBsalir1.setText("Salir");
        jBsalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalir1ActionPerformed(evt);
            }
        });
        getContentPane().add(jBsalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 160, 50));

        jTaplicaxCentro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTaplicaxCentro);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 620, 90));

        jBbuscar.setBackground(new java.awt.Color(153, 255, 204));
        jBbuscar.setText("Buscar  ");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jBbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 130, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/fondoLaboratorio.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalir1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jBsalir1ActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        // TODO add your handling code here:
        tabla.setRowCount(0);
        if(jCvacunatorio.getSelectedItem().toString().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Vacunatorio por favor");
        }else{
        ConsultaData conData=new ConsultaData();
        ArrayList<String[]>lista=new ArrayList();
        
        lista=conData.listarCentroA(jCvacunatorio.getSelectedItem().toString());
        cargarTabla(lista);
           
        }
        

            
            
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jCvacunatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCvacunatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCvacunatorioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBsalir1;
    private javax.swing.JComboBox<String> jCvacunatorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTaplicaxCentro;
    // End of variables declaration//GEN-END:variables
 private void armarCabecera() {
        tabla.addColumn("Centro Vacunatorio");
        tabla.addColumn("N° de serie de Dosis aplicada");
        tabla.addColumn("DNI Persona");
        jTaplicaxCentro.setModel(tabla);

 }
 private void cargarTabla(ArrayList<String[]> lista) {

        for (String[] fila : lista) {
            tabla.addRow(fila);

        }
    }
}
