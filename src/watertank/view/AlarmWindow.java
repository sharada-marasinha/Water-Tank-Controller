/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package watertank.view;

import java.awt.Color;
import javax.swing.*;
import watertank.WaterTankObserver;

/**
 *
 * @author shara
 */
public class AlarmWindow extends JFrame implements WaterTankObserver{

    /**
     * Creates new form AlarmWindow
     */
    public AlarmWindow() {
        setVisible(true);
        initComponents();
    }
   public void update(int waterLevel){
       lblAlarm.setText(waterLevel>=80 ? "ON" : "OFF");
       pnlAlarm.setBackground(waterLevel>=80?Color.red:Color.GREEN);
   }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAlarm = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnlAlarm = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAlarm.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblAlarm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAlarm.setText("ON/OFF");

        jLabel2.setBackground(new java.awt.Color(153, 255, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Alarm");

        pnlAlarm.setBackground(new java.awt.Color(0, 255, 0));
        pnlAlarm.setForeground(new java.awt.Color(102, 0, 51));

        javax.swing.GroupLayout pnlAlarmLayout = new javax.swing.GroupLayout(pnlAlarm);
        pnlAlarm.setLayout(pnlAlarmLayout);
        pnlAlarmLayout.setHorizontalGroup(
            pnlAlarmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pnlAlarmLayout.setVerticalGroup(
            pnlAlarmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlAlarm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAlarm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(pnlAlarm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(lblAlarm)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAlarm;
    private javax.swing.JPanel pnlAlarm;
    // End of variables declaration//GEN-END:variables
}
