/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jointhealliance.rumble.main;

import com.jointhealliance.rumble.main.modes.GameMode;
import com.jointhealliance.rumble.settings.SavedValues;
import com.jointhealliance.rumble.settings.Settings;
import com.jointhealliance.rumble.threads.Data;

/**
 * 
 * @author Joel Gallant
 */
public class Interface extends javax.swing.JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Teleop = new javax.swing.JButton();
        Auto = new javax.swing.JButton();
        Disable = new javax.swing.JButton();
        StartDataThread = new javax.swing.JButton();
        StopDataThread = new javax.swing.JButton();
        DebugToggle = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DebugConsole = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        Delay = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Logging = new javax.swing.JTextField();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jLabel6 = new javax.swing.JLabel();
        Team = new javax.swing.JTextField();
        Alliance = new javax.swing.JTextField();
        GameTime = new javax.swing.JTextField();
        Mode = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Interface");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(181, 228, 254));
        setBounds(500,200,200,200);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        Teleop.setText("Teleop");
        Teleop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeleopActionPerformed(evt);
            }
        });

        Auto.setText("Auto");
        Auto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutoActionPerformed(evt);
            }
        });

        Disable.setText("Disable");
        Disable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisableActionPerformed(evt);
            }
        });

        StartDataThread.setText("Start Data Thread");
        StartDataThread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartDataThreadActionPerformed(evt);
            }
        });

        StopDataThread.setText("Stop Data Thread");
        StopDataThread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopDataThreadActionPerformed(evt);
            }
        });

        DebugToggle.setText("Debugging Toggle");
        DebugToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DebugToggleActionPerformed(evt);
            }
        });

        DebugConsole.setColumns(20);
        DebugConsole.setRows(5);
        jScrollPane1.setViewportView(DebugConsole);

        jLabel2.setText("Debugging Console");

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Settings"));
        jLayeredPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        Delay.setBounds(70, 50, 110, 28);
        jLayeredPane1.add(Delay, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setText("Logging");
        jLabel3.setBounds(10, 20, 100, 30);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        jSlider1.setBounds(10, 254, 160, 50);
        jLayeredPane1.add(jSlider1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setText("Lag Compensation");
        jLabel4.setBounds(30, 230, 160, 18);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setText("Delay");
        jLabel5.setBounds(20, 50, 39, 20);
        jLayeredPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Logging.setBounds(70, 20, 110, 28);
        jLayeredPane1.add(Logging, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setText("Info");
        jLabel6.setBounds(100, 0, 49, 18);
        jLayeredPane3.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Team.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeamActionPerformed(evt);
            }
        });
        Team.setBounds(10, 20, 200, 28);
        jLayeredPane3.add(Team, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Alliance.setBounds(10, 50, 200, 28);
        jLayeredPane3.add(Alliance, javax.swing.JLayeredPane.DEFAULT_LAYER);
        GameTime.setBounds(10, 80, 200, 28);
        jLayeredPane3.add(GameTime, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Mode.setBounds(10, 110, 200, 28);
        jLayeredPane3.add(Mode, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(DebugToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Auto, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Teleop, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(Disable, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(StopDataThread, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(StartDataThread, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1))
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(StartDataThread)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StopDataThread)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DebugToggle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Teleop)
                            .addComponent(Auto))
                        .addGap(5, 5, 5)
                        .addComponent(Disable))
                    .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("Info");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    public static final GameMode modes = new GameMode();
    private void TeleopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeleopActionPerformed
        // TODO add your handling code here:
        modes.teleopInit();
    }//GEN-LAST:event_TeleopActionPerformed

    private void AutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutoActionPerformed
        // TODO add your handling code here:
        modes.autonomousInit();
    }//GEN-LAST:event_AutoActionPerformed

    private void DisableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisableActionPerformed
        // TODO add your handling code here:
        modes.disabledInit();
    }//GEN-LAST:event_DisableActionPerformed

    private void StartDataThreadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartDataThreadActionPerformed
        // TODO add your handling code here:
        Data.start();
    }//GEN-LAST:event_StartDataThreadActionPerformed

    private void StopDataThreadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopDataThreadActionPerformed
        // TODO add your handling code here:
        Data.stop();
    }//GEN-LAST:event_StopDataThreadActionPerformed

    private void DebugToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DebugToggleActionPerformed
        // TODO add your handling code here:
        if(Settings.LOGGING) {
            Settings.LOGGING = false;
        }else {
            Settings.LOGGING = true;
        }
    }//GEN-LAST:event_DebugToggleActionPerformed

    @SuppressWarnings("deprecation")
	private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        // TODO add your handling code here:
        SavedValues.setLagCompensation((double)jSlider1.getValue() / 30);
    }//GEN-LAST:event_jSlider1StateChanged

    private void TeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TeamActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField Alliance;
    private javax.swing.JButton Auto;
    public static javax.swing.JTextArea DebugConsole;
    private javax.swing.JToggleButton DebugToggle;
    public static javax.swing.JTextField Delay;
    private javax.swing.JButton Disable;
    public static javax.swing.JTextField GameTime;
    public static javax.swing.JTextField Logging;
    public static javax.swing.JTextField Mode;
    private javax.swing.JButton StartDataThread;
    private javax.swing.JButton StopDataThread;
    public static javax.swing.JTextField Team;
    private javax.swing.JButton Teleop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}
