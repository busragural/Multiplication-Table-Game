package com.myproject.multiplicationtable;

import java.awt.Component;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GameMode extends javax.swing.JFrame {

    Questions q;
    ChildrenInfo currentChild;

    public GameMode() {

        initComponents();
        q = new Questions();
        currentChild = LoginPage.currentChild;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modePanel = new javax.swing.JPanel();
        firstNumberField1 = new javax.swing.JTextField();
        fnLabel = new javax.swing.JLabel();
        newUserLabel = new javax.swing.JLabel();
        snLabel = new javax.swing.JLabel();
        secondNumberField1 = new javax.swing.JTextField();
        xLabel = new javax.swing.JLabel();
        qnLabel = new javax.swing.JLabel();
        questNumberField = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        firstNumberField2 = new javax.swing.JTextField();
        secondNumberField2 = new javax.swing.JTextField();
        fnLabel1 = new javax.swing.JLabel();
        snLabel1 = new javax.swing.JLabel();
        listBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(Toolkit.getDefaultToolkit().getScreenSize().width/5,Toolkit.getDefaultToolkit().getScreenSize().height/10);

        modePanel.setBackground(new java.awt.Color(157, 241, 223));

        firstNumberField1.setBackground(new java.awt.Color(141, 203, 230));
        firstNumberField1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        firstNumberField1.setForeground(new java.awt.Color(255, 255, 255));
        firstNumberField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstNumberField1.setBorder(null);

        fnLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fnLabel.setForeground(new java.awt.Color(163, 26, 203));
        fnLabel.setText("A(min)");

        newUserLabel.setFont(new java.awt.Font("Press Start 2P", 0, 36)); // NOI18N
        newUserLabel.setForeground(new java.awt.Color(163, 26, 203));
        newUserLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newUserLabel.setText("GAME MODE");

        snLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        snLabel.setForeground(new java.awt.Color(163, 26, 203));
        snLabel.setText("B(min)");

        secondNumberField1.setBackground(new java.awt.Color(141, 203, 230));
        secondNumberField1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        secondNumberField1.setForeground(new java.awt.Color(255, 255, 255));
        secondNumberField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        secondNumberField1.setBorder(null);

        xLabel.setBackground(new java.awt.Color(163, 26, 203));
        xLabel.setFont(new java.awt.Font("Press Start 2P", 0, 48)); // NOI18N
        xLabel.setForeground(new java.awt.Color(163, 26, 203));
        xLabel.setText("X");

        qnLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        qnLabel.setForeground(new java.awt.Color(163, 26, 203));
        qnLabel.setText("NUMBER OF QUESTIONS TO ASK");

        questNumberField.setBackground(new java.awt.Color(141, 203, 230));
        questNumberField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        questNumberField.setForeground(new java.awt.Color(255, 255, 255));
        questNumberField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        questNumberField.setBorder(null);

        saveBtn.setBackground(new java.awt.Color(163, 26, 203));
        saveBtn.setFont(new java.awt.Font("Press Start 2P", 0, 18)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("SAVE");
        saveBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        saveBtn.setBorderPainted(false);
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        firstNumberField2.setBackground(new java.awt.Color(141, 203, 230));
        firstNumberField2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        firstNumberField2.setForeground(new java.awt.Color(255, 255, 255));
        firstNumberField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstNumberField2.setBorder(null);

        secondNumberField2.setBackground(new java.awt.Color(141, 203, 230));
        secondNumberField2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        secondNumberField2.setForeground(new java.awt.Color(255, 255, 255));
        secondNumberField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        secondNumberField2.setBorder(null);

        fnLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fnLabel1.setForeground(new java.awt.Color(163, 26, 203));
        fnLabel1.setText("A(max)");

        snLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        snLabel1.setForeground(new java.awt.Color(163, 26, 203));
        snLabel1.setText("B(max)");

        listBtn.setBackground(new java.awt.Color(163, 26, 203));
        listBtn.setFont(new java.awt.Font("Press Start 2P", 0, 18)); // NOI18N
        listBtn.setForeground(new java.awt.Color(255, 255, 255));
        listBtn.setText("BACK");
        listBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        listBtn.setBorderPainted(false);
        listBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout modePanelLayout = new javax.swing.GroupLayout(modePanel);
        modePanel.setLayout(modePanelLayout);
        modePanelLayout.setHorizontalGroup(
            modePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modePanelLayout.createSequentialGroup()
                .addGroup(modePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(modePanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(firstNumberField1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(firstNumberField2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(xLabel)
                        .addGap(51, 51, 51)
                        .addComponent(secondNumberField1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(secondNumberField2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(modePanelLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(fnLabel)
                        .addGap(90, 90, 90)
                        .addComponent(fnLabel1)
                        .addGap(78, 450, Short.MAX_VALUE)))
                .addGap(140, 140, 140))
            .addGroup(modePanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(modePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modePanelLayout.createSequentialGroup()
                        .addGroup(modePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qnLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modePanelLayout.createSequentialGroup()
                                .addComponent(questNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)))
                        .addGap(338, 338, 338))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modePanelLayout.createSequentialGroup()
                        .addGroup(modePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(modePanelLayout.createSequentialGroup()
                                .addGroup(modePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(snLabel)
                                    .addComponent(newUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(83, 83, 83)
                                .addComponent(snLabel1)
                                .addGap(144, 144, 144))
                            .addGroup(modePanelLayout.createSequentialGroup()
                                .addComponent(listBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27))))
        );
        modePanelLayout.setVerticalGroup(
            modePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modePanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(newUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(modePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fnLabel)
                    .addComponent(fnLabel1)
                    .addComponent(snLabel)
                    .addComponent(snLabel1))
                .addGroup(modePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(modePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(modePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(firstNumberField1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(firstNumberField2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(modePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(secondNumberField1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(secondNumberField2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(qnLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(questNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(modePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(listBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(modePanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(xLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(modePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed

        String input1 = firstNumberField1.getText();      
        String input2 = firstNumberField2.getText();        
        String input3 = secondNumberField1.getText();     
        String input4 = secondNumberField2.getText();        
        String input5 = questNumberField.getText();
        

        if (input1.isEmpty() || input2.isEmpty() || input3.isEmpty() || input4.isEmpty()|| input5.isEmpty()) {
            
            String message = "Please fill in all fields.";
            JOptionPane.showMessageDialog(this, message, "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } 
        int a1 = Integer.parseInt(input1);
        int a2 = Integer.parseInt(input2);
        int b1 = Integer.parseInt(input3);
        int b2 = Integer.parseInt(input4);
        int N = Integer.parseInt(input5);
            
        if(a2 <= a1 || b2 <= b1 || N == 0 || a1 <= 0 || b1 <= 0 ){
            String message = "Please enter valid values.";
            JOptionPane.showMessageDialog(this, message);
        }
        else{
   
            int[] tmp = {a1, a2, b1, b2, N, 0};

            q.makeOneSetting(tmp);
            
            List<Questions> tmpL = FileOp.readQuestionFromFile("Settings.ser");
            tmpL.add(q);
            FileOp.writeQuestionToFile(tmpL, "Settings.ser");
            
            String message = "Game is saved.";
            JOptionPane.showMessageDialog(this, message);

            // reset the content of text fields
            Component[] components = modePanel.getComponents();
            for (Component component : components) {
                if (component instanceof JTextField) {
                    JTextField tf = (JTextField) component;
                    tf.setText("");
                }
            }
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void listBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listBtnActionPerformed
        dispose();
        new ParentMenu().setVisible(true);
    }//GEN-LAST:event_listBtnActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            GameMode gameMode = new GameMode();

            gameMode.setSize(1000, 500);
            gameMode.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gameMode.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField firstNumberField1;
    private javax.swing.JTextField firstNumberField2;
    private javax.swing.JLabel fnLabel;
    private javax.swing.JLabel fnLabel1;
    private javax.swing.JButton listBtn;
    private javax.swing.JPanel modePanel;
    private javax.swing.JLabel newUserLabel;
    private javax.swing.JLabel qnLabel;
    private javax.swing.JTextField questNumberField;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField secondNumberField1;
    private javax.swing.JTextField secondNumberField2;
    private javax.swing.JLabel snLabel;
    private javax.swing.JLabel snLabel1;
    private javax.swing.JLabel xLabel;
    // End of variables declaration//GEN-END:variables
}
