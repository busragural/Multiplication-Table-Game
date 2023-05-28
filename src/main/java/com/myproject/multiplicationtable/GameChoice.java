package com.myproject.multiplicationtable;

import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GameChoice extends javax.swing.JFrame {

    DefaultTableModel table;
    Object[] rowData;           // used to send the information from the selected row to the other class
    private List<Questions> exerciseList;
    ChildrenInfo currentChild;

    public GameChoice() {
        initComponents();
        if(LoginPage.currentChild== null){      // if the parent is looking at the table
             start2Button.setText("BACK");
             logoutBtn.setVisible(false);
             
        } 
        else {                                  // if the child is choosing game from the table
            currentChild = LoginPage.currentChild;
            scoreBtn.setVisible(false);
            deleteBtn.setVisible(false);
        }

        exerciseList = new ArrayList<>();
        exerciseList = FileOp.readQuestionFromFile("Settings.ser");
        
        table = (DefaultTableModel) gameListTable1.getModel();
        rowData = new Object[6];
        Object[] row = new Object[6];

        for (Questions questions : exerciseList) {
            row[0] = questions.settings[0];
            row[1] = questions.settings[1];
            row[2] = questions.settings[2];
            row[3] = questions.settings[3];
            row[4] = questions.settings[4];
            row[5] = questions.settings[5];
            table.addRow(row);
        } 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gameCoicePanel = new javax.swing.JPanel();
        start2Button = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        gameListTable1 = new javax.swing.JTable();
        logoutBtn = new javax.swing.JButton();
        scoreBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(Toolkit.getDefaultToolkit().getScreenSize().width/5,Toolkit.getDefaultToolkit().getScreenSize().height/10);

        gameCoicePanel.setBackground(new java.awt.Color(157, 241, 223));

        start2Button.setBackground(new java.awt.Color(163, 26, 203));
        start2Button.setFont(new java.awt.Font("Press Start 2P", 0, 18)); // NOI18N
        start2Button.setForeground(new java.awt.Color(255, 255, 255));
        start2Button.setText("START");
        start2Button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        start2Button.setBorderPainted(false);
        start2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start2ButtonActionPerformed(evt);
            }
        });

        gameListTable1.setBackground(new java.awt.Color(141, 203, 230));
        gameListTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "A(min)", "A(max)", "B(min)", "B(max)", "# Games", "ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        gameListTable1.setColumnSelectionAllowed(false);
        gameListTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gameListTable1.setGridColor(new java.awt.Color(255, 51, 0));
        gameListTable1.setSelectionBackground(new java.awt.Color(163, 26, 203));
        gameListTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        gameListTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(gameListTable1);
        gameListTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        logoutBtn.setBackground(new java.awt.Color(163, 26, 203));
        logoutBtn.setFont(new java.awt.Font("Press Start 2P", 0, 14)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("LOGOUT");
        logoutBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logoutBtn.setBorderPainted(false);
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        scoreBtn.setBackground(new java.awt.Color(163, 26, 203));
        scoreBtn.setFont(new java.awt.Font("Press Start 2P", 0, 14)); // NOI18N
        scoreBtn.setForeground(new java.awt.Color(255, 255, 255));
        scoreBtn.setText("SCORES");
        scoreBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        scoreBtn.setBorderPainted(false);
        scoreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(163, 26, 203));
        deleteBtn.setFont(new java.awt.Font("Press Start 2P", 0, 11)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("DELETE");
        deleteBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteBtn.setBorderPainted(false);
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gameCoicePanelLayout = new javax.swing.GroupLayout(gameCoicePanel);
        gameCoicePanel.setLayout(gameCoicePanelLayout);
        gameCoicePanelLayout.setHorizontalGroup(
            gameCoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameCoicePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224))
            .addGroup(gameCoicePanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(scoreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(gameCoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gameCoicePanelLayout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(start2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(271, 271, 271)
                        .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gameCoicePanelLayout.createSequentialGroup()
                        .addGap(570, 570, 570)
                        .addComponent(deleteBtn)))
                .addGap(27, 27, 27))
        );
        gameCoicePanelLayout.setVerticalGroup(
            gameCoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameCoicePanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gameCoicePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(gameCoicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scoreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(start2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gameCoicePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gameCoicePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void start2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start2ButtonActionPerformed

        if(currentChild != null){       //for the child
            
            int selectedRow = gameListTable1.getSelectedRow();
            
            if (selectedRow != -1) {
                rowData = new Object[table.getColumnCount()];
                
                for (int i = 0; i < rowData.length; i++) {
                    rowData[i] = table.getValueAt(selectedRow, i);
                    System.out.println("rowData: " + rowData[i]);
                }
                
                dispose();
                GameScreen gameScreen = new GameScreen(rowData, exerciseList); 
                gameScreen.setVisible(true);   
            }
            else{
                String message ="Please choose a game.";
                JOptionPane.showMessageDialog(this, message);
            }   
        }
        else{       //for the parent
            dispose();
            new ParentMenu().setVisible(true);
        }       
    }//GEN-LAST:event_start2ButtonActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        dispose();
        new LoginPage().setVisible(true);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void scoreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreBtnActionPerformed
         int selectedRow = gameListTable1.getSelectedRow();
            
            if (selectedRow != -1) {
                rowData = new Object[table.getColumnCount()];
                 for (int i = 0; i < rowData.length; i++) {
                    rowData[i] = table.getValueAt(selectedRow, i);
                    System.out.println("rowData: " + rowData[i]);
                }
                dispose();
                AllScores as = new AllScores(rowData); 
                as.setVisible(true);   
            }
            else{
                String message ="Please choose a game.";
                JOptionPane.showMessageDialog(this, message);
            }
    }//GEN-LAST:event_scoreBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
            int selectedRow = gameListTable1.getSelectedRow();

            if (selectedRow != -1) {
                int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this game?", "Confirmation", JOptionPane.YES_NO_OPTION);

                if (option == JOptionPane.YES_OPTION) {
                    table.removeRow(selectedRow);        
                    List<Questions> tmpL = FileOp.readQuestionFromFile("Settings.ser");                            
                    tmpL.remove(selectedRow);               
                    FileOp.writeQuestionToFile(tmpL, "Settings.ser");
                    
                }
               
            } else {
                String message = "Please choose a game.";
                JOptionPane.showMessageDialog(this, message);
            }
    }//GEN-LAST:event_deleteBtnActionPerformed

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
            java.util.logging.Logger.getLogger(GameChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameChoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GameChoice().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteBtn;
    private javax.swing.JPanel gameCoicePanel;
    private javax.swing.JTable gameListTable1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton scoreBtn;
    private javax.swing.JButton start2Button;
    // End of variables declaration//GEN-END:variables

}
