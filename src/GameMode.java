
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class GameMode extends javax.swing.JFrame {
        
   
    List<int[]> questions;
    private Questions quest;
    private Questions questForSettings;
    List<Questions> settings;
    
    
    public GameMode() {
        initComponents();
        questions = new ArrayList<>();
        quest = new Questions();
        
       
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
        logoutBtn = new javax.swing.JButton();
        firstNumberField2 = new javax.swing.JTextField();
        secondNumberField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        modePanel.setBackground(new java.awt.Color(157, 241, 223));

        firstNumberField1.setBackground(new java.awt.Color(141, 203, 230));
        firstNumberField1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        firstNumberField1.setForeground(new java.awt.Color(255, 255, 255));
        firstNumberField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstNumberField1.setBorder(null);
        firstNumberField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNumberField1ActionPerformed(evt);
            }
        });

        fnLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fnLabel.setForeground(new java.awt.Color(163, 26, 203));
        fnLabel.setText("ENTER 1...10");

        newUserLabel.setFont(new java.awt.Font("Press Start 2P", 0, 36)); // NOI18N
        newUserLabel.setForeground(new java.awt.Color(163, 26, 203));
        newUserLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newUserLabel.setText("GAME MODE");

        snLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        snLabel.setForeground(new java.awt.Color(163, 26, 203));
        snLabel.setText("ENTER 1...10");

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
        qnLabel.setText("HOW MANY QUESTIONS DO YOU WANT TO ASK?");

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

        logoutBtn.setBackground(new java.awt.Color(163, 26, 203));
        logoutBtn.setFont(new java.awt.Font("Press Start 2P", 0, 18)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("LOG OUT");
        logoutBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logoutBtn.setBorderPainted(false);
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
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

        javax.swing.GroupLayout modePanelLayout = new javax.swing.GroupLayout(modePanel);
        modePanel.setLayout(modePanelLayout);
        modePanelLayout.setHorizontalGroup(
            modePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(modePanelLayout.createSequentialGroup()
                .addGroup(modePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modePanelLayout.createSequentialGroup()
                        .addGroup(modePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(modePanelLayout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(firstNumberField1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(modePanelLayout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(fnLabel)))
                        .addGap(7, 7, 7)
                        .addGroup(modePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(modePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(qnLabel)
                                .addGroup(modePanelLayout.createSequentialGroup()
                                    .addComponent(questNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(143, 143, 143)))
                            .addGroup(modePanelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(modePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(newUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(modePanelLayout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addGroup(modePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(modePanelLayout.createSequentialGroup()
                                                .addComponent(firstNumberField2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(xLabel)
                                                .addGap(49, 49, 49)
                                                .addComponent(secondNumberField1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34)
                                                .addComponent(secondNumberField2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modePanelLayout.createSequentialGroup()
                                                .addComponent(snLabel)
                                                .addGap(75, 75, 75)))))
                                .addGap(66, 66, 66))))
                    .addGroup(modePanelLayout.createSequentialGroup()
                        .addGap(418, 418, 418)
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        modePanelLayout.setVerticalGroup(
            modePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(newUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(modePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(snLabel)
                    .addComponent(fnLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(modePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(firstNumberField1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(firstNumberField2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(modePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(secondNumberField1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(secondNumberField2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(xLabel))
                .addGap(39, 39, 39)
                .addComponent(qnLabel)
                .addGap(18, 18, 18)
                .addComponent(questNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
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
        int a1 = Integer.parseInt(input1);
        String input2 = firstNumberField2.getText();
        int a2 = Integer.parseInt(input2);

        
        String input3 = secondNumberField1.getText();
        int b1 = Integer.parseInt(input3);       
        String input4 = secondNumberField2.getText();
        int b2 = Integer.parseInt(input4);  
        
        
        String input5 = questNumberField.getText();
        int N = Integer.parseInt(input5);    
        
        //questForSettings = new Questions(a1,a2,b1,b2,N);
        //settings.add(questForSettings);
        //FileOp.writeSettingsToFile(settings, "Settings.ser");
        
        //List<Questions> deneme123 = FileOp.readSettingsFromFile("Settings.ser");
        //System.out.println(deneme123);
        
        questions = quest.randomQuestion(a1, a2, b1, b2, N);
        FileOp.writeQuestionToFile(questions, "Questions.ser");
        
        
        
  
        String message="Game is saved.";
        JOptionPane.showMessageDialog(this, message);

    }//GEN-LAST:event_saveBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        String message="Ready to play.";
        JOptionPane.showMessageDialog(this, message);
        dispose();
        new LoginPage().setVisible(true);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void firstNumberField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNumberField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNumberField1ActionPerformed

 
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
            GameMode gameMode= new GameMode();
            
            gameMode.setSize(1000, 500);
            gameMode.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gameMode.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField firstNumberField1;
    private javax.swing.JTextField firstNumberField2;
    private javax.swing.JLabel fnLabel;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPanel modePanel;
    private javax.swing.JLabel newUserLabel;
    private javax.swing.JLabel qnLabel;
    private javax.swing.JTextField questNumberField;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField secondNumberField1;
    private javax.swing.JTextField secondNumberField2;
    private javax.swing.JLabel snLabel;
    private javax.swing.JLabel xLabel;
    // End of variables declaration//GEN-END:variables
}
