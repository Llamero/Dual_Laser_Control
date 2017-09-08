package dual_laser_control;

import java.io.IOException;
import static java.lang.Math.round;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ben
 */

public class Dual_Laser_GUI extends javax.swing.JFrame {
    private double bluePower; //Value of blue laser intensity
    private double redPower; //Value of red laser intensity
    private String status; //Status of arduino connection
    private int connected; //Whether connection is active
    Dual_Laser_Serial laserSerial; //Initialize class for sending intensity to arduino
    
    /**
     * Creates new form Dual_Laser_GUI
     */
    public Dual_Laser_GUI() {
        laserSerial = new Dual_Laser_Serial(); //Create instance of serial communication class
        try {
            connected = laserSerial.initialize(); //Start serial communication with 
        } catch (IOException ex) {
            Logger.getLogger(Dual_Laser_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        statusString();
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

        Title = new javax.swing.JLabel();
        Laser1_Slider = new javax.swing.JSlider();
        Laser1_Label = new javax.swing.JLabel();
        Laser1_TextField = new javax.swing.JTextField();
        Laser2_TextField = new javax.swing.JTextField();
        Laser2_Slider = new javax.swing.JSlider();
        Laser2_Label = new javax.swing.JLabel();
        Status_label = new javax.swing.JLabel();
        Retry_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Dual Laser Control");

        Laser1_Slider.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Laser1_Slider.setForeground(new java.awt.Color(0, 0, 0));
        Laser1_Slider.setMajorTickSpacing(10);
        Laser1_Slider.setMinorTickSpacing(5);
        Laser1_Slider.setPaintLabels(true);
        Laser1_Slider.setPaintTicks(true);
        Laser1_Slider.setToolTipText("Move slider to adjust laser output");
        Laser1_Slider.setValue(0);
        Laser1_Slider.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Laser1_Slider.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Laser1_Slider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Laser1_SliderMouseDragged(evt);
            }
        });
        Laser1_Slider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Laser1_SliderMouseReleased(evt);
            }
        });

        Laser1_Label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Laser1_Label.setText("450 nm Laser:");

        Laser1_TextField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Laser1_TextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Laser1_TextField.setText("0");
        Laser1_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Laser1_TextFieldActionPerformed(evt);
            }
        });

        Laser2_TextField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Laser2_TextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Laser2_TextField.setText("0");
        Laser2_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Laser2_TextFieldActionPerformed(evt);
            }
        });

        Laser2_Slider.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Laser2_Slider.setForeground(new java.awt.Color(0, 0, 0));
        Laser2_Slider.setMajorTickSpacing(10);
        Laser2_Slider.setMinorTickSpacing(5);
        Laser2_Slider.setPaintLabels(true);
        Laser2_Slider.setPaintTicks(true);
        Laser2_Slider.setToolTipText("Move slider to adjust laser output");
        Laser2_Slider.setValue(0);
        Laser2_Slider.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Laser2_Slider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Laser2_SliderMouseDragged(evt);
            }
        });
        Laser2_Slider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Laser2_SliderMouseReleased(evt);
            }
        });

        Laser2_Label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Laser2_Label.setText("635 nm Laser:");

        Status_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Status_label.setText("Status: Trying to find correct COM port...");
        Status_label.setText(status);

        Retry_Button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Retry_Button.setText("Cancel");
        if(connected == 2) Retry_Button.setText("Cancel");
 else Retry_Button.setText("Retry");
        Retry_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Retry_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Laser1_Label)
                            .addComponent(Laser2_Label))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Status_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Laser1_Slider, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Laser2_Slider, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Laser2_TextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Laser1_TextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Retry_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Title)
                .addGap(20, 20, 20)
                .addComponent(Laser1_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Laser1_TextField)
                    .addComponent(Laser1_Slider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Laser2_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Laser2_TextField)
                    .addComponent(Laser2_Slider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Status_label, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Retry_Button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Laser1_SliderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Laser1_SliderMouseReleased
        bluePower = Laser1_Slider.getValue();
        Laser1_TextField.setText(Double.toString(bluePower));
        try {
            laserSerial.laserOutput(bluePower, true);
        } catch (IOException ex) {
            Logger.getLogger(Dual_Laser_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Laser1_SliderMouseReleased

    private void Laser1_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Laser1_TextFieldActionPerformed
        bluePower = (Double.parseDouble(Laser1_TextField.getText()));
        Laser1_Slider.setValue((int) round(bluePower));
        try {
            laserSerial.laserOutput(bluePower, true);
        } catch (IOException ex) {
            Logger.getLogger(Dual_Laser_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Laser1_TextFieldActionPerformed

    private void Laser2_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Laser2_TextFieldActionPerformed
        redPower = (Double.parseDouble(Laser2_TextField.getText()));
        Laser2_Slider.setValue((int) round(redPower));
        try {
            laserSerial.laserOutput(redPower, false);
        } catch (IOException ex) {
            Logger.getLogger(Dual_Laser_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Laser2_TextFieldActionPerformed

    private void Laser2_SliderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Laser2_SliderMouseReleased
        redPower = Laser2_Slider.getValue();
        Laser2_TextField.setText(Double.toString(redPower));
        try {
            laserSerial.laserOutput(redPower, false);
        } catch (IOException ex) {
            Logger.getLogger(Dual_Laser_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Laser2_SliderMouseReleased

    private void Laser1_SliderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Laser1_SliderMouseDragged
        bluePower = Laser1_Slider.getValue();
        Laser1_TextField.setText(Double.toString(bluePower));
    }//GEN-LAST:event_Laser1_SliderMouseDragged

    private void Laser2_SliderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Laser2_SliderMouseDragged
        redPower = Laser2_Slider.getValue();
        Laser2_TextField.setText(Double.toString(redPower));
    }//GEN-LAST:event_Laser2_SliderMouseDragged

    private void Retry_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Retry_ButtonActionPerformed
        if(connected == 2){
            try {
                connected = laserSerial.close(); //Stop serial communication
            } catch (IOException ex) {
                Logger.getLogger(Dual_Laser_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            statusString();
            Status_label.setText(status);
        }
        else{
            try {
                connected = laserSerial.initialize(); //Start serial communication
            } catch (IOException ex) {
                Logger.getLogger(Dual_Laser_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            statusString();
            Status_label.setText(status);
        }
        //Update button to current connection status
        if(connected == 2) Retry_Button.setText("Cancel");
        else Retry_Button.setText("Retry");
    }//GEN-LAST:event_Retry_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Dual_Laser_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dual_Laser_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dual_Laser_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dual_Laser_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Dual_Laser_GUI().setVisible(true);
        });
    }
    
    private void statusString(){
        switch (Integer.valueOf(connected)){ //Get current value of status
            case 1:
                status = "Status: COM port not found.";
                break;
            case 2:
                status = "Status: Connected.";
                break;
            case 3:
                status = "Status: Disconnected.";
                break;              
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Laser1_Label;
    private javax.swing.JSlider Laser1_Slider;
    private javax.swing.JTextField Laser1_TextField;
    private javax.swing.JLabel Laser2_Label;
    private javax.swing.JSlider Laser2_Slider;
    private javax.swing.JTextField Laser2_TextField;
    private javax.swing.JButton Retry_Button;
    private javax.swing.JLabel Status_label;
    private javax.swing.JLabel Title;
    // End of variables declaration//GEN-END:variables
}
