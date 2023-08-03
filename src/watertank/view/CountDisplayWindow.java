
package watertank.view;

import java.awt.Color;
import javax.swing.*;
import watertank.WaterTankObserver;


public class CountDisplayWindow extends JFrame implements WaterTankObserver{

  

    public CountDisplayWindow() {
        initComponents();
        setVisible(true);
    }
    @Override
    public void update(int waterLevel){
    displayTxt.setText(waterLevel+"");
    displayProg.setValue(waterLevel);
    displayProg.setForeground(waterLevel>=80?Color.red:Color.GREEN);
    lblAlarm.setText(waterLevel>=80?"ON":"OFF");
    lblGate.setText(waterLevel>=90?"OPEN":"CLOSE");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        displayProg = new javax.swing.JProgressBar();
        displayTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblAlarm = new javax.swing.JLabel();
        lblGate = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        displayProg.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        displayProg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        displayTxt.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        displayTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        displayTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayTxtActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Count Display");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Alarm :");

        lblAlarm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAlarm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAlarm.setText("OFF");

        lblGate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblGate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGate.setText("CLOSE");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Gate  :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(displayTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(46, 46, 46)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblAlarm))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblGate)))
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(79, 79, 79)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(displayProg, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(displayTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblAlarm))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblGate))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(displayProg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayTxtActionPerformed

    }//GEN-LAST:event_displayTxtActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar displayProg;
    private javax.swing.JTextField displayTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblAlarm;
    private javax.swing.JLabel lblGate;
    // End of variables declaration//GEN-END:variables
}
