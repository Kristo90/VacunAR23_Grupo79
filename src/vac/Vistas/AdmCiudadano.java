package vac.Vistas;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import vac.Data.CiudadanoData;
import vac_Entidades.Ciudadano;

public class AdmCiudadano extends javax.swing.JInternalFrame {

     public Ciudadano pers = new Ciudadano();
    CiudadanoData cd = new CiudadanoData();
   
    public AdmCiudadano() {
        initComponents();

    }
public void limpiar(){
    jTdni.setText("");
        jTnombre.setText("");
        jTapellido.setText("");
        jTmail.setText("");
        jTtelefono.setText("");
        jCriesgo.setSelectedIndex(0);
        jCescencial.setSelectedIndex(0);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jBactualizar = new javax.swing.JButton();
        jCriesgo = new javax.swing.JComboBox<>();
        jCescencial = new javax.swing.JComboBox<>();
        jTnombre = new javax.swing.JTextField();
        jTdni = new javax.swing.JTextField();
        jBeliminar = new javax.swing.JButton();
        jTapellido = new javax.swing.JTextField();
        jTdniEliminar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTmail = new javax.swing.JTextField();
        jTtelefono = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jBinscribir = new javax.swing.JButton();
        jBlimpiar = new javax.swing.JButton();
        jBsalir1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jfondo = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setMaximumSize(new java.awt.Dimension(600, 800));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setVerifyInputWhenFocusTarget(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Gulim", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Ingrese DNI de la persona a eliminar:");
        Background.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 509, 310, 20));

        jBactualizar.setBackground(new java.awt.Color(255, 255, 153));
        jBactualizar.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jBactualizar.setForeground(new java.awt.Color(51, 51, 51));
        jBactualizar.setText("Actualizar datos");
        jBactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBactualizarActionPerformed(evt);
            }
        });
        Background.add(jBactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 150, 50));

        jCriesgo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "0.Ninguna", "1. Enfermedad pulmonar", "2. Cardiopatías", "3. Diabetes", "4. Obesidad", "5. Transplante", "6. Inmuno deprimido", " " }));
        jCriesgo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCriesgoActionPerformed(evt);
            }
        });
        Background.add(jCriesgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 230, -1));

        jCescencial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Ninguna", "1. Personal de Salud, Fuerzas de seguridad, Fuerzas Armadas.", "2. Autoridades superiores de los gobiernosres.", "3. Personal de los servicios de justicia de turno.", "4. Personal diplomático y consular extranjero. ", "5. Personas que deban asistir a otras con discapacidad. ", "6. Personas que deban atender una situación de fuerza mayor.", "7. Personas afectadas a la realización de servicios funerarios.", "8. Personas afectadas a la atención de comedoress.", "9. Personal que se desempeña en los servicios de comunicación.", "10. Personal afectado a obra pública.", "11. Supermercados y comercios minoristas de proximidad. ", "12. Industrias de alimentación", "13. Actividades distribución y comercialización agropecuaria y de pesca.", "14. Actividades de telecomunicaciones.", "15. Comercio exterior.", "16. Recolección, transporte y tratamiento de residuos sólidos urbanos.", "17. Mantenimiento de los servicios básicos.", "18. Transporte público de pasajeros.", "19. Reparto a domicilio.", "20. Servicios de lavandería.", "21. Servicios postales y de distribución de paquetería.", "22. Servicios esenciales de vigilancia, limpieza y guardia.", " " }));
        Background.add(jCescencial, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 420, -1));

        jTnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTnombreKeyTyped(evt);
            }
        });
        Background.add(jTnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 240, -1));

        jTdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTdniActionPerformed(evt);
            }
        });
        jTdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTdniKeyTyped(evt);
            }
        });
        Background.add(jTdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 240, -1));

        jBeliminar.setBackground(new java.awt.Color(204, 0, 51));
        jBeliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBeliminar.setForeground(new java.awt.Color(255, 255, 255));
        jBeliminar.setText("Eliminar inscripto");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });
        Background.add(jBeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, -1, 50));

        jTapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTapellidoKeyTyped(evt);
            }
        });
        Background.add(jTapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 240, -1));
        Background.add(jTdniEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, 150, -1));

        jLabel11.setBackground(new java.awt.Color(255, 204, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/light-gray-concrete-wall.jpg"))); // NOI18N
        Background.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 790, 90));

        jTmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTmailFocusLost(evt);
            }
        });
        Background.add(jTmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 240, -1));

        jTtelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTtelefonoKeyTyped(evt);
            }
        });
        Background.add(jTtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 240, -1));
        Background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 120, 20));

        jBinscribir.setBackground(new java.awt.Color(102, 204, 255));
        jBinscribir.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jBinscribir.setForeground(new java.awt.Color(51, 51, 51));
        jBinscribir.setText("Inscribir");
        jBinscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBinscribirActionPerformed(evt);
            }
        });
        Background.add(jBinscribir, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 150, 50));

        jBlimpiar.setBackground(new java.awt.Color(153, 255, 153));
        jBlimpiar.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jBlimpiar.setForeground(new java.awt.Color(51, 51, 51));
        jBlimpiar.setText("Limpiar campos");
        jBlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimpiarActionPerformed(evt);
            }
        });
        Background.add(jBlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 150, 50));

        jBsalir1.setBackground(new java.awt.Color(255, 153, 153));
        jBsalir1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jBsalir1.setForeground(new java.awt.Color(51, 51, 51));
        jBsalir1.setText("Salir");
        jBsalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalir1ActionPerformed(evt);
            }
        });
        Background.add(jBsalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 150, 50));

        jLabel9.setFont(new java.awt.Font("Gulim", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Actividad esencial:");
        Background.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 190, 20));

        jLabel8.setFont(new java.awt.Font("Gulim", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Enfermedad de riesgo:");
        Background.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 190, 20));

        jLabel7.setFont(new java.awt.Font("Gulim", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Ingrese telefono:");
        Background.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 150, 20));

        jLabel6.setFont(new java.awt.Font("Gulim", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Ingrese e-mail:");
        Background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 150, 20));

        jLabel5.setFont(new java.awt.Font("Gulim", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Ingrese DNI:");
        Background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 130, 20));

        jLabel1.setFont(new java.awt.Font("Gulim", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Ingrese apellido:");
        Background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 150, 20));

        jLabel4.setFont(new java.awt.Font("Gulim", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Ingrese nombre:");
        Background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 140, 20));

        jLabel3.setFont(new java.awt.Font("Gulim", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Inscripción de Ciudadano");
        Background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 500, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/transparent white.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        Background.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 490));

        jfondo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jfondo.setForeground(new java.awt.Color(0, 0, 0));
        jfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/fondoCiudadano.jpg"))); // NOI18N
        jfondo.setText("Ingre DNI de la persona a eliminar:");
        jfondo.setPreferredSize(new java.awt.Dimension(600, 800));
        Background.add(jfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 490));

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
        if (jTnombre.getText().isEmpty() || jTapellido.getText().isEmpty() || jTdni.getText().isEmpty() || jTmail.getText().isEmpty() || jTtelefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los datos requeridos");

        } else {
            pers.setDni(Integer.parseInt(jTdni.getText()));
            pers.setNombre(jTnombre.getText());
            pers.setApellido(jTapellido.getText());
            pers.setEmail(jTmail.getText());
            pers.setCelular(jTtelefono.getText());
            pers.setPatologia(jCriesgo.getSelectedItem().toString());
            pers.setAmbtrabajo(jCescencial.getSelectedItem().toString());
            cd.inscribirCiudadano(pers);

            limpiar();
        }


    }//GEN-LAST:event_jBinscribirActionPerformed

    private void jTdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTdniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTdniActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        // TODO add your handling code here:
        if(jTdniEliminar.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe ingresar un DNI en el campo Eliminar Ciudadano");
        }else{
        cd.bajaCiudadano(Integer.parseInt(jTdniEliminar.getText()));
        jTdniEliminar.setText("");
        }
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jCriesgoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCriesgoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCriesgoActionPerformed

    private void jTdniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTdniKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Este campo solo admite números \nVuelva a ingresarlo");
            jTdni.setText("");

        }
    }//GEN-LAST:event_jTdniKeyTyped

    private void jTtelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTtelefonoKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Este campo solo admite números \nVuelva a ingresarlo");
            jTtelefono.setText("");

        }
    }//GEN-LAST:event_jTtelefonoKeyTyped

    private void jTnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTnombreKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if ((car < 65 || car > 90) && (car < 96 || car > 122) && (car < 128 || car > 183) && (car != (char) KeyEvent.VK_BACK_SPACE) && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Este campo solo admite letras \nVuelva a ingresarlo");
            jTnombre.setText("");

        }
    }//GEN-LAST:event_jTnombreKeyTyped

    private void jTapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTapellidoKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if ((car < 65 || car > 90) && (car < 96 || car > 122) && (car < 128 || car > 183) && (car != (char) KeyEvent.VK_BACK_SPACE) && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Este campo solo admite letras \nVuelva a ingresarlo");
            jTapellido.setText("");

        }
    }//GEN-LAST:event_jTapellidoKeyTyped
    public boolean isEmail(String correo) {
        Pattern pat = null;
        Matcher mat = null;
        pat = Pattern.compile("^[\\w\\\\\\+]+(\\.[\\w\\\\]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,4}$");
        mat = pat.matcher(correo);

        if (mat.find()) {
            return true;
        } else {
            return false;
        }

    }
    private void jTmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTmailFocusLost
        // TODO add your handling code here:
        if (isEmail(jTmail.getText())) {

        } else {
            JOptionPane.showMessageDialog(null, "El e-mail ingresado no es válido\nVuelva a ingresarlo");
            jTmail.setText("");
        }

    }//GEN-LAST:event_jTmailFocusLost

    private void jBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimpiarActionPerformed
        // TODO add your handling code here:
       limpiar();
    }//GEN-LAST:event_jBlimpiarActionPerformed

    private void jBsalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalir1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jBsalir1ActionPerformed

    private void jBactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBactualizarActionPerformed
        // TODO add your handling code here:
        
         if (jTnombre.getText().isEmpty() || jTapellido.getText().isEmpty() || jTdni.getText().isEmpty() || jTmail.getText().isEmpty() || jTtelefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Para actualizar debe completar todos los campos con los datos de la persona a mofificar y luego presionar ACTUALIZAR");

        } else {
            pers.setDni(Integer.parseInt(jTdni.getText()));
            pers.setNombre(jTnombre.getText());
            pers.setApellido(jTapellido.getText());
            pers.setEmail(jTmail.getText());
            pers.setCelular(jTtelefono.getText());
            pers.setPatologia(jCriesgo.getSelectedItem().toString());
            pers.setAmbtrabajo(jCescencial.getSelectedItem().toString());
            cd.actualizarCiudadano(pers);

            limpiar();
        }
    }//GEN-LAST:event_jBactualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton jBactualizar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBinscribir;
    private javax.swing.JButton jBlimpiar;
    private javax.swing.JButton jBsalir1;
    private javax.swing.JComboBox<String> jCescencial;
    private javax.swing.JComboBox<String> jCriesgo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTextField jTdniEliminar;
    private javax.swing.JTextField jTmail;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JTextField jTtelefono;
    private javax.swing.JLabel jfondo;
    // End of variables declaration//GEN-END:variables
}
