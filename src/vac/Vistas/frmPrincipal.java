
package vac.Vistas;

import javax.swing.JDesktopPane;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import vac_Entidades.Laboratorio;

public class frmPrincipal extends javax.swing.JFrame {

    
    public frmPrincipal() {
        initComponents();
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/imagen/fondoPpal.jpg"));
        Image image = icon.getImage();
        sDescritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jAdm = new javax.swing.JMenu();
        jMciudadano = new javax.swing.JMenuItem();
        jMlab = new javax.swing.JMenuItem();
        jMcita = new javax.swing.JMenuItem();
        jMvacuna = new javax.swing.JMenuItem();
        jConsultas = new javax.swing.JMenu();
        jConsultaD = new javax.swing.JMenuItem();
        jCentros = new javax.swing.JMenuItem();
        jSalir = new javax.swing.JMenu();
        jMsalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        sDescritorio.setPreferredSize(new java.awt.Dimension(860, 680));

        javax.swing.GroupLayout sDescritorioLayout = new javax.swing.GroupLayout(sDescritorio);
        sDescritorio.setLayout(sDescritorioLayout);
        sDescritorioLayout.setHorizontalGroup(
            sDescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 973, Short.MAX_VALUE)
        );
        sDescritorioLayout.setVerticalGroup(
            sDescritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 735, Short.MAX_VALUE)
        );

        jAdm.setText("Administracion");
        jAdm.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAdmActionPerformed(evt);
            }
        });

        jMciudadano.setText("Administrar Ciudadano");
        jMciudadano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMciudadanoActionPerformed(evt);
            }
        });
        jAdm.add(jMciudadano);

        jMlab.setText("Administrar Laboratorio");
        jMlab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMlabActionPerformed(evt);
            }
        });
        jAdm.add(jMlab);

        jMcita.setText("Administrar Cita");
        jMcita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMcitaActionPerformed(evt);
            }
        });
        jAdm.add(jMcita);

        jMvacuna.setText("Administrar Vacuna");
        jMvacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMvacunaActionPerformed(evt);
            }
        });
        jAdm.add(jMvacuna);

        jMenuBar1.add(jAdm);

        jConsultas.setText("Consultas");
        jConsultas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultasActionPerformed(evt);
            }
        });

        jConsultaD.setText("Dosis aplicadas por Fecha en cada centro");
        jConsultaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultaDActionPerformed(evt);
            }
        });
        jConsultas.add(jConsultaD);

        jCentros.setText("Dosis aplicadas por Centro de vacunación");
        jCentros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCentrosActionPerformed(evt);
            }
        });
        jConsultas.add(jCentros);

        jMenuBar1.add(jConsultas);

        jSalir.setText("Salir");
        jSalir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jMsalir.setText("Salir");
        jMsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMsalirActionPerformed(evt);
            }
        });
        jSalir.add(jMsalir);

        jMenuBar1.add(jSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sDescritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 973, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sDescritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 735, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMsalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMsalirActionPerformed

    private void jMciudadanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMciudadanoActionPerformed
        // TODO add your handling code here:
         // Remover la pantalla principal
        sDescritorio.removeAll();
        // Redibuja el escritorio principal
        sDescritorio.repaint();
        // Crear el objeto de la ventana fomulario alunmo(Clase)
        AdmCiudadano ac = new AdmCiudadano();
        // Hacer visible el objeto (ventana formulario)
        ac.setVisible(true);
        
        // Escritorio principal agregar el Objeto (ventana formilario)
        sDescritorio.add(ac);
    }//GEN-LAST:event_jMciudadanoActionPerformed

    private void jMlabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMlabActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
         // Remover la pantalla principal
        sDescritorio.removeAll();
        // Redibuja el escritorio principal
        sDescritorio.repaint();
        // Crear el objeto de la ventana fomulario alunmo(Clase)
        AdmLaboratorio al = new AdmLaboratorio();
        // Hacer visible el objeto (ventana formulario)
        al.setVisible(true);
        
        // Escritorio principal agregar el Objeto (ventana formilario)
        sDescritorio.add(al);
    }//GEN-LAST:event_jMlabActionPerformed

    private void jMvacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMvacunaActionPerformed
                 // TODO add your handling code here:
         // Remover la pantalla principal
        sDescritorio.removeAll();
        // Redibuja el escritorio principal
        sDescritorio.repaint();
        // Crear el objeto de la ventana fomulario alunmo(Clase)
        AdmVacuna admvac = new AdmVacuna();
        // Hacer visible el objeto (ventana formulario)
        admvac.setVisible(true);
        sDescritorio.add(admvac);
        
        
    }//GEN-LAST:event_jMvacunaActionPerformed

    private void jAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAdmActionPerformed
        // TODO add your handling code here:
        // Remover la pantalla principal
        sDescritorio.removeAll();
        // Redibuja el escritorio principal
        sDescritorio.repaint();
        // Crear el objeto de la ventana fomulario alunmo(Clase)
        AdmCita admCita = new AdmCita();
        // Hacer visible el objeto (ventana formulario)
        admCita.setVisible(true);
        sDescritorio.add(admCita);
    }//GEN-LAST:event_jAdmActionPerformed

    private void jMcitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMcitaActionPerformed
        // TODO add your handling code here:
        // Remover la pantalla principal
        sDescritorio.removeAll();
        // Redibuja el escritorio principal
        sDescritorio.repaint();
        // Crear el objeto de la ventana fomulario alunmo(Clase)
        AdmCita admCita = new AdmCita();
        // Hacer visible el objeto (ventana formulario)
        admCita.setVisible(true);
        sDescritorio.add(admCita);
    }//GEN-LAST:event_jMcitaActionPerformed

    private void jConsultaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultaDActionPerformed
        // TODO add your handling code here:
        // Remover la pantalla principal
        sDescritorio.removeAll();
        
        // redibuja el escritorio principal
        sDescritorio.repaint();
        
        // Crear el objeto de la ventana
        totalporFechaPorCentro tpfpc = new totalporFechaPorCentro();
        // Hacer visible el objeto
        tpfpc.setVisible(true);
        sDescritorio.add(tpfpc);
        
        
    }//GEN-LAST:event_jConsultaDActionPerformed

    private void jConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultasActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jConsultasActionPerformed

    private void jCentrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCentrosActionPerformed
        // TODO add your handling code here:
         sDescritorio.removeAll();
        
        sDescritorio.repaint();
        
        vacunasAplicadasporCentro vaxc = new vacunasAplicadasporCentro();
        
        vaxc.setVisible(true);
        sDescritorio.add(vaxc);
    }//GEN-LAST:event_jCentrosActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jAdm;
    private javax.swing.JMenuItem jCentros;
    private javax.swing.JMenuItem jConsultaD;
    private javax.swing.JMenu jConsultas;
    private javax.swing.JMenuItem jMcita;
    private javax.swing.JMenuItem jMciudadano;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMlab;
    private javax.swing.JMenuItem jMsalir;
    private javax.swing.JMenuItem jMvacuna;
    private javax.swing.JMenu jSalir;
    public static javax.swing.JDesktopPane sDescritorio;
    // End of variables declaration//GEN-END:variables
}
