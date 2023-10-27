/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vac.Vistas;

import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import vac.Data.CitaData;
import vac.Data.CiudadanoData;
import vac.Data.VacunaData;
import vac_Entidades.CitaVacunacion;
import vac_Entidades.Ciudadano;
import vac_Entidades.Vacuna;
import java.time.LocalDate;
import java.time.ZoneId;
import static java.time.temporal.TemporalQueries.localDate;

public class AdmCita extends javax.swing.JInternalFrame {

    public AdmCita() {
        initComponents();
        jTnomApe.setEnabled(false);
        jBcancelar.setEnabled(false);
        jBposponerTurno.setEnabled(true);
        jBguardarTurno.setEnabled(false);
        jBinfoAplica.setEnabled(true);
        jCdosis.setEnabled(false);
        jDateChooser1.setEnabled(false);
        jCvacunatorio.setEnabled(false);
        jChorario.setEnabled(false);

        if (jCdosis.getSelectedIndex() == 0) {
            jDateChooser1.setMinSelectableDate(java.sql.Date.valueOf(LocalDate.now().plusDays(1)));
        } else if (jCdosis.getSelectedIndex() == 1) {

        }
    }

    public void limpiar() {
        jTdni.setText("");
        jCdosis.setSelectedIndex(-1);
        jChorario.setSelectedIndex(0);
        jCvacunatorio.setSelectedIndex(0);
        jDateChooser1.setDate(null);
        jTnomApe.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jBsalir = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jCdosis = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCvacunatorio = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jBinfoAplica = new javax.swing.JButton();
        jChorario = new javax.swing.JComboBox<>();
        jTnomApe = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jTdni = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTdniAplica = new javax.swing.JTextField();
        jBcancelar = new javax.swing.JButton();
        jBposponerTurno = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jBguardarTurno = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jBbuscarPers = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/transparent white_1.png"))); // NOI18N

        setPreferredSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBsalir.setBackground(new java.awt.Color(255, 102, 102));
        jBsalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBsalir.setForeground(new java.awt.Color(0, 0, 0));
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });
        getContentPane().add(jBsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 120, 50));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 190, -1));

        jCdosis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "1", "2", "3", " " }));
        getContentPane().add(jCdosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 190, -1));

        jLabel6.setFont(new java.awt.Font("Gulim", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Registro de Turnos");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 420, 40));

        jLabel4.setFont(new java.awt.Font("Gulim", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Franja Horaria:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 20));

        jLabel7.setFont(new java.awt.Font("Gulim", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("DNI Persona:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, 20));

        jCvacunatorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "1- Cruz Roja Central", "2- Centro Cultural Leo Messi", "3- Club Social y Deportivo Cebollitas", "5- Escuela Normal N°10" }));
        getContentPane().add(jCvacunatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 190, -1));

        jLabel9.setFont(new java.awt.Font("Gulim", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Dosis:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, 20));

        jBinfoAplica.setBackground(new java.awt.Color(204, 255, 204));
        jBinfoAplica.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBinfoAplica.setForeground(new java.awt.Color(51, 51, 51));
        jBinfoAplica.setText("Informar dosis aplicada");
        jBinfoAplica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBinfoAplicaActionPerformed(evt);
            }
        });
        getContentPane().add(jBinfoAplica, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 230, 50));

        jChorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", " ", "10:00 a 10:30", "10:30 a 11:00", "11:00 a 11:30", "11:30 a 12:00", "12:00 a 12:30", "12:30 a 13:00", "13:00 a 13:30", "13:30 a 14:00", "14:00 a 14:30", "14:30 a 15:00", "15:00 a 15:30", "15:30 a 16:00" }));
        getContentPane().add(jChorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 190, -1));

        jTnomApe.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTnomApe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTnomApeKeyTyped(evt);
            }
        });
        getContentPane().add(jTnomApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 260, -1));

        jLabel2.setFont(new java.awt.Font("Gulim", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nombre y apellido:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 160, 20));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 700, 20));

        jLabel10.setFont(new java.awt.Font("Gulim", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Fecha Turno:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 20));

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
        getContentPane().add(jTdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 120, -1));

        jLabel11.setFont(new java.awt.Font("Gulim", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Vacunatorio:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, 20));

        jLabel13.setFont(new java.awt.Font("Gulim", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("DNI de la persona vacunada");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 310, 20));

        jTdniAplica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTdniAplicaActionPerformed(evt);
            }
        });
        jTdniAplica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTdniAplicaKeyTyped(evt);
            }
        });
        getContentPane().add(jTdniAplica, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 120, -1));

        jBcancelar.setBackground(new java.awt.Color(204, 0, 51));
        jBcancelar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBcancelar.setForeground(new java.awt.Color(0, 0, 0));
        jBcancelar.setText("Cancelar ");
        jBcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jBcancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 150, 50));

        jBposponerTurno.setBackground(new java.awt.Color(255, 255, 153));
        jBposponerTurno.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jBposponerTurno.setForeground(new java.awt.Color(51, 51, 51));
        jBposponerTurno.setText("Posponer/Cancelar turno");
        jBposponerTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBposponerTurnoActionPerformed(evt);
            }
        });
        getContentPane().add(jBposponerTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 220, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/light-gray-concrete-wall.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 700, 130));

        jBguardarTurno.setBackground(new java.awt.Color(102, 204, 255));
        jBguardarTurno.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jBguardarTurno.setForeground(new java.awt.Color(51, 51, 51));
        jBguardarTurno.setText("Guardar Turno");
        jBguardarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarTurnoActionPerformed(evt);
            }
        });
        getContentPane().add(jBguardarTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 150, 50));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 700, 60));

        jBbuscarPers.setBackground(new java.awt.Color(153, 255, 204));
        jBbuscarPers.setText("Buscar Persona ");
        jBbuscarPers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarPersActionPerformed(evt);
            }
        });
        getContentPane().add(jBbuscarPers, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 130, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/fondoCita.jpg"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 700, 480));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 700, 60));

        jLabel12.setFont(new java.awt.Font("Gulim", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("DNI Persona:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 120, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTdniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTdniActionPerformed

    private void jTdniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTdniKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Este campo solo admite números \nVuelva a ingresarlo");
            jTdni.setText("");

        }
    }//GEN-LAST:event_jTdniKeyTyped

    private void jTnomApeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTnomApeKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if ((car < 65 || car > 90) && (car < 96 || car > 122) && (car < 128 || car > 183) && (car != (char) KeyEvent.VK_BACK_SPACE) && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Este campo solo admite letras \nVuelva a ingresarlo");
            jTnomApe.setText("");

        }
    }//GEN-LAST:event_jTnomApeKeyTyped

    private void jBguardarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarTurnoActionPerformed
        // TODO add your handling code here:

        Ciudadano pers = new Ciudadano();
        CiudadanoData cd = new CiudadanoData();
        LocalDate fecha = null;
        Vacuna vac = new Vacuna();
        VacunaData vd = new VacunaData();
        CitaData cdata = new CitaData();
        CitaVacunacion cv = new CitaVacunacion();

        pers = cd.buscarCiudadano(Integer.parseInt(jTdni.getText()));
        cv = cdata.buscarCita(pers);

        cv.setPersona(pers);
        cv.setCentroVacunacion(jCvacunatorio.getSelectedItem().toString());
        cv.setCodigoRefuerzo(Integer.parseInt(jCdosis.getSelectedItem().toString()));
        cv.setFechaHoraCita(jDateChooser1.getDate().toString() + " " + jChorario.getSelectedItem().toString());
        cv.setEstado(true);
        System.out.println(cv.getFechaHoraCita());

        cdata.turnoVac(cv);

        limpiar();
        jTnomApe.setEnabled(false);
        jBcancelar.setEnabled(false);
        jBposponerTurno.setEnabled(true);
        jBguardarTurno.setEnabled(false);
        jBinfoAplica.setEnabled(true);
        jCdosis.setEnabled(false);
        jDateChooser1.setEnabled(false);
        jCvacunatorio.setEnabled(false);
        jChorario.setEnabled(false);
        jBbuscarPers.setEnabled(true);


    }//GEN-LAST:event_jBguardarTurnoActionPerformed

    private void jBposponerTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBposponerTurnoActionPerformed
        // TODO add your handling code here:
        PosponerCancelar pc = new PosponerCancelar();
        frmPrincipal.sDescritorio.add(pc);
        pc.toFront();
        pc.setVisible(true);


    }//GEN-LAST:event_jBposponerTurnoActionPerformed

    private void jBbuscarPersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarPersActionPerformed
        // TODO add your handling code here:
        if(jTdni.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe cargar un DNI para buscar a la persona");
        }else{
        
        Ciudadano pers = new Ciudadano();
        CiudadanoData cd = new CiudadanoData();
        Vacuna vac = new Vacuna();
        VacunaData vd = new VacunaData();
        CitaData cdata = new CitaData();
        CitaVacunacion cv = new CitaVacunacion();

        pers = cd.buscarCiudadano(Integer.parseInt(jTdni.getText()));
        cv = cdata.buscarCita(pers);

        if (pers.getNombre() == null) {
            JOptionPane.showMessageDialog(null, "Persona no existe en Base de Datos");
            jTdni.setText("");
            jBbuscarPers.setEnabled(true);
            jBcancelar.setEnabled(false);
            jCvacunatorio.setEnabled(false);
            jChorario.setEnabled(false);
        } else {
            jTnomApe.setText(pers.getNombre() + " " + pers.getApellido());
        }
       
            
        if (cv.getPersona() == null&&pers.getApellido()!=null) {
            jCdosis.setSelectedIndex(1);
            jTnomApe.setEnabled(false);

            jBcancelar.setEnabled(true);
            jBposponerTurno.setEnabled(false);
            jBguardarTurno.setEnabled(true);
            jBinfoAplica.setEnabled(false);
            jCdosis.setEnabled(false);
            jDateChooser1.setEnabled(true);
            jCvacunatorio.setEnabled(true);
            jChorario.setEnabled(true);
            jBbuscarPers.setEnabled(true);
            jTdni.setEnabled(true);
        }else if(pers.getApellido()!=null) {
        JOptionPane.showMessageDialog(null, "Ya hay un turno pendiente o una dosis por aplicar");
        
    }
//        System.out.println(cv);
//        if (cv.getCodigoRefuerzo() == 1 && cv.isEstado() == false) {
//            jCdosis.setSelectedIndex(2);
//            jBcancelar.setEnabled(true);
//            jBposponerTurno.setEnabled(false);
//            jBguardarTurno.setEnabled(true);
//            jBinfoAplica.setEnabled(false);
//            jCdosis.setEnabled(false);
//            jDateChooser1.setEnabled(true);
//            jCvacunatorio.setEnabled(true);
//            jChorario.setEnabled(true);
//            jBbuscarPers.setEnabled(false);
//            jTdni.setEnabled(true);
//            jDateChooser1.setMinSelectableDate(java.sql.Date.valueOf(cv.getFechaHoraColocada().plusWeeks(4)));
//            jDateChooser1.setMaxSelectableDate(java.sql.Date.valueOf(cv.getFechaHoraColocada().plusWeeks(6)));
//        } else if (cv.getCodigoRefuerzo() == 2 && cv.isEstado() == false) {
//            jCdosis.setSelectedIndex(3);
//            jBcancelar.setEnabled(true);
//            jBposponerTurno.setEnabled(false);
//            jBguardarTurno.setEnabled(true);
//            jBinfoAplica.setEnabled(false);
//            jCdosis.setEnabled(false);
//            jDateChooser1.setEnabled(true);
//            jCvacunatorio.setEnabled(true);
//            jChorario.setEnabled(true);
//            jBbuscarPers.setEnabled(false);
//            jTdni.setEnabled(true);
//            jDateChooser1.setMinSelectableDate(java.sql.Date.valueOf(cv.getFechaHoraColocada().plusWeeks(4)));
//            jDateChooser1.setMaxSelectableDate(java.sql.Date.valueOf(cv.getFechaHoraColocada().plusWeeks(6)));
//        } else if (cv.getCodigoRefuerzo() != 0 && cv.getFechaHoraColocada()==null) {
//            JOptionPane.showMessageDialog(null, "No se aplico la dosis correspondiente, no puede agendarse un nuevo turno");
//            jTnomApe.setEnabled(false);
//            jTnomApe.setText("");
//            jBcancelar.setEnabled(false);
//            jBposponerTurno.setEnabled(false);
//            jBguardarTurno.setEnabled(false);
//            jBinfoAplica.setEnabled(false);
//            jCdosis.setEnabled(false);
//            jDateChooser1.setEnabled(false);
//            jCvacunatorio.setEnabled(false);
//            jChorario.setEnabled(false);
//            jBbuscarPers.setEnabled(true);
//            jTdni.setText("");
//            jTdni.setEnabled(true);
//        }

//        if (cv.getPersona() == null) {
//            jCdosis.setSelectedIndex(1);
//            jTnomApe.setEnabled(false);
//
//            jBcancelar.setEnabled(true);
//            jBposponerTurno.setEnabled(false);
//            jBguardarTurno.setEnabled(true);
//            jBinfoAplica.setEnabled(false);
//            jCdosis.setEnabled(false);
//            jDateChooser1.setEnabled(true);
//            jCvacunatorio.setEnabled(true);
//            jChorario.setEnabled(true);
//            jBbuscarPers.setEnabled(true);
//            jTdni.setEnabled(true);
//        }
//        if (pers.getNombre() == null) {
//            jBcancelar.setEnabled(false);
//            jBposponerTurno.setEnabled(false);
//            jBguardarTurno.setEnabled(false);
//            jBinfoAplica.setEnabled(false);
//            jCdosis.setEnabled(false);
//            jCdosis.setSelectedIndex(0);
//            jDateChooser1.setEnabled(false);
//            jCvacunatorio.setEnabled(false);
//            jChorario.setEnabled(false);
//            jBbuscarPers.setEnabled(true);
//            jTdni.setText("");
//            jTdni.setEnabled(true);
//            jTnomApe.setText("");
        }
    }//GEN-LAST:event_jBbuscarPersActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBinfoAplicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBinfoAplicaActionPerformed
        // TODO add your handling code here:
        Vacuna vac = new Vacuna();
        VacunaData vd = new VacunaData();
        CitaData cdata = new CitaData();
        CitaVacunacion cv = new CitaVacunacion();
        ArrayList<Vacuna> listavac = new ArrayList();
        LocalDate hoy = LocalDate.now();
        listavac = vd.buscarvacuna();

        vac = listavac.get(0);

        vd.actualizaVac(vac.getIdVacuna());

        Ciudadano pers = new Ciudadano();
        CiudadanoData cd = new CiudadanoData();

        pers = cd.buscarCiudadano(Integer.parseInt(jTdniAplica.getText()));
        cv = cdata.buscarCitaApli(pers);
        cv.setFechaHoraColocada(hoy);
        cv.setDosis(vac);
        cv.setEstado(false);
        vac.setColocada(true);
        vac.setEstado(false);

        JOptionPane.showMessageDialog(null, "Por favor scannear el código de la dosis aplicada");
        cdata.aplicaVac(cv);
        
        if (cv.getCodigoRefuerzo() == 1 || cv.getCodigoRefuerzo() == 2) {
            JOptionPane.showMessageDialog(null, "Por favor agende un turno para la siguiente dosis");
        }
        if (cv.getCodigoRefuerzo() == 1) {
            jCdosis.setSelectedIndex(2);
            jDateChooser1.setMinSelectableDate(java.sql.Date.valueOf(cv.getFechaHoraColocada().plusWeeks(4)));
            jDateChooser1.setMaxSelectableDate(java.sql.Date.valueOf(cv.getFechaHoraColocada().plusWeeks(6)));
        }
        if (cv.getCodigoRefuerzo() == 2) {
            jCdosis.setSelectedIndex(3);
            jDateChooser1.setMinSelectableDate(java.sql.Date.valueOf(cv.getFechaHoraColocada().plusWeeks(4)));
            jDateChooser1.setMaxSelectableDate(java.sql.Date.valueOf(cv.getFechaHoraColocada().plusWeeks(6)));
        } else if (cv.getCodigoRefuerzo() == 3) {
            JOptionPane.showMessageDialog(null, "Ha completado las 3 dosis. Muchas gracias");
        }
jTdni.setText(jTdniAplica.getText());
jTdniAplica.setText("");
jBguardarTurno.setEnabled(true);
jChorario.setEnabled(true);
jCvacunatorio.setEnabled(true);
jDateChooser1.setEnabled(true);




    }//GEN-LAST:event_jBinfoAplicaActionPerformed

    private void jTdniAplicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTdniAplicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTdniAplicaActionPerformed

    private void jTdniAplicaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTdniAplicaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTdniAplicaKeyTyped

    private void jBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelarActionPerformed
        // TODO add your handling code here:
        jBcancelar.setEnabled(false);
        jBposponerTurno.setEnabled(true);
        jBguardarTurno.setEnabled(false);
        jBinfoAplica.setEnabled(true);
        jCdosis.setEnabled(false);
        jCdosis.setSelectedIndex(0);
        jDateChooser1.setEnabled(false);
        jCvacunatorio.setEnabled(false);
        jChorario.setEnabled(false);
        jBbuscarPers.setEnabled(true);
        jTdni.setText("");
        jTdni.setEnabled(true);
        jTnomApe.setText("");
    }//GEN-LAST:event_jBcancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscarPers;
    private javax.swing.JButton jBcancelar;
    private javax.swing.JButton jBguardarTurno;
    private javax.swing.JButton jBinfoAplica;
    private javax.swing.JButton jBposponerTurno;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<String> jCdosis;
    private javax.swing.JComboBox<String> jChorario;
    private javax.swing.JComboBox<String> jCvacunatorio;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTdni;
    private javax.swing.JTextField jTdniAplica;
    private javax.swing.JTextField jTnomApe;
    // End of variables declaration//GEN-END:variables
}
