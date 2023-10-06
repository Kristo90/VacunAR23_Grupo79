
package vac.Vistas;

import vac.Data.CiudadanoData;
import vac_Entidades.Ciudadano;

public class AdmCiudadano extends javax.swing.JInternalFrame {
    Ciudadano pers=new Ciudadano();
    CiudadanoData cd=new CiudadanoData();
    public AdmCiudadano() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jCriesgo = new javax.swing.JComboBox<>();
        jCescencial = new javax.swing.JComboBox<>();
        jTnombre = new javax.swing.JTextField();
        jTdni = new javax.swing.JTextField();
        jBsalir = new javax.swing.JButton();
        jTapellido = new javax.swing.JTextField();
        jTmail = new javax.swing.JTextField();
        jTtelefono = new javax.swing.JTextField();
        jBinscribir = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jfondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(600, 800));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setVerifyInputWhenFocusTarget(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/VacunAR 23 (300x154)_1.jpg"))); // NOI18N
        Background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 300, 160));

        jCriesgo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Ninguna", "1. Enfermedad pulmonar", "2. Cardiopatías", "3. Diabetes", "4. Obesidad", "5. Transplante", "6. Inmuno deprimido", " " }));
        jCriesgo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCriesgoActionPerformed(evt);
            }
        });
        Background.add(jCriesgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 230, -1));

        jCescencial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Ninguna", "1. Personal de Salud, Fuerzas de seguridad, Fuerzas Armadas.", "2. Autoridades superiores de los gobiernosres.", "3. Personal de los servicios de justicia de turno.", "4. Personal diplomático y consular extranjero. ", "5. Personas que deban asistir a otras con discapacidad. ", "6. Personas que deban atender una situación de fuerza mayor.", "7. Personas afectadas a la realización de servicios funerarios.", "8. Personas afectadas a la atención de comedoress.", "9. Personal que se desempeña en los servicios de comunicación.", "10. Personal afectado a obra pública.", "11. Supermercados y comercios minoristas de proximidad. ", "12. Industrias de alimentación", "13. Actividades distribución y comercialización agropecuaria y de pesca.", "14. Actividades de telecomunicaciones.", "15. Comercio exterior.", "16. Recolección, transporte y tratamiento de residuos sólidos urbanos.", "17. Mantenimiento de los servicios básicos.", "18. Transporte público de pasajeros.", "19. Reparto a domicilio.", "20. Servicios de lavandería.", "21. Servicios postales y de distribución de paquetería.", "22. Servicios esenciales de vigilancia, limpieza y guardia.", " " }));
        Background.add(jCescencial, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 420, -1));
        Background.add(jTnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 240, -1));

        jTdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTdniActionPerformed(evt);
            }
        });
        Background.add(jTdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 240, -1));

        jBsalir.setBackground(new java.awt.Color(255, 153, 153));
        jBsalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBsalir.setForeground(new java.awt.Color(51, 51, 51));
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });
        Background.add(jBsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 150, 50));
        Background.add(jTapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 240, -1));
        Background.add(jTmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 240, -1));
        Background.add(jTtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 240, -1));

        jBinscribir.setBackground(new java.awt.Color(102, 204, 255));
        jBinscribir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBinscribir.setForeground(new java.awt.Color(51, 51, 51));
        jBinscribir.setText("Inscribir");
        jBinscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBinscribirActionPerformed(evt);
            }
        });
        Background.add(jBinscribir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 150, 50));

        jLabel9.setFont(new java.awt.Font("Gulim", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Actividad escencial:");
        Background.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 180, 20));

        jLabel8.setFont(new java.awt.Font("Gulim", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Enfermedad de riesgo?:");
        Background.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 180, 20));

        jLabel7.setFont(new java.awt.Font("Gulim", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Ingrese telefono:");
        Background.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 130, 20));

        jLabel6.setFont(new java.awt.Font("Gulim", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Ingrese e-mail:");
        Background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 130, 20));

        jLabel5.setFont(new java.awt.Font("Gulim", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Ingrese DNI:");
        Background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 130, 20));

        jLabel1.setFont(new java.awt.Font("Gulim", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Ingrese apellido:");
        Background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 130, 20));

        jLabel4.setFont(new java.awt.Font("Gulim", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Ingrese nombre:");
        Background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 130, 20));

        jLabel3.setFont(new java.awt.Font("Gulim", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Inscripción de Ciudadano");
        Background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 500, 40));

        jfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/fondo.jpg"))); // NOI18N
        jfondo.setPreferredSize(new java.awt.Dimension(600, 800));
        Background.add(jfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBinscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBinscribirActionPerformed
        // TODO add your handling code here:
        
        pers.setDni(Integer.parseInt(jTdni.getText()));
        pers.setNombre(jTnombre.getText());
        pers.setApellido(jTapellido.getText());
        pers.setEmail(jTmail.getText());
        pers.setCelular(jTtelefono.getText());
        pers.setPatologia(jCriesgo.getSelectedItem().toString());
        pers.setAmbtrabajo(jCescencial.getSelectedItem().toString());
        cd.inscribirCiudadano(pers);
        jTdni.setText("");
        jTnombre.setText("");
        jTapellido.setText("");
        jTmail.setText("");
        jTtelefono.setText("");
        jCriesgo.setSelectedIndex(0);
        jCescencial.setSelectedIndex(0);
        
    }//GEN-LAST:event_jBinscribirActionPerformed

    private void jTdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTdniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTdniActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jCriesgoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCriesgoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCriesgoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton jBinscribir;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<String> jCescencial;
    private javax.swing.JComboBox<String> jCriesgo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTapellido;
    private javax.swing.JTextField jTdni;
    private javax.swing.JTextField jTmail;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JTextField jTtelefono;
    private javax.swing.JLabel jfondo;
    // End of variables declaration//GEN-END:variables
}
