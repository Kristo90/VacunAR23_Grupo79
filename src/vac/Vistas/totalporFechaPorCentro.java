/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vac.Vistas;

import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vac.Data.ConsultaData;

/**
 *
 * @author Ana y Guille
 */
public class totalporFechaPorCentro extends javax.swing.JInternalFrame {
private DefaultTableModel tabla = new DefaultTableModel() {
        public boolean isCellEditable(int fila, int columna) {
            return false;
        }
    };
    /**
     * Creates new form totalporFechaPorCentro
     */
    public totalporFechaPorCentro() {
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

        jBsalir1 = new javax.swing.JButton();
        jBbuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jDfecha = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTaplicaxCentroxFecha = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jBbuscar.setBackground(new java.awt.Color(153, 255, 204));
        jBbuscar.setText("Buscar  ");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jBbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 130, 40));

        jLabel4.setFont(new java.awt.Font("Gulim", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Total aplicadas por vacunatorio por fecha");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 670, 40));
        getContentPane().add(jDfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 59, 190, 40));

        jTaplicaxCentroxFecha.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTaplicaxCentroxFecha);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 640, 90));

        jLabel11.setFont(new java.awt.Font("Gulim", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Seleccione una fecha:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, 20));

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
        if(jDfecha.getDate()==null){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fecha.");
        }else{
        tabla.setRowCount(0);
        ConsultaData cd = new ConsultaData();
        ArrayList<String[]> lista = new ArrayList();
        lista=cd.aplicadasxFechaxVacunatorio(jDfecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
        cargarTabla(lista);
        System.out.println(lista);
        }
    }//GEN-LAST:event_jBbuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBsalir1;
    private com.toedter.calendar.JDateChooser jDfecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTaplicaxCentroxFecha;
    // End of variables declaration//GEN-END:variables

 private void armarCabecera() {
        tabla.addColumn("Centro Vacunatorio");
        tabla.addColumn("Total de Dosis aplicadas");
        
        jTaplicaxCentroxFecha.setModel(tabla);

 }
 private void cargarTabla(ArrayList<String[]> lista) {

        for (String[] fila : lista) {
            tabla.addRow(fila);

        }
    }
}
